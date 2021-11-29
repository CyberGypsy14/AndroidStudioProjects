package com.example.multi_button;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends Activity{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondactivity);

        Toast.makeText(this,getIntent().getStringExtra("str1"), Toast.LENGTH_SHORT).show();
        //Toast.makeText(this,Integer.toString(getIntent().getIntExtra("age1", 0)), Toast.LENGTH_SHORT).show();

        Bundle bundle = getIntent().getExtras();
        Toast.makeText(this, bundle.getString("str2"), Toast.LENGTH_SHORT).show();
        // Toast.makeText(this,Integer.toString(bundle.getInt("age2")), Toast.LENGTH_SHORT).show();

    }

    public void onClick(View view) {
        Intent data = new Intent();
        EditText txt_username = (EditText) findViewById(R.id.txt_username);
        data.setData(Uri.parse(txt_username.getText().toString()));
        setResult(RESULT_OK, data);

        finish();
    }


    public void onClick2(View view) {
        Intent i = new Intent();
        //i.putExtra("age3", 45);
        i.setData(Uri.parse("Something passed back to main activity"));
        setResult(RESULT_OK, i);

        finish();
    }
}