package com.example.textext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Bueno extends AppCompatActivity {
    EditText ca1,ca2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bueno);
        ca1   = (EditText) findViewById(R.id.cad1);
        ca2 = (EditText) findViewById(R.id.cad2);

        String a=getIntent().getStringExtra("a");
        ca1.setText(a);
        String b=getIntent().getStringExtra("b");
        ca2.setText(b);
    }
}