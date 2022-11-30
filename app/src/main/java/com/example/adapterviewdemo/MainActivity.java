package com.example.adapterviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //STEP CREATE DATASET
        String[] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        //STEP 2 CREATE ADAPTER
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1, weekdays);

        //STEP3 PLUG ADAPTER
        ListView list =  findViewById(R.id.list);
        list.setAdapter(adapter);

        //to reload data
        adapter.notifyDataSetChanged();


        //ON LIST ITEM CLICK AND PASS DATA TO NEXT SCREEN

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                //ON LIST ITEM CLICK
                Toast.makeText(MainActivity.this, weekdays[position], Toast.LENGTH_SHORT).show();

                //TO PASS TO NEXT SCREEN
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("WeekDay", weekdays[position]);
                startActivity(intent);

            }

        });



    }
}