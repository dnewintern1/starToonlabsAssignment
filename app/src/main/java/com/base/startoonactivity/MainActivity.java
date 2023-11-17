package com.base.startoonactivity;

import static android.graphics.BlendMode.COLOR;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("View Patient");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}