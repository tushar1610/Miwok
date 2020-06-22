package com.example.andoid.miwok;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class Phrases extends AppCompatActivity {

    RecyclerView recyclerView;
    String s1[], s2[];
    int media[] = {R.raw.phrase_where_are_you_going, R.raw.phrase_what_is_your_name, R.raw.phrase_my_name_is, R.raw.phrase_how_are_you_feeling, R.raw.phrase_im_feeling_good, R.raw.phrase_are_you_coming, R.raw.phrase_yes_im_coming, R.raw.phrase_im_coming, R.raw.phrase_lets_go, R.raw.phrase_come_here};
    int mColourResourceId1 = R.color.phrases;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

        recyclerView = findViewById(R.id.Phrases);
        s1 = getResources().getStringArray(R.array.phrases_in_miwok);
        s2 = getResources().getStringArray(R.array.phrases_in_english);
        RecyclerView.ItemDecoration divider = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(divider);

        MyAdapterPhrases myAdapterPhrases = new MyAdapterPhrases(this, s1, s2, media, mColourResourceId1);
        recyclerView.setAdapter(myAdapterPhrases);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
