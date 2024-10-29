package com.example.markcutoffpercentilecalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class JEEActivity extends AppCompatActivity {
    private Button jeepaper1;
    private Button jeepaper2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jeeactivity);
        jeepaper1 = (Button) findViewById(R.id.buttonjeepaper1);
        jeepaper2 = (Button) findViewById(R.id.buttonjeepaper2);
        jeepaper2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jee_paper2Activity();
            }
        });
        jeepaper1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jee_paper1Activity();
            }
        });
    }

    private void jee_paper2Activity() {
        Intent intent = new Intent(this,JEEPaper2Activity.class);
        startActivity(intent);

    }

    private void jee_paper1Activity() {
        Intent intent = new Intent(this,JEEPaper1Activity.class);
        startActivity(intent);
    }
}