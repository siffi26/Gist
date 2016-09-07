package com.example.hp.above;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class BellmanFordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bellman_ford);
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
    public void bellman_code(View view) {
        TextView tv = (TextView) findViewById(R.id.bellman_code);
        tv.setText("1) This step initializes distances from source to all vertices as infinite and distance to source itself as 0. Create an array dist[] of size |V| with all values as infinite except dist[src] where src is source vertex.\n" +
                "\n" +
                "2) This step calculates shortest distances. Do following |V|-1 times where |V| is the number of vertices in given graph.\n" +
                "…..a) Do following for each edge u-v\n" +
                "………………If dist[v] > dist[u] + weight of edge uv, then update dist[v]\n" +
                "………………….dist[v] = dist[u] + weight of edge uv\n" +
                "\n" +
                "3) This step reports if there is a negative weight cycle in graph. Do following for each edge u-v\n" +
                "……If dist[v] > dist[u] + weight of edge uv, then “Graph contains negative weight cycle”\n" +
                "The idea of step 3 is, step 2 guarantees shortest distances if graph doesn’t contain negative weight cycle. If we iterate through all edges one more time and get a shorter path for any vertex, then there is a negative weight cycle" +
                "\n\nNotes\n" +
                "1) Negative weights are found in various applications of graphs. For example, instead of paying cost for a path, we may get some advantage if we follow the path.\n" +
                "\n" +
                "2) Bellman-Ford works better (better than Dijksra’s) for distributed systems. Unlike Dijksra’s where we need to find minimum value of all vertices, in Bellman-Ford, edges are considered one by one.\n" +
                "\n" +
                "Exercise\n" +
                "1) The standard Bellman-Ford algorithm reports shortest path only if there is no negative weight cycles. Modify it so that it reports minimum distances even if there is a negative weight cycle.\n" +
                "\n" +
                "2) Can we use Dijksra’s algorithm for shortest paths for graphs with negative weights – one idea can be, calculate the minimum weight value, add a positive value (equal to absolute value of minimum weight value) to all weights and run the Dijksra’s algorithm for the modified graph. Will this algorithm work?" +
                "\n\nExample\n" +
                "Let us understand the algorithm with following example graph. The images are taken from this source.\n" +
                "\n" +
                "Let the given source vertex be 0. Initialize all distances as infinite, except the distance to source itself. Total number of vertices in the graph is 5, so all edges must be processed 4 times." +
                "");

        ImageView iv = (ImageView) findViewById(R.id.bellman1);
        iv.setImageResource(R.drawable.bellman1);

        TextView text1 = (TextView) findViewById(R.id.bellman2);
        text1.setText("Let all edges are processed in following order: (B,E), (D,B), (B,D), (A,B), (A,C), (D,C), (B,C), (E,D). We get following distances when all edges are processed first time. The first row in shows initial distances. The second row shows distances when edges (B,E), (D,B), (B,D) and (A,B) are processed. The third row shows distances when (A,C) is processed. The fourth row shows when (D,C), (B,C) and (E,D) are processed." +
                "\n");

        ImageView iv1 = (ImageView) findViewById(R.id.bellman3);
        iv1.setImageResource(R.drawable.bellman3);

        TextView text2 = (TextView) findViewById(R.id.bellman4);
        text2.setText("The first iteration guarantees to give all shortest paths which are at most 1 edge long. We get following distances when all edges are processed second time (The last row shows final values)." +
                "\n");

        ImageView iv2 = (ImageView) findViewById(R.id.bellman5);
        iv2.setImageResource(R.drawable.bellman5);

        TextView text3 = (TextView) findViewById(R.id.bellman6);
        text3.setText("The second iteration guarantees to give all shortest paths which are at most 2 edges long. The algorithm processes all edges 2 more times. The distances are minimized after the second iteration, so third and fourth iterations don’t update the distances." +
                "\nImplementation:" +
                "\n// A C / C++ program for Bellman-Ford's single source \n" +
                "// shortest path algorithm.\n" +
                " \n" +
                "#include <stdio.h>\n" +
                "#include <stdlib.h>\n" +
                "#include <string.h>\n" +
                "#include <limits.h>\n" +
                " \n" +
                "// a structure to represent a weighted edge in graph\n" +
                "struct Edge\n" +
                "{\n" +
                "    int src, dest, weight;\n" +
                "};\n" +
                " \n" +
                "// a structure to represent a connected, directed and \n" +
                "// weighted graph\n" +
                "struct Graph\n" +
                "{\n" +
                "    // V-> Number of vertices, E-> Number of edges\n" +
                "    int V, E;\n" +
                " \n" +
                "    // graph is represented as an array of edges.\n" +
                "    struct Edge* edge;\n" +
                "};\n" +
                " \n" +
                "// Creates a graph with V vertices and E edges\n" +
                "struct Graph* createGraph(int V, int E)\n" +
                "{\n" +
                "    struct Graph* graph = \n" +
                "         (struct Graph*) malloc( sizeof(struct Graph) );\n" +
                "    graph->V = V;\n" +
                "    graph->E = E;\n" +
                " \n" +
                "    graph->edge = \n" +
                "       (struct Edge*) malloc( graph->E * sizeof( struct Edge ) );\n" +
                " \n" +
                "    return graph;\n" +
                "}\n" +
                " \n" +
                "// A utility function used to print the solution\n" +
                "void printArr(int dist[], int n)\n" +
                "{\n" +
                "    printf(\"Vertex   Distance from Source\\n\");\n" +
                "    for (int i = 0; i < n; ++i)\n" +
                "        printf(\"%d \\t\\t %d\\n\", i, dist[i]);\n" +
                "}\n" +
                " \n" +
                "// The main function that finds shortest distances from src to\n" +
                "// all other vertices using Bellman-Ford algorithm.  The function\n" +
                "// also detects negative weight cycle\n" +
                "void BellmanFord(struct Graph* graph, int src)\n" +
                "{\n" +
                "    int V = graph->V;\n" +
                "    int E = graph->E;\n" +
                "    int dist[V];\n" +
                " \n" +
                "    // Step 1: Initialize distances from src to all other vertices\n" +
                "    // as INFINITE\n" +
                "    for (int i = 0; i < V; i++)\n" +
                "        dist[i]   = INT_MAX;\n" +
                "    dist[src] = 0;\n" +
                " \n" +
                "    // Step 2: Relax all edges |V| - 1 times. A simple shortest \n" +
                "    // path from src to any other vertex can have at-most |V| - 1 \n" +
                "    // edges\n" +
                "    for (int i = 1; i <= V-1; i++)\n" +
                "    {\n" +
                "        for (int j = 0; j < E; j++)\n" +
                "        {\n" +
                "            int u = graph->edge[j].src;\n" +
                "            int v = graph->edge[j].dest;\n" +
                "            int weight = graph->edge[j].weight;\n" +
                "            if (dist[u] != INT_MAX && dist[u] + weight < dist[v])\n" +
                "                dist[v] = dist[u] + weight;\n" +
                "        }\n" +
                "    }\n" +
                " \n" +
                "    // Step 3: check for negative-weight cycles.  The above step \n" +
                "    // guarantees shortest distances if graph doesn't contain \n" +
                "    // negative weight cycle.  If we get a shorter path, then there\n" +
                "    // is a cycle.\n" +
                "    for (int i = 0; i < E; i++)\n" +
                "    {\n" +
                "        int u = graph->edge[i].src;\n" +
                "        int v = graph->edge[i].dest;\n" +
                "        int weight = graph->edge[i].weight;\n" +
                "        if (dist[u] != INT_MAX && dist[u] + weight < dist[v])\n" +
                "            printf(\"Graph contains negative weight cycle\");\n" +
                "    }\n" +
                " \n" +
                "    printArr(dist, V);\n" +
                " \n" +
                "    return;\n" +
                "}\n" +
                " \n" +
                "// Driver program to test above functions\n" +
                "int main()\n" +
                "{\n" +
                "    /* Let us create the graph given in above example */\n" +
                "    int V = 5;  // Number of vertices in graph\n" +
                "    int E = 8;  // Number of edges in graph\n" +
                "    struct Graph* graph = createGraph(V, E);\n" +
                " \n" +
                "    // add edge 0-1 (or A-B in above figure)\n" +
                "    graph->edge[0].src = 0;\n" +
                "    graph->edge[0].dest = 1;\n" +
                "    graph->edge[0].weight = -1;\n" +
                " \n" +
                "    // add edge 0-2 (or A-C in above figure)\n" +
                "    graph->edge[1].src = 0;\n" +
                "    graph->edge[1].dest = 2;\n" +
                "    graph->edge[1].weight = 4;\n" +
                " \n" +
                "    // add edge 1-2 (or B-C in above figure)\n" +
                "    graph->edge[2].src = 1;\n" +
                "    graph->edge[2].dest = 2;\n" +
                "    graph->edge[2].weight = 3;\n" +
                " \n" +
                "    // add edge 1-3 (or B-D in above figure)\n" +
                "    graph->edge[3].src = 1;\n" +
                "    graph->edge[3].dest = 3;\n" +
                "    graph->edge[3].weight = 2;\n" +
                " \n" +
                "    // add edge 1-4 (or A-E in above figure)\n" +
                "    graph->edge[4].src = 1;\n" +
                "    graph->edge[4].dest = 4;\n" +
                "    graph->edge[4].weight = 2;\n" +
                " \n" +
                "    // add edge 3-2 (or D-C in above figure)\n" +
                "    graph->edge[5].src = 3;\n" +
                "    graph->edge[5].dest = 2;\n" +
                "    graph->edge[5].weight = 5;\n" +
                " \n" +
                "    // add edge 3-1 (or D-B in above figure)\n" +
                "    graph->edge[6].src = 3;\n" +
                "    graph->edge[6].dest = 1;\n" +
                "    graph->edge[6].weight = 1;\n" +
                " \n" +
                "    // add edge 4-3 (or E-D in above figure)\n" +
                "    graph->edge[7].src = 4;\n" +
                "    graph->edge[7].dest = 3;\n" +
                "    graph->edge[7].weight = -3;\n" +
                " \n" +
                "    BellmanFord(graph, 0);\n" +
                " \n" +
                "    return 0;\n" +
                "}" +
                "\n\nOutput:\n" +
                "Vertex   Distance from Source\n" +
                "0                0\n" +
                "1                -1\n" +
                "2                2\n" +
                "3                -2\n" +
                "4                1");

    }
}
