package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for Team A by 1, 2, 3 point.
     */
    int scoreA = 0;

    public void addOneForTeamA(View v) {
        scoreA += 1;
        displayForTeamA(scoreA);
    }

    public void addTwoForTeamA(View v) {
        scoreA += 2;
        displayForTeamA(scoreA);
    }

    public void addThreeForTeamA(View v) {
        scoreA += 3;
        displayForTeamA(scoreA);
    }


    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for Team B by 1, 2, 3 point.
     */
    int scoreB = 0;

    public void addOneForTeamB(View v) {
        scoreB += 1;
        displayForTeamB(scoreB);
    }

    public void addTwoForTeamB(View v) {
        scoreB += 2;
        displayForTeamB(scoreB);
    }

    public void addThreeForTeamB(View v) {
        scoreB += 3;
        displayForTeamB(scoreB);
    }

    /**
     *
     * Reset score results
     */
    public void resetScore(View v) {
        scoreA = 0;
        scoreB = 0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }

    /*
    Saving the data in case of turn screen
     */
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("scoreA", scoreA);
        outState.putInt("scoreB", scoreB);
    }

    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        scoreA = savedInstanceState.getInt("scoreA");
        scoreB = savedInstanceState.getInt("scoreB");
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }

}
