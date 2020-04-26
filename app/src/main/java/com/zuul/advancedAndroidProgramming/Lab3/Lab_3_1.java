package com.zuul.advancedAndroidProgramming.Lab3;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.zuul.advancedAndroidProgramming.R;

public class Lab_3_1 extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        LinearLayout colorTitleContainer = new LinearLayout(this);
        colorTitleContainer.setHorizontalGravity(1);

        TextView colorNameTitle = new TextView(this);
        colorNameTitle.setTextColor(getResources().getColor(android.R.color.black));
        colorNameTitle.setPadding(60, 60, 60, 60);
        colorNameTitle.setText("White");

        colorTitleContainer.setBackgroundColor(getResources().getColor(android.R.color.white));
        colorTitleContainer.addView(colorNameTitle);
        setContentView(colorTitleContainer);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.lab_3_1, menu);
        return true;
    }

}
