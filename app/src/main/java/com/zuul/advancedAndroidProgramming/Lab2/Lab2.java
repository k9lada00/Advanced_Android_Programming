package com.zuul.advancedAndroidProgramming.Lab2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.zuul.advancedAndroidProgramming.R;

public class Lab2 extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lab_2);
    }

    public void select21(View v)
    {
        Intent i = new Intent (this, Lab_2_1.class);
        startActivity(i);
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
