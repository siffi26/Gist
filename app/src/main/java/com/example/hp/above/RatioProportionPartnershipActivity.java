package com.example.hp.above;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class RatioProportionPartnershipActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ratio_proportion_partnership);
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
    public void rpp_answers1(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_rpp1);
        previewText.setText("SOLUTION: Here, we make the common term ‘b’ equal in both ratios.\n" +
                "Therefore, we multiply the first ratio by 7 and the second ratio by 9.\n" +
                "So, we have a : b = 35 : 63 and b : c = 63 : 36\n" +
                "Thus, a : b : c = 35 : 63 : 36 ");
    }
    public void rpp_answers2(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_rpp2);
        previewText.setText("SOLUTION: The given ratio is 5 : 4\n" +
                "Sum of numbers in the ratio = 5 + 4 = 9\n" +
                "We divide Rs. 981 in 9 parts.\n" +
                "981 / 9 = 109\n" +
                "Therefore, Rs. 981 in the ratio 5 : 4 = Rs. 981 in the ratio (5 / 9) : (4 / 9)\n" +
                "=> Rs. 981 in the ratio 5 : 4 = (5 x 109) : (4 x 109) = 545 : 436 ");
    }
    public void rpp_answers3(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_rpp3);
        previewText.setText("SOLUTION: Let the common ratio be 100 k.\n" +
                "Number of 50 p coins = 200 k\n" +
                "Number of 25 p coins = 500 k\n" +
                "Number of 10 p coins = 300 k\n" +
                "Value of 50 p coins = 0.5 x 200 k = 100 k\n" +
                "Value of 25 p coins = 0.25 x 500 k = 125 k\n" +
                "Value of 10 p coins = 0.1 x 300 k = 30 k\n" +
                "=> Total value of all coins = 100 k + 125 k + 30 k = 255 k = 510 (given)\n" +
                "=> k = 2\n" +
                "Therefore, Number of 50 p coins = 200 k = 400\n" +
                "Number of 25 p coins = 500 k = 1000\n" +
                "Number of 10 p coins = 300 k = 600 ");
    }
    public void rpp_answers4(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_rpp4);
        previewText.setText("SOLUTION:  The initial ratio is 4 : 3.\n" +
                "Let ‘k’ be the common ratio.\n" +
                "=> Initial quantity of sugar solution = 4 k\n" +
                "=> Initial quantity of colored water = 3 k\n" +
                "=> Final quantity of sugar solution = 4 k\n" +
                "=> Final quantity of colored water = 3 k + 10\n" +
                "Final ratio = 4 k : 3 k + 10 = 4 : 5\n" +
                "=> k = 5\n" +
                "Therefore, initial quantity of sugar solution in the given mixture = 4 k = 20 liters ");
    }
    public void rpp_answers5(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_rpp5);
        previewText.setText("SOLUTION: We know that if the time period of investment is same, profit/loss is divided in the ratio of value of investment.\n" +
                "=> Ratio of value of investment of A and B = 1,00,000 : 2,00,000 = 1 : 2\n" +
                "=> Ratio of share in profit = 1 : 2\n" +
                "=> Share of A in profit = (1/3) x 30,000 = Rs. 10,000\n" +
                "=> Share of B in profit = (2/3) x 30,000 = Rs. 20,000 ");
    }
    public void rpp_answers6(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_rpp6);
        previewText.setText("SOLUTION: We know that if the period of investment is not uniform, the gains/losses from the business are divided in the ratio of their inputs, where input is calculated as the product of amount of investment and time period of investment.\n" +
                "So, input = value of investment x period of investment, and here, period of investment would be broken into parts as the investment is not uniform throughout the time period.\n" +
                "A’s input = (10,000 x 5) + (7,000 x 7) = 99,000\n" +
                "B’s input = (10,000 x 5) + (8,000 x 7) = 1,06,000\n" +
                "C’s input = (10,000 x 5) + (13,000 x 7) = 1,41,000\n" +
                "=> A : B : C = 99000 : 106000 : 141000\n" +
                "=> A : B : C = 99 : 106 : 141\n" +
                "=> A : B : C = (99 / 346) : (106 / 346) : (141 / 346)\n" +
                "Thus, A’s share = (99 / 346) x 34600 = Rs. 9900\n" +
                "B’s share = (106 / 346) x 34600 = Rs. 10600\n" +
                "C’s share = (141 / 346) x 34600 = Rs. 14100 ");
    }
    public void rpp_answers7(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_rpp7);
        previewText.setText("SOLUTION: Let A work alone for ‘n’ months.\n" +
                "=> A’s input = 70,000 x 12\n" +
                "=> B’s input = 60,000 x (12 – n)\n" +
                "So, (70,000 x 12) / [60,000 x (12 – n)] = 2 / 1\n" +
                "=> (7 x 12) / [6 x (12 – n)] = 2 / 1\n" +
                "=> 12 – n = 7\n" +
                "=> n = 5\n" +
                "Therefore, B joined after 5 months");
    }

}