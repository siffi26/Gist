package com.example.hp.above;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class KnapsackProbActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_knapsack_prob);
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
    public void knapsack_code(View view) {
        TextView tv = (TextView) findViewById(R.id.knapsack_code);
        tv.setText("/* A Naive recursive implementation of 0-1 Knapsack problem */\n" +
                "#include<stdio.h>\n" +
                " \n" +
                "// A utility function that returns maximum of two integers\n" +
                "int max(int a, int b) { return (a > b)? a : b; }\n" +
                " \n" +
                "// Returns the maximum value that can be put in a knapsack of capacity W\n" +
                "int knapSack(int W, int wt[], int val[], int n)\n" +
                "{\n" +
                "   // Base Case\n" +
                "   if (n == 0 || W == 0)\n" +
                "       return 0;\n" +
                " \n" +
                "   // If weight of the nth item is more than Knapsack capacity W, then\n" +
                "   // this item cannot be included in the optimal solution\n" +
                "   if (wt[n-1] > W)\n" +
                "       return knapSack(W, wt, val, n-1);\n" +
                " \n" +
                "   // Return the maximum of two cases: \n" +
                "   // (1) nth item included \n" +
                "   // (2) not included\n" +
                "   else return max( val[n-1] + knapSack(W-wt[n-1], wt, val, n-1),\n" +
                "                    knapSack(W, wt, val, n-1)\n" +
                "                  );\n" +
                "}\n" +
                " \n" +
                "// Driver program to test above function\n" +
                "int main()\n" +
                "{\n" +
                "    int val[] = {60, 100, 120};\n" +
                "    int wt[] = {10, 20, 30};\n" +
                "    int  W = 50;\n" +
                "    int n = sizeof(val)/sizeof(val[0]);\n" +
                "    printf(\"%d\", knapSack(W, wt, val, n));\n" +
                "    return 0;\n" +
                "}" +
                "\n\nOutput:\n" +
                "220\n" +
                "It should be noted that the above function computes the same subproblems again and again. See the following recursion tree, K(1, 1) is being evaluated twice. Time complexity of this naive recursive solution is exponential (2^n).\n" +
                "\n" +
                "In the following recursion tree, K() refers to knapSack().  The two \n" +
                "parameters indicated in the following recursion tree are n and W.  \n" +
                "The recursion tree is for following sample inputs.\n" +
                "wt[] = {1, 1, 1}, W = 2, val[] = {10, 20, 30}\n" +
                "\n" +
                "                       K(3, 2)         ---------> K(n, W)\n" +
                "                   /            \\ \n" +
                "                 /                \\               \n" +
                "            K(2,2)                  K(2,1)\n" +
                "          /       \\                  /    \\ \n" +
                "        /           \\              /        \\\n" +
                "       K(1,2)      K(1,1)        K(1,1)     K(1,0)\n" +
                "       /  \\         /   \\          /   \\\n" +
                "     /      \\     /       \\      /       \\\n" +
                "K(0,2)  K(0,1)  K(0,1)  K(0,0)  K(0,1)   K(0,0)\n" +
                "Recursion tree for Knapsack capacity 2 units and 3 items of 1 unit weight.\n" +
                "Since suproblems are evaluated again, this problem has Overlapping Subprolems property. So the 0-1 Knapsack problem has both properties (see this and this) of a dynamic programming problem. Like other typical Dynamic Programming(DP) problems, recomputations of same subproblems can be avoided by constructing a temporary array K[][] in bottom up manner. Following is Dynamic Programming based implementation." +
                "\n\n" +
                "// A Dynamic Programming based solution for 0-1 Knapsack problem\n" +
                "#include<stdio.h>\n" +
                " \n" +
                "// A utility function that returns maximum of two integers\n" +
                "int max(int a, int b) { return (a > b)? a : b; }\n" +
                " \n" +
                "// Returns the maximum value that can be put in a knapsack of capacity W\n" +
                "int knapSack(int W, int wt[], int val[], int n)\n" +
                "{\n" +
                "   int i, w;\n" +
                "   int K[n+1][W+1];\n" +
                " \n" +
                "   // Build table K[][] in bottom up manner\n" +
                "   for (i = 0; i <= n; i++)\n" +
                "   {\n" +
                "       for (w = 0; w <= W; w++)\n" +
                "       {\n" +
                "           if (i==0 || w==0)\n" +
                "               K[i][w] = 0;\n" +
                "           else if (wt[i-1] <= w)\n" +
                "                 K[i][w] = max(val[i-1] + K[i-1][w-wt[i-1]],  K[i-1][w]);\n" +
                "           else\n" +
                "                 K[i][w] = K[i-1][w];\n" +
                "       }\n" +
                "   }\n" +
                " \n" +
                "   return K[n][W];\n" +
                "}\n" +
                " \n" +
                "int main()\n" +
                "{\n" +
                "    int val[] = {60, 100, 120};\n" +
                "    int wt[] = {10, 20, 30};\n" +
                "    int  W = 50;\n" +
                "    int n = sizeof(val)/sizeof(val[0]);\n" +
                "    printf(\"%d\", knapSack(W, wt, val, n));\n" +
                "    return 0;\n" +
                "}" +
                "\n\nOutput:\n" +
                "220\n" +
                "Time Complexity: O(nW) where n is the number of items and W is the capacity of knapsack.");
    }
}
