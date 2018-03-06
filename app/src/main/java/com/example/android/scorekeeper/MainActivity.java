package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * This app keeps score of the 2018 Superbowl game.
 */
public class MainActivity extends AppCompatActivity {

    int scorePatriots = 0;
    int scoreEagles = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase the score for the Patriots by 6 points.
     */
    public void addSixForPatriots(View view) {
        scorePatriots = scorePatriots + 6;
        displayForPatriots(scorePatriots);
    }

    /**
     * Increase the score for Patriots by 3 points.
     */
    public void addThreeForPatriots(View view) {
        scorePatriots = scorePatriots + 3;
        displayForPatriots(scorePatriots);
    }

    /**
     * Increase the score for Patriots by 2 points.
     */
    public void addTwoForPatriots(View view) {
        scorePatriots = scorePatriots + 2;
        displayForPatriots(scorePatriots);
    }

    /**
     * Increase the score for Patriots by 1 point.
     */
    public void addOneForPatriots(View view) {
        scorePatriots = scorePatriots + 1;
        displayForPatriots(scorePatriots);
    }

    /**
     * Displays the given score for Patriots.
     */
    public void displayForPatriots(int score) {
        TextView scoreView = (TextView) findViewById(R.id.patriots_score);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Increase the score for the Eagles by 6 points.
     */
    public void addSixForEagles(View view) {
        scoreEagles = scoreEagles + 6;
        displayForEagles(scoreEagles);
    }

    /**
     * Increase the score for Eagles by 3 points.
     */
    public void addThreeForEagles(View view) {
        scoreEagles = scoreEagles + 3;
        displayForEagles(scoreEagles);
    }

    /**
     * Increase the score for Eagles by 2 points.
     */
    public void addTwoForEagles(View view) {
        scoreEagles = scoreEagles + 2;
        displayForEagles(scoreEagles);
    }

    /**
     * Increase the score for Eagles by 1 point.
     */
    public void addOneForEagles(View view) {
        scoreEagles = scoreEagles + 1;
        displayForEagles(scoreEagles);
    }

    /**
     * Displays the given score for Eagles.
     */
    public void displayForEagles(int score) {
        TextView scoreView = (TextView) findViewById(R.id.eagles_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Resets the score for both teams back to 0.
     */
    public void resetScore (View view) {
        scorePatriots = 0;
        scoreEagles = 0;
        displayForPatriots(scorePatriots);
        displayForEagles(scoreEagles);
    }

}
