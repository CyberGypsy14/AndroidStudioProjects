package com.example.imageswitcher;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher.ViewFactory;

import androidx.appcompat.app.AppCompatActivity;

@SuppressWarnings("deprecation")
public class ImageSwitcherActivity  extends AppCompatActivity implements ViewFactory {

    //---the images to display--
    Integer[] imageIDs = {
            R.drawable.a,
            R.drawable.bank,
            R.drawable.hand,
            R.drawable.bank2,
    };

    private ImageSwitcher imageSwitcher;

    /** Called when the activity is first created. */

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageSwitcher = ((ImageSwitcher) findViewById(R.id.switcher1));
        imageSwitcher.setFactory(this);
        imageSwitcher.setInAnimation(AnimationUtils.loadAnimation(this,
        android.R.anim.fade_in));
        imageSwitcher.setOutAnimation(AnimationUtils.loadAnimation(this,
        android.R.anim.fade_out));
        Gallery gallery = findViewById(R.id.gallery1);
        gallery.setAdapter(new ImageAdapter(this));
        gallery.setOnItemClickListener((parent, v, position, id) -> imageSwitcher.setImageResource(imageIDs[position]));
    }

public View makeView()
        {
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundColor(0xFF000000);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setLayoutParams(new
        ImageSwitcher.LayoutParams(
        LayoutParams.MATCH_PARENT,
        LayoutParams.MATCH_PARENT));
        return imageView;
        }
public class ImageAdapter extends BaseAdapter
{
    private final Context context;
    private final int itemBackground;
    public ImageAdapter(Context c)
    {
        context = c;
        //---setting the style---
        TypedArray a = c.obtainStyledAttributes(R.styleable.Gallery1);
        itemBackground = a.getResourceId(
                R.styleable.Gallery1_android_galleryItemBackground, 0);
        a.recycle();
    }
    //---returns the number of images---
    public int getCount()
    {
        return imageIDs.length;
    }
    //---returns the item---
    public Object getItem(int position)
    {
        return position;
    }
    //---returns the ID of an item---
    public long getItemId(int position)
    {
        return position;
    }
    //---returns an ImageView view---
    public View getView(int position, View convertView, ViewGroup parent)
    {
        ImageView imageView = new ImageView(context);

        imageView.setImageResource(imageIDs[position]);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setLayoutParams(new Gallery.LayoutParams(150, 120));
        imageView.setBackgroundResource(itemBackground);

        return imageView;
    }
}
}
