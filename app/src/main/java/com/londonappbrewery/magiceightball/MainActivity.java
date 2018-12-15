package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       final ImageView ballDisplay = (ImageView) findViewById(R.id.ballImage);
        final int ballarray[] = {R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };
        Button mybutton = (Button) findViewById(R.id.Ask_button);

        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("8-ball", "roll");
                Random random_number_generator = new Random();

                int num = random_number_generator.nextInt(5);

                Log.d("8-ball","the random number is:" + num);

                ballDisplay.setImageResource(ballarray[num]);
            }
        });
    }

    }
