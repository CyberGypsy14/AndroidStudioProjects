package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.AdapterView.OnItemSelectedListener;

public class MainActivity extends AppCompatActivity {

    ImageView iv;
    Spinner sp;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv=findViewById(R.id.imageView);
        sp=findViewById(R.id.spinner);

        sp.setOnItemSelectedListener(new OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                switch (position) {

                    case 0 :
                        iv.setImageResource(R.drawable.lion);
                        break;

                    case 1 :
                        iv.setImageResource(R.drawable.dog);
                        break;

                    case 2 :
                        iv.setImageResource(R.drawable.cat);
                        break;

                    case 3 :
                        iv.setImageResource(R.drawable.horse);
                        break;

                    case 4 :
                        iv.setImageResource(R.drawable.hams);
                        break;

                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> arg0) { }

        });
    }
}