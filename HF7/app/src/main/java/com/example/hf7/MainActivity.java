package com.example.hf7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        MyCard[] myCards = new MyCard[]{
                new MyCard("Diszno","rof rof",R.drawable.disznyo),
                new MyCard("Macska","miau miau",R.drawable.cat),
                new MyCard("Kutya","vau vau",R.drawable.dog),
                new MyCard("Lovacska","nyihaha",R.drawable.horse),
                new MyCard("Oroszlan","Allatok kiralya",R.drawable.lion),
                new MyCard("Zsiraf","nagyon magas",R.drawable.giraffe),
                new MyCard("Nyuszi","cukiii",R.drawable.rabbit),
                new MyCard("Barany","beeee",R.drawable.sheep),

        };


        MyAdapter adapter = new MyAdapter(myCards,MainActivity.this);
        recyclerView.setAdapter(adapter);
    }
}