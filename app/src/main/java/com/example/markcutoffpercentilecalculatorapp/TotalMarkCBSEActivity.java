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

public class TotalMarkCBSEActivity extends AppCompatActivity {
    private EditText s1,s2,s3,s4,s5,s6;
    private Button calculateCGPAsslc;
    private TextView resultCPGAsslc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_total_mark_cbseactivity);
        s1 = (EditText) findViewById(R.id.editTextNumber);
        s2 = (EditText) findViewById(R.id.editTextNumber2);
        s3 = (EditText) findViewById(R.id.editTextNumber3);
        s4 = (EditText) findViewById(R.id.editTextNumber4);
        s5 = (EditText) findViewById(R.id.editTextNumber5);
        s6 = (EditText) findViewById(R.id.editTextNumber6);
        calculateCGPAsslc = (Button) findViewById(R.id.calculateCGPA);
        resultCPGAsslc = (TextView) findViewById(R.id.resultCBSEsslc);
        calculateCGPAsslc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculateSSLC_CGPA();
            }
        });
    }

    private void calculateSSLC_CGPA() {
        float S1,S2,S3,S4,S5,S6;
        double totalGPA,temp;
        if(TextUtils.isEmpty(s1.getText().toString()) || TextUtils.isEmpty(s2.getText().toString()) || TextUtils.isEmpty(s3.getText().toString()) || TextUtils.isEmpty(s4.getText().toString()) || TextUtils.isEmpty(s5.getText().toString()) || TextUtils.isEmpty(s6.getText().toString()))
        {
            alert("Enter valid GPA");
        }
        else
        {
            S1 = Float.parseFloat(s1.getText().toString());
            S2 = Float.parseFloat(s2.getText().toString());
            S3 = Float.parseFloat((s3.getText().toString()));
            S4 = Float.parseFloat((s4.getText().toString()));
            S5 = Float.parseFloat(s5.getText().toString());
            S6 = Float.parseFloat(s6.getText().toString());
            temp = (double) (S1+S2+S3+S4+S5+S6)/6;
            temp = Math.round(temp*100);
            totalGPA = temp/100;
            resultCPGAsslc.setText("CGPA is " + totalGPA);
        }
    }

    private void alert(String message) {
        AlertDialog warn3 = new AlertDialog.Builder(TotalMarkCBSEActivity.this)
                .setTitle("Warning !")
                .setMessage(message)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                })
                .create();
        warn3.show();
    }
}