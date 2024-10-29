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

public class PercentSBActivity extends AppCompatActivity {
    private Button percent;
    private EditText totalmarks;
    private TextView resultView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_percent_sbactivity);
        percent = (Button) findViewById(R.id.calculate_percent_sslc_sb_button);
        totalmarks = (EditText) findViewById(R.id.t_marks_sslc_sb);
        resultView = (TextView) findViewById(R.id.result_sslc_sb_percent);
        percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculateInPercent();
            }
        });


    }

    private void calculateInPercent() {
        if(TextUtils.isEmpty(totalmarks.getText().toString()))
        {
            alert("Enter a valid total marks");
        }
        else
        {
            int tmarks, temp;
            int percentResult;
            tmarks = Integer.parseInt(totalmarks.getText().toString());
            temp = tmarks * 100;
            percentResult = temp / 500;
            resultView.setText("Percentage is " + percentResult + " %");
        }
    }

    private void alert(String message) {
        AlertDialog warn2 = new AlertDialog.Builder(PercentSBActivity.this)
                .setTitle("Warning !")
                .setMessage(message)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                })
                .create();
        warn2.show();
    }
}