package com.zuul.uiprogrammatically;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void select22(View v)
    {
        Intent i = new Intent (this, Lab_2_2.class);
        startActivity(i);
    }

    public void select23(View v)
    {
        Intent i = new Intent (this, Lab_2_3.class);
        startActivity(i);
    }

    public void select24(View v)
    {
        Intent i = new Intent (this, Lab_2_4.class);
        startActivity(i);
    }

    public void select25(View v)
    {
        Intent i = new Intent (this, Lab_2_5.class);
        startActivity(i);
    }
}
