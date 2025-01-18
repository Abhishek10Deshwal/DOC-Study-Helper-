package com.example.studyhelper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class bca_sem_1_CF extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bca_sem1_cf);

        {
            Button button = findViewById(R.id.button177);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(getApplicationContext(), BCA_SEM_1_CF_U1.class);
                    startActivity(i);
                }
            });
        };
         Button b2 = findViewById(R.id.button178);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext() ,BCA_SEM_CF_U2.class);
                startActivity(i);
            }
        });
        final Button button2 = findViewById(R.id.button179);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext() ,BCA_SEM_CF_U3.class);
                startActivity(i);
            }
        });
        final Button button3 = findViewById(R.id.button180);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext() ,BCA_SEM_CF_U4.class);
                startActivity(i);
            }
        });
    }
}