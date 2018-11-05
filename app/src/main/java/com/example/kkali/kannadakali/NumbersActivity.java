package com.example.kkali.kannadakali;


import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_num);

        ArrayList<Word> numbers = new ArrayList<Word>();

        numbers.add(new Word("ಸೊನ್ನೆ","shoonya",R.drawable.zero,"#00e676"));
        numbers.add(new Word("ಒಂದು","ondu",R.drawable.one,"#8d6e63"));
        numbers.add(new Word("ಎರಡು","eradu",R.drawable.two,"#ffd54f"));
        numbers.add(new Word("ಮೂರು","mooru",R.drawable.three,"#ff6e40"));
        numbers.add(new Word("ನಾಲ್ಕು","nalku",R.drawable.four,"#90a4ae"));
        numbers.add(new Word("ಐದು","aydu",R.drawable.five,"#448aff"));
        numbers.add(new Word("ಆರು","aaru",R.drawable.six,"#ec407a"));
        numbers.add(new Word("ಏಳು","aellu",R.drawable.seven,"#4dd0e1"));
        numbers.add(new Word("ಎಂಟು","entu",R.drawable.eight,"#ff8f00"));
        numbers.add(new Word("ಒಂಬತ್ತು","ombattu",R.drawable.nine,"#ff3d00"));
        numbers.add(new Word("ಹತ್ತು","Hattu",R.drawable.ten,"#5c6bc0"));


        WordAdapter adapter = new WordAdapter(this,numbers);
        ListView listView = (ListView) findViewById(R.id.NumList);
        listView.setAdapter(adapter);

    }
}