package com.example.andoid.miwok;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;


public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    String data1[], data2[];
    int images[];
    Context context;
    int media[];
    MediaPlayer mMediaPlayer;
    int colorResourceId;


    public MyAdapter(Context ct, String s1[], String s2[], int img[], int m[], int color){
        context = ct;
        data1 = s1;
        data2 = s2;
        images = img;
        media = m;
        colorResourceId = color;
    }

    public MyAdapter(Context ct, String s1[], String s2[], int m[], int color){
        context = ct;
        data1 = s1;
        data2 = s2;
        media = m;
        colorResourceId = color;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater inflater = LayoutInflater.from(context);
            View view = inflater.inflate(R.layout.my_row, parent, false);
            return new MyViewHolder(view);
            }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
            holder.myText1.setText(data1[position]);
            holder.myText2.setText(data2[position]);
            holder.myImage.setImageResource(images[position]);
            holder.myLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mMediaPlayer = MediaPlayer.create(context, media[position]);
                    mMediaPlayer.start();
                }
            });
            holder.myLayout3.setBackgroundColor(ContextCompat.getColor(context, colorResourceId));
        }
    @Override
    public int getItemCount() {

        return data1.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

            TextView myText1, myText2;
            ImageView myImage;
            ConstraintLayout myLayout, myLayout3;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            myText1 = itemView.findViewById(R.id.myText1);
            myText2 = itemView.findViewById(R.id.myText2);
            myImage = itemView.findViewById(R.id.myImageView);
            myLayout = itemView.findViewById(R.id.myLayout);
            myLayout3 = itemView.findViewById(R.id.myLayout3);
        }
    }


}
