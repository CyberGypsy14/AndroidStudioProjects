package com.example.demo2;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.demo2.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    EditText num1;
    EditText num2;
    EditText res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1=findViewById(R.id.editTextTextPersonName);
        num2=findViewById(R.id.editTextTextPersonName2);
        res=findViewById(R.id.editTextTextPersonName3);
    }

    public void Add(View view) {
        int a=Integer.parseInt(num1.getText().toString());
        int b=Integer.parseInt(num2.getText().toString());
        int c=a+b;
        //res.setText(c);
        Toast.makeText(MainActivity.this,c,Toast.LENGTH_SHORT).show();
    }

    public void Sub(View view) {
        int a=Integer.parseInt(num1.getText().toString());
        int b=Integer.parseInt(num2.getText().toString());
        int c=a-b;
        res.setText(c);
    }

    public void Mul(View view) {
        int a=Integer.parseInt(num1.getText().toString());
        int b=Integer.parseInt(num2.getText().toString());
        int c=a*b;
        res.setText(c);
    }

    public void Div(View view) {
        int a=Integer.parseInt(num1.getText().toString());
        int b=Integer.parseInt(num2.getText().toString());
        int c=a/b;
        res.setText(c);
    }
}