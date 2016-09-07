package com.example.hp.above;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class LCMandHCFActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lcmand_hcf);
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
    public void lcmhcf_answers(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_lcmhcf);
        previewText.setText("Solution : Let the numbers be 5m and 11m. Since 5:11 is already the reduced ratio, ‘m’ has to be the HCF. So, the numbers are 5 x 7 = 35 and 11 x 7 = 77.");
    }
    public void lcmhcf_answers1(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_lcmhcf1);
        previewText.setText("Solution : Let us first convert each length to cm. So, the lengths are 450 cm, 990 cm and 1620 cm. Now, we need to find the length of the largest plank that can be used to measure these lengths as the largest plank will take the least time. For this, we need to take the HCF of 450, 990 and 1620.\n" +
                "450 = 2 x 3 x 3 x 5 x 5 = 2 x 32 x 52\n" +
                "990 = 2 x 3 x 3 x 5 x 11 = 2 x 32 x 5 x 11\n" +
                "1620 = 2 x 2 x 3 x 3 x 3 x 3 x 5 = 22 x 34 x 5\n" +
                "Therefore, HCF (450, 990, 1620) = 2 x 3 x 3 x 5 = 90\n" +
                "Thus, we need a plank of length 90 cm to measure the given lengths in the least time.");
    }
    public void lcmhcf_answers2(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_lcmhcf2);
        previewText.setText("Solution : The required number leaves remainders 1 and 4 on dividing 70 and 50 respectively. This means that the number exactly divides 69 and 46.\n" +
                "So, we need to find the HCF of 69 (3 x 23) and 46 (2 x 23).\n" +
                "HCF (69, 46) = 23\n" +
                "Thus, 23 is the required number.");
    }

    public void lcmhcf_answers3(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_lcmhcf3);
        previewText.setText("Solution : To find the required number, we need to find the HCF of (136-64), (238-136) and (238-64), i.e., HCF (72, 102, 174).\n" +
                "72 = 23 x 32\n" +
                "102 = 2 x 3 x 17\n" +
                "174 = 2 x 3 x 29\n" +
                "Therefore, HCF (72, 102, 174) = 2 x 3 = 6\n" +
                "hence, 6 is the required number.");
    }
    public void lcmhcf_answers4(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_lcmhcf4);
        previewText.setText("Solution : In these type of questions, we need to find the LCM of the divisors and add the common remainder (3) to it.\n" +
                "So, LCM (5, 7, 9, 12) = 1260\n" +
                "Therefore, required number = 1260 + 3 = 1263");
    }
    public void lcmhcf_answers5(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_lcmhcf5);
        previewText.setText("Solution : The largest four digit number is 9999.\n" +
                "Now, LCM (15, 21, 28) = 420\n" +
                "On dividing 9999 by 420, we get 339 as the remainder.\n" +
                "Therefore, the required number is 9999-339 = 9660");
    }

    public void lcmhcf_answers6(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_lcmhcf6);
        previewText.setText("Solution : They all will whistle again at the same time after an interval that is equal to the LCM of their individual whistle blowing cycles.\n" +
                "So, LCM (42, 60, 78) = 2 x 3 x 7 x 10 x 13 = 5460\n" +
                "Therefore, they will blow the whistle again simultaneously after 5460 sec, i.e., after 1 hour 31 minutes, i.e., at 11:01:00 hours.");
    }

    public void lcmhcf_answers7(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_lcmhcf7);
        previewText.setText("Solution : LCM (6, 7, 8) = 168\n" +
                "So, the number is of the form 168m + 3.\n" +
                "Now, 168m + 3 should be divisible by 9.\n" +
                "We know that a number is divisible by 9 if the sum of its digits is a multiple of 9.\n" +
                "For m = 1, the number is 168 + 3 = 171, the sum of whose digits is 9.\n" +
                "Therefore, the required number is 171.");
    }

    public void lcmhcf_answers8(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_lcmhcf8);
        previewText.setText("Solution : Let the common ratio be ‘m’. So, the numbers are 2m and 3m.\n" +
                "Now, we know that Product of numbers = Product of LCM and HCF.\n" +
                "=> 2m x 3m = 294\n" +
                "=> m2 = 49\n" +
                "=> m = 7\n" +
                "Therefore, the numbers are 14 and 21.");
    }
    public void lcmhcf_answers9(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_lcmhcf9);
        previewText.setText("Solution : We need to find the size of a square tile such that a number of tiles cover the field exactly, leaving no area unpaved.\n" +
                "For this, we find the HCF of the length and breadth of the field.\n" +
                "HCF (180, 105) = 15\n" +
                "Therefore, size of each tile = 15m x 15m\n" +
                "Also, number of tiles = area of field / area of each tile\n" +
                "=> Number of tiles = (180 x 105) / (15 x 15)\n" +
                "=> Number of tiles = 84\n" +
                "Hence, we need 84 tiles, each of size 15m x 15m.\n");
    }

    public void lcmhcf_answers10(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_lcmhcf10);
        previewText.setText("Solution : We need to divide each large field into smaller flower beds such that the area of each bed is same.\n" +
                "So, we find the HCF of the larger fields that gives us the area of the smaller field.\n" +
                "HCF (60, 84, 108) = 12\n" +
                "Now, this HCF is the area (in m2) of each flower bed.\n" +
                "Also, area of a rectangular field = Length x Breadth\n" +
                "=> 12 = 6 x Breadth\n" +
                "=> Breadth = 2 m\n" +
                "Hence, each flower bed would be 2 m wide.\n");
    }

    public void lcmhcf_answers11(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_lcmhcf11);
        previewText.setText("Solution : We need to find the HCF of the number of chocolates and candies available, which would give us the number of students.\n" +
                "HCF (182, 247) = 13\n" +
                "So, there can be 13 students.\n" +
                "Also, Number of chocolates for each student = 182 / 13 = 14\n" +
                "Number of toffees for each student = 247 / 13 = 19\n");
    }

}
