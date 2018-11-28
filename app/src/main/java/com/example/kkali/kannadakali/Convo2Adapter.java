package com.example.kkali.kannadakali;

import android.app.Activity;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class Convo2Adapter extends ArrayAdapter<Convo2> {

    private static final String LOG_TAG = Convo2Adapter.class.getSimpleName();

    Convo2Adapter(Activity context, ArrayList<Convo2> numbers)
    {
        super(context,0,numbers);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        View listItemView = convertView;

        if(listItemView==null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_view4,parent,false);
        }

        Convo2 setOfConvo2 = getItem(position);

        ImageView imageView1 = (ImageView) listItemView.findViewById(R.id.image1);
        imageView1.setImageResource(setOfConvo2.getImage1Id());

        ImageView imageView2 = (ImageView) listItemView.findViewById(R.id.image2);
        imageView2.setImageResource(setOfConvo2.getImage2Id());

        TextView englishText1 = (TextView) listItemView.findViewById(R.id.EnglishText1);
        englishText1.setText(setOfConvo2.getEnglishText1());

        TextView englishText2 = (TextView) listItemView.findViewById(R.id.EnglishText2);
        englishText2.setText(setOfConvo2.getEnglishText2());

        TextView kannadaText1 = (TextView) listItemView.findViewById(R.id.KannadaText1);
        kannadaText1.setText(setOfConvo2.getKannadaText1());

        TextView kannadaText2 = (TextView) listItemView.findViewById(R.id.KannadaText2);
        kannadaText2.setText(setOfConvo2.getKannadaText2());

        return listItemView;
    }
}
