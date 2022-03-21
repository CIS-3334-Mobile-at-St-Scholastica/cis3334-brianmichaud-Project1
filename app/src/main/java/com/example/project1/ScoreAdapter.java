package com.example.project1;

import android.app.Application;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ScoreAdapter extends RecyclerView.Adapter<ScoreViewHolder> {

    Application application;
    MainViewModel mainViewModel;

    public ScoreAdapter(Application application, MainViewModel mainViewModel)
    {
        this.application = application;
        this.mainViewModel = mainViewModel;
    }

    @NonNull
    @Override
    public ScoreViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.hole_row, parent, false);

        return new ScoreViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull ScoreViewHolder holder, int position) {
        //String score = mainViewModel.getPosition(position);
        //holder.scoreText.setText(score);

    }

    @Override
    public int getItemCount() {

        return 1;
    }
}
