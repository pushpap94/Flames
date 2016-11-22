package com.example.pushpa.demo;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Siblings extends AppCompatActivity {

    ImageView siblingsimage;

    TextView textsiblings, Txtsiblings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_siblings);

        siblingsimage=(ImageView)findViewById(R.id.image_siblings);

        textsiblings=(TextView)findViewById(R.id.text_siblings);

        Txtsiblings=(TextView)findViewById(R.id.txtsiblings);

        Typeface mycustomfont = Typeface.createFromAsset(getAssets(),"Yellowtail-Regular.ttf");
        Txtsiblings.setTypeface(mycustomfont);

        Typeface mycustomfont1 = Typeface.createFromAsset(getAssets(),"LobsterTwo-Bold.ttf");
        textsiblings.setTypeface(mycustomfont1);
    }
}
