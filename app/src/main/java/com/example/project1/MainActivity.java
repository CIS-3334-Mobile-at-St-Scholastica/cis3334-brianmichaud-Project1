package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MainViewModel mainViewModel;
    Button plusButton;
    Button minusButton;
    TextView scoreNumber;
    RecyclerView scoresRecyclerView;
    TextView holeNumber;

    ScoreAdapter scoreAdapter;

    int score = 0;
    int hole = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        plusButton = findViewById(R.id.plusButton);
        minusButton = findViewById(R.id.minusButton);
        scoreNumber = findViewById(R.id.scoreNumber);
        holeNumber = findViewById(R.id.scoreText);

        String score = "0";
        scoreNumber.setText(score);

        /**
         * Set up recycler view
         */
        scoresRecyclerView = findViewById(R.id.scoresRecyclerView);
        scoreAdapter = new ScoreAdapter(getApplication(), mainViewModel);
        scoresRecyclerView.setAdapter(scoreAdapter);
        scoresRecyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    public void plusButtonClick(View view) {
        score++;
        scoreNumber.setText(Integer.toString(score));

    }

    public void minusButtonClick(View view) {
        score--;
        scoreNumber.setText(Integer.toString(score));
    }

    public void submitButtonClick(View view) {
        //Integer.toString(score);
        mainViewModel.addScore(score, hole);
    }

    public void nextHoleButtonClick(View view) {
        hole++;
        holeNumber.setText(Integer.toString(hole));

    }

    public void previousHoleButtonClick(View view) {
        hole--;
        holeNumber.setText(Integer.toString(hole));
    }

}