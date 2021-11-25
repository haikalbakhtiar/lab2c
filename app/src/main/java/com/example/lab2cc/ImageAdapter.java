package com.example.lab2cc;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
    private final Context mContext;
    // Add all our images to arraylist
    public Integer[] thumbImages = {
            R.drawable.briefcase, R.drawable.calendar, R.drawable.chat, R.drawable.coding,
            R.drawable.handphone, R.drawable.more, R.drawable.notification, R.drawable.upload
    };

    public ImageAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return thumbImages.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new Imageview for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {

        ImageView imageView = new ImageView(mContext);
        imageView.setLayoutParams(new GridView.LayoutParams(250,250));
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setPadding(8, 8, 8, 8);
        imageView.setImageResource(thumbImages[position]);
        return imageView;
    }
}