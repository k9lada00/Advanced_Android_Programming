package com.zuul.advancedAndroidProgramming.Lab3;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.zuul.advancedAndroidProgramming.R;

public class Lab_3_2 extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lab_3_2);

        Button map = findViewById(R.id.openMap);
        Button call = findViewById(R.id.usePhone);
        Button go = findViewById(R.id.searchWeb);

        final EditText editText = findViewById(R.id.editText);

        map.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Uri location = Uri.parse("geo:0,0?q=Kotkantie+1,+Oulu");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);;
                startActivity(mapIntent);
            }
        });

        call.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Uri number = Uri.parse("tel:040 1415510");
                Intent callIntent = new Intent(Intent.ACTION_VIEW, number);
                startActivity(callIntent);
            }
        });

        go.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Uri webpage = Uri.parse(editText.getText().toString());
                Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(webIntent);
            }
        });
    }
}
