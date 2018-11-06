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

public class SwaragaluAdapter extends ArrayAdapter<Swaragalu> {

    private static final String LOG_TAG = SwaragaluAdapter.class.getSimpleName();

    SwaragaluAdapter(Activity context, ArrayList<Swaragalu> swaragalu)
    {
        super(context,0,swaragalu);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        View listItemView = convertView;

        if(listItemView==null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_view2,parent,false);
        }

        Swaragalu setOfalphaWords = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.alphaWords);

        nameTextView.setText(setOfalphaWords.getAlphaWords());


        ImageView icon = (ImageView) listItemView.findViewById(R.id.alphabetImage);

        icon.setImageResource(setOfalphaWords.getImageId());

        LinearLayout layoutColor = (LinearLayout)  listItemView.findViewById(R.id.linearLayoutColorSwaragalu);

        layoutColor.setBackgroundColor(Color.parseColor(setOfalphaWords.getColor()));

        return listItemView;
    }
}
