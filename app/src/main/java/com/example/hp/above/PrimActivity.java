package com.example.hp.above;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class PrimActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prim);
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
    public void prims_code(View view) {
        TextView tv = (TextView) findViewById(R.id.prims_code);
        tv.setText("// A C / C++ program for Prim's Minimum Spanning Tree (MST) algorithm. \n" +
                "// The program is for adjacency matrix representation of the graph\n" +
                " \n" +
                "#include <stdio.h>\n" +
                "#include <limits.h>\n" +
                " \n" +
                "// Number of vertices in the graph\n" +
                "#define V 5\n" +
                " \n" +
                "// A utility function to find the vertex with minimum key value, from\n" +
                "// the set of vertices not yet included in MST\n" +
                "int minKey(int key[], bool mstSet[])\n" +
                "{\n" +
                "   // Initialize min value\n" +
                "   int min = INT_MAX, min_index;\n" +
                " \n" +
                "   for (int v = 0; v < V; v++)\n" +
                "     if (mstSet[v] == false && key[v] < min)\n" +
                "         min = key[v], min_index = v;\n" +
                " \n" +
                "   return min_index;\n" +
                "}\n" +
                " \n" +
                "// A utility function to print the constructed MST stored in parent[]\n" +
                "int printMST(int parent[], int n, int graph[V][V])\n" +
                "{\n" +
                "   printf(\"Edge   Weight\\n\");\n" +
                "   for (int i = 1; i < V; i++)\n" +
                "      printf(\"%d - %d    %d \\n\", parent[i], i, graph[i][parent[i]]);\n" +
                "}\n" +
                " \n" +
                "// Function to construct and print MST for a graph represented using adjacency\n" +
                "// matrix representation\n" +
                "void primMST(int graph[V][V])\n" +
                "{\n" +
                "     int parent[V]; // Array to store constructed MST\n" +
                "     int key[V];   // Key values used to pick minimum weight edge in cut\n" +
                "     bool mstSet[V];  // To represent set of vertices not yet included in MST\n" +
                " \n" +
                "     // Initialize all keys as INFINITE\n" +
                "     for (int i = 0; i < V; i++)\n" +
                "        key[i] = INT_MAX, mstSet[i] = false;\n" +
                " \n" +
                "     // Always include first 1st vertex in MST.\n" +
                "     key[0] = 0;     // Make key 0 so that this vertex is picked as first vertex\n" +
                "     parent[0] = -1; // First node is always root of MST \n" +
                " \n" +
                "     // The MST will have V vertices\n" +
                "     for (int count = 0; count < V-1; count++)\n" +
                "     {\n" +
                "        // Pick thd minimum key vertex from the set of vertices\n" +
                "        // not yet included in MST\n" +
                "        int u = minKey(key, mstSet);\n" +
                " \n" +
                "        // Add the picked vertex to the MST Set\n" +
                "        mstSet[u] = true;\n" +
                " \n" +
                "        // Update key value and parent index of the adjacent vertices of\n" +
                "        // the picked vertex. Consider only those vertices which are not yet\n" +
                "        // included in MST\n" +
                "        for (int v = 0; v < V; v++)\n" +
                " \n" +
                "           // graph[u][v] is non zero only for adjacent vertices of m\n" +
                "           // mstSet[v] is false for vertices not yet included in MST\n" +
                "           // Update the key only if graph[u][v] is smaller than key[v]\n" +
                "          if (graph[u][v] && mstSet[v] == false && graph[u][v] <  key[v])\n" +
                "             parent[v]  = u, key[v] = graph[u][v];\n" +
                "     }\n" +
                " \n" +
                "     // print the constructed MST\n" +
                "     printMST(parent, V, graph);\n" +
                "}\n" +
                " \n" +
                " \n" +
                "// driver program to test above function\n" +
                "int main()\n" +
                "{\n" +
                "   /* Let us create the following graph\n" +
                "          2    3\n" +
                "      (0)--(1)--(2)\n" +
                "       |   / \\   |\n" +
                "      6| 8/   \\5 |7\n" +
                "       | /     \\ |\n" +
                "      (3)-------(4)\n" +
                "            9          */\n" +
                "   int graph[V][V] = {{0, 2, 0, 6, 0},\n" +
                "                      {2, 0, 3, 8, 5},\n" +
                "                      {0, 3, 0, 0, 7},\n" +
                "                      {6, 8, 0, 0, 9},\n" +
                "                      {0, 5, 7, 9, 0},\n" +
                "                     };\n" +
                " \n" +
                "    // Print the solution\n" +
                "    primMST(graph);\n" +
                " \n" +
                "    return 0;\n" +
                "}" +
                "\n\nOutput:\n" +
                "Edge   Weight\n" +
                "0 - 1    2\n" +
                "1 - 2    3\n" +
                "0 - 3    6\n" +
                "1 - 4    5\n" +
                "Time Complexity of the above program is O(V^2). If the input graph is represented using adjacency list, then the time complexity of Prim’s algorithm can be reduced to O(E log V) with the help of binary heap. " +
                "\n");
    }
}
