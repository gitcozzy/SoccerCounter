/*Goals of this app: To keep score of a soccer match
as well as the count of yellow and red cards that each team receives.
The values can be incremented by one, when a goal is scored, or when a team gets a card.
The option of decrementing a value by one is provided in order to correct misclick errors.
The reset button resets all the values to zero.
The app is intended to keep track of values and display them when the screen orientation is changed.
I have tried to make full use of the colors.xml, strings.xml and various other resources folders.

Copyright (c) 2017 Ivascu Cosmin

This project was created and submitted by Ivascu Cosmin
as part of the Google Challenge Scholarship: Android Basics for Udacity.

According to Udacity's Honor code, your submissions must be your own work,
hence submitting this project as your own might cause you to earn the suspension of your account.

Permission is hereby granted, free of charge, to any person
obtaining a copy of this software and associated documentation
files (the "Software"), to deal in the Software without restriction,
including without limitation the rights to use, copy, modify, merge,
publish, distribute, sublicense, and/or sell copies of the Software,
and to permit persons to whom the Software is furnished to do so,
subject to the following conditions:

The above copyright notice and this permission notice shall be
included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR
PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR
ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE,
ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.*/

package com.example.android.counterproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.lang.ref.Reference;

public class MainActivity extends AppCompatActivity {

    // Team A and B variables
    private int scoreA = 0;
    private int scoreB = 0;
    private int yellowA = 0;
    private int yellowB = 0;
    private int redA = 0;
    private int redB = 0;
    private TextView displayScoreA;
    private TextView displayScoreB;
    private TextView displayYellowA;
    private TextView displayYellowB;
    private TextView displayRedA;
    private TextView displayRedB;

    // Read values from the "savedInstanceState"
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        scoreA = savedInstanceState.getInt("scoreA");
        scoreB = savedInstanceState.getInt("scoreB");
        yellowA = savedInstanceState.getInt("yellowA");
        yellowB = savedInstanceState.getInt("yellowB");
        redA = savedInstanceState.getInt("redA");
        redB = savedInstanceState.getInt("redB");
        displayAll();
    }

    // Save the values you need into "outState"
    @Override
    protected void onSaveInstanceState(Bundle outState) {
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
        displayScoreA = (TextView)findViewById(R.id.displayScoreA);
        displayScoreB = (TextView)findViewById(R.id.displayScoreB);
        displayYellowA = (TextView)findViewById(R.id.displayYellowA);
        displayYellowB = (TextView)findViewById(R.id.displayYellowB);
        displayRedA = (TextView)findViewById(R.id.displayRedA);
        displayRedB = (TextView)findViewById(R.id.displayRedB);
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
        TextView scoreView = displayScoreA;
        scoreView.setText(String.valueOf(score));
    }

    public void displayYellowA(int score) {
        TextView scoreView = displayYellowA;
        scoreView.setText(String.valueOf(score));
    }

    public void displayRedA(int score) {
        TextView scoreView = displayRedA;
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
        TextView scoreView = displayScoreB;
        scoreView.setText(String.valueOf(score));
    }

    public void displayYellowB(int score) {
        TextView scoreView = displayYellowB;
        scoreView.setText(String.valueOf(score));
    }

    public void displayRedB(int score) {
        TextView scoreView = displayRedB;
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

    // Displays all variables
    public void displayAll() {
        displayScoreA(scoreA);
        displayScoreB(scoreB);
        displayYellowA(yellowA);
        displayYellowB(yellowB);
        displayRedA(redA);
        displayRedB(redB);
    }
}

