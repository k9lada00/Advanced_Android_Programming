package com.zuul.advancedAndroidProgramming.Lab2;

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
    public void removeCountry(String country)
    {
        this.countries.remove(country);
        if(this.countries.size() > 0)
        {
            this.countries.remove(this.countries.size() - 1);
        }
    }
}
