package com.example.markcutoffpercentilecalculatorapp;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class archActivity extends AppCompatActivity {
    private Button archcalculate;
    private EditText archcorrectr,archincorrectr,archdrawing;
    private TextView archR;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arch);
        archcalculate = (Button) findViewById(R.id.buttonarchmark);
        archR = (TextView) findViewById(R.id.archresult);
        archcorrectr = (EditText) findViewById(R.id.archcr);
        archincorrectr = (EditText) findViewById(R.id.archicr);
        archdrawing = (EditText) findViewById(R.id.archDrawing);
        archcalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate_Arch();
            }
        });
    }

    private void calculate_Arch() {
        int archcresponse,archicresponse,archd,temp,archresultmark;
        String resultarch;
        if(TextUtils.isEmpty(archcorrectr.getText().toString()) || TextUtils.isEmpty(archincorrectr.getText().toString()) || TextUtils.isEmpty(archdrawing.getText().toString()))
        {
            alert("Enter valid data");
        }
        else
        {
            archcresponse = Integer.parseInt(archcorrectr.getText().toString());
            archicresponse = Integer.parseInt(archincorrectr.getText().toString());
            archd = Integer.parseInt(archdrawing.getText().toString());
            temp = (archcresponse*4) - (archicresponse*1);
            temp += (int)archd;
            archresultmark = (int)temp;
            resultarch = String.valueOf(archresultmark);
            archR.setText("Your mark is \n" + resultarch);
        }
    }

    private void alert(String msg) {
        AlertDialog warnarch = new AlertDialog.Builder(archActivity.this)
                .setTitle("Warning !")
                .setMessage(msg)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .create();
        warnarch.show();
    }
}