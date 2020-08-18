package com.example.coviddashboard;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.strictmode.IntentReceiverLeakedViolation;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final int REQ_CODE = 1;
    TextView tvPositiveCases, tvPendingCases;
    RecyclerView rvEntries;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvPendingCases = findViewById(R.id.tvPending);
        tvPositiveCases = findViewById(R.id.tvPositive);
        rvEntries = findViewById(R.id.rvList);

    }

    public void onClick_EntryAdd(View view) {
        startActivityForResult(new Intent(getApplicationContext(), AddEntry.class), REQ_CODE);
    }

    public void onClick_Refresh(View view) {
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);


    }
}