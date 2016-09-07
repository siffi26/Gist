package com.example.hp.above;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
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
    public void numbers_answers(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_numbers);
        previewText.setText("\n\nSolution : The number is of the form 2a+1, 3b+2, 7c+3. So, we put c=1 and proceed as follows :" +
                "\nBasically, we successively multiply the divisors with the result of the previous stage and add the corresponding remainder.\n" +
                "7 x 1 + 3 = 10\n" +
                "3 x 10 + 2 = 32\n" +
                "2 x 32 + 1 = 65\n" +
                "Thus, 65 is the required answer.\n" +
                "NOTE : The answer would differ if we change the order of divisors. For smallest number, arrange the divisors in decreasing order.\n");
    }
    public void numbers_answers1(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_numbers1);
        previewText.setText("\n\nSolution : Proceeding in the similar manner as the above question,\n" +
                "8 x 1 + 0 = 8\n" +
                "4 x 8 + 1 = 33\n" +
                "2 x 33 + 1 = 67\n" +
                "Thus, 67 is the required answer.");
    }
    public void numbers_answers2(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_numbers2);
        previewText.setText("\n\nSolution : Only the leftmost part of the number can be of two or more digits. So, we split the answer as :\n" +
                "  1 2 B\n" +
                "+ B 4 C\n" +
                "+ C 6 7\n" +
                "--------\n" +
                " 10 3 5\n" +
                "--------" +
                "\nNow, from column 1, we can easily infer that B + C = 8 or B + C = 18.\n" +
                "First, let us consider B + C = 18. This is the case possible if and only if B = C = 9. So, the equation would be 129 + 949 + 967 = 2045, but we need 1035 as the answer. Thus, this is not the required case.\n" +
                "So, B + C = 8. For maximum ‘B’, we put C = 0. Therefore, B = 8.\n" +
                "Now, to verify our answer, we put B = 8 and C = 0 in the given equation.\n" +
                "  1 2 8\n" +
                "+ 8 4 0\n" +
                "+ 0 6 7\n" +
                "--------\n" +
                " 10 3 5\n" +
                "--------\n" +
                "Therefore, our answer B = 8 is correct.");
    }
    public void numbers_answers3(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_numbers3);
        previewText.setText("\n\nSolution : \n" +
                "(i) 162 = 256 > 247. Prime numbers less than 16 are 2, 3, 5, 7, 11, 13 and 247 is divisible by 13. Therefore, 247 is not a prime number. It is a composite number.\n" +
                "(ii) 202 = 400 > 397. Prime numbers less than 20 are 2, 3, 5, 7, 11, 13, 17, 19 but 397 is not divisible by any of these. Therefore, 397 is a prime number.\n" +
                "(iii) 212 = 441 > 423. Prime numbers less than 21 are 2, 3, 5, 7, 11, 13, 17, 19 and 423 is divisible by 3. Therefore, 423 is not a prime number. It is a composite number.\n");
    }

    public void numbers_answers4(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_numbers4);
        previewText.setText("\n\nSolution : The unit’s digit of the given equation would be the same as the unit’s digit of the equation 7153 x 162.\n" +
                "Now, we need to find a pattern in the unit’s digit when we gradually increase the powers of 7. 71 gives 7, 72 gives 9, 73 gives 3, 74 gives 1. So, at the fourth power, we get the unit’s digit as 1. Therefore, to make our work easy, we need to write the original power (153) in multiples of 4 to the closest extent possible. We multiply this power (4) by a number such that we get nearest to 153. So, 4 x 38 = 152 and 7152 also has 1 in the unit’s place.\n" +
                "Now, (17)153 has 7 at unit’s place and (31)62 has 1 at the unit’s place.\n" +
                "Therefore, the problem simply reduces to 7 x 1 = 7.\n" +
                "Hence, the unit’s digit is 7.\n");
    }

    public void numbers_answers5(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_numbers5);
        previewText.setText("\n\nSolution : The unit’s digit of the given equation would be the same as the unit’s digit of the equation 7153 + 162.\n" +
                "Now, we need to find a pattern in the unit’s digit when we gradually increase the powers of 7. 71 gives 7, 72 gives 9, 73 gives 3, 74 gives 1. So, at the fourth power, we get the unit’s digit as 1. Therefore, to make our work easy, we need to write the original power (153) in multiples of 4 to the closest extent possible. We multiply this power (4) by a number such that we get nearest to 153. So, 4 x 38 = 152 and 7152 also has 1 in the unit’s place.\n" +
                "Now, (17)153 has 7 at unit’s place and (31)62 has 1 at the unit’s place.\n" +
                "Therefore, the problem simply reduces to 7 + 1 = 8.\n" +
                "Hence, the unit’s digit is 8.\n");
    }

    public void numbers_answers6(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_numbers6);
        previewText.setText("\n\nSolution : (14)11 x (7)2 x (11)3 = (2 x 7)11 x (7)2 x (11)3 = (2)11 x (7)11 x (7)2 x (11)3 = (2)11 x (7)13 x (11)3\n" +
                "Therefore, total number of prime factors = 11 + 13 + 3 = 27\n");
    }

    public void numbers_answers7(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_numbers7);
        previewText.setText("\n\nSolution : Since the given number should be divisible by 5, 0 or 5 must come in place of #. But, a number ending with 5 is never divisible by 8. So, 0 will replace #.\n" +
                "Now, the number formed by the last three digits is 6*0, which becomes divisible by 8, if * is replaced by 4.\n" +
                "Hence, digits in place of * and # are 4 and 0 respectively.\n");
    }
    public void numbers_answers8(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_numbers8);
        previewText.setText("\n\nSolution : On dividing 9999 by 19, we get 5 as remainder. Therefore, number to be subtracted = 5.\n");
    }

    public void numbers_answers9(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_numbers9);
        previewText.setText("\n\nSolution : The number is of the form 340a + 47 = 17 * (20a) + 17 * (2) + 13 = 17 * (20a + 2) + 13.\n" +
                "Therefore, on dividing this number by 17, we would get 13 as the remainder.\n");
    }

    public void numbers_answers10(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_numbers10);
        previewText.setText("\n\nSolution : 34 = 81. So, the unit’s digit of 34 is 1.\n" +
                "Therefore, the unit’s digit of 320 = 1 and thus, the unit’s digit of 321 = 1*3 = 3.\n" +
                "3 when divided by 5 gives 3 as the remainder.\n" +
                "So, the remainder when 321 is divided by 5 is 3.\n");
    }

}
