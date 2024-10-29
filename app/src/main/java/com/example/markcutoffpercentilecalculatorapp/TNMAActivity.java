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

public class TNMAActivity extends AppCompatActivity {
    private EditText tnmaphysicst,tnmabiologyt,tnmachemistryt;
    private Button tnmaCutoff;
    private TextView tnmaResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tnmaactivity);
        tnmachemistryt = (EditText) findViewById(R.id.tnmaChemistry);
        tnmabiologyt = (EditText) findViewById(R.id.tnmaBiology);
        tnmaphysicst = (EditText) findViewById(R.id.tnmaPhysics);
        tnmaResult = (TextView) findViewById(R.id.tnmaresult);
        tnmaCutoff = (Button) findViewById(R.id.tnmacutoff);
        tnmaCutoff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateTNMACutoff();
            }
        });
    }

    private void calculateTNMACutoff() {
        String tt;
        float physicst,chemistryt,biologyt;
        float tnmaphysics,tnmabiology,tnmachemistry;
        double totaltnma;
        if(TextUtils.isEmpty(tnmachemistryt.getText().toString()) || TextUtils.isEmpty(tnmabiologyt.getText().toString()) || TextUtils.isEmpty(tnmaphysicst.getText().toString()))
        {
            alert("Enter valid marks");
        }
        else
        {
            physicst = Float.parseFloat(tnmaphysicst.getText().toString());
            biologyt = Float.parseFloat(tnmabiologyt.getText().toString());
            chemistryt = Float.parseFloat(tnmachemistryt.getText().toString());
            if(biologyt <= 100.00 || chemistryt <= 100.00 || physicst <= 100.00 )
            {
                tnmabiology = (float) (biologyt/2.00);
                tnmachemistry =  (float)(chemistryt/4.00);
                tnmaphysics = (float)(physicst/4.00);
                totaltnma =  (tnmabiology+tnmachemistry+tnmaphysics) * 100.00;
                totaltnma /= 100.00;
                tt = String.valueOf(totaltnma);
                tnmaResult.setText("Your cutoff is \n" + "  " +tt);

            }
            else
            {
                alert("Marks are greater than 100");
            }
        }
    }


    private void alert(String msg) {
        AlertDialog warntnma = new AlertDialog.Builder(TNMAActivity.this)
                .setTitle("Warning !")
                .setMessage(msg)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                })
                .create();
        warntnma.show();
    }
}