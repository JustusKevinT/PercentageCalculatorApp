package com.example.markcutoffpercentilecalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NEETActivity extends AppCompatActivity {
    private Button neetMarkBt;
    private Button neetPercentageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_neetactivity);
        neetMarkBt = (Button) findViewById(R.id.neetmarkbt);
        neetPercentageButton = (Button) findViewById(R.id.neetPercentage);
        neetPercentageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                neetpercentageActivity();
            }
        });
        neetMarkBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                neetMarkActivity();
            }
        });
    }

    private void neetMarkActivity() {
        Intent intent = new Intent(this,NEETMarkActivity.class);
        startActivity(intent);
    }

    private void neetpercentageActivity() {
        Intent intent = new Intent(this,NEETPercentageActivity.class);
        startActivity(intent);
    }
}