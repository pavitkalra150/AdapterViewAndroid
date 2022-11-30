package com.example.adapterviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String weekday = getIntent().getStringExtra("WeekDay");
        TextView text = findViewById(R.id.text);

        if(weekday != null){
        text.setText(weekday);
        }
    }
}