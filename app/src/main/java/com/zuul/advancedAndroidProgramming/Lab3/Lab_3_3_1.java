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

public class Lab_3_3_1 extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lab_3_3_1);

        ImageView huuhkaja = findViewById(R.id.huuhkaja);
        ImageView peippo = findViewById(R.id.peippo);
        ImageView peukaloinen = findViewById(R.id.peukaloinen);
        ImageView punatulkku = findViewById(R.id.punatulkku);

        huuhkaja.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                MediaPlayer mediaPlayer;
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.huuhkaja_norther_eagle_owl);
                mediaPlayer.start();
            }
        });
        peippo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mediaPlayer;
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.peippo_chaffinch);
                mediaPlayer.start();
            }
        });
        peukaloinen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mediaPlayer;
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.peukaloinen_wren);
                mediaPlayer.start();
            }
        });
        punatulkku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mediaPlayer;
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.punatulkku_northern_bullfinch);
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
