package com.example.listact;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class secondAct extends AppCompatActivity {
    TextView tv;
    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.textView);
        iv = findViewById(R.id.imageView);
        Intent i = getIntent();
        int j = i.getIntExtra("name", 0);
        switch(j)
        {
            case 0: tv.setText("Car Name: Ford, color:Blue");
                    iv.setImageResource(R.drawable.download);
                    break;
            case 1: tv.setText("Car Name: Ferrari, color:Red");
                iv.setImageResource(R.drawable.f);
                break;
            case 2: tv.setText("Car Name: Porche, color:Gray");
                iv.setImageResource(R.drawable.p);
                break;
            case 3: tv.setText("Car Name: Lamborghini, color:Golden");
                iv.setImageResource(R.drawable.l);
                break;
            case 4: tv.setText("Car Name: Pagani, color:Purple");
                iv.setImageResource(R.drawable.pg);
                break;
            case 5: tv.setText("Car Name: Bugatti, color:Black");
                iv.setImageResource(R.drawable.b);
                break;
            case 6: tv.setText("Car Name: Koenegsegg, color:White");
                iv.setImageResource(R.drawable.k);
                break;
            case 7: tv.setText("Car Name: Henessey, color:yellow");
                iv.setImageResource(R.drawable.h);
                break;
        }
    }
}
