package com.example.studyhelper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BSC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bsc);
        Button button = findViewById(R.id.button47);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),BSC_SEM1.class);
                startActivity(i);
            }
        });
        Button button1 = findViewById(R.id.button48);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),BSC_SEM2.class);
                startActivity(i);
            }
        });
        Button button2 = findViewById(R.id.button49);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),BSC_SEM3.class);
                startActivity(i);
            }
        });
        Button button3 = findViewById(R.id.button50);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),BSC_SEM4.class);
                startActivity(i);
            }
        });
        Button button4 = findViewById(R.id.button51);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),BSC_SEM5.class);
                startActivity(i);
            }
        });
        Button button5 = findViewById(R.id.button52);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),BSC_SEM6.class);
                startActivity(i);
            }
        });
       
    }
}