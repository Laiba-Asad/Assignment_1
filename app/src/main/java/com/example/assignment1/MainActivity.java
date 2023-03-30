package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.assignment1.R;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {

    ImageButton addButton;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addButton= findViewById(R.id.addbtn);
        addButton.setOnClickListener((View.OnClickListener) this);
    }
    public void onClick (View v)
    {
        Intent switchAct = new Intent(MainActivity.this, com.example.additemtolist.class);
        startActivity(switchAct);
    }
}

