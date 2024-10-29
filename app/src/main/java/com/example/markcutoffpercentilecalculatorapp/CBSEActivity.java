package com.example.markcutoffpercentilecalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CBSEActivity extends AppCompatActivity {
    private Button totalmarkscbseButton;
    private Button percentcbseButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cbseactivity);
        totalmarkscbseButton = (Button) findViewById(R.id.total_marks_cbse);
        percentcbseButton = (Button) findViewById(R.id.mark_percent_cbse);
        totalmarkscbseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                totalmarkscbseActivity();
            }
        });
        percentcbseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                percentcbseActivity();
            }
        });
    }

    private void percentcbseActivity() {
        Intent intent = new Intent(this,PercentCBSEActivity.class);
        startActivity(intent);
    }

    private void totalmarkscbseActivity() {
        Intent intent = new Intent(this,TotalMarkCBSEActivity.class);
        startActivity(intent);
    }
}