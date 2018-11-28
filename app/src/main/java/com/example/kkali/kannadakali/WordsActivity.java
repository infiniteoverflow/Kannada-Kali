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

        words.add(new Words("Teacher (Male) ","Adhyaapaka "));
        words.add(new Words("Teacher (Female) ","Adhyaapaki "));
        words.add(new Words("Maatru bhaashe ","Mother Tongue "));
        words.add(new Words("Raajya ","State "));
        words.add(new Words("Hesaru ","Name "));
        words.add(new Words("Ooru ","Native "));
        words.add(new Words("Baadige ","Rent "));
        words.add(new Words("Huduga ","Boy "));
        words.add(new Words("Wife ","Hendati "));
        words.add(new Words("Husband ","Ganda "));
        words.add(new Words("Chikka ","Small "));
        words.add(new Words("Dodda ","Big "));
        words.add(new Words("Sarkari ","Government "));
        words.add(new Words("Hosa ","New "));
        words.add(new Words("Meele ","On/Above "));
        words.add(new Words("Kelage","Below/Under "));
        words.add(new Words("Jaaga ","Space "));
        words.add(new Words("Eshtu ","How much "));
        words.add(new Words("Kadime ","Less "));
        words.add(new Words("Jaasti ","More "));
        words.add(new Words("Varsha ","Year "));
        words.add(new Words("Ivattu ","Today "));
        words.add(new Words("Nalle ","Tomorrow "));
        words.add(new Words("Nadiddu ","Day after tomorrow "));
        words.add(new Words("Ninne ","Yesterday "));
        words.add(new Words("Monne ","Day before yesterday "));
        words.add(new Words("Raja ","Holiday "));
        words.add(new Words("Gottilla ","Don't Know "));
        words.add(new Words("Bekku ","Cat "));


        WordsAdapter adapter = new WordsAdapter(this,words);
        ListView listView = (ListView) findViewById(R.id.wordsList);
        listView.setAdapter(adapter);
    }
}
