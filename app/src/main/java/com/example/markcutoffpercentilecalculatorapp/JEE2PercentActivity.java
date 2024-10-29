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

public class JEE2PercentActivity extends AppCompatActivity {
    private Button calculatejee2Percent;
    private EditText j2totalc,j2lessc;
    private TextView j2pR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jee2_percent);
        j2pR = (TextView) findViewById(R.id.j2result);
        j2totalc = (EditText) findViewById(R.id.jee2ct);
        j2lessc = (EditText) findViewById(R.id.jee2cl);
        calculatejee2Percent = (Button)  findViewById(R.id.buttonj2percent);
        calculatejee2Percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jee2_Percentcalculate();
            }
        });
    }

    private void jee2_Percentcalculate() {
        int j2candidatet,j2candidatel;
        String j2r;
        float temp,jee2r;
        if(TextUtils.isEmpty(j2totalc.getText().toString()) || TextUtils.isEmpty(j2lessc.getText().toString()))
        {
            alert("Enter valid data");
        }
        else
        {
            j2candidatet = Integer.parseInt(j2totalc.getText().toString());
            j2candidatel = Integer.parseInt(j2lessc.getText().toString());
            temp = (float) (j2candidatel*100);
            jee2r = (float) (temp/j2candidatet);
            j2r = String.valueOf(jee2r);
            j2pR.setText("Your Percentile is \n" + j2r);
        }
    }

    private void alert(String msg) {
        AlertDialog warnj2 = new AlertDialog.Builder(JEE2PercentActivity.this)
                .setTitle("Warning !")
                .setMessage(msg)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .create();
        warnj2.show();
    }
}