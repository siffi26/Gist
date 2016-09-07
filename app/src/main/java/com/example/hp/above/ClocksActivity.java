package com.example.hp.above;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class ClocksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clocks);
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

    public void clock_answers1(View view) {
        TextView previewText = (TextView) findViewById(R.id.solution_clock1);
        previewText.setText("SOLUTION:   At 3:00 PM, angle made by the minute hand = 0 degree and angle made by the hour hand = 3 x angle made by the hour hand in one hour = 3 x 30 = 90 degrees\n" +
                "Now, in the next 20 minutes, angle made by the hour hand = 20 x angle made by the minute hand in 1 minute = 20 x 6 = 120 degrees and angle made by the hour hand = 20 x angle made by the hour hand in 1 minute = 20 x 0.50 = 10 degrees\n" +
                "=> Angle made by the minute hand at 3:20 PM = 0 + 120 = 120 degrees\n" +
                "=> Angle made by the hour hand at 3:20 PM = 90 + 10 = 100 degrees\n" +
                "Therefore, angle between the hands of the clock at 3:20 PM = 120 – 100 = 20 degrees\n" +
                "Another Method : \n" +
                "At 3:00 PM, angle made by the minute hand = 0 degree and angle made by the hour hand = 3 x angle made by the hour hand in one hour = 3 x 30 = 90 degrees\n" +
                "=> Initial angle between the two hands = 90 degrees\n" +
                "Now, we know that the difference between the two hands of the clock increases every minute by 5.50 degrees.\n" +
                "=> Difference between the hands of the clock after 20 minutes = 20 x 5.50 = 110 degrees\n" +
                "Therefore, difference between the two hands at 3:20 PM = 110 – 90 = 20 degrees ");
    }

    public void clock_answers2(View view) {
        TextView previewText = (TextView) findViewById(R.id.solution_clock2);
        previewText.setText("SOLUTION:  At 3 PM, the hour hand would be at 15 spaces and the minute hand would be at 0 spaces. The minute hand would have to cover these extra 15 spaces in order to meet the hour hand.\n" +
                "Now, 55 minutes are gained by the minute hand in 60 minutes.\n" +
                "=> 15 minutes would be gained in (60 / 55) x 15 = 180 / 11 minutes\n" +
                "Thus, the two hands of the clock meet at 180 / 11 minutes past 3 PM, i.e., around 3:16:22 PM. ");
    }

    public void clock_answers3(View view) {
        TextView previewText = (TextView) findViewById(R.id.solution_clock3);
        previewText.setText("SOLUTION:  Between 11 to 1, the hands of the clock coincide only once, i.e., at 12. So, every 12 hours, they coincide 11 times.\n" +
                "Therefore, the two hands of the clock coincide 22 times in a day. ");
    }
}