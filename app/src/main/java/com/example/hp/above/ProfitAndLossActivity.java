package com.example.hp.above;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class ProfitAndLossActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profit_and_loss);
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
    public void pal_answers1(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_pal1);
        previewText.setText("SOLUTION:  CP for each pen = 10 / 20 = Rs. 0.50\n" +
                "SP for each pen = 10 / 15 = Rs. 2 / 3\n" +
                "Profit = SP – CP = Rs. (2 / 3) – 0.50 = Rs. 1 / 6\n" +
                "Therefore, profit percent = [ (1/6) / (0.50) ] x 100 = 33.334%");
    }
    public void pal_answers2(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_pal2);
        previewText.setText("SOLUTION:  Let the cost price of the article be Rs. C\n" +
                "=> SP = CP – Loss\n" +
                "=> 1805 = C – 0.05 C\n" +
                "=> 0.95 C = 1805\n" +
                "=> C = 1900");
    }
    public void pal_answers3(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_pal3);
        previewText.setText("SOLUTION:  We are given that the shopkeeper bought 80 Kg at Rs. 13.50 per KG and 120 KG at Rs. 16 per KG.\n" +
                "=> Total cost price = (80 x 13.50) + (120 x 16) = 1080 + 1920 = Rs. 3000 and total rice = 80 + 120 = 200 KG\n" +
                "Now, total selling price = Total cost price + 16 % of total cost price\n" +
                "=> Total selling price = 3000 + (0.16 x 3000) = Rs. 3480\n" +
                "Thus, selling price per KG = 3480 / 200 = Rs. 17.40");
    }
    public void pal_answers4(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_pal4);
        previewText.setText("SOLUTION: Profit percent = [ (True Value – Given Value) / Given Value ] x 100 %\n" +
                "Here, True Value = 1 KG = 1000 gm\n" +
                "Given Value = 750 gm\n" +
                "Therefore, profit percent = [ (1000 – 750) / 750 ] x 100 = (250 / 750) x 100 = 33.334 %");
    }
    public void pal_answers5(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_pal5);
        previewText.setText("SOLUTION: Let the marked price of the shirt be Rs. 1000\n" +
                "=> Price after first discount = Rs. 1000 – 20 % of Rs. 1000 = Rs. 1000 – 200 = Rs. 800\n" +
                "=> Price after second discount = Rs. 800 – 10 % of Rs. 800 = Rs. 800 – 80 = Rs. 720\n" +
                "=> Price after cash discount = Rs. 720 – 5 % of Rs. 720 = Rs. 720 – 36 = Rs. 684\n" +
                "Therefore, total discount = Rs. 1000 – 684 = Rs. 316\n" +
                "=> Overall discount percent = (316 / 1000) x 100 = 31.60 %");
    }
    public void pal_answers6(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_pal6);
        previewText.setText("SOLUTION: Let the cost price of the article be Rs. 100\n" +
                "=> Selling price of the article = Rs. 100 + 33% of CP = Rs. 133\n" +
                "Let the marked price be Rs. M\n" +
                "=> Selling price = Marked Price – Discount\n" +
                "=> 133 = M – 0.05 M\n" +
                "=> 133 = 0.95 M\n" +
                "=> M = 140\n" +
                "=> M – CP = 140 – 100 = 40\n" +
                "Therefore, percent of CP above which the article should be marked = (40 / 100) x 100 = 40 %");
    }
}