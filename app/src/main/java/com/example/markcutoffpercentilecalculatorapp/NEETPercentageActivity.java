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

public class NEETPercentageActivity extends AppCompatActivity {
    private Button calculate_NEETPercent;
    private EditText neetMark,neetTopMark;
    private TextView neetPercentResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_neetpercentage);
        neetPercentResult = (TextView) findViewById(R.id.percentResult);
        neetMark = (EditText) findViewById(R.id.neetmark);
        neetTopMark = (EditText) findViewById(R.id.neettopmark);
        calculate_NEETPercent = (Button) findViewById(R.id.calculateneetPercent);
        calculate_NEETPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate_Percent_NEET();
            }
        });
    }

    private void calculate_Percent_NEET() {
        int neetm,neettm;
        float neetp,temp;
        String neet_percent;
        if(TextUtils.isEmpty(neetMark.getText().toString()) || TextUtils.isEmpty(neetTopMark.getText().toString()))
        {
            alert("Enter valid marks");
        }
        else
        {
            neetm = Integer.parseInt(neetMark.getText().toString());
            neettm = Integer.parseInt(neetTopMark.getText().toString());
            temp = (float) (neetm*100.00);
            neetp =  (float) (temp/neettm);
            temp = (float) (neetp*100.00);
            neetp = (float) (temp / 100.00);
            neet_percent = String.valueOf(neetp);
            neetPercentResult.setText("Your percentile is \n" + neet_percent);
        }
    }

    private void alert(String msg) {
        AlertDialog warnneet = new AlertDialog.Builder(NEETPercentageActivity.this)
                .setTitle("Warning !")
                .setMessage(msg)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .create();
        warnneet.show();
    }
}