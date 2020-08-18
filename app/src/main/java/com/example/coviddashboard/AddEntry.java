package com.example.coviddashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

import com.backendless.Backendless;
import com.backendless.async.callback.AsyncCallback;
import com.backendless.exceptions.BackendlessFault;

public class AddEntry extends AppCompatActivity {

    EditText etFullname, etID;
    Switch switchPos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_entry);

        etFullname = findViewById(R.id.etSurname);
        etID = findViewById(R.id.etID);
        switchPos = findViewById(R.id.switchPos);


        Bundle bundle = getIntent().getExtras();

        if (bundle != null){

        }
    }

    public void onClick_SwitchResults(View view) {
        if (switchPos.isChecked()){
            switchPos.setTextOn("Positive Results");
        }else {
            switchPos.setTextOff("Pending Results");
        }
    }

    public void onClick_AddEntry(View view) {

        CovidEntry covidEntry = new CovidEntry();

        covidEntry.setFullName(etFullname.getText().toString().trim());
        covidEntry.setId(etID.getText().toString().trim());
        covidEntry.setPositive(switchPos.isChecked());

        Backendless.Persistence.save(covidEntry, new AsyncCallback<CovidEntry>() {
            @Override
            public void handleResponse(CovidEntry response) {
                Toast.makeText(AddEntry.this, response + " saved successfully", Toast.LENGTH_SHORT).show();
                setResult(RESULT_OK, getIntent());
                finish();
            }

            @Override
            public void handleFault(BackendlessFault fault) {
                Toast.makeText(AddEntry.this, "Error: "+ fault.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}