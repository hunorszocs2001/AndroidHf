package com.example.activitystatesavetwo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CheckBox checkBox;
    TextView textbox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        checkBox = findViewById(R.id.checkBox);
        textbox = findViewById(R.id.textbox);
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("editText", textbox.getText().toString());
        outState.putBoolean("checkBox", checkBox.isChecked());

    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        String editText = savedInstanceState.getString("editText");
        boolean checkboxAllapot = savedInstanceState.getBoolean("checkBox");

        textbox.setText(editText);
        checkBox.setChecked(checkboxAllapot);

    }
}