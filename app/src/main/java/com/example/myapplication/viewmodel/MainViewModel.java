package com.example.myapplication.viewmodel;

import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {

    public void saveItem(String item) {
        System.out.println(item);
    }
}