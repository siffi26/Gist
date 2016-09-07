package com.example.hp.above;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class HamiltonianCycleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hamiltonian_cycle);
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
    public void hamiltonian_code(View view) {
        TextView tv = (TextView) findViewById(R.id.hamiltonian_code);
        tv.setText("/* C/C++ program for solution of Hamiltonian Cycle problem\n" +
                "   using backtracking */\n" +
                "#include<stdio.h>\n" +
                " \n" +
                "// Number of vertices in the graph\n" +
                "#define V 5\n" +
                " \n" +
                "void printSolution(int path[]);\n" +
                " \n" +
                "/* A utility function to check if the vertex v can be added at\n" +
                "   index 'pos' in the Hamiltonian Cycle constructed so far (stored\n" +
                "   in 'path[]') */\n" +
                "bool isSafe(int v, bool graph[V][V], int path[], int pos)\n" +
                "{\n" +
                "    /* Check if this vertex is an adjacent vertex of the previously\n" +
                "       added vertex. */\n" +
                "    if (graph [ path[pos-1] ][ v ] == 0)\n" +
                "        return false;\n" +
                " \n" +
                "    /* Check if the vertex has already been included.\n" +
                "      This step can be optimized by creating an array of size V */\n" +
                "    for (int i = 0; i < pos; i++)\n" +
                "        if (path[i] == v)\n" +
                "            return false;\n" +
                " \n" +
                "    return true;\n" +
                "}\n" +
                " \n" +
                "/* A recursive utility function to solve hamiltonian cycle problem */\n" +
                "bool hamCycleUtil(bool graph[V][V], int path[], int pos)\n" +
                "{\n" +
                "    /* base case: If all vertices are included in Hamiltonian Cycle */\n" +
                "    if (pos == V)\n" +
                "    {\n" +
                "        // And if there is an edge from the last included vertex to the\n" +
                "        // first vertex\n" +
                "        if ( graph[ path[pos-1] ][ path[0] ] == 1 )\n" +
                "           return true;\n" +
                "        else\n" +
                "          return false;\n" +
                "    }\n" +
                " \n" +
                "    // Try different vertices as a next candidate in Hamiltonian Cycle.\n" +
                "    // We don't try for 0 as we included 0 as starting point in in hamCycle()\n" +
                "    for (int v = 1; v < V; v++)\n" +
                "    {\n" +
                "        /* Check if this vertex can be added to Hamiltonian Cycle */\n" +
                "        if (isSafe(v, graph, path, pos))\n" +
                "        {\n" +
                "            path[pos] = v;\n" +
                " \n" +
                "            /* recur to construct rest of the path */\n" +
                "            if (hamCycleUtil (graph, path, pos+1) == true)\n" +
                "                return true;\n" +
                " \n" +
                "            /* If adding vertex v doesn't lead to a solution,\n" +
                "               then remove it */\n" +
                "            path[pos] = -1;\n" +
                "        }\n" +
                "    }\n" +
                " \n" +
                "    /* If no vertex can be added to Hamiltonian Cycle constructed so far,\n" +
                "       then return false */\n" +
                "    return false;\n" +
                "}\n" +
                " \n" +
                "/* This function solves the Hamiltonian Cycle problem using Backtracking.\n" +
                "  It mainly uses hamCycleUtil() to solve the problem. It returns false\n" +
                "  if there is no Hamiltonian Cycle possible, otherwise return true and\n" +
                "  prints the path. Please note that there may be more than one solutions,\n" +
                "  this function prints one of the feasible solutions. */\n" +
                "bool hamCycle(bool graph[V][V])\n" +
                "{\n" +
                "    int *path = new int[V];\n" +
                "    for (int i = 0; i < V; i++)\n" +
                "        path[i] = -1;\n" +
                " \n" +
                "    /* Let us put vertex 0 as the first vertex in the path. If there is\n" +
                "       a Hamiltonian Cycle, then the path can be started from any point\n" +
                "       of the cycle as the graph is undirected */\n" +
                "    path[0] = 0;\n" +
                "    if ( hamCycleUtil(graph, path, 1) == false )\n" +
                "    {\n" +
                "        printf(\"\\nSolution does not exist\");\n" +
                "        return false;\n" +
                "    }\n" +
                " \n" +
                "    printSolution(path);\n" +
                "    return true;\n" +
                "}\n" +
                " \n" +
                "/* A utility function to print solution */\n" +
                "void printSolution(int path[])\n" +
                "{\n" +
                "    printf (\"Solution Exists:\"\n" +
                "            \" Following is one Hamiltonian Cycle \\n\");\n" +
                "    for (int i = 0; i < V; i++)\n" +
                "        printf(\" %d \", path[i]);\n" +
                " \n" +
                "    // Let us print the first vertex again to show the complete cycle\n" +
                "    printf(\" %d \", path[0]);\n" +
                "    printf(\"\\n\");\n" +
                "}\n" +
                " \n" +
                "// driver program to test above function\n" +
                "int main()\n" +
                "{\n" +
                "   /* Let us create the following graph\n" +
                "      (0)--(1)--(2)\n" +
                "       |   / \\   |\n" +
                "       |  /   \\  |\n" +
                "       | /     \\ |\n" +
                "      (3)-------(4)    */\n" +
                "   bool graph1[V][V] = {{0, 1, 0, 1, 0},\n" +
                "                      {1, 0, 1, 1, 1},\n" +
                "                      {0, 1, 0, 0, 1},\n" +
                "                      {1, 1, 0, 0, 1},\n" +
                "                      {0, 1, 1, 1, 0},\n" +
                "                     };\n" +
                " \n" +
                "    // Print the solution\n" +
                "    hamCycle(graph1);\n" +
                " \n" +
                "   /* Let us create the following graph\n" +
                "      (0)--(1)--(2)\n" +
                "       |   / \\   |\n" +
                "       |  /   \\  |\n" +
                "       | /     \\ |\n" +
                "      (3)       (4)    */\n" +
                "    bool graph2[V][V] = {{0, 1, 0, 1, 0},\n" +
                "                      {1, 0, 1, 1, 1},\n" +
                "                      {0, 1, 0, 0, 1},\n" +
                "                      {1, 1, 0, 0, 0},\n" +
                "                      {0, 1, 1, 0, 0},\n" +
                "                     };\n" +
                " \n" +
                "    // Print the solution\n" +
                "    hamCycle(graph2);\n" +
                " \n" +
                "    return 0;\n" +
                "}" +
                "\n\nOutput:\n" +
                "Solution Exists: Following is one Hamiltonian Cycle\n" +
                " 0  1  2  4  3  0\n" +
                "\n" +
                "Solution does not exist\n" +
                "Note that the above code always prints cycle starting from 0. Starting point should not matter as cycle can be started from any point. If you want to change the starting point, you should make two changes to above code.\n" +
                "Change “path[0] = 0;” to “path[0] = s;” where s is your new starting point. Also change loop “for (int v = 1; v < V; v++)” in hamCycleUtil() to “for (int v = 0; v < V; v++)”. " +
                "\n");
    }
}
