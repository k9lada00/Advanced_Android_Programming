package com.zuul.advancedAndroidProgramming.Lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.zuul.advancedAndroidProgramming.MainActivity;
import com.zuul.advancedAndroidProgramming.R;

public class Lab3 extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lab_3);
    }

    public void select31(View v)
    {
        Intent i = new Intent (this, Lab_3_1.class);
        startActivity(i);
    }

    public void select32(View v)
    {
        Intent i = new Intent (this, Lab_3_2.class);
        startActivity(i);
    }

    public void select33(View v)
    {
        Intent i = new Intent (this, MainActivity.class);
        startActivity(i);
    }

    public void select34(View v)
    {
        Intent i = new Intent (this, MainActivity.class);
        startActivity(i);
    }
}
