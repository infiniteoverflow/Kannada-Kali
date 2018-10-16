package com.example.kkali.kannadakali;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AlphabetsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabets);

        //Intent to SwaragaluActivity Activity
        TextView textview1 = (TextView)findViewById(R.id.Swaragula);
        textview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AlphabetsActivity.this,SwaragaluActivity.class);
                startActivity(intent);
            }
        });

        //Intent to YogavahagaluActivity Activity
        TextView textview2 = (TextView)findViewById(R.id.yogavahagalu);
        textview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AlphabetsActivity.this,YogavahagaluActivity.class);
                startActivity(intent);
            }
        });

        //Intent to VargiyaActivity vyanjanagalu Activity
        TextView textview3 = (TextView)findViewById(R.id.vargiya);
        textview3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AlphabetsActivity.this,VargiyaActivity.class);
                startActivity(intent);
            }
        });

        //Intent to AvargiyaActivity vyanjanagalu Activity
        TextView textview4 = (TextView)findViewById(R.id.avargiya);
        textview4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AlphabetsActivity.this,AvargiyaActivity.class);
                startActivity(intent);
            }
        });
    }
}
