package com.example.homework4;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class CustomAdapter extends ArrayAdapter {


    private final Activity context;


    private final Integer[] imageIDarray;


    private final String[] currencyAbrArray;


    private final String[] infoArray;

    private final String[] buyArray;

    private final String[] sellArray;



    public CustomAdapter(Activity context,String[] currencyAbrArrayParam,
                         String[] infoArrayParam, String[] buyArrayParam,String[] sellArrayParam,Integer[] imageIDArrayParam) {

        super(context, R.layout.list_item, currencyAbrArrayParam);
        this.context = context;
        this.imageIDarray = imageIDArrayParam;
        this.currencyAbrArray = currencyAbrArrayParam;
        this.infoArray = infoArrayParam;
        this.buyArray = buyArrayParam;
        this.sellArray = sellArrayParam;
    }


    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.list_item, null,true);


        TextView nev = rowView.findViewById(R.id.textView);

        TextView leiras = rowView.findViewById(R.id.textView2);
        TextView vesz = rowView.findViewById(R.id.textView3);
        TextView elad = rowView.findViewById(R.id.textView4);



        ImageView kep = rowView.findViewById(R.id.imageView);




        nev.setText(currencyAbrArray[position]);
        leiras.setText(infoArray[position]);
        vesz.setText(buyArray[position]);
        elad.setText(sellArray[position]);
        kep.setImageResource(imageIDarray[position]);



        return rowView;



    }

}
