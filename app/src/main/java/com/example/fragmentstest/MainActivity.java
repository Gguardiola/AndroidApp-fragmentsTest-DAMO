package com.example.fragmentstest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements ButtonsAct {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void getButton() {
        Toast.makeText(this, "Estic en main!", Toast.LENGTH_SHORT).show();
    }
}