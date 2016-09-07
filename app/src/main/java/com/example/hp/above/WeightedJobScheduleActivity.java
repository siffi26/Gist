package com.example.hp.above;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class WeightedJobScheduleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weighted_job_schedule);
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
    public void weighted_code(View view) {
        TextView tv = (TextView) findViewById(R.id.weighted_code);
        tv.setText("The above problem can be solved using following recursive solution.\n" +
                "\n" +
                "1) First sort jobs according to finish time.\n" +
                "2) Now apply following recursive process. \n" +
                "   // Here arr[] is array of n jobs\n" +
                "   findMaximumProfit(arr[], n)\n" +
                "   {\n" +
                "     a) if (n == 1) return arr[0];\n" +
                "     b) Return the maximum of following two profits.\n" +
                "         (i) Maximum profit by excluding current job, i.e., \n" +
                "             findMaximumProfit(arr, n-1)\n" +
                "         (ii) Maximum profit by including the current job            \n" +
                "   }\n" +
                "\n" +
                "How to find the profit including current job?\n" +
                "The idea is to find the latest job before the current job (in \n" +
                "sorted array) that doesn't conflict with current job 'arr[n-1]'. \n" +
                "Once we find such a job, we recur for all jobs till that job and\n" +
                "add profit of current job to result.\n" +
                "In the above example, \"job 1\" is the latest non-conflicting\n" +
                "for \"job 4\" and \"job 2\" is the latest non-conflicting for \"job 3\".\n" +
                " \n" +
                "The following is C++ implementation of above naive recursive method.\n" +
                "\n" +
                "// C++ program for weighted job scheduling using Naive Recursive Method\n" +
                "#include <iostream>\n" +
                "#include <algorithm>\n" +
                "using namespace std;\n" +
                " \n" +
                "// A job has start time, finish time and profit.\n" +
                "struct Job\n" +
                "{\n" +
                "    int start, finish, profit;\n" +
                "};\n" +
                " \n" +
                "// A utility function that is used for sorting events\n" +
                "// according to finish time\n" +
                "bool jobComparataor(Job s1, Job s2)\n" +
                "{\n" +
                "    return (s1.finish < s2.finish);\n" +
                "}\n" +
                " \n" +
                "// Find the latest job (in sorted array) that doesn't\n" +
                "// conflict with the job[i]. If there is no compatible job,\n" +
                "// then it returns -1.\n" +
                "int latestNonConflict(Job arr[], int i)\n" +
                "{\n" +
                "    for (int j=i-1; j>=0; j--)\n" +
                "    {\n" +
                "        if (arr[j].finish <= arr[i-1].start)\n" +
                "            return j;\n" +
                "    }\n" +
                "    return -1;\n" +
                "}\n" +
                " \n" +
                "// A recursive function that returns the maximum possible\n" +
                "// profit from given array of jobs.  The array of jobs must\n" +
                "// be sorted according to finish time.\n" +
                "int findMaxProfitRec(Job arr[], int n)\n" +
                "{\n" +
                "    // Base case\n" +
                "    if (n == 1) return arr[n-1].profit;\n" +
                " \n" +
                "    // Find profit when current job is inclueded\n" +
                "    int inclProf = arr[n-1].profit;\n" +
                "    int i = latestNonConflict(arr, n);\n" +
                "    if (i != -1)\n" +
                "      inclProf += findMaxProfitRec(arr, i+1);\n" +
                " \n" +
                "    // Find profit when current job is excluded\n" +
                "    int exclProf = findMaxProfitRec(arr, n-1);\n" +
                " \n" +
                "    return max(inclProf,  exclProf);\n" +
                "}\n" +
                " \n" +
                "// The main function that returns the maximum possible\n" +
                "// profit from given array of jobs\n" +
                "int findMaxProfit(Job arr[], int n)\n" +
                "{\n" +
                "    // Sort jobs according to finish time\n" +
                "    sort(arr, arr+n, jobComparataor);\n" +
                " \n" +
                "    return findMaxProfitRec(arr, n);\n" +
                "}\n" +
                " \n" +
                "// Driver program\n" +
                "int main()\n" +
                "{\n" +
                "    Job arr[] = {{3, 10, 20}, {1, 2, 50}, {6, 19, 100}, {2, 100, 200}};\n" +
                "    int n = sizeof(arr)/sizeof(arr[0]);\n" +
                "    cout << \"The optimal profit is \" << findMaxProfit(arr, n);\n" +
                "    return 0;\n" +
                "}" +
                "\n\nOutput:\n" +
                "\n" +
                "The optimal profit is 250\n" +
                "The above solution may contain many overlapping subproblems. For example if lastNonConflicting() always returns previous job, then findMaxProfitRec(arr, n-1) is called twice and the time complexity becomes O(n*2n). As another example when lastNonConflicting() returns previous to previous job, there are two recursive calls, for n-2 and n-1. In this example case, recursion becomes same as Fibonacci Numbers.\n" +
                "So this problem has both properties of Dynamic Programming, Optimal Substructure and Overlapping Subproblems.\n" +
                "Like other Dynamic Programming Problems, we can solve this problem by making a table that stores solution of subproblems.\n" +
                "\n" +
                "Below is C++ implementation based on Dynamic Programming.\n" +
                "\n" +
                "// C++ program for weighted job scheduling using Dynamic Programming.\n" +
                "#include <iostream>\n" +
                "#include <algorithm>\n" +
                "using namespace std;\n" +
                " \n" +
                "// A job has start time, finish time and profit.\n" +
                "struct Job\n" +
                "{\n" +
                "    int start, finish, profit;\n" +
                "};\n" +
                " \n" +
                "// A utility function that is used for sorting events\n" +
                "// according to finish time\n" +
                "bool jobComparataor(Job s1, Job s2)\n" +
                "{\n" +
                "    return (s1.finish < s2.finish);\n" +
                "}\n" +
                " \n" +
                "// Find the latest job (in sorted array) that doesn't\n" +
                "// conflict with the job[i]\n" +
                "int latestNonConflict(Job arr[], int i)\n" +
                "{\n" +
                "    for (int j=i-1; j>=0; j--)\n" +
                "    {\n" +
                "        if (arr[j].finish <= arr[i].start)\n" +
                "            return j;\n" +
                "    }\n" +
                "    return -1;\n" +
                "}\n" +
                " \n" +
                "// The main function that returns the maximum possible\n" +
                "// profit from given array of jobs\n" +
                "int findMaxProfit(Job arr[], int n)\n" +
                "{\n" +
                "    // Sort jobs according to finish time\n" +
                "    sort(arr, arr+n, jobComparataor);\n" +
                " \n" +
                "    // Create an array to store solutions of subproblems.  table[i]\n" +
                "    // stores the profit for jobs till arr[i] (including arr[i])\n" +
                "    int *table = new int[n];\n" +
                "    table[0] = arr[0].profit;\n" +
                " \n" +
                "    // Fill entries in M[] using recursive property\n" +
                "    for (int i=1; i<n; i++)\n" +
                "    {\n" +
                "        // Find profit including the current job\n" +
                "        int inclProf = arr[i].profit;\n" +
                "        int l = latestNonConflict(arr, i);\n" +
                "        if (l != -1)\n" +
                "            inclProf += table[l];\n" +
                " \n" +
                "        // Store maximum of including and excluding\n" +
                "        table[i] = max(inclProf, table[i-1]);\n" +
                "    }\n" +
                " \n" +
                "    // Store result and free dynamic memory allocated for table[]\n" +
                "    int result = table[n-1];\n" +
                "    delete[] table;\n" +
                " \n" +
                "    return result;\n" +
                "}\n" +
                " \n" +
                "// Driver program\n" +
                "int main()\n" +
                "{\n" +
                "    Job arr[] = {{3, 10, 20}, {1, 2, 50}, {6, 19, 100}, {2, 100, 200}};\n" +
                "    int n = sizeof(arr)/sizeof(arr[0]);\n" +
                "    cout << \"The optimal profit is \" << findMaxProfit(arr, n);\n" +
                "    return 0;\n" +
                "}" +
                "\n\nOutput:\n" +
                "\n" +
                "The optimal profit is 250\n" +
                "Time Complexity of the above Dynamic Programming Solution is O(n2).");
    }
}
