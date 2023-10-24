package com.example.fragmentstest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class APIActivity extends AppCompatActivity implements ButtonsAct {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apiactivity);
    }

    @Override
    public void getButton() {
        Toast.makeText(this, "Estoy en APIActivity", Toast.LENGTH_SHORT).show();
    }
}