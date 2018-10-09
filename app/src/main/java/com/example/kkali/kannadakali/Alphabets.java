package com.example.kkali.kannadakali;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;

public class Alphabets extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabets);

        //Intent to Swaragalu Activity
        TextView textview1 = (TextView)findViewById(R.id.Swaragula);
        textview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Alphabets.this,Swaragalu.class);
                startActivity(intent);
            }
        });

        //Intent to Yogavahagalu Activity
        TextView textview2 = (TextView)findViewById(R.id.yogavahagalu);
        textview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Alphabets.this,Yogavahagalu.class);
                startActivity(intent);
            }
        });

        //Intent to Vargiya vyanjanagalu Activity
        TextView textview3 = (TextView)findViewById(R.id.vargiya);
        textview3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Alphabets.this,Vargiya.class);
                startActivity(intent);
            }
        });

        //Intent to Avargiya vyanjanagalu Activity
        TextView textview4 = (TextView)findViewById(R.id.avargiya);
        textview4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Alphabets.this,Avargiya.class);
                startActivity(intent);
            }
        });
    }
}
