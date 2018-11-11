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

public class WordsAdapter extends ArrayAdapter<Words> {

    private static final String LOG_TAG = SwaragaluAdapter.class.getSimpleName();

    WordsAdapter(Activity context, ArrayList<Words> words)
    {
        super(context,0,words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        View listItemView = convertView;

        if(listItemView==null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_view5,parent,false);
        }

        Words setOfalphaWords = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.englishWords);

        nameTextView.setText(setOfalphaWords.getEnglishWords());

        TextView nameTextView1 = (TextView) listItemView.findViewById(R.id.kannadaWords);

        nameTextView1.setText(setOfalphaWords.getKannadaWords());


        return listItemView;
    }
}
