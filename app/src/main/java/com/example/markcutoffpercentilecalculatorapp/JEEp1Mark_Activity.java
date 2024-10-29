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

public class JEEp1Mark_Activity extends AppCompatActivity {
    private Button calculatep1Markjee;
    private EditText jeep1cr,jeep1icr;
    private TextView jeep1r;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jeep1_mark);
        jeep1cr = (EditText) findViewById(R.id.jeep1correctresponse);
        jeep1icr = (EditText) findViewById(R.id.jeep1incorrectresponse);
        jeep1r = (TextView) findViewById(R.id.jeep1markResult);
        calculatep1Markjee = (Button) findViewById(R.id.jeeP1mark);
        calculatep1Markjee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculatep1_Markjee();
            }
        });
    }

    private void calculatep1_Markjee() {
        int jeep1correctR,jeep1incorrectR;
        String jeep1Result;
        int temp,jeep1result;
        if(TextUtils.isEmpty(jeep1cr.getText().toString()) || TextUtils.isEmpty(jeep1icr.getText().toString()))
        {
            alert("Enter valid data");
        }
        else
        {
            jeep1correctR = Integer.parseInt(jeep1cr.getText().toString());
            jeep1incorrectR = Integer.parseInt(jeep1icr.getText().toString());
            temp = (jeep1correctR*4) - (jeep1incorrectR*1);
            jeep1result = (int) temp;
            jeep1Result = String.valueOf(jeep1result);
            jeep1r.setText("Your mark is \n" + jeep1Result);
        }

    }

    private void alert(String msg) {
        AlertDialog warnjp1 = new AlertDialog.Builder(JEEp1Mark_Activity.this)
                .setTitle("Warning !")
                .setMessage(msg)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .create();
        warnjp1.show();
    }
}