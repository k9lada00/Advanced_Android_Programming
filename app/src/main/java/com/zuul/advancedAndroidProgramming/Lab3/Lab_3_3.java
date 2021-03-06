package com.zuul.advancedAndroidProgramming.Lab3;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.zuul.advancedAndroidProgramming.R;

public class Lab_3_3 extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lab_3_3);

        ImageView wolf = findViewById(R.id.wolf);
        ImageView bear = findViewById(R.id.bear);
        ImageView elephant = findViewById(R.id.elephant);
        ImageView lamb = findViewById(R.id.lamb);

        wolf.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                MediaPlayer mediaPlayer;
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.wolf_sound);
                mediaPlayer.start();
            }
        });
        bear.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                MediaPlayer mediaPlayer;
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.bear_sound);
                mediaPlayer.start();
            }
        });
        elephant.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                MediaPlayer mediaPlayer;
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.elephant_sound);
                mediaPlayer.start();
            }
        });
        lamb.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                MediaPlayer mediaPlayer;
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.lamb_sound);
                mediaPlayer.start();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.lab_3_3, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.mammals:
                Intent intent = new Intent(getApplicationContext(), Lab_3_3.class);
                startActivity(intent);
                finish();
                break;
            case R.id.birds:
                intent = new Intent(getApplicationContext(), Lab_3_3_1.class);
                startActivity(intent);
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
