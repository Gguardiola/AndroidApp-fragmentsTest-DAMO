package com.example.fragmentstest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class APIMenu extends Fragment {

    private Button button1, button2, button3, openButton;
    public APIMenu() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_a_p_i_menu, container, false);



        button1 = (Button) v.findViewById(R.id.btn1);
        button2 = (Button) v.findViewById(R.id.btn2);
        button3 = (Button) v.findViewById(R.id.btn3);

        openButton = (Button) v.findViewById(R.id.APIbtn);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Activity mainact = getActivity();
                ((ButtonsAct)mainact).changeFragment(1);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Activity mainact = getActivity();
                ((ButtonsAct)mainact).changeFragment(2);
            }
        });

        openButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), APIActivity.class);
                startActivity(i);
            }
        });



        return v;
    }
}