package com.example.andoid.miwok;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class Colors extends AppCompatActivity {

    RecyclerView recyclerView;
    String s1[], s2[];
    int images[] = {R.drawable.color_red, R.drawable.color_mustard_yellow, R.drawable.color_dusty_yellow, R.drawable.color_green, R.drawable.color_brown, R.drawable.color_gray, R.drawable.color_black, R.drawable.color_white};
    int media[] = {R.raw.color_red, R.raw.color_mustard_yellow, R.raw.color_dusty_yellow, R.raw.color_green, R.raw.color_brown, R.raw.color_gray, R.raw.color_black, R.raw.color_white};
    int mColourResourceId = R.color.colours;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        recyclerView = findViewById(R.id.Colors);
        s1 = getResources().getStringArray(R.array.colors_in_miwok);
        s2 = getResources().getStringArray(R.array.colors_in_english);
        RecyclerView.ItemDecoration divider = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(divider);

        MyAdapter myAdapter = new MyAdapter(this, s1, s2, images, media, mColourResourceId);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
