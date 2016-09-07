package com.example.hp.above;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class SubsetSumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subset_sum);
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
    public void subset_code(View view) {
        TextView tv = (TextView) findViewById(R.id.subset_code);
        tv.setText("isSubsetSum(set, n, sum) = isSubsetSum(set, n-1, sum) || \n" +
                "                           isSubsetSum(arr, n-1, sum-set[n-1])\n" +
                "Base Cases:\n" +
                "isSubsetSum(set, n, sum) = false, if sum > 0 and n == 0\n" +
                "isSubsetSum(set, n, sum) = true, if sum == 0 \n" +
                "Following is naive recursive implementation that simply follows the recursive structure mentioned above." +
                "\n" +
                "// A recursive solution for subset sum problem\n" +
                "#include <stdio.h>\n" +
                " \n" +
                "// Returns true if there is a subset of set[] with sun equal to given sum\n" +
                "bool isSubsetSum(int set[], int n, int sum)\n" +
                "{\n" +
                "   // Base Cases\n" +
                "   if (sum == 0)\n" +
                "     return true;\n" +
                "   if (n == 0 && sum != 0)\n" +
                "     return false;\n" +
                " \n" +
                "   // If last element is greater than sum, then ignore it\n" +
                "   if (set[n-1] > sum)\n" +
                "     return isSubsetSum(set, n-1, sum);\n" +
                " \n" +
                "   /* else, check if sum can be obtained by any of the following\n" +
                "      (a) including the last element\n" +
                "      (b) excluding the last element   */\n" +
                "   return isSubsetSum(set, n-1, sum) || \n" +
                "                        isSubsetSum(set, n-1, sum-set[n-1]);\n" +
                "}\n" +
                " \n" +
                "// Driver program to test above function\n" +
                "int main()\n" +
                "{\n" +
                "  int set[] = {3, 34, 4, 12, 5, 2};\n" +
                "  int sum = 9;\n" +
                "  int n = sizeof(set)/sizeof(set[0]);\n" +
                "  if (isSubsetSum(set, n, sum) == true)\n" +
                "     printf(\"Found a subset with given sum\");\n" +
                "  else\n" +
                "     printf(\"No subset with given sum\");\n" +
                "  return 0;\n" +
                "}" +
                "\n\nOutput:\n" +
                " Found a subset with given sum" +
                "\n\nWe can solve the problem in Pseudo-polynomial time using Dynamic programming. We create a boolean 2D table subset[][] and fill it in bottom up manner. The value of subset[i][j] will be true if there is a subset of set[0..j-1] with sum equal to i., otherwise false. Finally, we return subset[sum][n]\n" +
                "\n" +
                "// A Dynamic Programming solution for subset sum problem\n" +
                "#include <stdio.h>\n" +
                " \n" +
                "// Returns true if there is a subset of set[] with sun equal to given sum\n" +
                "bool isSubsetSum(int set[], int n, int sum)\n" +
                "{\n" +
                "    // The value of subset[i][j] will be true if there is a \n" +
                "    // subset of set[0..j-1] with sum equal to i\n" +
                "    bool subset[sum+1][n+1];\n" +
                " \n" +
                "    // If sum is 0, then answer is true\n" +
                "    for (int i = 0; i <= n; i++)\n" +
                "      subset[0][i] = true;\n" +
                " \n" +
                "    // If sum is not 0 and set is empty, then answer is false\n" +
                "    for (int i = 1; i <= sum; i++)\n" +
                "      subset[i][0] = false;\n" +
                " \n" +
                "     // Fill the subset table in botton up manner\n" +
                "     for (int i = 1; i <= sum; i++)\n" +
                "     {\n" +
                "       for (int j = 1; j <= n; j++)\n" +
                "       {\n" +
                "         subset[i][j] = subset[i][j-1];\n" +
                "         if (i >= set[j-1])\n" +
                "           subset[i][j] = subset[i][j] || \n" +
                "                                 subset[i - set[j-1]][j-1];\n" +
                "       }\n" +
                "     }\n" +
                " \n" +
                "    /* // uncomment this code to print table\n" +
                "     for (int i = 0; i <= sum; i++)\n" +
                "     {\n" +
                "       for (int j = 0; j <= n; j++)\n" +
                "          printf (\"%4d\", subset[i][j]);\n" +
                "       printf(\"\\n\");\n" +
                "     } */\n" +
                " \n" +
                "     return subset[sum][n];\n" +
                "}\n" +
                " \n" +
                "// Driver program to test above function\n" +
                "int main()\n" +
                "{\n" +
                "  int set[] = {3, 34, 4, 12, 5, 2};\n" +
                "  int sum = 9;\n" +
                "  int n = sizeof(set)/sizeof(set[0]);\n" +
                "  if (isSubsetSum(set, n, sum) == true)\n" +
                "     printf(\"Found a subset with given sum\");\n" +
                "  else\n" +
                "     printf(\"No subset with given sum\");\n" +
                "  return 0;\n" +
                "}" +
                "\n" +
                "Output:\n" +
                "Found a subset with given sum\n" +
                "Time complexity of the above solution is O(sum*n).");
    }
}
