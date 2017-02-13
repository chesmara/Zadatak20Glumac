package com.example.androiddevelopment.zadatak20glumac.activity;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import com.example.androiddevelopment.zadatak20glumac.R;
import com.example.androiddevelopment.zadatak20glumac.provajderi.glumacProvajder;

import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * Created by androiddevelopment on 13.2.17..
 */

public class SecondActivity extends Activity {

        private int position=0;

    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);

        setContentView(R.layout.second_activity);

        /
        final int position = getIntent().getIntExtra("position", 0);

        // Finds "ivImage" ImageView and sets "imageDrawable" property
        ImageView ivImage = (ImageView) findViewById(R.id.iv_image);
        InputStream is = null;
        try {
            is = getAssets().open(glumacProvajder.getGlumacById(position).getSlika());
            Drawable drawable = Drawable.createFromStream(is, null);
            ivImage.setImageDrawable(drawable);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Finds "tvName" TextView and sets "text" property
        TextView tvName = (TextView) findViewById(R.id.tv_name);
        tvName.setText(glumacProvajder.getGlumacById(position).getImePrezime());

        // Finds "tvDescription" TextView and sets "text" property
        TextView tvDescription = (TextView) findViewById(R.id.tv_biografija);
        tvDescription.setText(glumacProvajder.getGlumacById(position).getBiografija());

        TextView tvDatum = (TextView) findViewById(R.id.tv_datum);
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        String reportDate=df.format()
        tvDescription.setText(report);

        // Finds "rbRating" RatingBar and sets "rating" property
        RatingBar rbRating = (RatingBar) findViewById(R.id.rb_ocena);
        rbRating.setRating(glumacProvajder.getGlumacById(position).getOcena());

        // Finds "btnBuy" Button and sets "onClickListener" listener


    }








}
