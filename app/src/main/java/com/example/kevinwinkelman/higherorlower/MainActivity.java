package com.example.kevinwinkelman.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randomNumber;

    public void buttonClicked(View view) {

        System.out.println(randomNumber);

        EditText guessEditText = (EditText) findViewById(R.id.guessEditText);

        int guessNumber = Integer.parseInt(guessEditText.getText().toString());

        if (guessNumber > randomNumber) {

            Toast.makeText(this, "Lower!", Toast.LENGTH_SHORT).show();

        } else if(guessNumber < randomNumber) {

            Toast.makeText(this, "Higher!", Toast.LENGTH_SHORT).show();

        } else {
            Toast.makeText(this, "That's Right! Try Again!", Toast.LENGTH_SHORT).show();

            Random rand = new Random();
            randomNumber =  rand.nextInt((20 - 1) + 1) + 1;
        }

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand = new Random();
        randomNumber =  rand.nextInt((20 - 1) + 1) + 1;

    }
}
