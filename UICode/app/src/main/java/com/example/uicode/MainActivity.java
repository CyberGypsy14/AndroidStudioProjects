package com.example.uicode;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        // Param for Views
        LayoutParams params = new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);

        // Create Layout
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);

        // Creates TextView
        TextView tv = new TextView(this);
        tv.setText("That;s a textview");
        tv.setLayoutParams(params);

        // Creates Button
        Button btn = new Button(this);
        btn.setText("This is a Button");
        btn.setLayoutParams(params);

        // Adds TextView
        layout.addView(tv);

        // Adds Button
        layout.addView(btn);

        // Param for Layout
        LinearLayout.LayoutParams layoutParam = new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
        this.addContentView(layout, layoutParam);

    }
}