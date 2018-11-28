package com.example.kkali.kannadakali;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Convo4_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convo4);

        ArrayList<Convo4> convo4 = new ArrayList<Convo4>();

        convo4.add(new Convo4(R.drawable.passenger,R.drawable.conductor,"Sir! Nivu Bangalorige hogtira?    ","Howdu! Olage banni     ","Sir! Will you go to Bangalore?","Yes sure! Get inside"));
        convo4.add(new Convo4(R.drawable.passenger,R.drawable.conductor,"Sir ticket eshtu majesticge   ","Sorry sir navu KR marketge hogtivi       ","Sir how much is the ticket to majestic   ","Sorry Sir we are going to KR market"));
        convo4.add(new Convo4(R.drawable.passenger,R.drawable.conductor,"Paravagilla sir! Ticket eshtu?   ","30 rupees      ","No problem! how much is it?  ","30 rupees "));
        convo4.add(new Convo4(R.drawable.passenger,R.drawable.conductor,"eshtottige serutte allige?  ","10:30 AM sir      ","At what time we will reach there?  ","10:30 AM  sir "));
        convo4.add(new Convo4(R.drawable.passenger,R.drawable.conductor,"Dayavittu helli reach adaga   ","Sari sir!      ","Please tell when we reach   ","Ok sir! "));

        Convo4Adapter adapter = new Convo4Adapter(this,convo4);
        ListView listView = (ListView) findViewById(R.id.Convo4List);
        listView.setAdapter(adapter);
    }
}
