package com.example.hp.above;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class AgeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age);
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

    public void age_answers1(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_age1);
        previewText.setText("SOLUTION:  Let A’s present age be ‘n’ years.\n" +
                "According to the question,\n" +
                "n + 15 = 5 (n – 5)\n" +
                "=> n + 15 = 5 n – 25\n" +
                "=> 4n = 40\n" +
                "=> n = 10\n" +
                "=> A’s present age = 10 years\n" +
                "Therefore, A’s age 3 years hence = 10 + 3 = 13 years");
    }
    public void age_answers2(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_age2);
        previewText.setText("SOLUTION:   Let A’s present age be x years. Then, B’s present age = 240 / x years\n" +
                "So, according to question\n" +
                "2 (240 / x ) – x = 4\n" +
                "=> 480 – x2 = 4 x\n" +
                "=> x2 + 4 x – 480 = 0\n" +
                "=> (x + 24) (x – 20) = 0\n" +
                "=> x = 20\n" +
                "=> B’s present age = 240 / 20 = 12 years\n" +
                "Thus, B’s age 2 years ago = 12 – 2 = 10 years");
    }
    public void age_answers3(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_age3);
        previewText.setText("SOLUTION: Let the daughter’s present age be ‘n’ years.\n" +
                "=> Mother’s present age = (3n + 3) years\n" +
                "So, according to the question\n" +
                "(3n + 3 + 3) = 2 (n + 3) + 10\n" +
                "=> 3n + 6 = 2n + 16\n" +
                "=> n = 10\n" +
                "Hence, mother’s present age = (3n + 3) = ((3 x 10) + 3) years = 33 years");
    }
    public void age_answers4(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_age4);
        previewText.setText("SOLUTION:  Let the common ratio be ‘n’.\n" +
                "=> A’s present age = 6 n years\n" +
                "=> B’s present age = 7 n years\n" +
                "So, according to the question\n" +
                "(6 n + 5) / (7 n + 5) = 7 / 8\n" +
                "=> 48 n + 40 = 49 n + 35\n" +
                "=> n = 5\n" +
                "Thus, A’s present age = 6 n = 30 years and B’s present age = 7 n = 35 years");
    }
}