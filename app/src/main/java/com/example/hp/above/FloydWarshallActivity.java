package com.example.hp.above;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class FloydWarshallActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floyd_warshall);
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
    public void floyd_code(View view) {
        TextView tv = (TextView) findViewById(R.id.floyd_code);
        tv.setText("Example:\n" +
                "\n" +
                "Input:\n" +
                "       graph[][] = { {0,   5,  INF, 10},\n" +
                "                    {INF,  0,  3,  INF},\n" +
                "                    {INF, INF, 0,   1},\n" +
                "                    {INF, INF, INF, 0} }\n" +
                "which represents the following graph\n" +
                "             10\n" +
                "       (0)------->(3)\n" +
                "        |         /|\\\n" +
                "      5 |          |\n" +
                "        |          | 1\n" +
                "       \\|/         |\n" +
                "       (1)------->(2)\n" +
                "            3       \n" +
                "Note that the value of graph[i][j] is 0 if i is equal to j \n" +
                "And graph[i][j] is INF (infinite) if there is no edge from vertex i to j.\n" +
                "\n" +
                "Output:\n" +
                "Shortest distance matrix\n" +
                "      0      5      8      9\n" +
                "    INF      0      3      4\n" +
                "    INF    INF      0      1\n" +
                "    INF    INF    INF      0 " +
                "\n\nFollowing is implementations of the Floyd Warshall algorithm." +
                "\n// C Program for Floyd Warshall Algorithm\n" +
                "#include<stdio.h>\n" +
                " \n" +
                "// Number of vertices in the graph\n" +
                "#define V 4\n" +
                " \n" +
                "/* Define Infinite as a large enough value. This value will be used\n" +
                "  for vertices not connected to each other */\n" +
                "#define INF 99999\n" +
                " \n" +
                "// A function to print the solution matrix\n" +
                "void printSolution(int dist[][V]);\n" +
                " \n" +
                "// Solves the all-pairs shortest path problem using Floyd Warshall algorithm\n" +
                "void floydWarshall (int graph[][V])\n" +
                "{\n" +
                "    /* dist[][] will be the output matrix that will finally have the shortest \n" +
                "      distances between every pair of vertices */\n" +
                "    int dist[V][V], i, j, k;\n" +
                " \n" +
                "    /* Initialize the solution matrix same as input graph matrix. Or \n" +
                "       we can say the initial values of shortest distances are based\n" +
                "       on shortest paths considering no intermediate vertex. */\n" +
                "    for (i = 0; i < V; i++)\n" +
                "        for (j = 0; j < V; j++)\n" +
                "            dist[i][j] = graph[i][j];\n" +
                " \n" +
                "    /* Add all vertices one by one to the set of intermediate vertices.\n" +
                "      ---> Before start of a iteration, we have shortest distances between all\n" +
                "      pairs of vertices such that the shortest distances consider only the\n" +
                "      vertices in set {0, 1, 2, .. k-1} as intermediate vertices.\n" +
                "      ----> After the end of a iteration, vertex no. k is added to the set of\n" +
                "      intermediate vertices and the set becomes {0, 1, 2, .. k} */\n" +
                "    for (k = 0; k < V; k++)\n" +
                "    {\n" +
                "        // Pick all vertices as source one by one\n" +
                "        for (i = 0; i < V; i++)\n" +
                "        {\n" +
                "            // Pick all vertices as destination for the\n" +
                "            // above picked source\n" +
                "            for (j = 0; j < V; j++)\n" +
                "            {\n" +
                "                // If vertex k is on the shortest path from\n" +
                "                // i to j, then update the value of dist[i][j]\n" +
                "                if (dist[i][k] + dist[k][j] < dist[i][j])\n" +
                "                    dist[i][j] = dist[i][k] + dist[k][j];\n" +
                "            }\n" +
                "        }\n" +
                "    }\n" +
                " \n" +
                "    // Print the shortest distance matrix\n" +
                "    printSolution(dist);\n" +
                "}\n" +
                " \n" +
                "/* A utility function to print solution */\n" +
                "void printSolution(int dist[][V])\n" +
                "{\n" +
                "    printf (\"Following matrix shows the shortest distances\"\n" +
                "            \" between every pair of vertices \\n\");\n" +
                "    for (int i = 0; i < V; i++)\n" +
                "    {\n" +
                "        for (int j = 0; j < V; j++)\n" +
                "        {\n" +
                "            if (dist[i][j] == INF)\n" +
                "                printf(\"%7s\", \"INF\");\n" +
                "            else\n" +
                "                printf (\"%7d\", dist[i][j]);\n" +
                "        }\n" +
                "        printf(\"\\n\");\n" +
                "    }\n" +
                "}\n" +
                " \n" +
                "// driver program to test above function\n" +
                "int main()\n" +
                "{\n" +
                "    /* Let us create the following weighted graph\n" +
                "            10\n" +
                "       (0)------->(3)\n" +
                "        |         /|\\\n" +
                "      5 |          |\n" +
                "        |          | 1\n" +
                "       \\|/         |\n" +
                "       (1)------->(2)\n" +
                "            3           */\n" +
                "    int graph[V][V] = { {0,   5,  INF, 10},\n" +
                "                        {INF, 0,   3, INF},\n" +
                "                        {INF, INF, 0,   1},\n" +
                "                        {INF, INF, INF, 0}\n" +
                "                      };\n" +
                " \n" +
                "    // Print the solution\n" +
                "    floydWarshall(graph);\n" +
                "    return 0;\n" +
                "}" +
                "\nOutput:\n" +
                "\n" +
                "Following matrix shows the shortest distances between every pair of vertices\n" +
                "      0      5      8      9\n" +
                "    INF      0      3      4\n" +
                "    INF    INF      0      1\n" +
                "    INF    INF    INF      0\n" +
                "Time Complexity: O(V^3)\n" +
                "\n" +
                "The above program only prints the shortest distances. We can modify the solution to print the shortest paths also by storing the predecessor information in a separate 2D matrix.\n" +
                "Also, the value of INF can be taken as INT_MAX from limits.h to make sure that we handle maximum possible value. When we take INF as INT_MAX, we need to change the if condition in the above program to avoid arithmatic overflow.\n" +
                "\n" +
                "#include <limits.h>\n" +
                "\n" +
                "#define INF INT_MAX\n" +
                "..........................\n" +
                "if ( dist[i][k] != INF && \n" +
                "     dist[k][j] != INF && \n" +
                "     dist[i][k] + dist[k][j] < dist[i][j]\n" +
                "    )\n" +
                " dist[i][j] = dist[i][k] + dist[k][j];\n" +
                "..........................." +
                "\n");
    }
}
