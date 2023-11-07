package com.example.fragmentstest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements ButtonsAct {
    private Fragment[] fragments;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fragments = new Fragment[2];
        fragments[0] = new ImageFragment();
        fragments[1] = new DataViewerFragment();

        setContentView(R.layout.activity_main);
    }

    @Override
    public void changeFragment(int k) {
        FragmentManager fgmng = getSupportFragmentManager();
        FragmentTransaction trans = fgmng.beginTransaction();

        switch(k){
            case 1:
                trans.replace(R.id.fragmentContainerData, fragments[0]);
                Toast.makeText(this, "FRAGMENT 1!", Toast.LENGTH_SHORT).show();
                break;
            case 2:
                trans.replace(R.id.fragmentContainerData, fragments[1]);
                Toast.makeText(this, "FRAGMENT 2!", Toast.LENGTH_SHORT).show();
                break;
        }
        trans.commit();
    }
}