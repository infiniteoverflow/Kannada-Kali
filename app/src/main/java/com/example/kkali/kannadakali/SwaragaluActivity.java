package com.example.kkali.kannadakali;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class SwaragaluActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swaragalu);

        ArrayList<Swaragalu> swaragalu = new ArrayList<Swaragalu>();

        swaragalu.add(new Swaragalu("ಅಮೆರಿಕ - America",R.drawable.a,"#00e676"));
        swaragalu.add(new Swaragalu("ಆಫ್ರಿಕಾ - Africa",R.drawable.aah,"#8d6e63"));
        swaragalu.add(new Swaragalu("ಇಂಡಿಯಾ - India",R.drawable.e,"#ffd54f"));
        swaragalu.add(new Swaragalu("ಈಗ - Iga - Now",R.drawable.ee,"#ff6e40"));
        swaragalu.add(new Swaragalu("ಉಪಗ್ರಹ - Upagraha - Satellite",R.drawable.ou,"#90a4ae"));
        swaragalu.add(new Swaragalu("ಊಟ - Uta - Food",R.drawable.oou,"#448aff"));
        swaragalu.add(new Swaragalu("ಋಷಿ - Rhushi - Saint",R.drawable.ru,"#ec407a"));
        swaragalu.add(new Swaragalu("ಎಲೆ - Ele - Leaf",R.drawable.ae,"#4dd0e1"));
        swaragalu.add(new Swaragalu("ಏಣಿ - Eeni - Ladder",R.drawable.aae,"#ff8f00"));
        swaragalu.add(new Swaragalu("ಐದು - Aydu - Five",R.drawable.ai,"#ff3d00"));
        swaragalu.add(new Swaragalu("ಒಂಟೆ - Onte - Camel",R.drawable.o,"#5c6bc0"));
        swaragalu.add(new Swaragalu("ಓಡು - Odu - Run",R.drawable.ooh,"#00e676"));
        swaragalu.add(new Swaragalu("ಔಷಧಿ - Aushadhi - Medicine",R.drawable.au,"#ffd54f"));

        SwaragaluAdapter adapter = new SwaragaluAdapter(this,swaragalu);
        ListView listView = (ListView) findViewById(R.id.SwaList);
        listView.setAdapter(adapter);
    }
}
