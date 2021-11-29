package com.example.buttonviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;

import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.view.Menu;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    EditText uname;
    TextView Greetings;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        Greetings=findViewById(R.id.textView);
    }


    public void B2(View view) {
        Greetings.setText("Good Afternoon");
    }

    public void B3(View view) {
        Greetings.setText("Good Evening");
    }

    public void set(View view) {
        String u = uname.getText().toString();
        Intent i = new Intent(MainActivity.this, secondActivity.class);
        i.putExtra("name",u);
    }
}