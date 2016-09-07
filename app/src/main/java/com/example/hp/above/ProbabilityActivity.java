package com.example.hp.above;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class ProbabilityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_probability);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    public void probability_answers1(View view) {
        TextView previewText = (TextView) findViewById(R.id.solution_probability1);
        previewText.setText("SOLUTION:  S = {HHH, HHT, HTH, THH, HTT, THT, TTH, TTT}\n" +
                "Favorable outcomes = {HTT, THT, TTH, TTT}\n" +
                "Total number of outcomes = 8\n" +
                "Number of favorable outcomes = 4\n" +
                "Required probability = 4 / 8 = 0.50 ");
    }
    public void probability_answers2(View view) {
        TextView previewText = (TextView) findViewById(R.id.solution_probability2);
        previewText.setText("SOLUTION: Total number of outcomes = 52\n" +
                "Number of favorable outcomes = Number of red cards = 26\n" +
                "=> Required probability = 26 / 52 = 0.50 ");
    }
    public void probability_answers3(View view) {
        TextView previewText = (TextView) findViewById(R.id.solution_probability3);
        previewText.setText("SOLUTION: Outcome will be favorable if the two balls drawn are of the same color.\n" +
                "=> Number of favorable outcomes = 6 C 2 + 4 C 2 = 21\n" +
                "Total number of outcomes = 10 C 2 = 45\n" +
                "Therefore, required probability = 21 / 45 = 7 / 15 ");
    }
    public void probability_answers4(View view) {
        TextView previewText = (TextView) findViewById(R.id.solution_probability4);
        previewText.setText("SOLUTION: S = {1, 2, 3, 4, 5, 6}\n" +
                "Favorable outcomes = {2, 4, 6}\n" +
                "Required probability = 3 / 6 = 0.50 ");
    }
    public void probability_answers5(View view) {
        TextView previewText = (TextView) findViewById(R.id.solution_probability5);
        previewText.setText("SOLUTION:  Total number of outcomes = 20 C 2 = 190\n" +
                "Number of favorable outcomes = 10 C 1 x 10 C 1 = 100\n" +
                "Therefore, required probability = 100 / 190 = 10 / 19 ");
    }


}