package com.zuul.advancedAndroidProgramming.Lab3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
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
        setContentView(R.layout.lab_3_1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.lab_3_1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item)
    {
        TextView textView = findViewById(R.id.colorView);
        switch (item.getItemId())
        {
            case R.id.red:
                textView.setText("RED");
                textView.setBackgroundColor(0xffff0000);
                textView.invalidate();
                break;
            case R.id.green:
                textView.setText("GREEN");
                textView.setBackgroundColor(0xff00ff00);
                textView.invalidate();
                break;
            case R.id.blue:
                textView.setText("BLUE");
                textView.setBackgroundColor(0xff0000ff);
                textView.invalidate();
                break;
            case R.id.yellow:
                textView.setText("YELLOW");
                textView.setBackgroundColor(0xffffff00);
                textView.invalidate();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

}
