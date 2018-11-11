package com.example.kkali.kannadakali;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class WordsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_words);

        ArrayList<Words> words = new ArrayList<Words>();

        words.add(new Words(" "," "));
        words.add(new Words(" "," "));
        words.add(new Words(" "," "));
        words.add(new Words(" "," "));
        words.add(new Words(" "," "));
        words.add(new Words(" "," "));
        words.add(new Words(" "," "));
        words.add(new Words(" "," "));
        words.add(new Words(" "," "));
        words.add(new Words(" "," "));
        words.add(new Words(" "," "));
        words.add(new Words(" "," "));
        words.add(new Words(" "," "));
        words.add(new Words(" "," "));
        words.add(new Words(" "," "));
        words.add(new Words(" "," "));
        words.add(new Words(" "," "));
        words.add(new Words(" "," "));
        words.add(new Words(" "," "));
        words.add(new Words(" "," "));
        words.add(new Words(" "," "));
        words.add(new Words(" "," "));
        words.add(new Words(" "," "));
        words.add(new Words(" "," "));
        words.add(new Words(" "," "));
        words.add(new Words(" "," "));
        words.add(new Words(" "," "));
        words.add(new Words(" "," "));
        words.add(new Words(" "," "));
        words.add(new Words(" "," "));


        WordsAdapter adapter = new WordsAdapter(this,words);
        ListView listView = (ListView) findViewById(R.id.wordsList);
        listView.setAdapter(adapter);
    }
}
