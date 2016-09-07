package com.example.hp.above;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class CompoundInterestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compound_interest);
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
    public void ci_answers1(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_ci1);
        previewText.setText("SOLUTION:Time period of 3 years and 6 months means for 3 years, the interest is compounded yearly and for the remaining 6 months, the interest is compounded compounded half yearly. This means that we have 3 cycles of interest compounded yearly and 1 cycle of interest compounded half yearly.\n" +
                "So, Amount = P [1 + (R / 100)]^3 [1 + ( {R/2} / 100 )]\n" +
                "=> Amount = 10000 [1 + 0.1]^3 [1 + 0.05]\n" +
                "=> Amount = 10000 (1.1)^3 (1.05)\n" +
                "=> Amount = Rs. 13975.50\n" +
                "=> Compound Interest, CI = Amount – Principal = 13975.50 – 10000\n" +
                "Therefore, CI = Rs. 3975.50 ");
    }
    public void ci_answers2(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_ci2);
        previewText.setText("SOLUTION:Let the sum be P.\n" +
                "R = 10 %\n" +
                "n = 2 years\n" +
                "SI = P x R x n / 100 = P x 10 x 2 / 100 = 0.20 P\n" +
                "CI = A – P = P [1 + (R / 100)]^n – P = 0.21 P\n" +
                "Now, it is given that CI – SI = 549\n" +
                "=> 0.21 P – 0.20 P = 549\n" +
                "=> 0.01 P = 549\n" +
                "=> P = 54900\n" +
                "Therefore, the required sum of money is Rs. 54,900 ");
    }
    public void ci_answers3(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_ci3);
        previewText.setText("SOLUTION:Let the first brother be given Rs. P\n" +
                "=> Money with second brother = Rs. 1000 – P\n" +
                "Now, according to the question,\n" +
                "P [1 + (5 / 100)]^4 = (1000 – P) [1 + (5 / 100)]^6\n" +
                "=> P (1.05)4 = (1000 – P) (1.05)^6\n" +
                "=> 0.9070 P = 1000 – P\n" +
                "=> 1.9070 P = 1000\n" +
                "=> P = 524.38\n" +
                "Therefore, share of first brother = Rs. 524.38\n" +
                "Share of second brother = Rs. 475.62 ");
    }
    public void ci_answers4(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_ci4);
        previewText.setText("SOLUTION:Let the sum of money be Rs. P\n" +
                "=> P [1 + (R/100)]3= 669 and P [1 + (R/100)]^6= 1003.50\n" +
                "Dividing both equations, we get\n" +
                "[1 + (R/100)]^3 = 1003.50 / 669 = 1.50\n" +
                "Now, we put this value in the equation P [1 + (R/100)]3= 669\n" +
                "=> P x 1.50 = 669\n" +
                "=> P = 446\n" +
                "Thus, the required sum of money is Rs. 446 ");
    }
    public void ci_answers5(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_ci5);
        previewText.setText("SOLUTION: it is given that the investment doubles itself in 15 years.\n" +
                "Let the initial investment be Rs. P\n" +
                "=> At the end of 15 years, A = 2 P\n" +
                "Now, this 2 P will be invested.\n" +
                "=> Amount after 15 more years = 2 x 2 P = 4 P\n" +
                "Now, this 4 P will be invested.\n" +
                "=> Amount after 15 more years = 2 x 4 P = 8 P\n" +
                "Thus, the investment (P) will become 8 times (8 P) in 15 + 15 + 15 = 45 years ");
    }
}