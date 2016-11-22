package com.example.pushpa.demo;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Lovers extends AppCompatActivity {

    TextView textlover, Txtlover;
    ImageView loveimage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lovers);

        loveimage=(ImageView)findViewById(R.id.image_lovers);

        textlover=(TextView)findViewById(R.id.text_lovers);
        Txtlover=(TextView)findViewById(R.id.txtlovers);


        Typeface mycustomfont = Typeface.createFromAsset(getAssets(),"Yellowtail-Regular.ttf");
        Txtlover.setTypeface(mycustomfont);

        Typeface mycustomfont1 = Typeface.createFromAsset(getAssets(),"LobsterTwo-Bold.ttf");
        textlover.setTypeface(mycustomfont1);
    }
}
