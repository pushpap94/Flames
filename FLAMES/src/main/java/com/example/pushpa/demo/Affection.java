package com.example.pushpa.demo;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Affection extends AppCompatActivity {

    ImageView affectionimage;
    TextView textaffection, Txtaffection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_affection);

        affectionimage =(ImageView)findViewById(R.id.image_affection);
        textaffection=(TextView)findViewById(R.id.text_affection);
        Txtaffection=(TextView)findViewById(R.id.txtaffection);

        Typeface mycustomfont = Typeface.createFromAsset(getAssets(),"Yellowtail-Regular.ttf");
        Txtaffection.setTypeface(mycustomfont);

        Typeface mycustomfont1 = Typeface.createFromAsset(getAssets(),"LobsterTwo-Bold.ttf");
        textaffection.setTypeface(mycustomfont1);
    }
}
