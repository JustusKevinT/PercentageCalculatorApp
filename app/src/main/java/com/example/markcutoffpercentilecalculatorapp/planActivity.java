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

public class planActivity extends AppCompatActivity {
    private Button plancalculate;
    private TextView planmarkResult;
    private EditText plancorrectr,planincorrectr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plan);
        plancalculate = (Button) findViewById(R.id.calculateplanmark);
        planmarkResult = (TextView) findViewById(R.id.planresult);
        plancorrectr = (EditText) findViewById(R.id.plancr);
        planincorrectr = (EditText) findViewById(R.id.planicr);
        plancalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate_planmark();
            }
        });
    }

    private void calculate_planmark() {
        int cresponse,icresponse,temp,planmark;
        String planr;
        if(TextUtils.isEmpty(plancorrectr.getText().toString()) || TextUtils.isEmpty(planincorrectr.getText().toString()))
        {
            alert("Enter valid details");
        }
        else
        {
            cresponse = Integer.parseInt(plancorrectr.getText().toString());
            icresponse = Integer.parseInt(planincorrectr.getText().toString());
            temp = (cresponse*4) - (icresponse*1);
            planmark = (int)(temp);
            planr = String.valueOf(planmark);
            planmarkResult.setText("Your mark is \n" + planr);
        }
    }

    private void alert(String msg) {
        AlertDialog planwarn = new AlertDialog.Builder(planActivity.this)
                .setTitle("Warning !")
                .setMessage(msg)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .create();
        planwarn.show();
    }
}