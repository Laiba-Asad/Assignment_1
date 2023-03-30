package com.example.assignment1;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import androidx.appcompat.app.AppCompatActivity;

import com.example.assignment1.R;

public class splash_screen extends AppCompatActivity {
    private static int sp_time_out=2000;

    @Override
    public void onCreate(Bundle sp)
    {
        super.onCreate(sp);
        setContentView(R.layout.splash_screen);
        getSupportActionBar().hide();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent switchAct = new Intent(splash_screen.this, com.example.MainActivity.class);
                startActivity(switchAct);

                finish();

            }
        },3000);




    }
}
