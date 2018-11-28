package com.example.kkali.kannadakali;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_num);

        ArrayList<Numbers> numbers = new ArrayList<Numbers>();

        numbers.add(new Numbers("ಶೂನ್ಯ","shoonya",R.drawable.zero,"#00e676"));
        numbers.add(new Numbers("ಒಂದು","ondu",R.drawable.one,"#8d6e63"));
        numbers.add(new Numbers("ಎರಡು","eradu",R.drawable.two,"#ffd54f"));
        numbers.add(new Numbers("ಮೂರು","mooru",R.drawable.three,"#ff6e40"));
        numbers.add(new Numbers("ನಾಲ್ಕು","nalku",R.drawable.four,"#90a4ae"));
        numbers.add(new Numbers("ಐದು","aydu",R.drawable.five,"#448aff"));
        numbers.add(new Numbers("ಆರು","aaru",R.drawable.six,"#ec407a"));
        numbers.add(new Numbers("ಏಳು","aellu",R.drawable.seven,"#4dd0e1"));
        numbers.add(new Numbers("ಎಂಟು","entu",R.drawable.eight,"#ff8f00"));
        numbers.add(new Numbers("ಒಂಬತ್ತು","ombattu",R.drawable.nine,"#ff3d00"));
        numbers.add(new Numbers("ಹತ್ತು","Hattu",R.drawable.ten,"#5c6bc0"));


        NumbersAdapter adapter = new NumbersAdapter(this,numbers);
        ListView listView = (ListView) findViewById(R.id.NumList);
        listView.setAdapter(adapter);
    }
}