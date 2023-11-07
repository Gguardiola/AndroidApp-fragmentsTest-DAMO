package com.example.fragmentstest;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class ImageFragment extends Fragment {
    public ImageFragment() {
        // Required empty public constructor
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);
        NameOfClassViewModel model = new ViewModelProvider(this).get(NameOfClassViewModel.class);
        TextView t = (TextView)getView().findViewById(R.id.namecurs2);
        t.setText(model.getName());

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Toast.makeText(getContext(), "obro fragment image", Toast.LENGTH_SHORT).show();
        return inflater.inflate(R.layout.fragment_image, container, false);
    }
}