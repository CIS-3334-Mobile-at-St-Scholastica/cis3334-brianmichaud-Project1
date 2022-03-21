package com.example.project1;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

public class MainViewModel extends AndroidViewModel {

    int score;
    int hole;

    public MainViewModel(@NonNull Application application) {
        super(application);
    }

    public Hole addScore(int score, int hole) {
        this.score = score;
        this.hole = hole;

        Hole newHole = new Hole(score, hole);

        return newHole;
    }

    public int getCount() {
        return 0;
    }


    public String getPosition(int position) {
        return null;
    }
}
