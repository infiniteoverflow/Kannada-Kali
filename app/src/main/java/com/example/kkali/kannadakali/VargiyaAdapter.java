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

public class VargiyaAdapter extends ArrayAdapter<Vargiya> {

    private static final String LOG_TAG = SwaragaluAdapter.class.getSimpleName();

    VargiyaAdapter(Activity context, ArrayList<Vargiya> vargiya)
    {
        super(context,0,vargiya);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        View listItemView = convertView;

        if(listItemView==null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_view2,parent,false);
        }

        Vargiya setOfalphaWords = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.alphaWords);

        nameTextView.setText(setOfalphaWords.getAlphaWords());


        ImageView icon = (ImageView) listItemView.findViewById(R.id.alphabetImage);

        icon.setImageResource(setOfalphaWords.getImageId());

        LinearLayout layoutColor = (LinearLayout)  listItemView.findViewById(R.id.linearLayoutColorSwaragalu);

        layoutColor.setBackgroundColor(Color.parseColor(setOfalphaWords.getColor()));

        return listItemView;
    }
}
