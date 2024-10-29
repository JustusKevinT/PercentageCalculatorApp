package com.example.markcutoffpercentilecalculatorapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class JEE2MarkActivity extends AppCompatActivity {
    private Button btnarch;
    private Button btnplan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jee2_mark);
        btnarch = (Button) findViewById(R.id.buttonarch);
        btnplan = (Button) findViewById(R.id.buttonplan);
        btnplan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                planActivity();
            }
        });
        btnarch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                archActivity();
            }
        });
    }

    private void archActivity() {
        Intent intent = new Intent(this,archActivity.class);
        startActivity(intent);
    }


    private void planActivity() {
        Intent intent = new Intent(this,planActivity.class);
        startActivity(intent);
    }
}