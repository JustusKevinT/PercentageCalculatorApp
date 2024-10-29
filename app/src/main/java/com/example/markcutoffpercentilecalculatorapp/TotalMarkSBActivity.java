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

public class TotalMarkSBActivity extends AppCompatActivity {
    private EditText l1,l2,math,science,socialscience;
    private TextView totalmarks;
    private Button calculateTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_total_mark_sbactivity);
        l1 = (EditText) findViewById(R.id.languageI);
        l2 = (EditText) findViewById(R.id.languageII);
        math = (EditText) findViewById(R.id.mathematics);
        science = (EditText) findViewById(R.id.science);
        socialscience = (EditText) findViewById(R.id.socialscience);
        calculateTotal = (Button) findViewById(R.id.calculatesbsslctotal);
        totalmarks = (TextView) findViewById(R.id.totalsslcsb);
        calculateTotal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculateTotalMarks();
            }
        });
    }

    private void calculateTotalMarks() {
        int language1,language2,maths,sci,socialsci;
        int total;
        if(TextUtils.isEmpty(l1.getText().toString()) || TextUtils.isEmpty(l2.getText().toString()) || TextUtils.isEmpty(math.getText().toString()) || TextUtils.isEmpty(science.getText().toString()) || TextUtils.isEmpty(socialscience.getText().toString()))
        {
            alert("Enter valid marks");
        }
        else
        {
            language1 = Integer.parseInt(l1.getText().toString());
            language2 = Integer.parseInt(l2.getText().toString());
            maths = Integer.parseInt(math.getText().toString());
            sci = Integer.parseInt(science.getText().toString());
            socialsci = Integer.parseInt(socialscience.getText().toString());
            if(language1 <= 100 || language2 <= 100 || maths <= 100 || sci <= 100 || socialsci <= 100)
            {
                total = language1+language2+maths+sci+socialsci;
                totalmarks.setText(" Total marks is " + total );
            }
            else
            {
                alert("Marks are greater than 100");
            }
        }
    }


    private void alert(String message) {
        AlertDialog warn = new AlertDialog.Builder(TotalMarkSBActivity.this)
                .setTitle("Warning !")
                .setMessage(message)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                })
                .create();
        warn.show();
    }
}

