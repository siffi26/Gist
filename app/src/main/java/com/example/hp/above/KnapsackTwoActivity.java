package com.example.hp.above;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class KnapsackTwoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_knapsack_two);
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
    public void knapsacktwo_code(View view) {
        TextView tv = (TextView) findViewById(R.id.knapsacktwo_code);
        tv.setText("Following is C++ implementation of above idea.\n" +
                "\n" +
                "// C++ program to solve knapsack problem using\n" +
                "// branch and bound\n" +
                "#include <bits/stdc++.h>\n" +
                "using namespace std;\n" +
                " \n" +
                "// Stucture for Item which store weight and corresponding\n" +
                "// value of Item\n" +
                "struct Item\n" +
                "{\n" +
                "    float weight;\n" +
                "    int value;\n" +
                "};\n" +
                " \n" +
                "// Node structure to store information of decision\n" +
                "// tree\n" +
                "struct Node\n" +
                "{\n" +
                "    // level  --> Level of node in decision tree (or index\n" +
                "    //             in arr[]\n" +
                "    // profit --> Profit of nodes on path from root to this\n" +
                "    //            node (including this node)\n" +
                "    // bound ---> Upper bound of maximum profit in subtree\n" +
                "    //            of this node/\n" +
                "    int level, profit, bound;\n" +
                "    float weight;\n" +
                "};\n" +
                " \n" +
                "// Comparison function to sort Item according to\n" +
                "// val/weight ratio\n" +
                "bool cmp(Item a, Item b)\n" +
                "{\n" +
                "    double r1 = (double)a.value / a.weight;\n" +
                "    double r2 = (double)b.value / b.weight;\n" +
                "    return r1 > r2;\n" +
                "}\n" +
                " \n" +
                "// Returns bound of profit in subtree rooted with u.\n" +
                "// This function mainly uses Greedy solution to find\n" +
                "// an upper bound on maximum profit.\n" +
                "int bound(Node u, int n, int W, Item arr[])\n" +
                "{\n" +
                "    // if weight overcomes the knapsack capacity, return\n" +
                "    // 0 as expected bound\n" +
                "    if (u.weight >= W)\n" +
                "        return 0;\n" +
                " \n" +
                "    // initialize bound on profit by current profit\n" +
                "    int profit_bound = u.profit;\n" +
                " \n" +
                "    // start including items from index 1 more to current\n" +
                "    // item index\n" +
                "    int j = u.level + 1;\n" +
                "    int totweight = u.weight;\n" +
                " \n" +
                "    // checking index condition and knapsack capacity\n" +
                "    // condition\n" +
                "    while ((j < n) && (totweight + arr[j].weight <= W))\n" +
                "    {\n" +
                "        totweight    += arr[j].weight;\n" +
                "        profit_bound += arr[j].value;\n" +
                "        j++;\n" +
                "    }\n" +
                " \n" +
                "    // If k is not n, include last item partially for\n" +
                "    // upper bound on profit\n" +
                "    if (j < n)\n" +
                "        profit_bound += (W - totweight) * arr[j].value /\n" +
                "                                         arr[j].weight;\n" +
                " \n" +
                "    return profit_bound;\n" +
                "}\n" +
                " \n" +
                "// Returns maximum profit we can get with capacity W\n" +
                "int knapsack(int W, Item arr[], int n)\n" +
                "{\n" +
                "    // sorting Item on basis of value per unit\n" +
                "    // weight.\n" +
                "    sort(arr, arr + n, cmp);\n" +
                " \n" +
                "    // make a queue for traversing the node\n" +
                "    queue<Node> Q;\n" +
                "    Node u, v;\n" +
                " \n" +
                "    // dummy node at starting\n" +
                "    u.level = -1;\n" +
                "    u.profit = u.weight = 0;\n" +
                "    Q.push(u);\n" +
                " \n" +
                "    // One by one extract an item from decision tree\n" +
                "    // compute profit of all children of extracted item\n" +
                "    // and keep saving maxProfit\n" +
                "    int maxProfit = 0;\n" +
                "    while (!Q.empty())\n" +
                "    {\n" +
                "        // Dequeue a node\n" +
                "        u = Q.front();\n" +
                "        Q.pop();\n" +
                " \n" +
                "        // If it is starting node, assign level 0\n" +
                "        if (u.level == -1)\n" +
                "            v.level = 0;\n" +
                " \n" +
                "        // If there is nothing on next level\n" +
                "        if (u.level == n-1)\n" +
                "            continue;\n" +
                " \n" +
                "        // Else if not last node, then increment level,\n" +
                "        // and compute profit of children nodes.\n" +
                "        v.level = u.level + 1;\n" +
                " \n" +
                "        // Taking current level's item add current\n" +
                "        // level's weight and value to node u's\n" +
                "        // weight and value\n" +
                "        v.weight = u.weight + arr[v.level].weight;\n" +
                "        v.profit = u.profit + arr[v.level].value;\n" +
                " \n" +
                "        // If cumulated weight is less than W and\n" +
                "        // profit is greater than previous profit,\n" +
                "        // update maxprofit\n" +
                "        if (v.weight <= W && v.profit > maxProfit)\n" +
                "            maxProfit = v.profit;\n" +
                " \n" +
                "        // Get the upper bound on profit to decide\n" +
                "        // whether to add v to Q or not.\n" +
                "        v.bound = bound(v, n, W, arr);\n" +
                " \n" +
                "        // If bound value is greater than profit,\n" +
                "        // then only push into queue for further\n" +
                "        // consideration\n" +
                "        if (v.bound > maxProfit)\n" +
                "            Q.push(v);\n" +
                " \n" +
                "        // Do the same thing,  but Without taking\n" +
                "        // the item in knapsack\n" +
                "        v.weight = u.weight;\n" +
                "        v.profit = u.profit;\n" +
                "        v.bound = bound(v, n, W, arr);\n" +
                "        if (v.bound > maxProfit)\n" +
                "            Q.push(v);\n" +
                "    }\n" +
                " \n" +
                "    return maxProfit;\n" +
                "}\n" +
                " \n" +
                "// driver program to test above function\n" +
                "int main()\n" +
                "{\n" +
                "    int W = 10;   // Weight of knapsack\n" +
                "    Item arr[] = {{2, 40}, {3.14, 50}, {1.98, 100},\n" +
                "                  {5, 95}, {3, 30}};\n" +
                "    int n = sizeof(arr) / sizeof(arr[0]);\n" +
                " \n" +
                "    cout << \"Maximum possible profit = \"\n" +
                "         << knapsack(W, arr, n);\n" +
                " \n" +
                "    return 0;\n" +
                "}\n" +
                "Run on IDE\n" +
                "Output :\n" +
                "\n" +
                "Maximum possible profit = 235" +
                "\n");
    }
}
