package com.example.hp.above;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class BipartiteGraphActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bipartite_graph);
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
    public void bipartite_code(View view) {
        TextView tv = (TextView) findViewById(R.id.bipartite_code);
        tv.setText("// C++ program to find out whether a given graph is Bipartite or not\n" +
                "#include <iostream>\n" +
                "#include <queue>\n" +
                "#define V 4\n" +
                "using namespace std;\n" +
                " \n" +
                "// This function returns true if graph G[V][V] is Bipartite, else false\n" +
                "bool isBipartite(int G[][V], int src)\n" +
                "{\n" +
                "    // Create a color array to store colors assigned to all veritces. Vertex \n" +
                "    // number is used as index in this array. The value '-1' of  colorArr[i] \n" +
                "    // is used to indicate that no color is assigned to vertex 'i'.  The value \n" +
                "    // 1 is used to indicate first color is assigned and value 0 indicates \n" +
                "    // second color is assigned.\n" +
                "    int colorArr[V];\n" +
                "    for (int i = 0; i < V; ++i)\n" +
                "        colorArr[i] = -1;\n" +
                " \n" +
                "    // Assign first color to source\n" +
                "    colorArr[src] = 1;\n" +
                " \n" +
                "    // Create a queue (FIFO) of vertex numbers and enqueue source vertex\n" +
                "    // for BFS traversal\n" +
                "    queue <int> q;\n" +
                "    q.push(src);\n" +
                " \n" +
                "    // Run while there are vertices in queue (Similar to BFS)\n" +
                "    while (!q.empty())\n" +
                "    {\n" +
                "        // Dequeue a vertex from queue ( Refer http://goo.gl/35oz8 )\n" +
                "        int u = q.front();\n" +
                "        q.pop();\n" +
                " \n" +
                "         // Find all non-colored adjacent vertices\n" +
                "        for (int v = 0; v < V; ++v)\n" +
                "        {\n" +
                "            // An edge from u to v exists and destination v is not colored\n" +
                "            if (G[u][v] && colorArr[v] == -1)\n" +
                "            {\n" +
                "                // Assign alternate color to this adjacent v of u\n" +
                "                colorArr[v] = 1 - colorArr[u];\n" +
                "                q.push(v);\n" +
                "            }\n" +
                " \n" +
                "            //  An edge from u to v exists and destination v is colored with\n" +
                "            // same color as u\n" +
                "            else if (G[u][v] && colorArr[v] == colorArr[u])\n" +
                "                return false;\n" +
                "        }\n" +
                "    }\n" +
                " \n" +
                "    // If we reach here, then all adjacent vertices can be colored with \n" +
                "    // alternate color\n" +
                "    return true;\n" +
                "}\n" +
                " \n" +
                "// Driver program to test above function\n" +
                "int main()\n" +
                "{\n" +
                "    int G[][V] = {{0, 1, 0, 1},\n" +
                "        {1, 0, 1, 0},\n" +
                "        {0, 1, 0, 1},\n" +
                "        {1, 0, 1, 0}\n" +
                "    };\n" +
                " \n" +
                "    isBipartite(G, 0) ? cout << \"Yes\" : cout << \"No\";\n" +
                "    return 0;\n" +
                "}" +
                "\n\nOutput:\n" +
                "Yes\n" +
                "Refer this for C implementation of the same.\n" +
                "\n" +
                "Time Complexity of the above approach is same as that Breadth First Search. In above implementation is O(V^2) where V is number of vertices. If graph is represented using adjacency list, then the complexity becomes O(V+E).\n" +
                "\n" +
                "Exercise:\n" +
                "1. Can DFS algorithm be used to check the bipartite-ness of a graph? If yes, how?\n" +
                "2. The above algorithm works if the graph is strongly connected. Extend above code to work for graph with more than one component." +
                "\n");
    }
}
