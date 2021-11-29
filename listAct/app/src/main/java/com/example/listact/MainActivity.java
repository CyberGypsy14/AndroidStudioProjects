package com.example.listact;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.Toolbar;

public class MainActivity extends ListActivity {
    String[] cars ={
            "Ford",
            "Ferrari",
            "Porche",
            "Lamborghini",
            "Pagani",
            "Bugati",
            "Koinegsegg",
            "Henessey"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        setListAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, cars));
    }
    public void onListItemClick(
            ListView parent, View v, int position, long id)
    {
        Toast.makeText(this, "You've selected "  +  cars[position],
                Toast.LENGTH_SHORT).show();
        Intent i = new Intent(MainActivity.this, secondAct.class);
        i.putExtra("name", position);
        startActivity(i);
    }
}