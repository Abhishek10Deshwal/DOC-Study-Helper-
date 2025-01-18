package com.example.studyhelper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ma);
        final Button button = findViewById(R.id.button65);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),MA_SEM1.class);
                startActivity(i);
            }
        });
        final Button button1 = findViewById(R.id.button66);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),MA_SEM2.class);
                startActivity(i);
            }
        });
        final Button button2 = findViewById(R.id.button67);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),MA_SEM3.class);
                startActivity(i);
            }
        });
        final Button button3 = findViewById(R.id.button68);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),MA_SEM4.class);
                startActivity(i);
            }
        });
    }
}