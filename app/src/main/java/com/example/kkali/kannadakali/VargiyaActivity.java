package com.example.kkali.kannadakali;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class VargiyaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vargiya);

        ArrayList<Vargiya> vargiya = new ArrayList<Vargiya>();

        vargiya.add(new Vargiya("ಕಲಮು - Kalamu - Pen",R.drawable.ka,"#00e676"));
        vargiya.add(new Vargiya("ಖಡ್ಗ - Khadga - Sword",R.drawable.kha,"#8d6e63"));
        vargiya.add(new Vargiya("ಗದೆ - Gadhe - Mace",R.drawable.ga,"#ffd54f"));
        vargiya.add(new Vargiya("ಘನ - Ghana - Solid",R.drawable.gha,"#ff6e40"));
        vargiya.add(new Vargiya(" ",R.drawable.nga,"#90a4ae"));
        vargiya.add(new Vargiya(" ",R.drawable.cha,"#448aff"));
        vargiya.add(new Vargiya(" ",R.drawable.chha,"#ec407a"));
        vargiya.add(new Vargiya(" ",R.drawable.ja,"#4dd0e1"));
        vargiya.add(new Vargiya(" ",R.drawable.jha,"#ff8f00"));
        vargiya.add(new Vargiya(" ",R.drawable.nnya,"#ff3d00"));
        vargiya.add(new Vargiya(" ",R.drawable.tta,"#5c6bc0"));
        vargiya.add(new Vargiya(" ",R.drawable.ttha,"#00e676"));
        vargiya.add(new Vargiya(" ",R.drawable.da,"#ffd54f"));
        vargiya.add(new Vargiya(" ",R.drawable.dha,"#8d6e63"));
        vargiya.add(new Vargiya(" ",R.drawable.nha,"#ffd54f"));
        vargiya.add(new Vargiya(" ",R.drawable.ta,"#ff6e40"));
        vargiya.add(new Vargiya(" ",R.drawable.tha,"#90a4ae"));
        vargiya.add(new Vargiya(" ",R.drawable.da1,"#448aff"));
        vargiya.add(new Vargiya(" ",R.drawable.dha1,"#ec407a"));
        vargiya.add(new Vargiya(" ",R.drawable.na,"#4dd0e1"));
        vargiya.add(new Vargiya(" ",R.drawable.pa,"#ff8f00"));
        vargiya.add(new Vargiya(" ",R.drawable.pha,"#ff3d00"));
        vargiya.add(new Vargiya(" ",R.drawable.ba,"#5c6bc0"));
        vargiya.add(new Vargiya(" ",R.drawable.bha,"#00e676"));
        vargiya.add(new Vargiya(" ",R.drawable.ma,"#ffd54f"));

        VargiyaAdapter adapter = new VargiyaAdapter(this,vargiya);
        ListView listView = (ListView) findViewById(R.id.vargList);
        listView.setAdapter(adapter);
    }
}
