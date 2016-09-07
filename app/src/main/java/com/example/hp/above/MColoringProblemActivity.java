package com.example.hp.above;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MColoringProblemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mcoloring_problem);
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
    public void mcolor_code(View view) {
        TextView tv = (TextView) findViewById(R.id.mcolor_code);
        tv.setText("#include<stdio.h>\n" +
                " \n" +
                "// Number of vertices in the graph\n" +
                "#define V 4\n" +
                " \n" +
                "void printSolution(int color[]);\n" +
                " \n" +
                "/* A utility function to check if the current color assignment\n" +
                "   is safe for vertex v */\n" +
                "bool isSafe (int v, bool graph[V][V], int color[], int c)\n" +
                "{\n" +
                "    for (int i = 0; i < V; i++)\n" +
                "        if (graph[v][i] && c == color[i])\n" +
                "            return false;\n" +
                "    return true;\n" +
                "}\n" +
                " \n" +
                "/* A recursive utility function to solve m coloring problem */\n" +
                "bool graphColoringUtil(bool graph[V][V], int m, int color[], int v)\n" +
                "{\n" +
                "    /* base case: If all vertices are assigned a color then\n" +
                "       return true */\n" +
                "    if (v == V)\n" +
                "        return true;\n" +
                " \n" +
                "    /* Consider this vertex v and try different colors */\n" +
                "    for (int c = 1; c <= m; c++)\n" +
                "    {\n" +
                "        /* Check if assignment of color c to v is fine*/\n" +
                "        if (isSafe(v, graph, color, c))\n" +
                "        {\n" +
                "           color[v] = c;\n" +
                " \n" +
                "           /* recur to assign colors to rest of the vertices */\n" +
                "           if (graphColoringUtil (graph, m, color, v+1) == true)\n" +
                "             return true;\n" +
                " \n" +
                "            /* If assigning color c doesn't lead to a solution\n" +
                "               then remove it */\n" +
                "           color[v] = 0;\n" +
                "        }\n" +
                "    }\n" +
                " \n" +
                "    /* If no color can be assigned to this vertex then return false */\n" +
                "    return false;\n" +
                "}\n" +
                " \n" +
                "/* This function solves the m Coloring problem using Backtracking.\n" +
                "  It mainly uses graphColoringUtil() to solve the problem. It returns\n" +
                "  false if the m colors cannot be assigned, otherwise return true and\n" +
                "  prints assignments of colors to all vertices. Please note that there\n" +
                "  may be more than one solutions, this function prints one of the\n" +
                "  feasible solutions.*/\n" +
                "bool graphColoring(bool graph[V][V], int m)\n" +
                "{\n" +
                "    // Initialize all color values as 0. This initialization is needed\n" +
                "    // correct functioning of isSafe()\n" +
                "    int *color = new int[V];\n" +
                "    for (int i = 0; i < V; i++)\n" +
                "       color[i] = 0;\n" +
                " \n" +
                "    // Call graphColoringUtil() for vertex 0\n" +
                "    if (graphColoringUtil(graph, m, color, 0) == false)\n" +
                "    {\n" +
                "      printf(\"Solution does not exist\");\n" +
                "      return false;\n" +
                "    }\n" +
                " \n" +
                "    // Print the solution\n" +
                "    printSolution(color);\n" +
                "    return true;\n" +
                "}\n" +
                " \n" +
                "/* A utility function to print solution */\n" +
                "void printSolution(int color[])\n" +
                "{\n" +
                "    printf(\"Solution Exists:\"\n" +
                "            \" Following are the assigned colors \\n\");\n" +
                "    for (int i = 0; i < V; i++)\n" +
                "      printf(\" %d \", color[i]);\n" +
                "    printf(\"\\n\");\n" +
                "}\n" +
                " \n" +
                "// driver program to test above function\n" +
                "int main()\n" +
                "{\n" +
                "    /* Create following graph and test whether it is 3 colorable\n" +
                "      (3)---(2)\n" +
                "       |   / |\n" +
                "       |  /  |\n" +
                "       | /   |\n" +
                "      (0)---(1)\n" +
                "    */\n" +
                "    bool graph[V][V] = {{0, 1, 1, 1},\n" +
                "        {1, 0, 1, 0},\n" +
                "        {1, 1, 0, 1},\n" +
                "        {1, 0, 1, 0},\n" +
                "    };\n" +
                "    int m = 3; // Number of colors\n" +
                "    graphColoring (graph, m);\n" +
                "    return 0;\n" +
                "}" +
                "\n\nOutput:\n" +
                "Solution Exists: Following are the assigned colors\n" +
                " 1  2  3  2");
    }
}

