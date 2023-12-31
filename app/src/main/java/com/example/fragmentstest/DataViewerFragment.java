package com.example.fragmentstest;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DataViewerFragment extends Fragment {
    NameOfClassViewModel model;
    public DataViewerFragment() {
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
        TextView t = (TextView)getView().findViewById(R.id.namecurs);
        t.setText(model.getName());

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_data_viewer, container, false);

        model = new ViewModelProvider(getActivity()).get(NameOfClassViewModel.class);

        final Observer<String> nameObserver = new Observer<String>() {
            @Override
            public void onChanged(String s) {
                TextView t = (TextView)v.findViewById(R.id.namecurs);
                t.setText(s);
            }
        };

        model.getModel().observe(getActivity(), nameObserver);

        return v;
    }
}