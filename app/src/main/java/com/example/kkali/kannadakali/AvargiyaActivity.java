package com.example.kkali.kannadakali;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class AvargiyaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avargiya);

        ArrayList<Avargiya> avargiya = new ArrayList<Avargiya>();

        avargiya.add(new Avargiya(" ",R.drawable.ya,"#00e676"));
        avargiya.add(new Avargiya(" ",R.drawable.ra,"#8d6e63"));
        avargiya.add(new Avargiya(" ",R.drawable.la,"#ffd54f"));
        avargiya.add(new Avargiya(" ",R.drawable.va,"#ff6e40"));
        avargiya.add(new Avargiya(" ",R.drawable.ssa,"#90a4ae"));
        avargiya.add(new Avargiya(" ",R.drawable.sha,"#448aff"));
        avargiya.add(new Avargiya(" ",R.drawable.sa1,"#ec407a"));
        avargiya.add(new Avargiya(" ",R.drawable.ha,"#5985dd"));
        avargiya.add(new Avargiya(" ",R.drawable.lla,"#a2dd5a"));

        AvargiyaAdapter adapter = new AvargiyaAdapter(this,avargiya);
        ListView listView = (ListView) findViewById(R.id.avargList);
        listView.setAdapter(adapter);
    }
}
