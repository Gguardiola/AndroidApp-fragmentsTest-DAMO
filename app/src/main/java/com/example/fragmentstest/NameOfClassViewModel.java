package com.example.fragmentstest;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NameOfClassViewModel extends ViewModel {
    private MutableLiveData<String> name = new MutableLiveData<String>();

    public String getName(){
        return name.getValue();
    }

    public void setName(String s){
        name.setValue(s);
    }

    public MutableLiveData<String> getModel(){
        return name;
    }
}
