package com.example.hp.above;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class EightPuzzleBranchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eight_puzzle_branch);
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
    public void eight_code(View view) {
        TextView tv = (TextView) findViewById(R.id.eight_code);
        tv.setText("/* Algorithm LCSearch uses c(x) to find an answer node\n" +
                " * LCSearch uses Least() and Add() to maintain the list \n" +
                "   of live nodes\n" +
                " * Least() finds a live node with least c(x), deletes\n" +
                "   it from the list and returns it\n" +
                " * Add(x) adds x to the list of live nodes\n" +
                " * Implement list of live nodes as a min heap */\n" +
                "\n" +
                "struct list_node\n" +
                "{\n" +
                "   list_node *next;\n" +
                "\n" +
                "   // Helps in tracing path when answer is found\n" +
                "   list_node *parent; \n" +
                "   float cost;\n" +
                "} \n" +
                "\n" +
                "algorithm LCSearch(list_node *t)\n" +
                "{\n" +
                "   // Search t for an answer node\n" +
                "   // Input: Root node of tree t\n" +
                "   // Output: Path from answer node to root\n" +
                "   if (*t is an answer node)\n" +
                "   {\n" +
                "       print(*t);\n" +
                "       return;\n" +
                "   }\n" +
                "   \n" +
                "   E = t; // E-node\n" +
                "\n" +
                "   Initialize the list of live nodes to be empty;\n" +
                "   while (true)\n" +
                "   {\n" +
                "      for each child x of E\n" +
                "      {\n" +
                "          if x is an answer node\n" +
                "          {\n" +
                "             print the path from x to t;\n" +
                "             return;\n" +
                "          }\n" +
                "          Add (x); // Add x to list of live nodes;\n" +
                "          x->parent = E; // Pointer for path to root\n" +
                "      }\n" +
                "\n" +
                "      if there are no more live nodes\n" +
                "      {\n" +
                "         print (\"No answer node\");\n" +
                "         return;\n" +
                "      }\n" +
                "       \n" +
                "      // Find a live node with least estimated cost\n" +
                "      E = Least(); \n" +
                "\n" +
                "      // The found node is deleted from the list of \n" +
                "      // live nodes\n" +
                "   }\n" +
                "}\n" +
                "Below diagram shows the path followed by above algorithm to reach final configuration from given initial configuration of 8-Puzzle. Note that only nodes having least value of cost function are expanded." +
                "");

        ImageView iv = (ImageView) findViewById(R.id.eight_image);
        iv.setImageResource(R.drawable.eight_image);

        TextView tv1 = (TextView) findViewById(R.id.extra_text);
        tv1.setText("// Program to print path from root node to destination node\n" +
                "// for N*N -1 puzzle algorithm using Branch and Bound\n" +
                "// The solution assumes that instance of puzzle is solvable\n" +
                "#include <bits/stdc++.h>\n" +
                "using namespace std;\n" +
                "#define N 3\n" +
                " \n" +
                "// state space tree nodes\n" +
                "struct Node\n" +
                "{\n" +
                "    // stores parent node of current node\n" +
                "    // helps in tracing path when answer is found\n" +
                "    Node* parent;\n" +
                " \n" +
                "    // stores matrix\n" +
                "    int mat[N][N];\n" +
                " \n" +
                "    // stores blank tile cordinates\n" +
                "    int x, y;\n" +
                " \n" +
                "    // stores the number of misplaced tiles\n" +
                "    int cost;\n" +
                " \n" +
                "    // stores the number of moves so far\n" +
                "    int level;\n" +
                "};\n" +
                " \n" +
                "// Function to print N x N matrix\n" +
                "int printMatrix(int mat[N][N])\n" +
                "{\n" +
                "    for (int i = 0; i < N; i++)\n" +
                "    {\n" +
                "        for (int j = 0; j < N; j++)\n" +
                "            printf(\"%d \", mat[i][j]);\n" +
                "        printf(\"\\n\");\n" +
                "    }\n" +
                "}\n" +
                " \n" +
                "// Function to allocate a new node\n" +
                "Node* newNode(int mat[N][N], int x, int y, int newX,\n" +
                "              int newY, int level, Node* parent)\n" +
                "{\n" +
                "    Node* node = new Node;\n" +
                " \n" +
                "    // set pointer for path to root\n" +
                "    node->parent = parent;\n" +
                " \n" +
                "    // copy data from parent node to current node\n" +
                "    memcpy(node->mat, mat, sizeof node->mat);\n" +
                " \n" +
                "    // move tile by 1 postion\n" +
                "    swap(node->mat[x][y], node->mat[newX][newY]);\n" +
                " \n" +
                "    // set number of misplaced tiles\n" +
                "    node->cost = INT_MAX;\n" +
                " \n" +
                "    // set number of moves so far\n" +
                "    node->level = level;\n" +
                " \n" +
                "    // update new blank tile cordinates\n" +
                "    node->x = newX;\n" +
                "    node->y = newY;\n" +
                " \n" +
                "    return node;\n" +
                "}\n" +
                " \n" +
                "// botton, left, top, right\n" +
                "int row[] = { 1, 0, -1, 0 };\n" +
                "int col[] = { 0, -1, 0, 1 };\n" +
                " \n" +
                "// Function to calculate the the number of misplaced tiles\n" +
                "// ie. number of non-blank tiles not in their goal position\n" +
                "int calculateCost(int initial[N][N], int final[N][N])\n" +
                "{\n" +
                "    int count = 0;\n" +
                "    for (int i = 0; i < N; i++)\n" +
                "      for (int j = 0; j < N; j++)\n" +
                "        if (initial[i][j] && initial[i][j] != final[i][j])\n" +
                "           count++;\n" +
                "    return count;\n" +
                "}\n" +
                " \n" +
                "// Function to check if (x, y) is a valid matrix cordinate\n" +
                "int isSafe(int x, int y)\n" +
                "{\n" +
                "    return (x >= 0 && x < N && y >= 0 && y < N);\n" +
                "}\n" +
                " \n" +
                "// print path from root node to destination node\n" +
                "void printPath(Node* root)\n" +
                "{\n" +
                "    if (root == NULL)\n" +
                "        return;\n" +
                "    printPath(root->parent);\n" +
                "    printMatrix(root->mat);\n" +
                " \n" +
                "    printf(\"\\n\");\n" +
                "}\n" +
                " \n" +
                "// Comparison object to be used to order the heap\n" +
                "struct comp\n" +
                "{\n" +
                "    bool operator()(const Node* lhs, const Node* rhs) const\n" +
                "    {\n" +
                "        return (lhs->cost + lhs->level) > (rhs->cost + rhs->level);\n" +
                "    }\n" +
                "};\n" +
                " \n" +
                "// Function to solve N*N - 1 puzzle algorithm using\n" +
                "// Branch and Bound. x and y are blank tile coordinates\n" +
                "// in initial state\n" +
                "void solve(int initial[N][N], int x, int y,\n" +
                "           int final[N][N])\n" +
                "{\n" +
                "    // Create a priority queue to store live nodes of\n" +
                "    // search tree;\n" +
                "    priority_queue<Node*, std::vector<Node*>, comp> pq;\n" +
                " \n" +
                "    // create a root node and calculate its cost\n" +
                "    Node* root = newNode(initial, x, y, x, y, 0, NULL);\n" +
                "    root->cost = calculateCost(initial, final);\n" +
                " \n" +
                "    // Add root to list of live nodes;\n" +
                "    pq.push(root);\n" +
                " \n" +
                "    // Finds a live node with least cost,\n" +
                "    // add its childrens to list of live nodes and\n" +
                "    // finally deletes it from the list.\n" +
                "    while (!pq.empty())\n" +
                "    {\n" +
                "        // Find a live node with least estimated cost\n" +
                "        Node* min = pq.top();\n" +
                " \n" +
                "        // The found node is deleted from the list of\n" +
                "        // live nodes\n" +
                "        pq.pop();\n" +
                " \n" +
                "        // if min is an answer node\n" +
                "        if (min->cost == 0)\n" +
                "        {\n" +
                "            // print the path from root to destination;\n" +
                "            printPath(min);\n" +
                "            return;\n" +
                "        }\n" +
                " \n" +
                "        // do for each child of min\n" +
                "        // max 4 children for a node\n" +
                "        for (int i = 0; i < 4; i++)\n" +
                "        {\n" +
                "            if (isSafe(min->x + row[i], min->y + col[i]))\n" +
                "            {\n" +
                "                // create a child node and calculate\n" +
                "                // its cost\n" +
                "                Node* child = newNode(min->mat, min->x,\n" +
                "                              min->y, min->x + row[i],\n" +
                "                              min->y + col[i],\n" +
                "                              min->level + 1, min);\n" +
                "                child->cost = calculateCost(child->mat, final);\n" +
                " \n" +
                "                // Add child to list of live nodes\n" +
                "                pq.push(child);\n" +
                "            }\n" +
                "        }\n" +
                "    }\n" +
                "}\n" +
                " \n" +
                "// Driver code\n" +
                "int main()\n" +
                "{\n" +
                "    // Initial configuration\n" +
                "    // Value 0 is used for empty space\n" +
                "    int initial[N][N] =\n" +
                "    {\n" +
                "        {1, 2, 3},\n" +
                "        {5, 6, 0},\n" +
                "        {7, 8, 4}\n" +
                "    };\n" +
                " \n" +
                "    // Solvable Final configuration\n" +
                "    // Value 0 is used for empty space\n" +
                "    int final[N][N] =\n" +
                "    {\n" +
                "        {1, 2, 3},\n" +
                "        {5, 8, 6},\n" +
                "        {0, 7, 4}\n" +
                "    };\n" +
                " \n" +
                "    // Blank tile coordinates in initial\n" +
                "    // configuration\n" +
                "    int x = 1, y = 2;\n" +
                " \n" +
                "    solve(initial, x, y, final);\n" +
                " \n" +
                "    return 0;\n" +
                "}" +
                "\n\nOutput :\n" +
                "\n" +
                "1 2 3 \n" +
                "5 6 0 \n" +
                "7 8 4 \n" +
                "\n" +
                "1 2 3 \n" +
                "5 0 6 \n" +
                "7 8 4 \n" +
                "\n" +
                "1 2 3 \n" +
                "5 8 6 \n" +
                "7 0 4 \n" +
                "\n" +
                "1 2 3 \n" +
                "5 8 6 \n" +
                "0 7 4 ");
    }
}
