package com.example.android.counterproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Team A and B variables
    private int scoreA = 0;
    private int scoreB = 0;
    private int yellowA = 0;
    private int yellowB = 0;
    private int redA = 0;
    private int redB = 0;

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        // Read values from the "savedInstanceState"
        super.onRestoreInstanceState(savedInstanceState);
        scoreA = savedInstanceState.getInt("scoreA");
        scoreB = savedInstanceState.getInt("scoreB");
        yellowA = savedInstanceState.getInt("yellowA");
        yellowB = savedInstanceState.getInt("yellowB");
        redA = savedInstanceState.getInt("redA");
        redB = savedInstanceState.getInt("redB");
        displayAll();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        // Save the values you need into "outState"
        super.onSaveInstanceState(outState);
        outState.putInt("scoreA", scoreA);
        outState.putInt("scoreB", scoreB);
        outState.putInt("yellowA", yellowA);
        outState.putInt("yellowB", yellowB);
        outState.putInt("redA", redA);
        outState.putInt("redB", redB);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //<---------TEAM A---------->

    // Team A increment and decrement methods
    public void plusScoreA(View v) {
        scoreA++;
        displayScoreA(scoreA);
    }

    public void minusScoreA(View v) {
        if (scoreA > 0) {
            scoreA--;
        }
        displayScoreA(scoreA);
    }

    public void plusYellowA(View v) {
        yellowA++;
        displayYellowA(yellowA);
    }

    public void minusYellowA(View v) {
        if (yellowA > 0) {
            yellowA--;
        }
        displayYellowA(yellowA);
    }

    public void plusRedA(View v) {
        redA++;
        displayRedA(redA);
    }

    public void minusRedA(View v) {
        if (redA > 0) {
            redA--;
            displayRedA(redA);
        }
    }

    // Team A display methods
    public void displayScoreA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.displayScoreA);
        scoreView.setText(String.valueOf(score));
    }

    public void displayYellowA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.displayYellowA);
        scoreView.setText(String.valueOf(score));
    }

    public void displayRedA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.displayRedA);
        scoreView.setText(String.valueOf(score));
    }

    //<---------TEAM B---------->

    // Team B increment and decrement methods:

    public void plusScoreB(View v) {
        scoreB++;
        displayScoreB(scoreB);
    }

    public void minusScoreB(View v) {
        if (scoreB > 0) {
            scoreB--;
        }
        displayScoreB(scoreB);
    }

    public void plusYellowB(View v) {
        yellowB++;
        displayYellowB(yellowB);
    }

    public void minusYellowB(View v) {
        if (yellowB > 0) {
            yellowB--;
        }
        displayYellowB(yellowB);
    }

    public void plusRedB(View v) {
        redB++;
        displayRedB(redB);
    }

    public void minusRedB(View v) {
        if (redB > 0) {
            redB--;
        }
        displayRedB(redB);
    }

    // Team B display methods:

    public void displayScoreB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.displayScoreB);
        scoreView.setText(String.valueOf(score));
    }

    public void displayYellowB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.displayYellowB);
        scoreView.setText(String.valueOf(score));
    }

    public void displayRedB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.displayRedB);
        scoreView.setText(String.valueOf(score));
    }

    // Resets all variables
    public void resetAll(View v) {
        scoreA = 0;
        yellowA = 0;
        redA = 0;
        scoreB = 0;
        yellowB = 0;
        redB = 0;
        displayAll();
    }
    public void displayAll() {
        displayScoreA(scoreA);
        displayScoreB(scoreB);
        displayYellowA(yellowA);
        displayYellowB(yellowB);
        displayRedA(redA);
        displayRedB(redB);
    }
}