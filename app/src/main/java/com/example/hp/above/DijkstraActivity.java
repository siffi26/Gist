package com.example.hp.above;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class DijkstraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dijkstra);
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
    public void dijikstra_code(View view) {
        TextView tv = (TextView) findViewById(R.id.dijikstra_code);
        tv.setText("// A C / C++ program for Dijkstra's single source shortest path algorithm.\n" +
                "// The program is for adjacency matrix representation of the graph\n" +
                " \n" +
                "#include <stdio.h>\n" +
                "#include <limits.h>\n" +
                " \n" +
                "// Number of vertices in the graph\n" +
                "#define V 9\n" +
                " \n" +
                "// A utility function to find the vertex with minimum distance value, from\n" +
                "// the set of vertices not yet included in shortest path tree\n" +
                "int minDistance(int dist[], bool sptSet[])\n" +
                "{\n" +
                "   // Initialize min value\n" +
                "   int min = INT_MAX, min_index;\n" +
                " \n" +
                "   for (int v = 0; v < V; v++)\n" +
                "     if (sptSet[v] == false && dist[v] <= min)\n" +
                "         min = dist[v], min_index = v;\n" +
                " \n" +
                "   return min_index;\n" +
                "}\n" +
                " \n" +
                "// A utility function to print the constructed distance array\n" +
                "int printSolution(int dist[], int n)\n" +
                "{\n" +
                "   printf(\"Vertex   Distance from Source\\n\");\n" +
                "   for (int i = 0; i < V; i++)\n" +
                "      printf(\"%d \\t\\t %d\\n\", i, dist[i]);\n" +
                "}\n" +
                " \n" +
                "// Funtion that implements Dijkstra's single source shortest path algorithm\n" +
                "// for a graph represented using adjacency matrix representation\n" +
                "void dijkstra(int graph[V][V], int src)\n" +
                "{\n" +
                "     int dist[V];     // The output array.  dist[i] will hold the shortest\n" +
                "                      // distance from src to i\n" +
                " \n" +
                "     bool sptSet[V]; // sptSet[i] will true if vertex i is included in shortest\n" +
                "                     // path tree or shortest distance from src to i is finalized\n" +
                " \n" +
                "     // Initialize all distances as INFINITE and stpSet[] as false\n" +
                "     for (int i = 0; i < V; i++)\n" +
                "        dist[i] = INT_MAX, sptSet[i] = false;\n" +
                " \n" +
                "     // Distance of source vertex from itself is always 0\n" +
                "     dist[src] = 0;\n" +
                " \n" +
                "     // Find shortest path for all vertices\n" +
                "     for (int count = 0; count < V-1; count++)\n" +
                "     {\n" +
                "       // Pick the minimum distance vertex from the set of vertices not\n" +
                "       // yet processed. u is always equal to src in first iteration.\n" +
                "       int u = minDistance(dist, sptSet);\n" +
                " \n" +
                "       // Mark the picked vertex as processed\n" +
                "       sptSet[u] = true;\n" +
                " \n" +
                "       // Update dist value of the adjacent vertices of the picked vertex.\n" +
                "       for (int v = 0; v < V; v++)\n" +
                " \n" +
                "         // Update dist[v] only if is not in sptSet, there is an edge from \n" +
                "         // u to v, and total weight of path from src to  v through u is \n" +
                "         // smaller than current value of dist[v]\n" +
                "         if (!sptSet[v] && graph[u][v] && dist[u] != INT_MAX \n" +
                "                                       && dist[u]+graph[u][v] < dist[v])\n" +
                "            dist[v] = dist[u] + graph[u][v];\n" +
                "     }\n" +
                " \n" +
                "     // print the constructed distance array\n" +
                "     printSolution(dist, V);\n" +
                "}\n" +
                " \n" +
                "// driver program to test above function\n" +
                "int main()\n" +
                "{\n" +
                "   /* Let us create the example graph discussed above */\n" +
                "   int graph[V][V] = {{0, 4, 0, 0, 0, 0, 0, 8, 0},\n" +
                "                      {4, 0, 8, 0, 0, 0, 0, 11, 0},\n" +
                "                      {0, 8, 0, 7, 0, 4, 0, 0, 2},\n" +
                "                      {0, 0, 7, 0, 9, 14, 0, 0, 0},\n" +
                "                      {0, 0, 0, 9, 0, 10, 0, 0, 0},\n" +
                "                      {0, 0, 4, 0, 10, 0, 2, 0, 0},\n" +
                "                      {0, 0, 0, 14, 0, 2, 0, 1, 6},\n" +
                "                      {8, 11, 0, 0, 0, 0, 1, 0, 7},\n" +
                "                      {0, 0, 2, 0, 0, 0, 6, 7, 0}\n" +
                "                     };\n" +
                " \n" +
                "    dijkstra(graph, 0);\n" +
                " \n" +
                "    return 0;\n" +
                "}" +
                "\n\nOutput:\n" +
                "Vertex   Distance from Source\n" +
                "0                0\n" +
                "1                4\n" +
                "2                12\n" +
                "3                19\n" +
                "4                21\n" +
                "5                11\n" +
                "6                9\n" +
                "7                8\n" +
                "8                14\n" +
                "Notes:\n" +
                "1) The code calculates shortest distance, but doesn’t calculate the path information. We can create a parent array, update the parent array when distance is updated (like prim’s implementation) and use it show the shortest path from source to different vertices.\n" +
                "\n" +
                "2) The code is for undirected graph, same dijekstra function can be used for directed graphs also.\n" +
                "\n" +
                "3) The code finds shortest distances from source to all vertices. If we are interested only in shortest distance from source to a single target, we can break the for loop when the picked minimum distance vertex is equal to target (Step 3.a of algorithm).\n" +
                "\n" +
                "4) Time Complexity of the implementation is O(V^2). If the input graph is represented using adjacency list, it can be reduced to O(E log V) with the help of binary heap. " +
                "\n5) Dijkstra’s algorithm doesn’t work for graphs with negative weight edges.");
    }
}
