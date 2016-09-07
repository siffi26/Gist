package com.example.hp.above;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class WorkAndWagesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work_and_wages);
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
    public void workwages_answers(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_workwages);
        previewText.setText("\n\nSolution : Method 1 :\n" +
                "A’s one day work (efficiency) = 1/10\n" +
                "B’s one day work (efficiency) = 1/15\n" +
                "Total work done in one day = 1/10 + 1/15 = 1/6\n" +
                "Therefore, working together, they can complete the total work in 6 days.\n" +
                "Method 2 (Short Method):\n" +
                "Let the total work be LCM (10, 15) = 30 units\n" +
                "=> A’s efficiency = 30/10 = 3 units / day\n" +
                "=> B’s efficiency = 30/15 = 2 units / day\n" +
                "Combined efficiency of A and B = 3+2 = 5 units / day\n" +
                "=> In one day, A and B working together can finish of 5 units of work, out of the given 30 units.\n" +
                "Therefore, time taken to complete total work = 30 / 5 = 6 days");
    }
    public void workwages_answers1(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_workwages1);
        previewText.setText("\n\nSolution : Let the total work be LCM (4, 12) = 12\n" +
                "=> A’s efficiency = 12/12 = 1 unit / day\n" +
                "=> Combined efficiency of A and B = 12/4 = 3 units / day\n" +
                "Therefore, B’s efficiency = Combined efficiency of A and B – A’s efficiency = 2 units / day\n" +
                "So, time taken by B to complete the assignment alone = 12/2 = 6 days");
    }
    public void workwages_answers2(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_workwages2);
        previewText.setText("\n\nSolution : Let the total work be LCM (18, 24, 36) = 72\n" +
                "=> Combined efficiency of A and B = 72/18 = 4 units / day\n" +
                "=> Combined efficiency of B and C = 72/24 = 3 units / day\n" +
                "=> Combined efficiency of A and C = 72/36 = 2 units / day\n" +
                "Summing the efficiencies,\n" +
                "2 x (Combined efficiency of A, B and C) = 9 units / day\n" +
                "=> Combined efficiency of A, B and C = 4.5 units / day\n" +
                "Therefore, time required to complete the task if A, B and C work together = 72/4.5 = 16 days\n" +
                " \n" +
                "Also, to find the individual times, we need to find individual efficiencies. For that, we subtract the combined efficiency of any two from combined efficiency of all three.\n" +
                "So, Efficiency of A = Combined efficiency of A, B and C – Combined efficiency of B and C = 4.5 – 3 = 1.5 units / day\n" +
                "Efficiency of B = Combined efficiency of A, B and C – Combined efficiency of A and C = 4.5 – 2 = 2.5 units / day\n" +
                "Efficiency of C = Combined efficiency of A, B and C – Combined efficiency of A and B = 4.5 – 4 = 0.5 units / day\n" +
                " \n" +
                "Therefore, time required by A to complete the task alone = 72/1.5 = 48 days\n" +
                "Time required by B to complete the task alone = 72/2.5 = 28.8 days\n" +
                "Time required by C to complete the task alone = 72/0.5 = 144 days");
    }

    public void workwages_answers3(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_workwages3);
        previewText.setText("\n\nSolution : Let the efficiency of B be 1 unit / day.\n" +
                "=> Efficiency of A = 2 unit / day.\n" +
                "=> Combined efficiency of A and B = 2+1 = 3 units / day\n" +
                "=> Total work = No. of Days x Efficiency = 18 days x 3 units / day = 54 units\n" +
                "Therefore, time required by A to complete the work alone = 54/2 = 27 days\n" +
                "Time required by B to complete the work alone = 54/1 = 54 days");
    }

    public void workwages_answers4(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_workwages4);
        previewText.setText("\n\nSolution : Let the total work be 800 units.\n" +
                "=> A’s efficiency = 800/800 = 1 unit / day\n" +
                "=> Work done by A in 100 days = 100 units\n" +
                "=> Remaining work = 700 units\n" +
                "Now, A leaves and B alone completes the remaining 700 units of work in 350 days.\n" +
                "=> Efficiency of B = 700/350 = 2 units / day\n" +
                "Therefore, combined efficiency of A and B = 3 units / day\n" +
                "So, time taken to complete the work if both A and B would have worked for the whole time = 800 / 3 = 266.667 days.");
    }

    public void workwages_answers5(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_workwages5);
        previewText.setText("\n\nSolution : Let the total work be LCM (6, 8, 24) = 24 units.\n" +
                "=> A’s efficiency = 24/6 = 4 units / day\n" +
                "=> B’s efficiency = 24/8 = 3 units / day\n" +
                "=> C’s efficiency = 24/24 = 1 unit / day\n" +
                "We know that ratio of efficiencies = Ratio of wages\n" +
                "=> Ratio of daily wages of A, B, C = 4:3:1\n" +
                "Also, it is given that they get Rs. 800 collectively at the end of each day.\n" +
                "Therefore, A’s daily wages = Rs. 400\n" +
                "B’s daily wages = Rs. 300\n" +
                "C’s daily wages = Rs. 100");
    }


    public void workwages_answers6(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_workwages6);
        previewText.setText("\n\nSolution : Let the total work be LCM (9, 12) = 36 units\n" +
                "=> A’s efficiency = 36/9 = 4 units / day\n" +
                "=> B’s efficiency = 36/12 = 3 units / day\n" +
                "Now, since they work alternately, they would complete 7 units of work in two days.\n" +
                "=> In 5 such cycles of alternate working, i.e., 10 days, they would have completed 35 units of work.\n" +
                "Now, work left = 1 unit\n" +
                "Now, B would do that in less than one day but we have to take into account one full day even if work goes on for some part of the day.\n" +
                "Therefore, time required for the work to be completed = 10+1 = 11 days");
    }

    public void workwages_answers7(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_workwages7);
        previewText.setText("\n\nSolution : Let the efficiency of each man be 1 unit / day.\n" +
                "Let the total work = 45 x 16 = 720 units\n" +
                "=> Work done in 6 days by 45 men = 45 x 6 = 270 units\n" +
                "=> Remaining work = 720-270 = 450 units\n" +
                "Now, we have 75 men with efficiency 1 unit / day each to complete the work.\n" +
                "Thus, More days required to complete the work = 450/75 = 6 days\n" +
                " \n" +
                "Alternate Method\n" +
                "Here, we can use the formula for comparison of work and efficiency\n" +
                "M1 D1 H1 E1 / W1 = M2 D2 H2 E2 / W2\n" +
                "Here, M1 = 45 (initial number of men)\n" +
                "D1 = 6 (number of days 45 men work)\n" +
                "W1 = 270 (work done by 45 men in 6 days)\n" +
                "E1 = E2 = 1 (efficiency of each man)\n" +
                "We assume H1 = H2 = Number of working hours in a day\n" +
                "M2 = 75 (number of men after 6 days)\n" +
                "D2 = Number of days 75 men work or Number of more days required\n" +
                "W2 = 270 (work to be done by 75 men)\n" +
                " \n" +
                "So, we have (45 x 6 x 1) / 270 = (75 x D2 x 1) / 450\n" +
                "Therefore, D2 = 6 days\n" +
                "Hence, 6 more days are required to complete the work.\n");
    }
    public void workwages_answers8(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_workwages8);
        previewText.setText("\n\nSolution : Here, we need to use the summation formula for comparison of work and efficiency\n" +
                "∑(Mi Ei) D1 H1 / W1 = ∑(Mj Ej) D2 H2 / W2\n" +
                "Here, ∑(Mi Ei) = 2M + 3W, where M is the efficiency of each Man and W is the efficiency of each Woman\n" +
                "∑(Mj Ej) = 3M + 2W\n" +
                "D1 = 10\n" +
                "D2 = 8\n" +
                "Also, H1 = H2 and W1 = W2\n" +
                "So, we have (2M + 3W) x 10 = (3M + 2W) x 8\n" +
                "=> M:W = 7:2\n" +
                "Assume the constant of proportionality to be ‘k’ here.\n" +
                "=> M = 7k and W = 2k\n" +
                " \n" +
                "Now, we again apply the summation formula with LHS being any of the given set of values and RHS being the set of values corresponding to 2 Men and 1 Woman.\n" +
                "Therefore, (2M + 3W) x 10 = (2M + 1W) x D, where D is the number of days required to complete the work if 2 Men and 1 woman are employed.\n" +
                "=> 20k x 10 = 16k x D\n" +
                "=> D = 12.5 days\n");
    }
    public void workwages_answers9(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_workwages9);
        previewText.setText("\n\nSolution : Let the time required if A and B work together be ‘n’ days.\n" +
                "=> A alone takes n+2 days\n" +
                "=> B alone takes n+18 days\n" +
                "So, work done by A in one day alone = 1 / (n+2)\n" +
                "Work done by B in one day alone = 1 / (n+18)\n" +
                "Total work done by both A and B in one day alone = 1/(n+2) + 1/(n+18)\n" +
                "But, total work done in one day if both A and B work together = 1/n\n" +
                "Therefore, 1/(n+2) + 1/(n+18) = 1/n\n" +
                "=> (2n + 20) / [(n+2) x (n+18)] = 1/n\n" +
                "=> 2n2 + 20n = n2 + 20n + 36\n" +
                "=> n2 = 36\n" +
                "=> n = 6 (Since ‘n’ is the number of days and cannot be negative)\n" +
                "Therefore, time taken to complete the job if both A and B work together = 6 days\n" +
                " \n" +
                "Short Method\n" +
                "In these type of questions, we can simply do as :\n" +
                "n2 = d1 x d2, where d1 is the additional days required by A and d2 is the additional days required by B.\n" +
                "(NOTE : This short cut is applicable if only two people are working on a job)\n" +
                "So, n2 = 2 x 18 = 36\n" +
                "=> n = 6.\n" +
                "Therefore, time taken to complete the job if both A and B work together = 6 days\n");
    }

}
