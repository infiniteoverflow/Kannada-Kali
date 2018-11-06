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

class NumbersAdapter extends ArrayAdapter<Numbers> {
    private static final String LOG_TAG = NumbersAdapter.class.getSimpleName();

    NumbersAdapter(Activity context, ArrayList<Numbers> numbers)
    {
        super(context,0,numbers);
    }
    @Override
    public View getView(int position,View convertView,ViewGroup parent) {


        View listItemView = convertView;

        if(listItemView==null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_view,parent,false);
        }

        Numbers setOfNumbers = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.version_name);

        nameTextView.setText(setOfNumbers.getDefaultTranslation());

        TextView numberTextView = (TextView) listItemView.findViewById(R.id.version_number);

        numberTextView.setText(setOfNumbers.getKannadaTranslation());

        ImageView icon = (ImageView) listItemView.findViewById(R.id.iconOfImage);

        icon.setImageResource(setOfNumbers.getIconId());

        LinearLayout layoutColor = (LinearLayout)  listItemView.findViewById(R.id.linearLayoutColor);

        layoutColor.setBackgroundColor(Color.parseColor(setOfNumbers.getColorId()));

        return listItemView;
    }
}