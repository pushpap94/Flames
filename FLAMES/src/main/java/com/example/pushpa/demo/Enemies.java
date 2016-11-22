package com.example.pushpa.demo;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Enemies extends AppCompatActivity {

    ImageView enemiesimage;

    TextView textenemies, Txtenemies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enemies);

        enemiesimage=(ImageView)findViewById(R.id.image_enemies);

        textenemies=(TextView)findViewById(R.id.text_enemies);

        Txtenemies=(TextView)findViewById(R.id.txtenemies);

        Typeface mycustomfont = Typeface.createFromAsset(getAssets(),"Yellowtail-Regular.ttf");
        Txtenemies.setTypeface(mycustomfont);

        Typeface mycustomfont1 = Typeface.createFromAsset(getAssets(),"LobsterTwo-Bold.ttf");
        textenemies.setTypeface(mycustomfont1);

    }
}
