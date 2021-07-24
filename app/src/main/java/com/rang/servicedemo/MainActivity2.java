package com.rang.servicedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.rang.servicedemo.music.MusicService;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {

    private Intent playServiceIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        findViewById(R.id.play_btn).setOnClickListener(this);
        findViewById(R.id.stop_btn).setOnClickListener(this);

        playServiceIntent = new Intent(this, MusicService.class);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.play_btn:
                startService(playServiceIntent);
                break;
            case R.id.stop_btn:
                stopService(playServiceIntent);
                break;
            default:
                break;
        }
    }
}