package com.zuul.advancedAndroidProgramming.Lab1;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import com.zuul.advancedAndroidProgramming.R;

public class Lab_1_4 extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lab_1_4);

        final String[] COUNTRIES = new String[]
                {
                        "Afghanistan", "Albania", "Algeria", "American Samoa", "Andorra", "Angola", "Anguilla",
                        "Antarctica", "Antigua and Barbuda", "Argentina", "Armenia", "Aruba", "Australia",
                        "Austria", "Azerbaijan", "The Bahamas", "Bahrain", "Bangladesh", "Barbados",
                        "Belarus", "Belgium", "Belize", "Benin", "Bermuda", "Bhutan", "Plurinational State of Bolivia",
                        "Bonaire, Sint Eustatius and Saba", "Bosnia and Herzegovina", "Botswana", "Bouvet Island",
                        "Brazil", "The British Indian Ocean Territory", "Brunei Darussalam", "Bulgaria",
                        "Burkina Faso", "Burundi", "Cabo Verde", "Cambodia", "Cameroon", "Canada", "The Cayman Islands",
                        "The entral African Republic", "Chad", "Chile", "China", "Christmas Island", "The Cocos (Keeling) Islands",
                        "Colombia", "The Comoros", "The Democratic Republic of the Congo", "The Congo", "The Cook Islands",
                        "Costa Rica", "Croatia", "Cuba", "Curaçao", "Cyprus", "Czechia", "Côte d'Ivoire", "Denmark", "Djibouti",
                        "Dominica", "The Dominican Republic", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea",
                        "Estonia", "Eswatini", "Ethiopia", "The Falkland Islands [Malvinas]", "The Faroe Islands",
                        "Fiji", "Finland", "France", "French Guiana", "French Polynesia", "The French Southern Territories",
                        "Gabon", "The Gambia", "Georgia", "Germany", "Ghana", "Gibraltar", "Greece", "Greenland", "Grenada",
                        "Guadeloupe", "Guam", "Guatemala", "Guernsey", "Guinea", "Guinea-Bissau", "Guyana", "Haiti",
                        "Heard Island and McDonald Islands", "The Holy See", "Honduras", "Hong Kong", "Hungary", "Iceland",
                        "India", "Indonesia", "Islamic Republic of Iran", "Iraq", "Ireland", "Isle of Man", "Israel",
                        "Italy", "Jamaica", "Japan", "Jersey", "Jordan", "Kazakhstan", "Kenya", "Kiribati",
                        "The Democratic People's Republic of Korea", "The Republic of Korea", "Kuwait", "Kyrgyzstan",
                        "The Lao People's Democratic Republic", "Latvia", "Lebanon", "Lesotho", "Liberia",
                        "Libya", "Liechtenstein", "Lithuania", "Luxembourg", "Macao", "Madagascar", "Malawi", "Malaysia",
                        "Maldives", "Mali", "Malta", "The Marshall Islands", "Martinique", "Mauritania", "Mauritius",
                        "Mayotte", "Mexico", "Federated States of Micronesia", "The Republic of Moldova", "Monaco",
                        "Mongolia", "Montenegro", "Montserrat", "Morocco", "Mozambique", "Myanmar", "Namibia", "Nauru",
                        "Nepal", "The Netherlands", "New Caledonia", "New Zealand", "Nicaragua", "The Niger", "Nigeria",
                        "Niue", "Norfolk Island", "The Northern Mariana Islands", "Norway", "Oman", "Pakistan", "Palau",
                        "Palestine, State of", "Panama", "Papua New Guinea", "Paraguay", "Peru", "The Philippines", "Pitcairn",
                        "Poland", "Portugal", "Puerto Rico", "Qatar", "Republic of North Macedonia", "Romania", "The Russian Federation",
                        "Rwanda", "Réunion", "Saint Barthélemy", "Saint Helena, Ascension and Tristan da Cunha", "Saint Kitts and Nevis",
                        "Saint Lucia", "Saint Martin (French part)", "Saint Pierre and Miquelon", "Saint Vincent and the Grenadines",
                        "Samoa", "San Marino", "Sao Tome and Principe", "Saudi Arabia", "Senegal", "Serbia", "Seychelles",
                        "Sierra Leone", "Singapore", "Sint Maarten (Dutch part)", "Slovakia", "Slovenia", "Solomon Islands",
                        "Somalia", "South Africa", "South Georgia and the South Sandwich Islands", "South Sudan", "Spain",
                        "Sri Lanka", "Sudan (the)", "Suriname", "Svalbard and Jan Mayen", "Sweden", "Switzerland", "Syrian Arab Republic",
                        "Taiwan (Province of China)", "Tajikistan", "Tanzania, United Republic of", "Thailand", "Timor-Leste",
                        "Togo", "Tokelau", "Tonga", "Trinidad and Tobago", "Tunisia", "Turkey", "Turkmenistan", "The Turks and Caicos Islands",
                        "Tuvalu", "Uganda", "Ukraine", "The United Arab Emirates", "The United Kingdom of Great Britain and Northern Ireland",
                        "The United States Minor Outlying Islands", "The United States of America", "Uruguay", "Uzbekistan",
                        "Vanuatu", "Bolvarioan Republic of Venezuela", "Viet Nam", "Virgin Islands (British)",
                        "Virgin Islands (U.S.)", "Wallis and Futuna", "Western Sahara", "Yemen", "Zambia", "Zimbabwe", "Åland Islands"
                };

        ListView myListView = (ListView) findViewById(R.id.country_list);
        final ArrayAdapter<String> countryAdapter;
        countryAdapter = new ArrayAdapter<String>(this,  android.R.layout.simple_list_item_1, COUNTRIES);
        myListView.setAdapter(countryAdapter);
    }
}
