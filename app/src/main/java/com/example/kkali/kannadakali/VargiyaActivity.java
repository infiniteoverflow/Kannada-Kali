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

        vargiya.add(new Vargiya("ಕಮಲ - Kamala - lotus",R.drawable.ka,"#00e676"));
        vargiya.add(new Vargiya("ಖಡ್ಗ - Khadga - Sword",R.drawable.kha,"#8d6e63"));
        vargiya.add(new Vargiya("ಗಡಿಯಾರ - Gadiyara -clock",R.drawable.ga,"#ffd54f"));
        vargiya.add(new Vargiya("ಘನ - Ghana - Solid",R.drawable.gha,"#ff6e40"));
        vargiya.add(new Vargiya("ಜ್ಞಾನ-Gnana - Knowledge ",R.drawable.nga,"#90a4ae"));
        vargiya.add(new Vargiya("ಚಕ್ರ-Chakra - Wheel ",R.drawable.cha,"#448aff"));
        vargiya.add(new Vargiya("ಛತ್ರಿ-Chatri - Umbrella",R.drawable.chha,"#ec407a"));
        vargiya.add(new Vargiya("ಜನರು-Janaru - People ",R.drawable.ja,"#4dd0e1"));
        vargiya.add(new Vargiya("ಝಂಡಾ-jhanda - Flag ",R.drawable.jha,"#ff8f00"));
        vargiya.add(new Vargiya(" ",R.drawable.nnya,"#ff3d00"));
        vargiya.add(new Vargiya("ಟಗರು -tagaru - male sheep ",R.drawable.tta,"#5c6bc0"));
        vargiya.add(new Vargiya("ಠಾಣೆ-tthane - station,",R.drawable.ttha,"#00e676"));
        vargiya.add(new Vargiya("ಡಬ್ಬಿ -dabbi - Box",R.drawable.da,"#ffd54f"));
        vargiya.add(new Vargiya("ಢಕ್ಕೆ-dhakke - a musical instrument made of skin ",R.drawable.dha,"#8d6e63"));
        vargiya.add(new Vargiya("ಹಣ-hana- Money ",R.drawable.nha,"#ffd54f"));
        vargiya.add(new Vargiya("ತಟ್ಟೆ-tatte - Plate ",R.drawable.ta,"#ff6e40"));
        vargiya.add(new Vargiya("ಥಟ್ಟನೆ-thattane - Sudden",R.drawable.tha,"#90a4ae"));
        vargiya.add(new Vargiya("ದಳ -dala - Party ",R.drawable.da1,"#448aff"));
        vargiya.add(new Vargiya("ಧನ -Dhana - Money ",R.drawable.dha1,"#ec407a"));
        vargiya.add(new Vargiya("ನಡವಳಿಕೆ-Naḍavaḷike - Behaviour ",R.drawable.na,"#4dd0e1"));
        vargiya.add(new Vargiya("ಪಟಾಕಿ-pataki - Crackers ",R.drawable.pa,"#ff8f00"));
        vargiya.add(new Vargiya("ಫಲ-phala - Fruits ",R.drawable.pha,"#ff3d00"));
        vargiya.add(new Vargiya("ಬಲಿ-ali - Victim ",R.drawable.ba,"#5c6bc0"));
        vargiya.add(new Vargiya("ಭಜನೆ -Bhajane - Hymn",R.drawable.bha,"#00e676"));
        vargiya.add(new Vargiya("ಮನೆ -Mane - Home ",R.drawable.ma,"#ffd54f"));

        VargiyaAdapter adapter = new VargiyaAdapter(this,vargiya);
        ListView listView = (ListView) findViewById(R.id.vargList);
        listView.setAdapter(adapter);
    }
}
