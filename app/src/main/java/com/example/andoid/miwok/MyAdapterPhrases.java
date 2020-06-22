package com.example.andoid.miwok;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapterPhrases extends RecyclerView.Adapter<MyAdapterPhrases.MyViewHolderPhrases> {
    String data3[], data4[];
    Context context;
    int media[];
    MediaPlayer mMediaPlayer;
    int colorResourceId2;


    public MyAdapterPhrases(Context ct, String s1[], String s2[], int m[], int color1){
        context = ct;
        data3 = s1;
        data4 = s2;
        media = m;
        colorResourceId2 = color1;
    }

    @NonNull
    @Override
    public MyAdapterPhrases.MyViewHolderPhrases onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.my_row2, parent, false);
        return new MyViewHolderPhrases(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapterPhrases.MyViewHolderPhrases holder, final int position) {
        holder.myText3.setText(data3[position]);
        holder.myText4.setText(data4[position]);
        holder.myLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mMediaPlayer = MediaPlayer.create(context, media[position]);
                mMediaPlayer.start();
            }
        });
        holder.myLayout2.setBackgroundColor(ContextCompat.getColor(context, colorResourceId2));
    }

    @Override
    public int getItemCount() {
        return data3.length;
    }

    public class MyViewHolderPhrases extends RecyclerView.ViewHolder{

        TextView myText3, myText4;
        LinearLayout myLayout2;

        public MyViewHolderPhrases(@NonNull View itemView) {
            super(itemView);
            myText3 = itemView.findViewById(R.id.textView3);
            myText4 = itemView.findViewById(R.id.textView4);
            myLayout2 = itemView.findViewById(R.id.myLayout2);
        }
    }
}
