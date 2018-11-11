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

        avargiya.add(new Avargiya("ಯಂತ್ರ - Yantra - Machine",R.drawable.ya,"#00e676"));
        avargiya.add(new Avargiya("ರಾಜ - Raja - King",R.drawable.ra,"#8d6e63"));
        avargiya.add(new Avargiya("ಲಂಡನ್ - London",R.drawable.la,"#ffd54f"));
        avargiya.add(new Avargiya("ವಾಯು - Vayu - Air",R.drawable.va,"#ff6e40"));
        avargiya.add(new Avargiya("ಶಂಖ - Shankha - Sea Shell",R.drawable.ssa,"#90a4ae"));
        avargiya.add(new Avargiya("ಪುರುಷ - Purusha - Male",R.drawable.sha,"#448aff"));
        avargiya.add(new Avargiya("ಸರಿ - Sari - OK",R.drawable.sa1,"#ec407a"));
        avargiya.add(new Avargiya("ಹಂಸ - Hamsa - Swan",R.drawable.ha,"#5985dd"));
        avargiya.add(new Avargiya("ಹಳ್ಳಿ - Halli - Village",R.drawable.lla,"#a2dd5a"));

        AvargiyaAdapter adapter = new AvargiyaAdapter(this,avargiya);
        ListView listView = (ListView) findViewById(R.id.avargList);
        listView.setAdapter(adapter);
    }
}
