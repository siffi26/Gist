package com.example.hp.above;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class PuzzlesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puzzles);
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
    public void puzzles_ques1(View view)
    {
        TextView previewText = (TextView) findViewById(R.id.puzzles_ques1);
        previewText.setText("\nAnswer: (I) 17." +
                "(II) 13.");
    }
    public void puzzles_ques2(View view)
    {
        TextView previewText = (TextView) findViewById(R.id.puzzles_ques2);
        previewText.setText("\nAnswer: 60 Kmph. ");
    }
    public void puzzles_ques3(View view)
    {
        TextView previewText = (TextView) findViewById(R.id.puzzles_ques3);
        previewText.setText("\nAnswer: 30. ");
    }
    public void puzzles_ques4(View view)
    {
        TextView previewText = (TextView) findViewById(R.id.puzzles_ques4);
        previewText.setText("\n Answer & Explanation\n" +
                "Explanation :\n" +
                "19, 21, 24\n" +
                "\n" +
                "The sequence progresses +1, +2, +3 repeated; \n ");
    }
    public void puzzles_ques5(View view)
    {
        TextView previewText = (TextView) findViewById(R.id.puzzles_ques5);
        previewText.setText("\n  Answer & Explanation\n" +
                "Explanation :\n" +
                "30 18 48 66.\n" +
                "Starting at the top, add pairs of numbers in each column to arrive at the next number.\n");
    }
    public void puzzles_ques6(View view)
    {
        TextView previewText = (TextView) findViewById(R.id.puzzles_ques6);
        previewText.setText("\n   Answer & Explanation\n" +
                "Explanation :\n" +
                "59 \n" +
                "The first 56 balls could be of all colours except red. This would leave 8 balls, all of which are red. so any three chosen would be red.\n");
    }
    public void puzzles_ques7(View view)
    {
        TextView previewText = (TextView) findViewById(R.id.puzzles_ques7);
        previewText.setText("\n Answer\t:\t6\n" +
                "Explanation\t:\tLooking at the diagram in rows, " +
                "the central circle equals half the sum of the numbers in the other circles to the left and right of the centre.\n");
    }
    public void puzzles_ques8(View view)
    {
        TextView previewText = (TextView) findViewById(R.id.puzzles_ques8);
        previewText.setText("\n Answer\t:\t9\n" +
                "Explanation\t:\tThe number at the centre of each triangle equals the sum of the lower two numbers minus the top number.\n");
    }
    public void puzzles_ques9(View view)
    {
        TextView previewText = (TextView) findViewById(R.id.puzzles_ques9);
        previewText.setText("\n Answer\t:\t19\n" +
                "Explanation\t:\tAs you move diagonally down, numbers follow the sequence of Prime Numbers.\n");
    }


}
