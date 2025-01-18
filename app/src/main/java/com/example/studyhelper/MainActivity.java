package com.example.studyhelper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;

import java.util.Date;

public class MainActivity extends AppCompatActivity {
     public static final String Data=null ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }

    public void clickhere(View view) {
        EditText e1 = findViewById(R.id.editTextTextPersonName2);
        Intent intent=new Intent(this,login.class);
        String m1=e1.getText().toString();
        intent.putExtra(Data,m1);
        startActivity(intent);
    }
}