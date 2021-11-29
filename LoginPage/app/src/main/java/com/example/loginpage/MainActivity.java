package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText uname;
    EditText pass;
    Button user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        uname=findViewById(R.id.editTextTextPersonName);
        pass=findViewById(R.id.editTextTextPassword);
        user=findViewById(R.id.button);
    }

    public void validate(View view) {
        if (uname.getText().toString().equals("zaigam") && pass.getText().toString().equals("1234")) {
            Toast.makeText(this, "Logging in...", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Wrong Credentials..", Toast.LENGTH_SHORT).show();
        }
    }
}