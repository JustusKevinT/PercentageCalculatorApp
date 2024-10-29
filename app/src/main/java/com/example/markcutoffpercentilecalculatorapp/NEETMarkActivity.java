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

public class NEETMarkActivity extends AppCompatActivity {
    private Button calculate_neetmark;
    private TextView neetresult;
    private EditText correctR,incorrectR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_neetmark);
        correctR = (EditText) findViewById(R.id.correctresponse);
        incorrectR = (EditText) findViewById(R.id.incorrectresponse);
        neetresult = (TextView) findViewById(R.id.neetResultMark);
        calculate_neetmark = (Button) findViewById(R.id.calculateneetmarkbt);
        calculate_neetmark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate_neetMark();
            }
        });
    }

    private void calculate_neetMark() {
        int responseC , responseIR;
        String result_neet;
        int temp,neetmark_result;
        if(TextUtils.isEmpty(correctR.getText().toString()) || TextUtils.isEmpty(incorrectR.getText().toString()))
        {
            alert("Enter valid data");
        }
        else
        {
            responseC = Integer.parseInt(correctR.getText().toString());
            responseIR = Integer.parseInt(incorrectR.getText().toString());
            temp = (responseC*4) - (responseIR*1);
            neetmark_result = (int) temp;
            result_neet = String.valueOf(neetmark_result);
            neetresult.setText("Your mark is \n" + result_neet);
        }
    }

    private void alert(String msg) {
        AlertDialog alertneet2 = new AlertDialog.Builder(NEETMarkActivity.this)
                .setTitle("Warning !")
                .setMessage(msg)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .create();
        alertneet2.show();

    }
}