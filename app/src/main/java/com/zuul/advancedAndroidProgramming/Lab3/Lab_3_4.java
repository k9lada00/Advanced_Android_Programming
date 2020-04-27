package com.zuul.advancedAndroidProgramming.Lab3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import com.zuul.advancedAndroidProgramming.R;

public class Lab_3_4 extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lab_3_4);

        final EditText time = findViewById(R.id.time);
        Button start = findViewById(R.id.start);

        start.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(getApplicationContext(), Lab_3_4_1.class);
                intent.putExtra("time", time.getText().toString());
                startActivity(intent);
            }
        });
    }
}
