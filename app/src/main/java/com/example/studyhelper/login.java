package com.example.studyhelper;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class login extends AppCompatActivity {

    Button button1;
    EditText editt1, editt2;
    String email = "vinod@gmail.com";
    String password = "vinod";
    final Context context = this;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView textView=findViewById(R.id.textView76);
        Intent intent=getIntent();
        String s = intent.getStringExtra(MainActivity.Data);
        textView.setText(s);


        button1 = (Button) findViewById(R.id.button500);
        button1.setEnabled(false);
        editt1 = (EditText) findViewById(R.id.editText500);
        editt2 = (EditText) findViewById(R.id.editText501);
        editt1.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (editt1.getText().toString().equals(email) &&
                        editt2.getText().toString().equals(password)) {
                    button1.setEnabled(true);
                } else {
                    button1.setEnabled(false);
                }


            }

            public void afterTextChanged(Editable s) {

            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {
                // TODO Auto-generated method stub

            }


        });
        editt2.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (editt1.getText().toString().equals(email) &&
                        editt2.getText().toString().equals(password)) {
                    button1.setEnabled(true);
                } else {
                    button1.setEnabled(false);
                }


            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {
                // TODO Auto-generated method stub

            }

            @Override
            public void afterTextChanged(Editable s) {
                // TODO Auto-generated method stub

            }
        });


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editt1.getText().toString().equals(email) &&
                        editt2.getText().toString().equals(password)) {
                    Toast.makeText(getApplicationContext(),
                            "successfully login", Toast.LENGTH_LONG).show();
                    Intent i = new Intent(getApplicationContext(),Classes.class);
                    startActivity(i);


                } else {
                    Toast.makeText(getApplicationContext(), "invalid username or password", Toast.LENGTH_LONG).show();


                }
            }
        });


    }
}