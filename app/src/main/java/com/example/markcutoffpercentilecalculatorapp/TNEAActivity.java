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

public class TNEAActivity extends AppCompatActivity {
    private Button tneaCutoff;
    private EditText tneaphysicst,tneachemistryt,tneamathst;
    private TextView tneaResultt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tneaactivity);
        tneaResultt = (TextView) findViewById(R.id.tneaResult);
        tneaphysicst = (EditText) findViewById(R.id.tneaPhysics);
        tneachemistryt = (EditText) findViewById(R.id.tneaChemistry);
        tneamathst = (EditText) findViewById(R.id.tneaMaths);
        tneaCutoff = (Button) findViewById(R.id.tneaCutoffButton);
        tneaCutoff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateTNEACutoff();
            }
        });
    }

    private void calculateTNEACutoff() {
        float physicst,mathst,chemistryt;
        float tneaphysics,tneamaths,tneachemistry;
        double totaltnea;
        String tt2;
        if(TextUtils.isEmpty(tneaphysicst.getText().toString()) || TextUtils.isEmpty(tneachemistryt.getText().toString()) || TextUtils.isEmpty(tneamathst.getText().toString()))
        {
            alert("Enter valid marks");
        }
        else
        {
            physicst = Float.parseFloat(tneaphysicst.getText().toString());
            mathst = Float.parseFloat(tneamathst.getText().toString());
            chemistryt = Float.parseFloat(tneachemistryt.getText().toString());
            if(mathst <= 100.00 || chemistryt <= 100.00 || physicst <= 100.00 )
            {
                tneamaths = (float) (mathst);
                tneachemistry =  (float)(chemistryt/2.00);
                tneaphysics = (float)(physicst/2.00);
                totaltnea =  (tneamaths+tneachemistry+tneaphysics) * 100.00;
                totaltnea /= 100.00;
                tt2 = String.valueOf(totaltnea);
                tneaResultt.setText("Your cutoff is \n" + "  " +tt2);

            }
            else
            {
                alert("Marks are greater than 100");
            }
        }
    }

    private void alert(String msg) {
        AlertDialog warntnea = new AlertDialog.Builder(TNEAActivity.this)
                .setTitle("Warning !")
                .setMessage(msg)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                })
                .create();
        warntnea.show();
    }
}