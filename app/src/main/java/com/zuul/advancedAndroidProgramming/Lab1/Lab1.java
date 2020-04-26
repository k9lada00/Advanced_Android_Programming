package com.zuul.advancedAndroidProgramming.Lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.zuul.advancedAndroidProgramming.R;

public class Lab1 extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lab_1);
    }

    public void select11(View v)
    {
        Intent i = new Intent (this, Lab_1_1.class);
        startActivity(i);
    }

    public void select12(View v)
    {
        Intent i = new Intent (this, Lab_1_2.class);
        startActivity(i);
    }

    public void select13(View v)
    {
        Intent i = new Intent (this, Lab_1_3.class);
        startActivity(i);
    }

    public void select14(View v)
    {
        Intent i = new Intent (this, Lab_1_4.class);
        startActivity(i);
    }
}
