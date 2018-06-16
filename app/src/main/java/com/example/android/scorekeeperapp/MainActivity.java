package com.example.android.scorekeeperapp;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int goalHomeTeam = 0 ;
    int chanceHomeTeam = 0 ;
    int goalAwayTeam = 0 ;
    int chanceAwayTeam = 0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     *Increase the goal for Home Team by 1 goal.
     */
    public void addOneGoalForHomeTeam(View view){
        goalHomeTeam = goalHomeTeam+ 1 ;
        displayGoalForHomeTeam(goalHomeTeam);
    }
    /**
     *Increase the chance for Home Team by 1 foul.
     */
    public void addOneChanceForHomeTeam(View view){
        chanceHomeTeam= chanceHomeTeam + 1 ;
        displayChanceForHomeTeam(chanceHomeTeam);
    }

    /**
     *Increase the score for Away Team by 1 goal.
     */
    public void addOneGoalForAwayTeam(View view){
        goalAwayTeam = goalAwayTeam + 1 ;
        displayGoalForAwayTeam(goalAwayTeam);
    }

    /**
     *Increase the chance for Home Team by 1 foul.
     */
    public void addOneChanceForAwayTeam(View view){
        chanceAwayTeam= chanceAwayTeam + 1 ;
        displayChanceForAwayTeam(chanceAwayTeam);
    }

    /**
     * Displays the given goal for Home Team.
     */
    public void displayGoalForHomeTeam(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_home_goal);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given chance for Home Team.
     */
    public void displayChanceForHomeTeam(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_home_chance);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given goal for Away Team.
     */
    public void displayGoalForAwayTeam(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_away_goal);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given chance for Away Team.
     */
    public void displayChanceForAwayTeam(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_away_chance);
        scoreView.setText(String.valueOf(score));
    }

    /**Reset the scores and chances for both teams to zero
     *
     * @param view
     */
    public void resetStats(View view){
        goalHomeTeam = 0 ;
        chanceHomeTeam = 0 ;
        goalAwayTeam = 0 ;
        chanceAwayTeam = 0 ;
        displayGoalForHomeTeam(goalHomeTeam);
        displayChanceForHomeTeam(chanceHomeTeam);
        displayGoalForAwayTeam(goalAwayTeam);
        displayChanceForAwayTeam(chanceAwayTeam);
    }


    // Use an intent to launch a youtube app.
    public void watchYouTubeLive(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("vnd.youtube:"));// only you app should handle this
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }



    }
}
