package com.example.homework32;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        List<Product> products = new ArrayList<>();

        EditText code = findViewById(R.id.productCodeInput);
        EditText name = findViewById(R.id.productNameInput);
        EditText price = findViewById(R.id.productPriceInput);


        Button add = findViewById(R.id.button);
        Button cancel = findViewById(R.id.button2);
        Button show = findViewById(R.id.button3);

        TextView showproduct = findViewById(R.id.showProduct);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Code = code.getText().toString();
                String Name = name.getText().toString();
                Double Price = Double.parseDouble(price.getText().toString());

                products.add(new Product(Code,Name,Price));

                Toast.makeText(MainActivity.this, "Termek hozzaadva. Nyomj a CANCEL gombra hogy kitoruld es ujat tudj megadni", Toast.LENGTH_SHORT).show();
            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                code.getText().clear();
                name.getText().clear();
                price.getText().clear();
            }
        });

        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = "";

                for (Product product :
                        products) {
                    text += product.toString();
                }

                showproduct.setText(text);
            }
        });
    }
}