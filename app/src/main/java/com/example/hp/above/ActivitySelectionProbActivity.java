package com.example.hp.above;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class ActivitySelectionProbActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_selection_prob);
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
    public void activity_code(View view) {
        TextView tv = (TextView) findViewById(R.id.activity_code);
        tv.setText("\n\nLet us consider the Activity Selection problem as our first example of Greedy algorithms. Following is the problem statement.\n" +
                "\nYou are given n activities with their start and finish times. Select the maximum number of activities that can be performed by a single person, assuming that a person can only work on a single activity at a time.\n" +
                "\nExample:\n" +
                "\n" +
                "\nConsider the following 6 activities. \n" +
                "\n     start[]  =  {1, 3, 0, 5, 8, 5};\n" +
                "\n     finish[] =  {2, 4, 6, 7, 9, 9};\n" +
                "\n\nThe maximum set of activities that can be executed \n" +
                "by a single person is {0, 1, 3, 4}" +
                "\n\n\nThe greedy choice is to always pick the next activity whose finish time is least among the remaining activities and the start time is more than or equal to the finish time of previously selected activity. We can sort the activities according to their finishing time so that we always consider the next activity as minimum finishing time activity.\n" +
                "\n" +
                "\n1) Sort the activities according to their finishing time\n" +
                "\n2) Select the first activity from the sorted array and print it.\n" +
                "\n3) Do following for remaining activities in the sorted array.\n" +
                "\n…….a) If the start time of this activity is greater than the finish time of previously selected activity then select this activity and print it.\n" +
                "\n" +
                "\nIn the following C implementation, it is assumed that the activities are already sorted according to their finish time.\n" +
                "\n"+
                "\n\n#include<stdio.h>\n" +
                " \n" +
                "// Prints a maximum set of activities that can be done by a single\n" +
                "// person, one at a time.\n" +
                "//  n   -->  Total number of activities\n" +
                "//  s[] -->  An array that contains start time of all activities\n" +
                "//  f[] -->  An array that contains finish time of all activities\n" +
                "void printMaxActivities(int s[], int f[], int n)\n" +
                "{\n" +
                "    int i, j;\n" +
                " \n" +
                "    printf (\"Following activities are selected \\n\");\n" +
                " \n" +
                "    // The first activity always gets selected\n" +
                "    i = 0;\n" +
                "    printf(\"%d \", i);\n" +
                " \n" +
                "    // Consider rest of the activities\n" +
                "    for (j = 1; j < n; j++)\n" +
                "    {\n" +
                "      // If this activity has start time greater than or\n" +
                "      // equal to the finish time of previously selected\n" +
                "      // activity, then select it\n" +
                "      if (s[j] >= f[i])\n" +
                "      {\n" +
                "          printf (\"%d \", j);\n" +
                "          i = j;\n" +
                "      }\n" +
                "    }\n" +
                "}\n" +
                " \n" +
                "\n// driver program to test above function\n" +
                "int main()\n" +
                "{\n" +
                "    int s[] =  {1, 3, 0, 5, 8, 5};\n" +
                "    int f[] =  {2, 4, 6, 7, 9, 9};\n" +
                "    int n = sizeof(s)/sizeof(s[0]);\n" +
                "    printMaxActivities(s, f, n);\n" +
                "    getchar();\n" +
                "    return 0;\n" +
                "}" +
                "\n\n\nOutput:\n" +
                "\nFollowing activities are selected\n" +
                "0 1 3 4\n" +
                "\n\nHow does Greedy Choice work for Activities sorted according to finish time?\n" +
                "\nLet the give set of activities be S = {1, 2, 3, ..n} and activities be sorted by finish time. The greedy choice is to always pick activity 1. How come the activity 1 always provides one of the optimal solutions. We can prove it by showing that if there is another solution B with first activity other than 1, then there is also a solution A of same size with activity 1 as first activity. Let the first activity selected by B be k, then there always exist A = {B – {k}} U {1}.(Note that the activities in B are independent and k has smallest finishing time among all. Since k is not 1, finish(k) >= finish(1))." +
                "\n");
    }
}
