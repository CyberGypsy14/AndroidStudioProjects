package com.example.dialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    CharSequence[] items = {"Google", "Apple", "Microsoft"};
    boolean[] itemsChecked = new boolean[items.length];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onclick(View v) {
        showDialog(0);
    }

    @Override
    protected Dialog onCreateDialog(int id) {
        switch (id) {
            case 0:
            return new AlertDialog.Builder(this)
            .setIcon(R.drawable.ic_launcher_background)
            .setTitle("This is a dialog with some simple text...")
            .setPositiveButton("OK",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialogInterface, int whichButton) {
                            Toast.makeText(getBaseContext(),"OK clicked!", Toast.LENGTH_SHORT).show();

                        }
                    })
                    .setNegativeButton("Cancel",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int whichButton)
                                {
                                    Toast.makeText(getBaseContext(), "Cancel clicked!", Toast.LENGTH_SHORT).show();
                                }
                            }
                    )
                    .setMultiChoiceItems(items, itemsChecked,
                            new DialogInterface.OnMultiChoiceClickListener() {
                                public void onClick(DialogInterface dialog,
                                                    int which, boolean isChecked) {
                                    Toast.makeText(getBaseContext(),
                                            items[which] + (isChecked ? " checked!":" unchecked!"),
                                            Toast.LENGTH_SHORT).show();
        }
        }
 ).create();


    }
 return null;
}
}