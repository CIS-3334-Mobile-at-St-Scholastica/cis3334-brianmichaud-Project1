package com.example.project1;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ScoreViewHolder extends RecyclerView.ViewHolder {

    TextView scoreText;

    public ScoreViewHolder(@NonNull View itemView) {
        super(itemView);

        scoreText = itemView.findViewById(R.id.scoreText);

    }

}
