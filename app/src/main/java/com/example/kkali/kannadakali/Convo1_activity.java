package com.example.kkali.kannadakali;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Convo1_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convo1);

        ArrayList<Convo1> convo1 = new ArrayList<Convo1>();

        convo1.add(new Convo1(R.drawable.shopkeeper,R.drawable.ladycustomer,"Namaskara Madam !!    ","Namaskara, Ondu kilo alugedegge yeshtu??             ","Hello Madam !!","Hello, How much for 1 kilo Potato?"));
        convo1.add(new Convo1(R.drawable.shopkeeper,R.drawable.ladycustomer,"Ipattu rupees madam   ","Sari ! eradu kilo kodi       ","20 rupees Madam   ","OK ! Give 2 kilo"));
        convo1.add(new Convo1(R.drawable.shopkeeper,R.drawable.ladycustomer,"Matte nimage yen beku madam?   ","Ondu kilo Tomato yeshtu?      ","What do you want next madam?   ","How much for 1 kilo tomato? "));
        convo1.add(new Convo1(R.drawable.shopkeeper,R.drawable.ladycustomer,"Hadinaidu rupees madam   ","Sari ! adhu eradu kilo kodi      ","15 rupees madam  ","OK ! That you give 2 kilo "));
        convo1.add(new Convo1(R.drawable.ladycustomer,R.drawable.shopkeeper,"Total yeshtaytu Sir?   ","Total nalvattu rupees aytu madam      ","How much is the total Sir?   ","Total is 40 rupees madam "));
        convo1.add(new Convo1(R.drawable.ladycustomer,R.drawable.shopkeeper,"Sari!  ","Danyavada madam     ","Ok! Here you go   ","Thank you madam "));

        Convo1Adapter adapter = new Convo1Adapter(this,convo1);
        ListView listView = (ListView) findViewById(R.id.Convo1List);
        listView.setAdapter(adapter);
    }
}
