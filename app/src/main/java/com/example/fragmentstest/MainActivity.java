package com.example.fragmentstest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements ButtonsAct {
    private Fragment[] fragments;
    EditText e;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fragments = new Fragment[2];
        fragments[0] = new ImageFragment();
        fragments[1] = new DataViewerFragment();

        setContentView(R.layout.activity_main);

        NameOfClassViewModel model = new ViewModelProvider(this).get(NameOfClassViewModel.class);

        final Observer<String> nameObserver = new Observer<String>() {
            @Override
            public void onChanged(String s) {
                ((TextView)findViewById(R.id.namecursmain)).setText(model.getName());
            }
        };

        model.getModel().observe(this, nameObserver);

        Button b = (Button)findViewById(R.id.changeDataBTN);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e = (EditText)findViewById(R.id.editNameTXT);
                model.setName(e.getText().toString());
            }
        });


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