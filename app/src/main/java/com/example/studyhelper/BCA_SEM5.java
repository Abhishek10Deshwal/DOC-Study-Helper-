package com.example.studyhelper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BCA_SEM5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bca_sem5);
        final Button button = findViewById(R.id.button89);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),bca_sem_1_CF.class);
                startActivity(i);
            }
        });
        final Button button1 = findViewById(R.id.button90);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),bca_sem_1_CF.class);
                startActivity(i);
            }
        });
        final Button button2 = findViewById(R.id.button91);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),bca_sem_1_CF.class);
                startActivity(i);
            }
        });
        final Button button3 = findViewById(R.id.button92);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),bca_sem_1_CF.class);
                startActivity(i);
            }
        });    final Button button4 = findViewById(R.id.button93);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),bca_sem_1_CF.class);
                startActivity(i);
            }
        });    final Button button5 = findViewById(R.id.button94);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),bca_sem_1_CF.class);
                startActivity(i);
            }
        });



    }
}