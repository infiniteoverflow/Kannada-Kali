package com.example.kkali.kannadakali;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Intent to Alphabets Activity
        TextView textView = (TextView)findViewById(R.id.alphabets);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Alphabets.class);
                startActivity(i);
            }
        });

        //Intent to Numbers Activity
        TextView textView2 = (TextView)findViewById(R.id.numbers);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Numbers.class);
                startActivity(i);
            }
        });

        //Intent to Family Activity
        TextView textView3 = (TextView)findViewById(R.id.family);
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Family.class);
                startActivity(i);
            }
        });

        //Intent to Conversation Activity
        TextView textView4 = (TextView)findViewById(R.id.convo);
        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Convo.class);
                startActivity(i);
            }
        });

        //Intent to Phrases Activity
        TextView textView5 = (TextView)findViewById(R.id.phrases);
        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Phrases.class);
                startActivity(i);
            }
        });

        //Intent to Words Activity
        TextView textView6 = (TextView)findViewById(R.id.words);
        textView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Words.class);
                startActivity(i);
            }
        });
    }

    public void feedback(View view)
    {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra(Intent.EXTRA_SUBJECT,"Feedback for the app");
        intent.putExtra(Intent.EXTRA_EMAIL,"aswinrethi@gmail.com");

        if(intent.resolveActivity(getPackageManager())!=null)
        {
            startActivity(Intent.createChooser(intent, "Send Email"));
        }
    }
}
