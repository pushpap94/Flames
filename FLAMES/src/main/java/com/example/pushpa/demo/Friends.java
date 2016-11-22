package com.example.pushpa.demo;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Friends extends AppCompatActivity {

    ImageView friendimage;
    TextView textfriend, Txtfiend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends);
        friendimage=(ImageView)findViewById(R.id.image_friends);
        textfriend=(TextView)findViewById(R.id.text_friends);
        Txtfiend=(TextView)findViewById(R.id.txtfriend);

        Typeface mycustomfont = Typeface.createFromAsset(getAssets(),"Yellowtail-Regular.ttf");
        Txtfiend.setTypeface(mycustomfont);

        Typeface mycustomfont1 = Typeface.createFromAsset(getAssets(),"LobsterTwo-Bold.ttf");
        textfriend.setTypeface(mycustomfont1);
    }
}
