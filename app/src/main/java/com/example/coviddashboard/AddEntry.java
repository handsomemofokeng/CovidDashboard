package com.example.coviddashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;

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



    }

    public void onClick_SwitchResults(View view) {
        if (switchPos.isChecked()){
            switchPos.setTextOn("Positive Results");
        }else {
            switchPos.setTextOff("Pending Results");
        }
    }
}