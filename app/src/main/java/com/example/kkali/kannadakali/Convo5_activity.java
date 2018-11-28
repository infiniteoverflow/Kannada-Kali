package com.example.kkali.kannadakali;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Convo5_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convo5);

        ArrayList<Convo5> convo5 = new ArrayList<Convo5>();

        convo5.add(new Convo5(R.drawable.shopkeeper,R.drawable.ladycustomer,"Namaskara Madam !!    ","Namaskara, Ondu kilo alugedegge yeshtu??             ","Hello Madam !!","Hello, How much for 1 kilo Potato?"));
        convo5.add(new Convo5(R.drawable.shopkeeper,R.drawable.ladycustomer,"Ipattu rupees madam   ","Sari ! eradu kilo kodi       ","20 rupees Madam   ","OK ! Give 2 kilo"));
        convo5.add(new Convo5(R.drawable.shopkeeper,R.drawable.ladycustomer,"Matte nimage yen beku madam?   ","Ondu kilo Tomato yeshtu?      ","What do you want next madam?   ","How much for 1 kilo tomato? "));
        convo5.add(new Convo5(R.drawable.shopkeeper,R.drawable.ladycustomer,"Hadinaidu rupees madam   ","Sari ! adhu eradu kilo kodi      ","15 rupees madam  ","OK ! That you give 2 kilo "));
        convo5.add(new Convo5(R.drawable.ladycustomer,R.drawable.shopkeeper,"Total yeshtaytu Sir?   ","Total nalvattu rupees aytu madam      ","How much is the total Sir?   ","Total is 40 rupees madam "));
        convo5.add(new Convo5(R.drawable.ladycustomer,R.drawable.shopkeeper,"Sari!  ","Danyavada madam     ","Ok! Here you go   ","Thank you madam "));

        Convo5Adapter adapter = new Convo5Adapter(this,convo5);
        ListView listView = (ListView) findViewById(R.id.Convo5List);
        listView.setAdapter(adapter);
    }
}
