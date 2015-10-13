package com.hmartinez.menu.ui.activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.hmartinez.menu.R;

/**
 * Splash Activity
 * Created by hmartinez on 10/12/15.
 */
public class SplashActivity extends AppCompatActivity {
    private Handler handler;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash);

        handler = new Handler();

        final Runnable r = new Runnable() {
            public void run() {
                Intent i = new Intent(SplashActivity.this,
                        MainActivity.class);
                startActivity(i);
                finish();
            }
        };

        handler.postDelayed(r, 1000);
    }




}
