package com.example.passingdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText uname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uname=findViewById(R.id.editTextTextPersonName);
    }

    public void set(View view){
        String u = uname.getText().toString();
        Intent i = new Intent(MainActivity.this, SecondActivity.class);
        i.putExtra("name",u);
        startActivity(i);
    }
}