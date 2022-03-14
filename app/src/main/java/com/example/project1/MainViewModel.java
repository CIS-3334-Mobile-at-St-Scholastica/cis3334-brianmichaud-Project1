package com.example.project1;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

public class MainViewModel extends AndroidViewModel {
    public MainViewModel(@NonNull Application application) {
        super(application);
    }

    public Hole addScore(int score, int hole) {
        Hole newHole = new Hole(score, hole);
        //newHole

        return newHole;
    }





}
