package com.zuul.uiprogrammatically;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Lab_2_2 extends AppCompatActivity
{

    int clicks = 0;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        //create the button
        final Button gameButton = new Button(this);
        gameButton.setText("Hello, I'm the button");

        super.onCreate(savedInstanceState);
        setContentView(gameButton);

        gameButton.setOnClickListener(new View.OnClickListener()
        {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v)
            {
                clicks++;
                if (clicks > 0 )
                {
                    gameButton.setText("You have clicked the button " + clicks + " times.");
                }
            }
        });
    }
}
