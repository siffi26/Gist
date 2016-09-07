package com.example.hp.above;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class SubsetSumBacktrackingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subset_sum_backtracking);
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
    public void subsetsum_code(View view) {
        TextView tv = (TextView) findViewById(R.id.subsetsum_code);
        tv.setText("For example, if we are at level 1, tuple_vector[1] can take any value of four branches generated. If we are at level 2 of left most node, tuple_vector[2] can take any value of three branches generated, and so on…\n" +
                "\n" +
                "For example the left most child of root generates all those subsets that include w[1]. Similarly the second child of root generates all those subsets that includes w[2] and excludes w[1].\n" +
                "\n" +
                "As we go down along depth of tree we add elements so far, and if the added sum is satisfying explicit constraints, we will continue to generate child nodes further. Whenever the constraints are not met, we stop further generation of sub-trees of that node, and backtrack to previous node to explore the nodes not yet explored. In many scenarios, it saves considerable amount of processing time.\n" +
                "\n" +
                "The tree should trigger a clue to implement the backtracking algorithm (try yourself). It prints all those subsets whose sum add up to given number. We need to explore the nodes along the breadth and depth of the tree. Generating nodes along breadth is controlled by loop and nodes along the depth are generated using recursion (post order traversal). Pseudo code given below,\n" +
                "\n" +
                "if(subset is satisfying the constraint)\n" +
                "    print the subset\n" +
                "    exclude the current element and consider next element\n" +
                "else\n" +
                "    generate the nodes of present level along breadth of tree and\n" +
                "    recur for next levels\n" +
                "Following is C implementation of subset sum using variable size tuple vector. Note that the following program explores all possibilities similar to exhaustive search. It is to demonstrate how backtracking can be used. See next code to verify, how we can optimize the backtracking solution.\n" +
                "\n" +
                "#include <stdio.h>\n" +
                "#include <stdlib.h>\n" +
                " \n" +
                "#define ARRAYSIZE(a) (sizeof(a))/(sizeof(a[0]))\n" +
                " \n" +
                "static int total_nodes;\n" +
                "// prints subset found\n" +
                "void printSubset(int A[], int size)\n" +
                "{\n" +
                "    for(int i = 0; i < size; i++)\n" +
                "    {\n" +
                "        printf(\"%*d\", 5, A[i]);\n" +
                "    }\n" +
                " \n" +
                "    printf(\"\\n\");\n" +
                "}\n" +
                " \n" +
                "// inputs\n" +
                "// s            - set vector\n" +
                "// t            - tuplet vector\n" +
                "// s_size       - set size\n" +
                "// t_size       - tuplet size so far\n" +
                "// sum          - sum so far\n" +
                "// ite          - nodes count\n" +
                "// target_sum   - sum to be found\n" +
                "void subset_sum(int s[], int t[],\n" +
                "                int s_size, int t_size,\n" +
                "                int sum, int ite,\n" +
                "                int const target_sum)\n" +
                "{\n" +
                "    total_nodes++;\n" +
                "    if( target_sum == sum )\n" +
                "    {\n" +
                "        // We found subset\n" +
                "        printSubset(t, t_size);\n" +
                "        // Exclude previously added item and consider next candidate\n" +
                "        subset_sum(s, t, s_size, t_size-1, sum - s[ite], ite + 1, target_sum);\n" +
                "        return;\n" +
                "    }\n" +
                "    else\n" +
                "    {\n" +
                "        // generate nodes along the breadth\n" +
                "        for( int i = ite; i < s_size; i++ )\n" +
                "        {\n" +
                "            t[t_size] = s[i];\n" +
                "            // consider next level node (along depth)\n" +
                "            subset_sum(s, t, s_size, t_size + 1, sum + s[i], i + 1, target_sum);\n" +
                "        }\n" +
                "    }\n" +
                "}\n" +
                " \n" +
                "// Wrapper to print subsets that sum to target_sum\n" +
                "// input is weights vector and target_sum\n" +
                "void generateSubsets(int s[], int size, int target_sum)\n" +
                "{\n" +
                "    int *tuplet_vector = (int *)malloc(size * sizeof(int));\n" +
                " \n" +
                "    subset_sum(s, tuplet_vector, size, 0, 0, 0, target_sum);\n" +
                " \n" +
                "    free(tuplet_vector);\n" +
                "}\n" +
                " \n" +
                "int main()\n" +
                "{\n" +
                "    int weights[] = {10, 7, 5, 18, 12, 20, 15};\n" +
                "    int size = ARRAYSIZE(weights);\n" +
                " \n" +
                "    generateSubsets(weights, size, 35);\n" +
                "    printf(\"Nodes generated %d\\n\", total_nodes);\n" +
                "    return 0;\n" +
                "}" +
                "\n\nThe power of backtracking appears when we combine explicit and implicit constraints, and we stop generating nodes when these checks fail. We can improve the above algorithm by strengthening the constraint checks and presorting the data. By sorting the initial array, we need not to consider rest of the array, once the sum so far is greater than target number. We can backtrack and check other possibilities.\n" +
                "\n" +
                "Similarly, assume the array is presorted and we found one subset. We can generate next node excluding the present node only when inclusion of next node satisfies the constraints. Given below is optimized implementation (it prunes the subtree if it is not satisfying contraints).\n" +
                "\n" +
                "#include <stdio.h>\n" +
                "#include <stdlib.h>\n" +
                " \n" +
                "#define ARRAYSIZE(a) (sizeof(a))/(sizeof(a[0]))\n" +
                " \n" +
                "static int total_nodes;\n" +
                " \n" +
                "// prints subset found\n" +
                "void printSubset(int A[], int size)\n" +
                "{\n" +
                "    for(int i = 0; i < size; i++)\n" +
                "    {\n" +
                "        printf(\"%*d\", 5, A[i]);\n" +
                "    }\n" +
                " \n" +
                "    printf(\"\\n\");\n" +
                "}\n" +
                " \n" +
                "// qsort compare function\n" +
                "int comparator(const void *pLhs, const void *pRhs)\n" +
                "{\n" +
                "    int *lhs = (int *)pLhs;\n" +
                "    int *rhs = (int *)pRhs;\n" +
                " \n" +
                "    return *lhs > *rhs;\n" +
                "}\n" +
                " \n" +
                "// inputs\n" +
                "// s            - set vector\n" +
                "// t            - tuplet vector\n" +
                "// s_size       - set size\n" +
                "// t_size       - tuplet size so far\n" +
                "// sum          - sum so far\n" +
                "// ite          - nodes count\n" +
                "// target_sum   - sum to be found\n" +
                "void subset_sum(int s[], int t[],\n" +
                "                int s_size, int t_size,\n" +
                "                int sum, int ite,\n" +
                "                int const target_sum)\n" +
                "{\n" +
                "    total_nodes++;\n" +
                " \n" +
                "    if( target_sum == sum )\n" +
                "    {\n" +
                "        // We found sum\n" +
                "        printSubset(t, t_size);\n" +
                " \n" +
                "        // constraint check\n" +
                "        if( ite + 1 < s_size && sum - s[ite] + s[ite+1] <= target_sum )\n" +
                "        {\n" +
                "            // Exclude previous added item and consider next candidate\n" +
                "            subset_sum(s, t, s_size, t_size-1, sum - s[ite], ite + 1, target_sum);\n" +
                "        }\n" +
                "        return;\n" +
                "    }\n" +
                "    else\n" +
                "    {\n" +
                "        // constraint check\n" +
                "        if( ite < s_size && sum + s[ite] <= target_sum )\n" +
                "        {\n" +
                "            // generate nodes along the breadth\n" +
                "            for( int i = ite; i < s_size; i++ )\n" +
                "            {\n" +
                "                t[t_size] = s[i];\n" +
                " \n" +
                "                if( sum + s[i] <= target_sum )\n" +
                "                {\n" +
                "                    // consider next level node (along depth)\n" +
                "                    subset_sum(s, t, s_size, t_size + 1, sum + s[i], i + 1, target_sum);\n" +
                "                }\n" +
                "            }\n" +
                "        }\n" +
                "    }\n" +
                "}\n" +
                " \n" +
                "// Wrapper that prints subsets that sum to target_sum\n" +
                "void generateSubsets(int s[], int size, int target_sum)\n" +
                "{\n" +
                "    int *tuplet_vector = (int *)malloc(size * sizeof(int));\n" +
                " \n" +
                "    int total = 0;\n" +
                " \n" +
                "    // sort the set\n" +
                "    qsort(s, size, sizeof(int), &comparator);\n" +
                " \n" +
                "    for( int i = 0; i < size; i++ )\n" +
                "    {\n" +
                "        total += s[i];\n" +
                "    }\n" +
                " \n" +
                "    if( s[0] <= target_sum && total >= target_sum )\n" +
                "    {\n" +
                " \n" +
                "        subset_sum(s, tuplet_vector, size, 0, 0, 0, target_sum);\n" +
                " \n" +
                "    }\n" +
                " \n" +
                "    free(tuplet_vector);\n" +
                "}\n" +
                " \n" +
                "int main()\n" +
                "{\n" +
                "    int weights[] = {15, 22, 14, 26, 32, 9, 16, 8};\n" +
                "    int target = 53;\n" +
                " \n" +
                "    int size = ARRAYSIZE(weights);\n" +
                " \n" +
                "    generateSubsets(weights, size, target);\n" +
                " \n" +
                "    printf(\"Nodes generated %d\\n\", total_nodes);\n" +
                " \n" +
                "    return 0;\n" +
                "}" +
                "\nAs another approach, we can generate the tree in fixed size tuple analogs to binary pattern. We will kill the sub-trees when the constraints are not satisfied." +
                "\n");
    }
}
