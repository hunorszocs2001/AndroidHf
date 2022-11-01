package com.example.homework5;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> lista = new ArrayList<>();
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ListView myList = findViewById(R.id.myListView);
        lista.add("Lionel Messi");
        lista.add("Szoboszlai Dominik");
        lista.add("Diego Maradona");
        lista.add("Andres Iniesta");
        lista.add("Puskas Ferenc");
        lista.add("Pedri");


        registerForContextMenu(myList);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,lista);
        myList.setAdapter(adapter);


    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.context_menu,menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        AdapterView.AdapterContextMenuInfo listItem = (AdapterView.AdapterContextMenuInfo)item.getMenuInfo();

        switch (item.getItemId()){
            case R.id.menuRed:
                listItem.targetView.setBackgroundColor(Color.RED);
                return true;
            case R.id.menuGreen:
                listItem.targetView.setBackgroundColor(Color.GREEN);
                return true;
            case R.id.menuYellow:
                listItem.targetView.setBackgroundColor(Color.YELLOW);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.optionSort:
                Toast.makeText(this, "ABC sorrendbe rendezve", Toast.LENGTH_SHORT).show();
                Collections.sort(lista);
                adapter.notifyDataSetChanged();
                return true;
            case R.id.optionaDel:
                Toast.makeText(this, "Torolve", Toast.LENGTH_SHORT).show();
                lista.clear();
                adapter.notifyDataSetChanged();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}