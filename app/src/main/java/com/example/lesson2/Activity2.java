package com.example.lesson2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity2);

        CheckBox checkBox = findViewById(R.id.my_checkbox);

        //checkBox.setChecked(false);

        EditText editText = findViewById(R.id.edt_input);

        boolean chkStatus = checkBox.isChecked();

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                String mess = "Gia tri checkbox set la: " + b + "\n";
                mess += ("Noi dung EditText la: " + editText.getText());

                Toast.makeText(getApplicationContext(), mess, Toast.LENGTH_SHORT).show();

            }
        });


    }
}