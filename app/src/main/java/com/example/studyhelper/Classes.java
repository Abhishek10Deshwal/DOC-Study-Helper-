package com.example.studyhelper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.speech.SpeechRecognizer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Classes extends AppCompatActivity {
   // public static final String Data1=null ;
   ImageButton imageButton;
    int count=0;
    SpeechRecognizer speechRecognizer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classes);
     TextView textView=findViewById(R.id.t2);
        Intent intent=getIntent();
        String s = intent.getStringExtra(MainActivity.Data);
        textView.setText(s);

        final Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),BCA.class);
                startActivity(i);
            }
        });
        final Button button1 = findViewById(R.id.button3);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),BSC.class);
                startActivity(i);
            }
        });
        final Button button2 = findViewById(R.id.button4);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),BCOM.class);
                startActivity(i);
            }
        });
        final Button button3 = findViewById(R.id.button5);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),BA.class);
                startActivity(i);
            }
        });
        final Button button4 = findViewById(R.id.button6);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),MA.class);
                startActivity(i);
            }
        });
        final Button button5 = findViewById(R.id.button300);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),googleweb.class);
                startActivity(i);
            }
        });
        final Button button6 = findViewById(R.id.button301);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),accesweb.class);
                startActivity(i);
            }
        });
        final Button button8 = findViewById(R.id.button408);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),tiktio.class);
                startActivity(i);
            }
        });
    }

}