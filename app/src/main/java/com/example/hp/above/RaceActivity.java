package com.example.hp.above;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class RaceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_race);
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

    public void race_answers1(View view) {
        TextView previewText = (TextView) findViewById(R.id.solution_race1);
        previewText.setText("SOLUTION: According to the question, B covers 28 m in 7 seconds.\n" +
                "=> B’s speed = 28 / 7 = 4 m/s\n" +
                "=> Time required by B to complete 100 m = 100 / 4 = 25 s\n" +
                "Now, A needs 7 s less than B to complete the race.\n" +
                "=> Time required by A = 25 – 7 = 18 s ");
    }

    public void race_answers2(View view) {
        TextView previewText = (TextView) findViewById(R.id.solution_race2);
        previewText.setText("SOLUTION:   If A covers 100 m, B covers 96 m and C covers 93.6 m\n" +
                "=> When B covers 96 m, C covers 93.6 m\n" +
                "=> When B covers 100 m, C covers (93.6 / 96) x 100 = 97.5 m\n" +
                "Therefore, B can give a start of 100 – 97.5 = 2.5 m to C ");
    }
}