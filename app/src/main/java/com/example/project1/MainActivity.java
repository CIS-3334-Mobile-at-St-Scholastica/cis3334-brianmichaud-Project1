package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MainViewModel mainViewModel;
    Button plusButton;
    Button minusButton;
    TextView scoreNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        plusButton = findViewById(R.id.plusButton);
        minusButton = findViewById(R.id.minusButton);
        scoreNumber = findViewById(R.id.scoreNumber);

        String score = "0";
        scoreNumber.setText(score);

    }

    public void plusButtonClick(View view) {
        String score = "4";
        scoreNumber.setText(score);

    }

    public void minusButtonClick(View view) {
        String score = "0";
        scoreNumber.setText(score);
    }

}