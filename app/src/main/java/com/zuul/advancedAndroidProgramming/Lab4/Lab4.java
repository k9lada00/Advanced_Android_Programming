package com.zuul.advancedAndroidProgramming.Lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.zuul.advancedAndroidProgramming.R;

public class Lab4 extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lab_4);
    }

    public void select41(View v)
    {
        Intent i = new Intent (this, Lab_4_1.class);
        startActivity(i);
    }

    public void select42(View v)
    {
        Intent i = new Intent (this, Lab_4_2.class);
        startActivity(i);
    }
}
