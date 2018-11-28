package com.example.kkali.kannadakali;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Convo2_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convo2);

        ArrayList<Convo2> convo2 = new ArrayList<Convo2>();

        convo2.add(new Convo2(R.drawable.student,R.drawable.teacher,"Namaskara Sir !!    ","Namaskara, Neevu yaaru??             ","Hello Sir !!","Hello, Who are you?"));
        convo2.add(new Convo2(R.drawable.student,R.drawable.teacher,"Nanna hesaru Jacob,Sir !   ","Sari ! Nivu yava class alli oduttiddiya?       ","My name is Jacob,Sir !   ","OK ! Which class do u study? "));
        convo2.add(new Convo2(R.drawable.student,R.drawable.teacher,"Nanna hesaru Jacob,Sir !   ","Sari Sari !!      ","I am studying in 11th standard Sir   ","OK ! OK ! "));
        convo2.add(new Convo2(R.drawable.student,R.drawable.teacher,"Niivu yaaru Sir?   ","Naanu Kannada adhyaapaka      ","Who are you Sir?   ","I am a Kannada teacher "));
        convo2.add(new Convo2(R.drawable.student,R.drawable.teacher,"Nimma hesaru ennu Sir?   ","Nanna hesaru Ramesh      ","What is your name Sir?   ","My name is Ramesh "));
        convo2.add(new Convo2(R.drawable.teacher,R.drawable.student,"Nimma rajya yaavudu?   ","Nanna rajya Kerala     ","Which is your state?   ","My state is Kerala "));
        convo2.add(new Convo2(R.drawable.student,R.drawable.teacher,"Sari Sir ! Nanage class ide. Amele sigona   ","Sari Sari !! Bye      ","Ok Sir! I have class now ! See you later  ","OK OK !! Bye "));

        Convo2Adapter adapter = new Convo2Adapter(this,convo2);
        ListView listView = (ListView) findViewById(R.id.Convo2List);
        listView.setAdapter(adapter);
    }
}
