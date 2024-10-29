package com.example.markcutoffpercentilecalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class JEEPaper2Activity extends AppCompatActivity {
    private Button jeepaper2percent;
    private Button jeepaper2mark;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jeepaper2);
        jeepaper2percent = (Button) findViewById(R.id.jee2percent);
        jeepaper2mark = (Button) findViewById(R.id.jee2mark);
        jeepaper2percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jee2_percentActivity();
            }
        });
        jeepaper2mark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jee2_markActivity();
            }
        });
    }

    private void jee2_percentActivity() {
        Intent intent = new Intent(this,JEE2PercentActivity.class);
        startActivity(intent);
    }

    private void jee2_markActivity() {
        Intent intent = new Intent(this,JEE2MarkActivity.class);
        startActivity(intent);
    }
}