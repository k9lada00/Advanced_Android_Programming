package com.zuul.uiprogrammatically;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class Lab_2_4 extends AppCompatActivity
{
    private final Countries countries = new Countries();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        //Testing Adapter
        countries.addCountry("Finland");
        countries.addCountry("Iceland");
        countries.addCountry("Estonia");
        countries.addCountry("Lativa");
        countries.addCountry("Lithuania");

        //Layout Setup
        LinearLayout labLayout = new LinearLayout(this);
        labLayout.setOrientation(LinearLayout.VERTICAL);
        labLayout.setPadding(40,40,40,40);

        //First Section
        LinearLayout btnLayout = new LinearLayout(this);
        btnLayout.setOrientation(LinearLayout.HORIZONTAL);
        btnLayout.setHorizontalGravity(1);

        //Buttons
        Button addBtn = new Button(this); addBtn.setText("Add");
        Button editBtn = new Button(this); editBtn.setText("Edit");
        Button removeBtn = new Button(this); removeBtn.setText("Remove");

        //First Section Layout
        btnLayout.addView(addBtn);
        btnLayout.addView(editBtn);
        btnLayout.addView(removeBtn);

        //Second Section
        LinearLayout listLayout = new LinearLayout(this);
        listLayout.setOrientation(LinearLayout.VERTICAL);

        //Edit Text
        final EditText editCountries = new EditText(this);

        //List View
        ListView countriesList = new ListView(this);

        //Retrieving the List
        ArrayList<String> countryList = countries.getList();

        //Array Adapter
        final ArrayAdapter<String> countryAdapter;
        countryAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, countryList);
        countriesList.setAdapter(countryAdapter);

        //Second Section Layout
        listLayout.addView(editCountries);
        listLayout.addView(countriesList);

        //Setting up the Content View
        labLayout.addView(btnLayout);
        labLayout.addView(listLayout);
        setContentView(labLayout);


        //Setting On Click Listeners
        //Adding a country
        addBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String addingCountry = editCountries.getText().toString();
                countries.addCountry(addingCountry);
                countryAdapter.notifyDataSetChanged();
                editCountries.setText("");
            }
        });

        //Removing a country
        removeBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String removingCountry = editCountries.getText().toString();
                countries.removeCountry(removingCountry);
                editCountries.setText("");
            }
        });
    }
}
