package com.example.kkali.kannadakali;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Convo3_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convo3);

        ArrayList<Convo3> convo3 = new ArrayList<Convo3>();

        convo3.add(new Convo3(R.drawable.boy1,R.drawable.boy2,"Namaste Mohan. Hegidheeya?    ","Namaste Ramesh. Naanu chennagi idini. Neenu hegidheeya?","Hii Mohan. How are you?","Hello Ramesh,I am fine. How are you?"));
        convo3.add(new Convo3(R.drawable.boy1,R.drawable.boy2,"Nanu chennagidini","Neenu en madtha idhiya?","I am fine too !","So what do u do?"));
        convo3.add(new Convo3(R.drawable.boy1,R.drawable.boy2,"Naanu 2nd year Cse Vidyarthi","Yavu college??","I am a 2nd year Cse Student   ","Which college? "));
        convo3.add(new Convo3(R.drawable.boy1,R.drawable.boy2,"Sir M. Visvesvaraya Institute of technology  ","olleyedagali      ","Sir M. Visvesvaraya Institute of technology  ","Great !! "));
        convo3.add(new Convo3(R.drawable.boy1,R.drawable.boy2,"Neenu en madtha idhiya?  ","Naanu 2nd year Mech vidyarthi      ","What do you do?   ","I am a 2nd year Mech student"));
        convo3.add(new Convo3(R.drawable.boy1,R.drawable.boy2,"Yav college nalli?  ","Reva University     ","In which college?   ","Reva University "));
        convo3.add(new Convo3(R.drawable.boy1,R.drawable.boy2,"Mohan ninna whatsapp number kodu  ","9072215663    ","Mohan give me your whatsapp number  "," "));
        convo3.add(new Convo3(R.drawable.boy1,R.drawable.boy2,"Danyavada mohan  ","Sari! nange swalpa kelsa idhe. Amele Kare madtini    ","Thanks mohan  ","OK! I have some work. Call you later "));
        
        Convo3Adapter adapter = new Convo3Adapter(this,convo3);
        ListView listView = (ListView) findViewById(R.id.Convo3List);
        listView.setAdapter(adapter);
    }
}
