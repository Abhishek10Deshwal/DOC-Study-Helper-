package com.example.studyhelper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BA_SEM2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ba_sem2);
        Button button = findViewById(R.id.button206);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),bca_sem_1_CF.class);
                startActivity(i);
            }
        });
        Button button1 = findViewById(R.id.button207);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),bca_sem_1_CF.class);
                startActivity(i);
            }
        });
        Button button2 = findViewById(R.id.button208);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),bca_sem_1_CF.class);
                startActivity(i);
            }
        });
        Button button3 = findViewById(R.id.button209);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),bca_sem_1_CF.class);
                startActivity(i);
            }
        });
        Button button4 = findViewById(R.id.button210);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),bca_sem_1_CF.class);
                startActivity(i);
            }
        });
        Button button5 = findViewById(R.id.button211);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),bca_sem_1_CF.class);
                startActivity(i);
            }
        });
    }
}