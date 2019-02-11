package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class WordAdapter extends ArrayAdapter<Word> {
    private int mActivityColor = -1;

    public WordAdapter(@NonNull Context context, @NonNull List<Word> words, int activityColor) {
        super(context, 0, words);
        this.mActivityColor = activityColor;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View itemView = convertView;
        if (itemView == null) {
            itemView = LayoutInflater.from(getContext()).inflate(R.layout.list_view_item, parent, false);
        }
        Word currentWord = getItem(position);

        TextView englishWord = (TextView) itemView.findViewById(R.id.englishWord);
        englishWord.setText(currentWord.getEnglishWord());
        TextView translatedWord = (TextView) itemView.findViewById(R.id.translatedWord);
        translatedWord.setText(currentWord.getTranslatedWord());
        ImageView imageView = (ImageView) itemView.findViewById(R.id.imageView);

        if (currentWord.getImageResourceId() == -1) {
            imageView.setVisibility(View.GONE);
        } else {
            imageView.setVisibility(View.VISIBLE);
            imageView.setImageResource(currentWord.getImageResourceId());
        }

        if (mActivityColor != -1) {
            View textContainer = itemView.findViewById(R.id.textContainer);
            int color = ContextCompat.getColor(getContext(), mActivityColor);
            textContainer.setBackgroundColor(color);
        }

        return itemView;
    }
}
