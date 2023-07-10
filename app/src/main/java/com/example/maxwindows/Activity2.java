package com.example.maxwindows;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public abstract class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
    }

    public void goBack(View v) {

    }

    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
            public void startNewActivity(View v) {
                Intent intent = new Intent(this, Activity3.class);
                startActivity(intent);
            }}