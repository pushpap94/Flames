package com.example.pushpa.demo;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Married extends AppCompatActivity {

    ImageView marriedimage;
    TextView textmarried, Txtmarried;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_married);

        marriedimage=(ImageView)findViewById(R.id.image_married);

        textmarried=(TextView)findViewById(R.id.text_married);

        Txtmarried=(TextView)findViewById(R.id.txtmarried);

        Typeface mycustomfont = Typeface.createFromAsset(getAssets(),"Yellowtail-Regular.ttf");
        Txtmarried.setTypeface(mycustomfont);

        Typeface mycustomfont1 = Typeface.createFromAsset(getAssets(),"LobsterTwo-Bold.ttf");
        textmarried.setTypeface(mycustomfont1);
    }
}
