package com.zuul.advancedAndroidProgramming.Lab2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Lab_2_5 extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        //Set main Layout
        LinearLayout languageMainLayout = new LinearLayout(this);
        languageMainLayout.setOrientation(LinearLayout.VERTICAL);
        languageMainLayout.setPadding(40, 40, 40, 40);

        //Edit Text Field at the Top
        final EditText inputName = new EditText(this);

        //English and Finnish layout
        LinearLayout topButtonsLayout = new LinearLayout(this);
        topButtonsLayout.setOrientation(LinearLayout.HORIZONTAL);
        topButtonsLayout.setHorizontalGravity(1);

        Button englishBtn = new Button(this); englishBtn.setText("English");
        Button finnishBtn = new Button(this); finnishBtn.setText("Suomeksi");

        topButtonsLayout.addView(englishBtn);
        topButtonsLayout.addView(finnishBtn);

        //Swedish and Norwegian (surprise) layout
        LinearLayout bottomButtonsLayout = new LinearLayout(this);
        bottomButtonsLayout.setOrientation(LinearLayout.HORIZONTAL);
        bottomButtonsLayout.setHorizontalGravity(1);

        Button swedishBtn = new Button (this); swedishBtn.setText("Sverige");
        Button surpriseBtn = new Button (this); surpriseBtn.setText("Surprise");

        bottomButtonsLayout.addView(swedishBtn);
        bottomButtonsLayout.addView(surpriseBtn);

        //Greeting
        LinearLayout greetingContainer = new LinearLayout(this);
        greetingContainer.setHorizontalGravity(1);
        greetingContainer.setPadding(40, 40,40,40);

        final TextView languageGreeting = new TextView(this);
        languageGreeting.setText("");

        greetingContainer.addView(languageGreeting);

        englishBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String nameString = inputName.getText().toString();
                languageGreeting.setText("Hello, " + nameString + "!");
            }
        });

        finnishBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String nameString = inputName.getText().toString();
                languageGreeting.setText("Terve, " + nameString + "!");
            }
        });

        swedishBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String nameString = inputName.getText().toString();
                languageGreeting.setText("Hejjsan, " + nameString + "!");
            }
        });

        surpriseBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String nameString = inputName.getText().toString();
                languageGreeting.setText("Hallo, " + nameString + "!");
            }
        });


        //Filling Main Layout view
        languageMainLayout.addView(inputName);
        languageMainLayout.addView(topButtonsLayout);
        languageMainLayout.addView(bottomButtonsLayout);
        languageMainLayout.addView(greetingContainer);

        //Set Main View
        setContentView(languageMainLayout);
    }
}
