package com.example.markcutoffpercentilecalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SSLCActivity extends AppCompatActivity {
    private Button stateboardButton;
    private Button cbseButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sslcactivity);
        stateboardButton = (Button) findViewById(R.id.state_board);
        cbseButton = (Button) findViewById(R.id.cbse);
        stateboardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stateboardActivity();
            }
        });
        cbseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cbseActivity();
            }
        });

    }

    private void cbseActivity() {
        Intent intent = new Intent(this,CBSEActivity.class);
        startActivity(intent);
    }

    private void stateboardActivity() {
        Intent intent = new Intent(this,StateBoardActivity.class);
        startActivity(intent);
    }
}