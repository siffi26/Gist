package com.example.hp.above;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class ProgressionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progressions);
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
    public void progress_answers1(View view) {
        TextView previewText = (TextView) findViewById(R.id.solution_progress1);
        previewText.setText("SOLUTION:  4t(4) = 9t(9) , we need to find t(13) \n" +
                "\n" +
                "4(a + 3d) = 9(a + 8d) \n" +
                "\n" +
                "4a + 12d = 9a + 72d \n" +
                "\n" +
                "=> 5a + 60d = 0 \n" +
                "\n" +
                "=> a + 12d = 0 \n" +
                "\n" +
                "=> t(13) = 0 \n" +
                "\n" +
                "=> 13 × t\"(13)\" = 0 \n" +
                "\n" +
                "As a simple rule, if n × t(n) = m × t(m), then t(m+n) = 0. See, if you can prove this. \n" +
                "\n" +
                "Answer choice (b). ");
    }
    public void progress_answers2(View view){
        TextView previewText = (TextView) findViewById(R.id.solution_progress2);
        previewText.setText("SOLUTION: First A.P., a = 1, d = 4 \n" +
                "\n" +
                "S(2n) = 2n/2 [2 x 1+(2n −1)4] \n" +
                "\n" +
                "S(2n) = n(2 + 8n – 4) = n(8n – 2) = 8n^2 – 2n \n" +
                "\n" +
                "For the second AP, a = 56, d = 2 \n" +
                "\n" +
                "S(n) = n/2 [2 x 56+(n −1)2] \n" +
                "\n" +
                "S(n) = n/2 [112+2n −2] = n/2 (110+2n) \n" +
                "\n" +
                "The sum of 2n terms of AP {1, 5, 9, 13, …..} is greater than sum of n terms of A.P. = {56, 58, 60, …} \n" +
                "\n" +
                "8n^2 – 2n > n/2 (110+2n)\n" +
                "\n" +
                "16n^2 – 4n > 110n + 2n2\n" +
                "\n" +
                "14n^2 > 114n\n" +
                "\n" +
                "7n > 57\n" +
                "\n" +
                "n > 57/7\n" +
                "\n" +
                "The smallest value n can take = 9. Answer choice (a) ");

    }
    public void progress_answers3(View view) {
        TextView previewText = (TextView) findViewById(R.id.solution_progress3);
        previewText.setText("SOLUTION:  Given, Second term of an AP is 8 => a+d =8, 8th term is 2 more than thrice the second term => a+7d = 2 +3(a+d) = 2+3*8 =26 .\n" +
                "\n" +
                "a+d =8 -------------- 1\n" +
                "\n" +
                "a+7d = 26 -------------- 2\n" +
                "\n" +
                "Solving for d in the two equations, we get d = 3 and a =5. Sum of n terms in an AP = n2 * [2a +(n-1)d].\n" +
                "\n" +
                "=> Sum upto 8 terms in this AP = 82 * [2*5 + (8-1)3] => 4*[10+21] = 4*31 = 124. ");
    }
    public void progress_answers4(View view) {
        TextView previewText = (TextView) findViewById(R.id.solution_progress4);
        previewText.setText("SOLUTION:  Given : S(∞)=12 and a=8\n" +
                "\n" +
                "S(∞)=a/(1−r)\n" +
                "12=81−r\n" +
                "l−r=23\n" +
                "r=13\n" +
                "\n" +
                "Now t(4)=8∗133\n" +
                "t(4)=827\n" +
                "\n" +
                "Correct Answer: 827 ");
    }
    public void progress_answers5(View view) {
        TextView previewText = (TextView) findViewById(R.id.solution_progress5);
        previewText.setText("SOLUTION: Let a1, a2 be the salaries of their first year and d1 and d2 be the difference between salaries of two consecutive years.\n" +
                "\n" +
                "Now, the sum of p terms of their salaries are \n" +
                "\n" +
                "S(p) = p/2∗[2a1+(p−1)d1]\n" +
                "\n" +
                "S'(p) = p/2∗[2a2+(p−1)d2]\n" +
                "\n" +
                "(p/2∗[2a1+(p−1)d1])/(p/2∗[2a2+(p−1)d2])=4p+12p+17\n" +
                "\n" +
                "([2a1+(p−1)d1])/([2a2+(p−1)d2])=4p+12p+17 -------------------- (1)\n" +
                "\n" +
                "Now,\n" +
                "Ratio of Salaries earned by them in the 7th year\n" +
                "\n" +
                "= (a1+6d1)/(a2+6d2)\n" +
                "\n" +
                "= (2a1+12d1)/(2a2+12d2) (Multiplying and Dividing by 2)\n" +
                "\n" +
                "= (2a1+(13−1)d1)/([2a2+(13−1)d2)\n" +
                "\n" +
                "= (4∗13+1)/(2∗13+17)\n" +
                "\n" +
                "= 53 : 43 \n" +
                "\n" +
                "Correct Answer: 53 : 43 ");
    }
    public void progress_answers6(View view) {
        TextView previewText = (TextView) findViewById(R.id.solution_progress6);
        previewText.setText("SOLUTION:  Common ratio is positive, and one of the terms is positive => All terms are positive\n" +
                "\n" +
                "P6 = P5 * t6 => If P6 > P5, t6 > 1\n" +
                "\n" +
                "P7 = P6 * t7 => If P6 > P7, t7 < 1\n" +
                "\n" +
                "t6 = t2 * r4 = 1000r^4;\n" +
                "\n" +
                "t7 = t2 * r5 = 1000r^5\n" +
                "\n" +
                "1000r^4 > 1 and 1000r^5 < 1\n" +
                "\n" +
                "1/r^4 < 1000 and 1/r^5 > 1000.\n" +
                "1/r = n.\n" +
                "\n" +
                "n4 < 1000 and n5 > 1000, where n is a natural number\n" +
                "\n" +
                "n4 < 1000 => n < 6\n" +
                "\n" +
                "n5 > 1000 => n ≥ 4\n" +
                "\n" +
                "n could be 4 or 5. Sum of possible values = 9 " +
                "Correct Answer: 9\n");
    }
}