package com.example.homework1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button osszead = findViewById(R.id.osszead);
        Button kivonas = findViewById(R.id.kivon);
        Button szorzas = findViewById(R.id.szorzas);
        Button osztas = findViewById(R.id.osztas);

        EditText elsoszam = findViewById(R.id.szam1);
        EditText masodikszam = findViewById(R.id.szam2);
        TextView megoldas = findViewById(R.id.eredmeny);


        osszead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    float sz1 = Float.parseFloat(elsoszam.getText().toString());
                    float sz2 = Float.parseFloat(masodikszam.getText().toString());

                    float eredmeny = sz1 +sz2;
                    megoldas.setText("Eredmeny: "+eredmeny);

                }catch (NumberFormatException e){
                    Toast.makeText(MainActivity.this, "Csak szamot lehet", Toast.LENGTH_SHORT).show();
                }
            }
        });

        kivonas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    float sz1 = Float.parseFloat(elsoszam.getText().toString());
                    float sz2 = Float.parseFloat(masodikszam.getText().toString());

                    float eredmeny = sz1 -sz2;
                    megoldas.setText("Eredmeny: "+eredmeny);

                }catch (NumberFormatException e){
                    Toast.makeText(MainActivity.this, "Csak szamot lehet", Toast.LENGTH_SHORT).show();
                }
            }
        });
        szorzas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    float sz1 = Float.parseFloat(elsoszam.getText().toString());
                    float sz2 = Float.parseFloat(masodikszam.getText().toString());

                    float eredmeny = sz1 *sz2;
                    megoldas.setText("Eredmeny: "+eredmeny);

                }catch (NumberFormatException e){
                    Toast.makeText(MainActivity.this, "Csak szamot lehet", Toast.LENGTH_SHORT).show();
                }
            }
        });
        osztas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    float sz1 = Float.parseFloat(elsoszam.getText().toString());
                    float sz2 = Float.parseFloat(masodikszam.getText().toString());

                    float eredmeny = sz1 /sz2;
                    megoldas.setText("Eredmeny: "+eredmeny);

                }catch (NumberFormatException e){
                    Toast.makeText(MainActivity.this, "Csak szamot lehet", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}