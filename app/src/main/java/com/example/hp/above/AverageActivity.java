package com.example.hp.above;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class AverageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_average);
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
    public void a_answers1(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_a1);
        previewText.setText("SOLUTION: Option(D) is correct\n" +
                "\n" +
                "The total wages earned during the 15 days that the worker worked :\n" +
                "\n" +
                "=15×90=Rs.1350\n" +
                "\n" +
                "The total wages earned during the first 7 days = 7×87 = Rs. 609.\n" +
                "\n" +
                "The total wages earned during the last 7 days = 7×92  = Rs. 644.\n" +
                "\n" +
                "Total wages earned during the 15 days = wages during first 7 days + wage on 8th day + wages during the last 7 days.\n" +
                "\n" +
                "1350=609+ wage on 8th day +644\n" +
                "\n" +
                "wage on 8th day = 1350−609−644= Rs. 97\n" +
                "\n" +
                "\n" +
                "\n" +
                "");
    }
    public void a_answers2(View view) {
        TextView previewText = (TextView) findViewById(R.id.solution_a2);
        previewText.setText("SOLUTION: Option(A) is correct\n" +
                "\n" +
                "Let the average weight of the 59 students be A.\n" +
                "\n" +
                "Therefore, the total weight of the 59 of them will be 59 A.\n" +
                "\n" +
                "The questions states that when the weight of this student who left is added, the total weight of the class\n" +
                "\n" +
                "= 59A+45\n" +
                "\n" +
                "When this student is also included, the average weight decreases by 0.2 kgs.\n" +
                "\n" +
                " 59A+45/60=A−0.2\n" +
                "\n" +
                "⇒59A+45=60A−12\n" +
                "\n" +
                "⇒45+12=60A−59A\n" +
                "\n" +
                "⇒A=57\n" +
                "\n" +
                "\n" +
                "\n" +
                "");
    }

    public void a_answers3(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_a3);
        previewText.setText("SOLUTION: Option(C) is correct\n" +
                "\n" +
                "The average of the elements in the original set SS is:\n" +
                "\n" +
                "(0+2+4+5+9)/5=4\n" +
                "\n" +
                "If we remove an element that equals the average, then the average of the new set will remain unchanged. The new set after removing 4 is {0, 2, 5, 9}.\n" +
                "\n" +
                "The average of the elements is:\n" +
                "\n" +
                "(0+2+5+9)/4=4");
    }
    public void a_answers4(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_a4);
        previewText.setText("SOLUTION: Option(C) is correct\n" +
                "\n" +
                "Total cost of 10 books = Rs. 120\n" +
                "\n" +
                "Total cost of 8 books = Rs. 94 \n" +
                "\n" +
                "⇒⇒ The cost of 2 books = Rs. 26\n" +
                "\n" +
                "Let the price of each book be x and y.\n" +
                "\n" +
                "⇒ x + y = 26 ---------------- (1)\n" +
                "\n" +
                "Given that the price of 1 book is 60% more than the other price\n" +
                "\n" +
                "160y/100+y=26\n" +
                "\n" +
                "y=(26×100)/260\n" +
                "\n" +
                "y=10\n" +
                "\n" +
                "Substituting Y=10 in (1) we get,\n" +
                "\n" +
                "x+10=26\n" +
                "xx = 16");
    }
    public void a_answers5(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_a5);
        previewText.setText("SOLUTION:Option(A) is correct\n" +
                "\n" +
                "Let a,b,c,d and e be the five positive numbers in the decreasing order of size such that e is the\n" +
                "\n" +
                "smallest number. We are given that the average of the five numbers is 25. Hence, we have the\n" +
                "\n" +
                "equation\n" +
                "\n" +
                "(a+b+c+d+e)/5=25\n" +
                "\n" +
                "a+b+c+d+e=125----------- (1) by multiplying by 5\n" +
                "\n" +
                "The smallest number in a set is at least less than the average of the numbers in the set if at least\n" +
                "\n" +
                "one number is different. \n" +
                "\n" +
                "For example, the average of 1, 2, and 3 is 2, and the smallest number in the set 1 is less than the\n" +
                "\n" +
                "average 2. Hence, we have the inequality\n" +
                "\n" +
                "0<e<25\n" +
                "0>–e>–25 by multiplying both sides of the inequality by –1 and flipping the directions of\n" +
                "\n" +
                "the inequalities.\n" +
                "\n" +
                "Adding this inequality to equation (1) yields\n" +
                "\n" +
                "0+125>(a+b+c+d+e)+(–e)>125–25\n" +
                "\n" +
                "125>(a+b+c+d)>100\n" +
                "\n" +
                "125>(a+b+c+d+0)>100 by adding by 0\n" +
                "\n" +
                "25>(a+b+c+d+0)/5=>20by dividing the inequality by 5\n" +
                "\n" +
                "25> The average of numbers a,b,c,d and 0>20\n" +
                "\n" +
                "Hence, x equals \n" +
                "\n" +
                "(Average of the numbers a,b,c,d and e)–(Average of the numbers a,b,c and d)\n" +
                "\n" +
                "=25−(A number between 20 and 25)\n" +
                "\n" +
                "⇒ A number less than 5\n" +
                "\n" +
                "Hence, x is less than 5.\n" +
                "\n" +
                "\n" +
                "\n" +
                "");
    }
}