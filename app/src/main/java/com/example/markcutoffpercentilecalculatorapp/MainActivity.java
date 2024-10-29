package com.example.markcutoffpercentilecalculatorapp;

import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button SSLCbutton;
    private Button TNMAButton;
    private Button TNEAButton;
    private Button NEETButton;
    private Button ExitButton;
    private Button JEEButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OnBackPressedCallback callback = new OnBackPressedCallback(true /* enabled by default */) {
            @Override
            public void handleOnBackPressed() {
                // Handle the back button press here
                showAlert();
            }
        };
        // Add the callback to the back button dispatcher
        getOnBackPressedDispatcher().addCallback(this, callback);
        SSLCbutton = (Button) findViewById(R.id.sslc);
        TNMAButton = (Button) findViewById(R.id.tnma);
        TNEAButton = (Button) findViewById(R.id.buttontnea);
        NEETButton = (Button) findViewById(R.id.neet);
        ExitButton = (Button) findViewById(R.id.buttonExit);
        JEEButton = (Button) findViewById(R.id.buttonjee);
        JEEButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jeeActivity();
            }
        });
        ExitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exitConfirmation();
            }
        });
        NEETButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                neetActivity();
            }
        });
        SSLCbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sslcActivity();
            }
        });
        TNMAButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tnmaActivity();
            }
        });
        TNEAButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tneaActivity();
            }
        });
    }

    private void jeeActivity() {
        Intent intent = new Intent(this,JEEActivity.class);
        startActivity(intent);
    }

    private void exitConfirmation() {
        AlertDialog adme = new AlertDialog.Builder(MainActivity.this)
                .setTitle("Exit Confirmation")
                .setMessage("Are you sure to exit ?")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                })
                .setNegativeButton("Cancel",null)
                .create();
        adme.show();
    }

    private void neetActivity() {
        Intent intent = new Intent(this,NEETActivity.class);
        startActivity(intent);
    }

    private void tneaActivity() {
        Intent intent = new Intent(this,TNEAActivity.class);
        startActivity(intent);
    }


    private void tnmaActivity() {
        Intent intent = new Intent(this,TNMAActivity.class);
        startActivity(intent);
    }

    private void sslcActivity() {
        Intent intent = new Intent(this,SSLCActivity.class);
        startActivity(intent);
    }

    private void showAlert() {
        AlertDialog adme2 = new AlertDialog.Builder(MainActivity.this)
                .setTitle("Exit Confirmation")
                .setMessage("Are you sure to exit ?")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                })
                .setNegativeButton("Cancel",null)
                .create();
        adme2.show();
    }
}