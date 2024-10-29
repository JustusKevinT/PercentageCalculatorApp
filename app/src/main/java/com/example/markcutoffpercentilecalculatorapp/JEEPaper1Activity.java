package com.example.markcutoffpercentilecalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class JEEPaper1Activity extends AppCompatActivity {
    private Button jeep1mark;
    private Button jeep1percent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jeepaper1);
        jeep1mark = (Button) findViewById(R.id.jp1mark);
        jeep1percent = (Button) findViewById(R.id.jp1percent);
        jeep1mark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                JEEp1MarkActivit();
            }
        });
        jeep1percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                JEEp1PercentActivity();
            }
        });
    }

    private void JEEp1PercentActivity() {
        Intent intent = new Intent(this,JEEp1Percent_Activity.class);
        startActivity(intent);
    }

    private void JEEp1MarkActivit() {
        Intent intent = new Intent(this,JEEp1Mark_Activity.class);
        startActivity(intent);
    }
}