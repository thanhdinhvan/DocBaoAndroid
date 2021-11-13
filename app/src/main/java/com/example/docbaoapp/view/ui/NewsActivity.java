package com.example.docbaoapp.view.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.docbaoapp.R;

public class NewsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        getSupportActionBar().hide();
    }
}