package com.example.gymappfirst;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button alertMsg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        alertMsg=findViewById(R.id.alertMsg);

        AlertDialog.Builder myBuilder=new AlertDialog.Builder(MainActivity.this);

        myBuilder.setTitle("Window Option");
        myBuilder.setMessage("Are you sure to Quit?");
        myBuilder.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        myBuilder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                System.exit(0);
            }
        });


        alertMsg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myBuilder.show();
            }
        });

    }
}