package com.example.android.footballcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.footballcounter.R;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

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
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void sixPoints(View v) {
        scoreTeamA += 6;
        displayForTeamA(scoreTeamA);
    }

    public void threePoints(View v) {
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    public void twoPoints(View v) {
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    public void onePoint(View v) {
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    public void sixPointsB(View v) {
        scoreTeamB += 6;
        displayForTeamB(scoreTeamB);
    }

    public void threePointsB(View v) {
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    public void twoPointsB(View v) {
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    public void onePointB(View v) {
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

    public void resetScore(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

}
