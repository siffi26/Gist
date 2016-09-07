package com.example.hp.above;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class PercentageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_percentage);
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
    public void p_answers1(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_p1);
        previewText.setText("SOLUTION:  Let the total number of bats on that day be n.\n" +
                "=> 0.085 % of n = 34\n" +
                "=> (0.085 / 100) x n = 34\n" +
                "=> n = 34 x (100 / 0.085)\n" +
                "=> n = 40,000\n" +
                "Therefore, total number of bats manufactured on the day = 40,000 ");
    }
    public void p_answers2(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_p2);
        previewText.setText("SOLUTION:   Let the number be n.\n" +
                "=> (n / 3) – 25 % of n = 8\n" +
                "=> (n / 3) – (n / 4) = 8\n" +
                "=> n / 12 = 8\n" +
                "=> n = 96\n" +
                "Thus, 96 is the required number ");
    }
    public void p_answers3(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_p3);
        previewText.setText("SOLUTION:  Let the number of registered participants be n.\n" +
                "Number of participants who actually turned up = 75 % of n\n" +
                "Number of valid participations = 98 % of (75 % of n) [because 2% were invalid]\n" +
                "Number of participants defeated by the winner = 75 % of 98 % of (75 % of n) = 9261\n" +
                "=> 0.75 x 0.98 x 0.75 x n = 9261\n" +
                "=> 0.55125 x n = 9261\n" +
                "=> n = 16800\n" +
                "Therefore, number of registered participants = 16800 ");
    }
    public void p_answers4(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_p4);
        previewText.setText("SOLUTION:  Let the retirement money be Rs. 100 n\n" +
                "=> Money given to wife = 40 % of 100 n = 40 n, Balance = 60 n\n" +
                "=> Money given to 3 sons = 3 x (20 % of 60 n) = 3 x 12 n = 36 n, Balance = 24 n\n" +
                "=> Money spent on miscellaneous items = 50 % of 24 n = 12 n, Balance = 12 n\n" +
                "Now, this remaining 12 n is the money deposited in the bank, i.e., Rs. 1,20,000\n" +
                "=> 12 n = 1,20,000\n" +
                "=> n = 10,000\n" +
                "Therefore, geek’s retirement money = 100 n = Rs. 10,00,000 ");
    }
    public void p_answers5(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_p5);
        previewText.setText("SOLUTION:  We know that if price of increases by P %, the necessary reduction in consumption to avoid increase in expenditure = [( P / (100 + P) ) x 100] %\n" +
                "Therefore, reduction in consumption required = (25 / 125) x 100 = 20 % ");
    }
    public void p_answers6(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_p6);
        previewText.setText("SOLUTION:  We know that if the value is currently P and it depreciates by R % every year, then, value after ‘n’ years = P x [1 – (R / 100)]^n\n" +
                "=> Value after 3 years = 1,60,000 x [1 – (5 / 100)]3\n" +
                "=> Value after 3 years = 1,60,000 x (0.95)3\n" +
                "=> Value after 3 years = 1,60,000 x 0.857375 = Rs. 1,37,180\n" +
                "  ");
    }
    public void p_answers7(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_p7);
        previewText.setText("SOLUTION: Sugar in initial solution = 2 % of 50 KG = 1 KG\n" +
                "Let the sugar added be n KG.\n" +
                "=> (1 + n) / (50 + n) = 10 / 100\n" +
                "=> n = 40 / 9\n" +
                "Therefore, 40 / 9 KG of sugar should be added ");
    }
    public void p_answers8(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_p8);
        previewText.setText("SOLUTION: Let the total number of students be 100 n.\n" +
                "=> Students passed in English = 80 % of 100 n = 80 n\n" +
                "=> Students passed in Mathematics = 85 % of 100 n = 85 n\n" +
                "=> Students passed in both English and Mathematics = 75 % of 100 n = 75 n\n" +
                "=> Total number of students passed in atleast one subject = 80 n + 85 n – 75 n = 90 n\n" +
                "=> Number of students who failed in both the subjects = 100 n – 90 n = 10 n = 40 (given)\n" +
                "=> n = 4\n" +
                "Therefore, total number of students who appeared in the examination = 100 n = 400 ");
    }
}