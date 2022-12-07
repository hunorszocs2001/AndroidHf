package com.example.hf7;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextClock;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.VH> {

    MyCard[] myCards;
    Context context;

    public MyAdapter(MyCard[] myCards, Context context) {
        this.myCards = myCards;
        this.context = context;
    }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View itemView = layoutInflater.inflate(R.layout.card_item,parent,false);
        return new VH(itemView,context);
    }

    @Override
    public void onBindViewHolder(@NonNull VH holder, int position) {
        final MyCard myCardsList = myCards[position];
        holder.title.setText(myCardsList.getTitle());
        holder.name.setText(myCardsList.getName());
        holder.img.setImageResource(myCardsList.getImage());
    }

    @Override
    public int getItemCount() {
        return myCards.length;
    }

    public class VH extends RecyclerView.ViewHolder{
        ImageView img;
        TextView title;
        TextView name;


        public VH(@NonNull View itemView, Context context) {
            super(itemView);
            img = itemView.findViewById(R.id.imageView);
            title= itemView.findViewById(R.id.textView);
            name= itemView.findViewById(R.id.textView2);
        }
    }
}
