package com.example.pushpa.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ShareActionProvider;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Scanner;

import static android.support.v7.appcompat.R.styleable.MenuItem;

public class MainActivity extends AppCompatActivity {

    EditText name, partnername;
    Button calculate;
    String name1, name2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (EditText) findViewById(R.id.editText1);
        partnername = (EditText) findViewById(R.id.editText2);
        calculate = (Button) findViewById(R.id.button1);


        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (name.getText().toString().length() == 0) {
                    Toast.makeText(getApplicationContext(), "Name cannot be Blank", Toast.LENGTH_LONG).show();
                    name.setError("Name cannot be Blank");
                    return;

                }
                if (partnername.getText().toString().length() == 0) {
                    Toast.makeText(getApplicationContext(), "Partner Name is Required", Toast.LENGTH_LONG).show();
                    partnername.setError("Partner Name is Required");
                    return;
                }


                name1 = name.getText().toString();
                name2 = partnername.getText().toString();


                name1 = name1.toLowerCase();
                name2 = name2.toLowerCase();
                String name1_split[] = name1.split(" ");
                String name2_split[] = name2.split(" ");
                name1 = "";
                name2 = "";


                for (int i = 0; i < name1_split.length; i++) {
                    name1 = name1 + name1_split[i];
                }
                for (int i = 0; i < name2_split.length; i++) {
                    name2 = name2 + name2_split[i];
                }

                int length = name1.length() + name2.length();
                boolean name_check[] = new boolean[name2.length()];

                for (int i = 0; i < name2.length(); i++) {
                    name_check[i] = false;
                }
                for (int i = 0; i < name1.length(); i++) {
                    for (int j = 0; j < name2.length(); j++) {
                        if ((name_check[j] == false) && (name1.charAt(i) == name2.charAt(j))) {
                            name_check[j] = true;
                            length = length - 2;
                            break;
                        }
                    }
                }

                boolean flames_check[] = new boolean[6];

                for (int i = 0; i < 6; i++) {
                    flames_check[i] = true;
                }
                int count = 6;
                int k = 1, deleted_letters = 0;
                int j;
                for (j = 0; j <= count; j++) {
                    if (k <= length) {
                        if (j == count) {
                            j = 0;
                        }
                        if (flames_check[j] == true) {
                            k = k + 1;
                        }
                    }
                    if ((k - 1) == length) {
                        deleted_letters = deleted_letters + 1;
                        flames_check[j] = false;
                        k = 1;
                    }
                    if (deleted_letters == 6) {
                        if (j == 0) {
                            Intent intent = new Intent(MainActivity.this, Friends.class);
                            Toast.makeText(getApplicationContext(), name1 + " " + "and" + " " + name2 + " are good FRIENDS", Toast.LENGTH_LONG).show();
                            startActivity(intent);

                        }
                        else if (j == 1)
                        {
                            Intent intent = new Intent(MainActivity.this, Lovers.class);
                            Toast.makeText(getApplicationContext(), name1 + " " + "and" + " " + name2 + " are LOVERS", Toast.LENGTH_LONG).show();
                            startActivity(intent);
                        }
                        else if (j == 2)
                        {

                            Intent intent = new Intent(MainActivity.this, Affection.class);
                            Toast.makeText(getApplicationContext(), name1 + " " + "and" + " " + name2 + " have alot of AFFECTION", Toast.LENGTH_LONG).show();
                            startActivity(intent);

                        }
                        else if (j == 3)
                        {

                            Intent intent = new Intent(MainActivity.this, Married.class);
                            Toast.makeText(getApplicationContext(), name1 + " " + "and" + " " + name2 + " are MARRIED", Toast.LENGTH_LONG).show();
                            startActivity(intent);
                        }
                        else if (j == 4)
                        {
                            Intent intent = new Intent(MainActivity.this, Enemies.class);
                            Toast.makeText(getApplicationContext(), name1 + " " + "and" + " " + name2 + " are ENEMIES", Toast.LENGTH_LONG).show();
                            startActivity(intent);
                        }
                        else if (j == 5)
                        {
                            Intent intent = new Intent(MainActivity.this, Siblings.class);
                            Toast.makeText(getApplicationContext(), name1 + " " + "and" + " " + name2 + " are SIBLINGS", Toast.LENGTH_LONG).show();
                            startActivity(intent);
                        }
                        break;
                    }
                }

            }

        });


    }

    @Override

    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.action_menu, menu);

        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){

        switch (item.getItemId()) {

            case R.id.mShare:

                Intent  i = new Intent(android.content.Intent.ACTION_SEND);

                i.setType("text/plain");

//                i.putExtra(android.content.Intent.EXTRA_TEXT, "The string you want to share, which can include URLs");

                startActivity(Intent.createChooser(i, "Select Your Share Option"));

                break;

        }
        return super.onOptionsItemSelected(item);

    }

    }


