package com.example.hp.above;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class CalendersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calenders);
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

    public void cal_answers1(View view) {
        TextView previewText = (TextView) findViewById(R.id.solution_cal1);
        previewText.setText("SOLUTION:  1600 will have 0 odd days.\n" +
                "300 years will have 1 odd day.\n" +
                "Now, in the next 99 years, we would be having 75 non – leap years and 24 leap years.\n" +
                "=> Number of odd days = (75 x 1) + (24 x 2) = 75 + 48 = 123 mod 7 = 4 odd days\n" +
                "Total odd days till now = 1 + 4 = 5\n" +
                "Number of of odd days in January = 31 mod 7 = 3\n" +
                "Number of of odd days in February (2000 is a leap year) = 29 mod 7 = 1\n" +
                "Number of of odd days in March = 31 mod 7 = 3\n" +
                "Number of of odd days till 14 April, 2000 in the month of April= 14 mod 7 = 0\n" +
                "So, total number of odd days = 5 + 3 + 1 + 3 = 12 mod 7 = 5\n" +
                "Thus, 14 April, 2000 was Friday (odd days = 5 => Friday) ");
    }

    public void cal_answers2(View view) {
        TextView previewText = (TextView) findViewById(R.id.solution_cal2);
        previewText.setText("SOLUTION:  1600 will have 0 odd days.\n" +
                "300 years will have 1 odd day.\n" +
                "Now, in the next 47 years, we would be having 36 non – leap years and 11 leap years.\n" +
                "=> Number of odd days = (36 x 1) + (11 x 2) = 36 + 22 = 58 mod 7 = 2 odd days\n" +
                "Total odd days till now = 1 + 2 = 3\n" +
                "Number of of odd days in January = 31 mod 7 = 3\n" +
                "Number of of odd days in February (1947 is a non – leap leap year) = 28 mod 7 = 0\n" +
                "Number of of odd days in March = 31 mod 7 = 3\n" +
                "Number of of odd days in April = 30 mod 7 = 2\n" +
                "Number of of odd days in May = 31 mod 7 = 3\n" +
                "Number of of odd days in June = 30 mod 7 = 2\n" +
                "Number of of odd days in July = 31 mod 7 = 3\n" +
                "Number of of odd days till 16 August, 1947 = 16 mod 7 = 2\n" +
                "So, total number of odd days = 3 + 3 + 0 + 3 + 2 + 3 + 2 + 3 + 2 = 21 mod 7 = 0\n" +
                "Thus, 16 August, 1947 was Sunday (odd days = 0 => Sunday) ");
    }
}