package com.zuul.uiprogrammatically;

import android.widget.ArrayAdapter;
import java.util.ArrayList;

public class Countries
{
    //Creating Array List
    private ArrayList<String> countries = new ArrayList();

    //Methods

    //Retrieve the list
    public ArrayList<String> getList()
    {
        return this.countries;
    }

    //Add a country to the list
    public void addCountry(String country)
    {
        this.countries.add(country);
    }

    //Remove a country from the list
    public void removeCountry(int i)
    {
        countries.remove(i);
    }
}
