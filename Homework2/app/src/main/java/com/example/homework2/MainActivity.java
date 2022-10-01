package com.example.homework2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView szoveg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Statusz", "MainActivity: onCreate()");

        Button button1 =findViewById(R.id.button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
            }
        });
        szoveg = findViewById(R.id.textbox);
        szoveg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                szoveg.append("\n" + szoveg.getText().toString());
            }
        });
    }



    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Statusz", "MainActivity: onStart()");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Statusz", "MainActivity: onResume()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Statusz", "MainActivity: onRestart()");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Statusz", "MainActivity: onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Statusz", "MainActivity: onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Statusz", "MainActivity: onDestroy()");
    }
    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        szoveg.setText(savedInstanceState.getString("szoveg"));
        Log.d("Statusz", "MainActivity: onRestoreInstanceState()");
    }
    @Override
    protected void onSaveInstanceState(@NonNull Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putString("szoveg", szoveg.getText().toString());
        Log.d("Statusz", "MainActivity: onSaveInstanceState()");
    }


}
