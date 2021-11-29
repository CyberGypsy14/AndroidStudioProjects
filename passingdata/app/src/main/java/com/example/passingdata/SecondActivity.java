package com.example.passingdata;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;

public class SecondActivity extends Activity{
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tv = findViewById(R.id.textView);
        Intent i1=getIntent();
        String txt=i1.getStringExtra("name");
        tv.setText("Welcome  " +txt);
    }

    public void onClick(View view) {
        finish();
    }
}
