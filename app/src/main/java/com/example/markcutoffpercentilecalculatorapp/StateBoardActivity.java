package com.example.markcutoffpercentilecalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StateBoardActivity extends AppCompatActivity {
    private Button totalmarkssbButton;
    private Button percentsbButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_state_board);
        totalmarkssbButton = (Button) findViewById(R.id.total_marks_sb);
        percentsbButton = (Button) findViewById(R.id.mark_percent_sb);
        totalmarkssbButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                totalmarksbActivity();
            }
        });
        percentsbButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                percentsbActivity();
            }
        });

    }

    private void percentsbActivity() {
        Intent intent = new Intent(this,PercentSBActivity.class);
        startActivity(intent);
    }

    private void totalmarksbActivity() {
        Intent intent = new Intent(this,TotalMarkSBActivity.class);
        startActivity(intent);
    }
}