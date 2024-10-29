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

public class JEEp1Percent_Activity extends AppCompatActivity {
    private Button jp1Percentbt;
    private TextView jp1Pr;
    private EditText totalc,cless;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jeep1_percent);
        cless = (EditText) findViewById(R.id.candidateless);
        totalc = (EditText) findViewById(R.id.candidatetotal);
        jp1Pr = (TextView) findViewById(R.id.jeep1Percent);
        jp1Percentbt = (Button) findViewById(R.id.buttonjp1percent);
        jp1Percentbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate_JEEpercent();
            }
        });
    }

    private void calculate_JEEpercent() {
        int candidatet,candidatel;
        String resultpj1;
        float temp,jeep1percentile;
        if(TextUtils.isEmpty(cless.getText().toString()) || TextUtils.isEmpty(totalc.getText().toString()))
        {
            alert("Enter valid details");
        }
        else
        {
            candidatel = Integer.parseInt(cless.getText().toString());
            candidatet = Integer.parseInt(totalc.getText().toString());
            temp = (float) (100*candidatel);
            jeep1percentile = (float) (temp/candidatet);
            resultpj1 = String.valueOf(jeep1percentile);
            jp1Pr.setText("Your Percentile is \n" + resultpj1);
        }
    }

    private void alert(String msg) {
        AlertDialog warnjp1p = new AlertDialog.Builder(JEEp1Percent_Activity.this)
                .setTitle("Warning !")
                .setMessage(msg)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .create();
        warnjp1p.show();
    }
}