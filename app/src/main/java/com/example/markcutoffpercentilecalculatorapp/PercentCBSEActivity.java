package com.example.markcutoffpercentilecalculatorapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PercentCBSEActivity extends AppCompatActivity {
    private Button CGPAPercent;
    private EditText CGPA;
    private TextView resultCGPAPercent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_percent_cbseactivity);
        CGPAPercent = (Button) findViewById(R.id.CGPAPercent);
        CGPA = (EditText) findViewById(R.id.CGPA);
        resultCGPAPercent = (TextView) findViewById(R.id.resultCGPAPercent);
        CGPAPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculatePercent_CGPA_SSLC();
            }
        });
    }

    private void calculatePercent_CGPA_SSLC() {
        float givenCGPA,resultPercent;
        if(TextUtils.isEmpty(CGPA.getText().toString()))
        {
            alert("Enter a valid CGPA");
        }
        else
        {
            givenCGPA = Float.parseFloat(CGPA.getText().toString());
            resultPercent = (float) (givenCGPA*9.5);
            resultCGPAPercent.setText("Percentage is " + resultPercent + " %");
        }
    }

    private void alert(String message) {
        AlertDialog warn4 = new AlertDialog.Builder(PercentCBSEActivity.this)
                .setTitle("Warning !")
                .setMessage(message)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                })
                .create();
        warn4.show();
    }
}