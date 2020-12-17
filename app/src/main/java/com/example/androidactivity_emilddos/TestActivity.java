package com.example.androidactivity_emilddos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class TestActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test2);
        textView=findViewById(R.id.textMessage);
        textView.setText(getIntent().getStringExtra("msg")+", you are stupid");
    }
}