package com.example.buttonviewdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class secondActivity extends Activity{
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tv = findViewById(R.id.textView);
        Intent i1=getIntent();
        String txt=i1.getStringExtra("name");
        tv.setText("  " +txt);
    }

    public void onClick(View view) {
        finish();
    }
}

