package com.example.hp.above;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class PermutationAndCombinationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_permutation_and_combination);
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

    public void permutation_answers1(View view) {
        TextView previewText = (TextView) findViewById(R.id.solution_permutation1);
        previewText.setText("SOLUTION:  The word “DELHI” has 5 different words.\n" +
                "Therefore, required number of words = 5 P 3 = 5! / (5 – 3)!\n" +
                "=> Required number of words = 5! / 2! = 120 / 2 = 60\n" +
                " ");
    }

    public void permutation_answers2(View view) {
        TextView previewText = (TextView) findViewById(R.id.solution_permutation2);
        previewText.setText("SOLUTION: In these type of questions, we assume all the vowels to be a single character, i.e., “IE” is a single character.\n" +
                "So, now we have a total of 5 characters in the word, namely, D, R, V, R, IE.\n" +
                "But, R occurs 2 times.\n" +
                "=> Number of possible arrangements = 5! / 2! = 60\n" +
                "Now, the two vowels can be arranged in 2! = 2 ways.\n" +
                "=> Total number of possible words such that the vowels are always together= 60 x 2 = 120");
    }

    public void permutation_answers3(View view) {
        TextView previewText = (TextView) findViewById(R.id.solution_permutation3);
        previewText.setText("SOLUTION:  Number of possible ways of selection = 15 C 4 = 15 ! / [(4 !) x (11 !)]\n" +
                "=> Number of possible ways of selection = (15 x 14 x 13 x 12) / (4 x 3 x 2 x 1) = 1365");
    }
    public void permutation_answers4(View view) {
        TextView previewText = (TextView) findViewById(R.id.solution_permutation4);
        previewText.setText("SOLUTION:  Number of ways 3 boys can be selected out of 6 = 6 C 3 = 6 ! / [(3 !) x (3 !)] = (6 x 5 x 4) / (3 x 2 x 1) = 20\n" +
                "Number of ways 2 girls can be selected out of 5 = 5 C 2 = 5 ! / [(2 !) x (3 !)] = (5 x 4) / (2 x 1) = 10\n" +
                "Therefore, total number of ways of forming the group = 20 x 10 = 200");
    }
    public void permutation_answers5(View view) {
        TextView previewText = (TextView) findViewById(R.id.solution_permutation5);
        previewText.setText("SOLUTION:  we assume all the vowels to be a single character, i.e., “IE” is a single character.\n" +
                "So, now we have a total of 5 characters in the word, namely, D, R, V, R, IE.\n" +
                "But, R occurs 2 times.\n" +
                "=> Number of possible arrangements = 5! / 2! = 60\n" +
                "Now, the two vowels can be arranged in 2! = 2 ways.\n" +
                "=> Total number of possible words such that the vowels are always together = 60 x 2 = 120\n" +
                "Also, total number of possible words = 6! / 2! = 720 / 2 = 360\n" +
                "Therefore, total number of possible words such that the vowels are never together = 360 – 120 = 240");
    }
}