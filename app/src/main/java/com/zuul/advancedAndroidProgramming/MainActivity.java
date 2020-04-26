package com.zuul.advancedAndroidProgramming;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.zuul.advancedAndroidProgramming.Lab1.Lab1;
import com.zuul.advancedAndroidProgramming.Lab2.Lab2;
import com.zuul.advancedAndroidProgramming.Lab3.Lab3;
import com.zuul.advancedAndroidProgramming.Lab4.Lab4;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void select1(View v)
    {
        Intent i = new Intent (this, Lab1.class);
        startActivity(i);
    }

    public void select2(View v)
    {
        Intent i = new Intent (this, Lab2.class);
        startActivity(i);
    }

    public void select3(View v)
    {
        Intent i = new Intent (this, Lab3.class);
        startActivity(i);
    }

    public void select4(View v)
    {
        Intent i = new Intent (this, Lab4.class);
        startActivity(i);
    }
}
