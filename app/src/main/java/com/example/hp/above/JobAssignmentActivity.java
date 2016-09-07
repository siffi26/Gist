package com.example.hp.above;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class JobAssignmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job_assignment);
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
    public void job_code(View view) {
        TextView tv = (TextView) findViewById(R.id.job_code);
        tv.setText("Complete Algorithm:\n" +
                "\n" +
                "/* findMinCost uses Least() and Add() to maintain the\n" +
                "   list of live nodes\n" +
                "\n" +
                "   Least() finds a live node with least cost, deletes\n" +
                "   it from the list and returns it\n" +
                "\n" +
                "   Add(x) calculates cost of x and adds it to the list\n" +
                "   of live nodes\n" +
                "\n" +
                "   Implements list of live nodes as a min heap */\n" +
                "\n" +
                "\n" +
                "// Search Space Tree Node\n" +
                "node\n" +
                "{\n" +
                "   int job_number;\n" +
                "   int worker_number;\n" +
                "   node parent;\n" +
                "   int cost;\n" +
                "}\n" +
                "\n" +
                "// Input: Cost Matrix of Job Assignment problem\n" +
                "// Output: Optimal cost and Assignment of Jobs\n" +
                "algorithm findMinCost (costMatrix mat[][])\n" +
                "{\n" +
                "   // Initialize list of live nodes(min-Heap)\n" +
                "   // with root of search tree i.e. a Dummy node\n" +
                "   while (true)\n" +
                "   {\n" +
                "      // Find a live node with least estimated cost\n" +
                "      E = Least();\n" +
                "\n" +
                "      // The found node is deleted from the list\n" +
                "      // of live nodes\n" +
                "      if (E is a leaf node)\n" +
                "      {\n" +
                "         printSolution();\n" +
                "         return;\n" +
                "      }\n" +
                "\n" +
                "     for each child x of E\n" +
                "     {\n" +
                "         Add(x); // Add x to list of live nodes;\n" +
                "         x->parent = E; // Pointer for path to root\n" +
                "     }\n" +
                "   }\n" +
                "} \n" +
                "Below is its C++ implementation.\n" +
                "\n" +
                "// Program to solve Job Assignment problem\n" +
                "// using Branch and Bound\n" +
                "#include <bits/stdc++.h>\n" +
                "using namespace std;\n" +
                "#define N 4\n" +
                " \n" +
                "// state space tree node\n" +
                "struct Node\n" +
                "{\n" +
                "    // stores parent node of current node\n" +
                "    // helps in tracing path when answer is found\n" +
                "    Node* parent;\n" +
                " \n" +
                "    // contains cost for ancestors nodes\n" +
                "    // including current node\n" +
                "    int pathCost;\n" +
                " \n" +
                "    // contains least promising cost\n" +
                "    int cost;\n" +
                " \n" +
                "    // contain worker number\n" +
                "    int workerID;\n" +
                " \n" +
                "    // contains Job ID\n" +
                "    int jobID;\n" +
                " \n" +
                "    // Boolean array assigned will contains\n" +
                "    // info about available jobs\n" +
                "    bool assigned[N];\n" +
                "};\n" +
                " \n" +
                "// Function to allocate a new search tree node\n" +
                "// Here Person x is assigned to job y\n" +
                "Node* newNode(int x, int y, bool assigned[],\n" +
                "              Node* parent)\n" +
                "{\n" +
                "    Node* node = new Node;\n" +
                " \n" +
                "    for (int j = 0; j < N; j++)\n" +
                "        node->assigned[j] = assigned[j];\n" +
                "    node->assigned[y] = true;\n" +
                " \n" +
                "    node->parent = parent;\n" +
                "    node->workerID = x;\n" +
                "    node->jobID = y;\n" +
                " \n" +
                "    return node;\n" +
                "}\n" +
                " \n" +
                "// Function to calculate the least promising cost\n" +
                "// of node after worker x is assigned to job y.\n" +
                "int calculateCost(int costMatrix[N][N], int x,\n" +
                "                  int y, bool assigned[])\n" +
                "{\n" +
                "    int cost = 0;\n" +
                " \n" +
                "    // to store unavailable jobs\n" +
                "    bool available[N] = {true};\n" +
                " \n" +
                "    // start from next worker\n" +
                "    for (int i = x + 1; i < N; i++)\n" +
                "    {\n" +
                "        int min = INT_MAX, minIndex = -1;\n" +
                " \n" +
                "        // do for each job\n" +
                "        for (int j = 0; j < N; j++)\n" +
                "        {\n" +
                "            // if job is unassigned\n" +
                "            if (!assigned[j] && available[j] &&\n" +
                "                costMatrix[i][j] < min)\n" +
                "            {\n" +
                "                // store job number\n" +
                "                minIndex = j;\n" +
                " \n" +
                "                // store cost\n" +
                "                min = costMatrix[i][j];\n" +
                "            }\n" +
                "        }\n" +
                " \n" +
                "        // add cost of next worker\n" +
                "        cost += min;\n" +
                " \n" +
                "        // job becomes unavailable\n" +
                "        available[minIndex] = false;\n" +
                "    }\n" +
                " \n" +
                "    return cost;\n" +
                "}\n" +
                " \n" +
                "// Comparison object to be used to order the heap\n" +
                "struct comp\n" +
                "{\n" +
                "    bool operator()(const Node* lhs,\n" +
                "                   const Node* rhs) const\n" +
                "    {\n" +
                "        return lhs->cost > rhs->cost;\n" +
                "    }\n" +
                "};\n" +
                " \n" +
                "// print Assignments\n" +
                "void printAssignments(Node *min)\n" +
                "{\n" +
                "    if(min->parent==NULL)\n" +
                "        return;\n" +
                " \n" +
                "    printAssignments(min->parent);\n" +
                "    cout << \"Assign Worker \" << char(min->workerID + 'A')\n" +
                "         << \" to Job \" << min->jobID << endl;\n" +
                " \n" +
                "}\n" +
                " \n" +
                "// Finds minimum cost using Branch and Bound.\n" +
                "int findMinCost(int costMatrix[N][N])\n" +
                "{\n" +
                "    // Create a priority queue to store live nodes of\n" +
                "    // search tree;\n" +
                "    priority_queue<Node*, std::vector<Node*>, comp> pq;\n" +
                " \n" +
                "    // initailize heap to dummy node with cost 0\n" +
                "    bool assigned[N] = {false};\n" +
                "    Node* root = newNode(-1, -1, assigned, NULL);\n" +
                "    root->pathCost = root->cost = 0;\n" +
                "    root->workerID = -1;\n" +
                " \n" +
                "    // Add dummy node to list of live nodes;\n" +
                "    pq.push(root);\n" +
                " \n" +
                "    // Finds a live node with least cost,\n" +
                "    // add its childrens to list of live nodes and\n" +
                "    // finally deletes it from the list.\n" +
                "    while (!pq.empty())\n" +
                "    {\n" +
                "      // Find a live node with least estimated cost\n" +
                "      Node* min = pq.top();\n" +
                " \n" +
                "      // The found node is deleted from the list of\n" +
                "      // live nodes\n" +
                "      pq.pop();\n" +
                " \n" +
                "      // i stores next worker\n" +
                "      int i = min->workerID + 1;\n" +
                " \n" +
                "      // if all workers are assigned a job\n" +
                "      if (i == N)\n" +
                "      {\n" +
                "          printAssignments(min);\n" +
                "          return min->cost;\n" +
                "      }\n" +
                " \n" +
                "      // do for each job\n" +
                "      for (int j = 0; j < N; j++)\n" +
                "      {\n" +
                "        // If unassigned\n" +
                "        if (!min->assigned[j])\n" +
                "        {\n" +
                "          // create a new tree node\n" +
                "          Node* child = newNode(i, j, min->assigned, min);\n" +
                " \n" +
                "          // cost for ancestors nodes including current node\n" +
                "          child->pathCost = min->pathCost + costMatrix[i][j];\n" +
                " \n" +
                "          // calculate its lower bound\n" +
                "          child->cost = child->pathCost +\n" +
                "            calculateCost(costMatrix, i, j, child->assigned);\n" +
                " \n" +
                "          // Add child to list of live nodes;\n" +
                "          pq.push(child);\n" +
                "        }\n" +
                "      }\n" +
                "    }\n" +
                "}\n" +
                " \n" +
                "// Driver code\n" +
                "int main()\n" +
                "{\n" +
                "    // x-cordinate represents a Worker\n" +
                "    // y-cordinate represents a Job\n" +
                "    int costMatrix[N][N] =\n" +
                "    {\n" +
                "        {9, 2, 7, 8},\n" +
                "        {6, 4, 3, 7},\n" +
                "        {5, 8, 1, 8},\n" +
                "        {7, 6, 9, 4}\n" +
                "    };\n" +
                " \n" +
                " \n" +
                "    /* int costMatrix[N][N] =\n" +
                "    {\n" +
                "        {82, 83, 69, 92},\n" +
                "        {77, 37, 49, 92},\n" +
                "        {11, 69,  5, 86},\n" +
                "        { 8,  9, 98, 23}\n" +
                "    };\n" +
                "    */\n" +
                " \n" +
                "    /* int costMatrix[N][N] =\n" +
                "    {\n" +
                "        {2500, 4000, 3500},\n" +
                "        {4000, 6000, 3500},\n" +
                "        {2000, 4000, 2500}\n" +
                "    };*/\n" +
                " \n" +
                "    /*int costMatrix[N][N] =\n" +
                "    {\n" +
                "        {90, 75, 75, 80},\n" +
                "        {30, 85, 55, 65},\n" +
                "        {125, 95, 90, 105},\n" +
                "        {45, 110, 95, 115}\n" +
                "    };*/\n" +
                " \n" +
                " \n" +
                "    cout << \"\\nOptimal Cost is \"\n" +
                "        << findMinCost(costMatrix);\n" +
                " \n" +
                "    return 0;\n" +
                "}" +
                "\n\nOutput :\n" +
                "\n" +
                "Assign Worker A to Job 1\n" +
                "Assign Worker B to Job 0\n" +
                "Assign Worker C to Job 2\n" +
                "Assign Worker D to Job 3\n" +
                "\n" +
                "Optimal Cost is 13");
    }
}
