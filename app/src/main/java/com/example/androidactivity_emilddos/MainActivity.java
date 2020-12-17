package com.example.androidactivity_emilddos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Intent intent;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.editName);
    }

    public void onClick(View view) {
        intent=new Intent(this,TestActivity.class);
        intent.putExtra("msg",editText.getText().toString());
        startActivity(intent);
    }
}