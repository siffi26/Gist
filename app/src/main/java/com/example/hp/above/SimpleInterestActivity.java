package com.example.hp.above;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class SimpleInterestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_interest);
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
    public void si_answers1(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_si1);
        previewText.setText("SOLUTION: Here, A = 18000, T = 2, R = 20\n" +
                "=> A = P + SI\n" +
                "=> A = P + (P x R x T / 100)\n" +
                "=> A = P [1 + (R x T / 100)]\n" +
                "=> 28000 = P [1 + 0.4]\n" +
                "=> P = 28000 / 1.4\n" +
                "=> P = 20000\n" +
                "Thus, the required sum is Rs. 20,000 ");
    }
    public void si_answers2(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_si2);
        previewText.setText("SOLUTION:  Let the borrowed sum be P.\n" +
                "=> SI for first 2 years + SI for next 3 years + SI for next 4 years = 22800\n" +
                "=> (P x 6 x 2 / 100) + (P x 9 x 3 / 100) + (P x 14 x 4 / 100) = 22800\n" +
                "=> 95 P / 100 = 22800\n" +
                "=> P = 24000\n" +
                "Therefore, Borrowed sum = Rs. 24,000 ");
    }
    public void si_answers3(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_si3);
        previewText.setText("SOLUTION:  Amount = Principal + SI\n" +
                "If the sum of money would be thrice the principal after 10 years, the SI would be twice the principal.\n" +
                "=> SI = 2 x P\n" +
                "=> (P x R x T / 100) = 2 X P\n" +
                "=> R x T / 100 = 2\n" +
                "=> R x T = 200\n" +
                "=> R x 10 = 200\n" +
                "=> R = 20 %\n" +
                "Thus, the required rate of interest is 20 % ");
    }
    public void si_answers4(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_si4);
        previewText.setText("SOLUTION:  Let the sum be P.\n" +
                "=> SI in 5 years at 12 % per annum = P x 12 x 5 / 100 = 0.6 P\n" +
                "=> SI in 7 years at 10 % per annum = P x 10 x 7 / 100 = 0.7 P\n" +
                "Now, according to the question,\n" +
                "0.7 P – 0.6 P = 400\n" +
                "=> 0.1 P = 400\n" +
                "=> P = 4000\n" +
                "Thus, the required sum is Rs. 4000 ");
    }
    public void si_answers5(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_si5);
        previewText.setText("SOLUTION:  Let the sum lent at 5 % be P.\n" +
                "=> Sum lent at 8 % = 1000 – P\n" +
                "Now, according to the question,\n" +
                "SI for 5 % + SI for 8 % = 62\n" +
                "=> (P x 5 x 1 / 100) + ((1000 – P) x 8 x 1 / 100) =62\n" +
                "=> 5 P + 8 (1000 – P) = 620\n" +
                "=> 5 P + 8000 – 8 P = 6200\n" +
                "=> 3 P = 1800\n" +
                "=> P = 600\n" +
                "Therefore, sum lent at 5 % = P = Rs. 600\n" +
                "Sum lent at 8 % = 1000 – P = Rs. 400\n" +
                " ");
    }

}