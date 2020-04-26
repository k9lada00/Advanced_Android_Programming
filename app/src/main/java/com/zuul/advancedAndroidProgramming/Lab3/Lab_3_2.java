package com.zuul.advancedAndroidProgramming.Lab3;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.zuul.advancedAndroidProgramming.R;

public class Lab_3_2 extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        //Main Layout
        LinearLayout oamkHomePage = new LinearLayout(this);
        oamkHomePage.setOrientation(LinearLayout.VERTICAL);

        //First Layout
        LinearLayout mapLayout = new LinearLayout(this);
        Button openMap = new Button(this);
        openMap.setText("Open Map");
        mapLayout.addView(openMap);

        //Second layout
        LinearLayout callLayout = new LinearLayout(this);
        Button makeCall = new Button(this);
        makeCall.setText("Call OAMK");
        callLayout.addView(makeCall);

        //Third Layout
        LinearLayout websiteLayout = new LinearLayout(this);
        websiteLayout.setOrientation(LinearLayout.HORIZONTAL);
        EditText inputWebsite = new EditText(this);
        Button searchWeb = new Button(this);
        searchWeb.setText("Go");
        websiteLayout.addView(inputWebsite);
        websiteLayout.addView(searchWeb);

        //Forth Layout
        LinearLayout imageLayout = new LinearLayout(this);
        ImageView oamkLogo = new ImageView(this);
        imageLayout.addView(oamkLogo);

        //Filling the Main Layout
        oamkHomePage.addView(mapLayout);
        oamkHomePage.addView(callLayout);
        oamkHomePage.addView(websiteLayout);
        oamkHomePage.addView(imageLayout);
        setContentView(oamkHomePage);
    }
}
