package com.example.myapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    RadioGroup rd;
    RadioButton rdb1, rdb2;
    CheckBox chkAutosave;
    ToggleButton toggle1;
    CheckBox star;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.rdbGp1);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup group, int CheckedId) {
                RadioButton rdb1 = (RadioButton) findViewById(R.id.rdb1);
                RadioButton rdb2 = (RadioButton) findViewById(R.id.rdb2);
                if (rdb1.isChecked()) {
                    Toast.makeText(MainActivity.this, "Option 1 selected!", Toast.LENGTH_SHORT).show();
                } else if (rdb2.isChecked()) {
                    Toast.makeText(MainActivity.this, "Option 2 selected!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Option 3 selected!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        //---CheckBox1---
        CheckBox checkBox1 = (CheckBox) findViewById(R.id.chkAutosave);
        checkBox1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (((CheckBox) v).isChecked())
                    Toast.makeText(MainActivity.this, "CheckBox is checked", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this, "CheckBox is unchecked", Toast.LENGTH_SHORT).show();
            }
        });

        //---Checkbox2---
        CheckBox checkBox2 = (CheckBox) findViewById(R.id.star);
        checkBox2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (((CheckBox) v).isChecked())
                    Toast.makeText(MainActivity.this, "Star is shining", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this, "Star ain't shining", Toast.LENGTH_SHORT).show();
            }
        });

        //---ToggleButton---
        ToggleButton toggleButton = (ToggleButton) findViewById(R.id.toggle1);
        toggleButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (((ToggleButton) v).isChecked())
                    Toast.makeText(MainActivity.this, "Toggle button is on", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this, "Toggle button is Off", Toast.LENGTH_SHORT).show();
            }
        });

    }
    public void open(View view) {
        Toast.makeText(MainActivity.this,"You've clicked on open button",Toast.LENGTH_SHORT).show();
    }

    public void save(View view) {
        Toast.makeText(MainActivity.this,"You've clicked on save button",Toast.LENGTH_SHORT).show();
    }

}
