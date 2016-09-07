package com.example.hp.above;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class PipesAndCisternsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pipes_and_cisterns);
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
    public void pc_answers1(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_pc1);
        previewText.setText("Solution : Part of tank filled by pipe A in one hour working alone = 1 / 12\n" +
                "Part of tank filled by pipe B in one hour working alone = 1 / 16\n" +
                "=> Part of tank filled by pipe A and pipe B in one hour working together = (1 / 12) + (1 / 16) = 7 / 48\n" +
                "Therefore, time taken to completely fill the tank if both A and B work together = 48 / 7 hours\n" +
                " \n" +
                "Another Method\n" +
                "Let the capacity of tank be LCM (12, 16) = 48 units\n" +
                "=> Efficiency of pipe A = 48 / 12 = 4 units / hour\n" +
                "=> Efficiency of pipe B = 48 / 16 = 3 units / hour\n" +
                "=> Combined efficiency of pipes A and B = 7 units / hour\n" +
                "Therefore, time taken to completely fill the tank = 48 / 7 hours");
    }
    public void pc_answers2(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_pc2);
        previewText.setText("SOLUTION:Part of tank filled by pipe A in one hour working alone = 1 / 10\n" +
                "Part of tank filled by pipe B in one hour working alone = 1 / 12\n" +
                "Part of tank emptied by pipe B in one hour working alone = 1 / 30\n" +
                "=> Part of tank filled by pipes A,B and C in one hour working together = (1 / 10) + (1 / 12) – (1 / 30) = 3 / 20\n" +
                "Therefore, time taken to completely fill the tank if both A and B work together = 20 / 3 hours = 6 hours 40 minutes\n" +
                " \n" +
                "Another Method\n" +
                "Let the capacity of tank be LCM (10, 12, 30) = 60 units\n" +
                "=> Efficiency of pipe A = 60 / 10 = 6 units / hour\n" +
                "=> Efficiency of pipe B = 60 / 12 = 5 units / hour\n" +
                "=> Efficiency of pipe C = – 60 / 30 = – 2 units / hour (Here, ‘-‘ represents outlet pipe)\n" +
                "=> Combined efficiency of pipes A, B and C = 6 + 5 – 2 = 9 units / hour\n" +
                "Therefore, time taken to completely fill the tank = 60 / 9 = 6 hours 40 minutes");
    }
    public void pc_answers3(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_pc3);
        previewText.setText("SOLUTION:Let the time taken by first pipe working alone be ‘t’ minutes.\n" +
                "=> Time taken by second pipe working alone = t + 10 minutes.\n" +
                "Part of tank filled by pipe A in one hour working alone = 1 / t\n" +
                "Part of tank filled by pipe B in one hour working alone = 1 / (t + 10)\n" +
                "=> Part of tank filled by pipe A and B in one hour working together = (1 / t) + (1 / t+10) = (2t + 10) / [t x (t + 10)]\n" +
                "But we are given that it takes 12 minutes to completely fill the cistern if both pipes are working together.\n" +
                "=> (2t + 10) / [t x (t + 10)] = 1 / 12\n" +
                "=> t x (t + 10) / (2t + 10) = 12\n" +
                "=> t2 + 10t = 24t + 120\n" +
                "=> t2 – 14t – 120 = 0\n" +
                "=> (t – 20) (t + 6) = 0\n" +
                "=> t = 20 minutes (Time cannot be negative)\n" +
                "Therefore, time taken by second pipe working alone = 20 + 10 = 30 minutes\n" +
                " \n" +
                "Another Method\n" +
                "Let the time taken by first pipe working alone be ‘t’ minutes.\n" +
                "=> Time taken by second pipe working alone = t + 10 minutes.\n" +
                "Let the capacity of cistern be t x (t + 10) units.\n" +
                "=> Efficiency of first pipe = t x (t + 10) / t = (t + 10) units / minute\n" +
                "=> Efficiency of second pipe = t x (t + 10) / (t + 10) = t units / minute\n" +
                "=> Combined efficiency of pipes = (2t + 10) units / minute\n" +
                "=> Time taken to fill the cistern completely = t x (t + 10) / (2t + 10)\n" +
                "But we are given that it takes 12 minutes to completely fill the cistern if both pipes are working together.\n" +
                "=> t x (t + 10) / (2t + 10) = 12\n" +
                "=> t2 + 10t = 24t + 120\n" +
                "=> t2 – 14t – 120 = 0\n" +
                "=> (t – 20) (t + 6) = 0\n" +
                "=> t = 20 minutes (Time cannot be negative)\n" +
                "Therefore, time taken by second pipe working alone = 20 + 10 = 30 minutes");
    }

    public void pc_answers4(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_pc4);
        previewText.setText("SOLUTION:Let the capacity of tank be LCM (10, 30) = 30 units\n" +
                "=> Efficiency of pipe A = 30 / 10 = 3 units / hour\n" +
                "=> Efficiency of pipe B = 30 / 30 = 1 units / hour\n" +
                "=> Combined efficiency of pipes A and B = 4 units/hour\n" +
                "Therefore, time taken to completely fill the tank if only A and B are opened = 30 / 4 = 7 hours 30 minutes\n" +
                "=> Time taken to completely fill the tank if all pipes are opened = 7 hours 30 minutes + 30 minutes = 8 hours\n" +
                "=> Combined efficiency of all pipes = 30 / 8 = 3.75 units / hour\n" +
                "Now, efficiency of pipe C = Combined efficiency of all three pipes – Combined efficiency of pipes A and B\n" +
                "Therefore, efficiency of pipe C = 4 – 3.75 = 0.25 units / hour\n" +
                "Thus, time taken to empty the tank if only C is opened = 30 / 0.25 = 120 hours");
    }
    public void pc_answers5(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_pc5);
        previewText.setText("SOLUTION:Let the capacity of the tank be LCM (36, 45, 30) = 180 units\n" +
                "=> Efficiency of pipe A = 180 / 36 = 5 units / second\n" +
                "=> Efficiency of pipe B = 180 / 45 = 4 units / second\n" +
                "=> Efficiency of pipe C = – 180 / 30 = – 6 units / second\n" +
                "Now, for the first 7 seconds, A and B were open.\n" +
                "=> Combined efficiency of A and B = 5 + 4 = 9 units / second\n" +
                "=> Part of the tank filled in 7 seconds = 7 x 9 = 63 units\n" +
                "=> Part of tank empty = 180 – 63 = 117 units\n" +
                "Now, all pipes are opened.\n" +
                "=> Combined efficiency of all pipes = 5 + 4 – 6 = 3 units / second\n" +
                "Therefore, more time required = 117 / 3 = 39 seconds\n" +
                " ");
    }
    public void pc_answers6(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_pc6);
        previewText.setText("SOLUTION:Let the capacity of the tank be LCM (20, 30) = 60 units\n" +
                "=> Efficiency of pipe A = 60 / 20 = 3 units / hour\n" +
                "=> Efficiency of pipe B = 60 / 30 = 2 units / hour\n" +
                "=> Combined efficiency of pipes A and B = 5 units / hour\n" +
                "Let both A and B be opened for ‘n’ hours and then, B be closed and only A be opened for the remaining ’18 – n’ hours.\n" +
                "=> 5n + 3 x (18 – n) = 60\n" +
                "=> 2n + 54 = 60\n" +
                "=> 2n = 6\n" +
                "=> n = 3\n" +
                "Therefore, B should be closed after 3 hours");
    }

}