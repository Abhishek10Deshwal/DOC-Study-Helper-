package com.example.studyhelper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ba);
        Button button = findViewById(R.id.button59);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),BA_SEM1.class);
                startActivity(i);
            }
        });
        Button button1 = findViewById(R.id.button60);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),BA_SEM2.class);
                startActivity(i);
            }
        });
        Button button2 = findViewById(R.id.button61);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),BA_SEM3.class);
                startActivity(i);
            }
        });
        Button button3 = findViewById(R.id.button62);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),BA_SEM4.class);
                startActivity(i);
            }
        }); Button button4 = findViewById(R.id.button63);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),BA_SEM5.class);
                startActivity(i);
            }
        }); Button button5 = findViewById(R.id.button64);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),BA_SEM6.class);
                startActivity(i);
            }
        });



    }
}