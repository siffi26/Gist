package com.example.hp.above;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class KruskalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kruskal);
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
    public void kruskal_code(View view) {
        TextView tv = (TextView) findViewById(R.id.kruskal_code);
        tv.setText("// C++ program for Kruskal's algorithm to find Minimum Spanning Tree\n" +
                "// of a given connected, undirected and weighted graph\n" +
                "#include <stdio.h>\n" +
                "#include <stdlib.h>\n" +
                "#include <string.h>\n" +
                " \n" +
                "// a structure to represent a weighted edge in graph\n" +
                "struct Edge\n" +
                "{\n" +
                "    int src, dest, weight;\n" +
                "};\n" +
                " \n" +
                "// a structure to represent a connected, undirected and weighted graph\n" +
                "struct Graph\n" +
                "{\n" +
                "    // V-> Number of vertices, E-> Number of edges\n" +
                "    int V, E;\n" +
                " \n" +
                "    // graph is represented as an array of edges. Since the graph is\n" +
                "    // undirected, the edge from src to dest is also edge from dest\n" +
                "    // to src. Both are counted as 1 edge here.\n" +
                "    struct Edge* edge;\n" +
                "};\n" +
                " \n" +
                "// Creates a graph with V vertices and E edges\n" +
                "struct Graph* createGraph(int V, int E)\n" +
                "{\n" +
                "    struct Graph* graph = (struct Graph*) malloc( sizeof(struct Graph) );\n" +
                "    graph->V = V;\n" +
                "    graph->E = E;\n" +
                " \n" +
                "    graph->edge = (struct Edge*) malloc( graph->E * sizeof( struct Edge ) );\n" +
                " \n" +
                "    return graph;\n" +
                "}\n" +
                " \n" +
                "// A structure to represent a subset for union-find\n" +
                "struct subset\n" +
                "{\n" +
                "    int parent;\n" +
                "    int rank;\n" +
                "};\n" +
                " \n" +
                "// A utility function to find set of an element i\n" +
                "// (uses path compression technique)\n" +
                "int find(struct subset subsets[], int i)\n" +
                "{\n" +
                "    // find root and make root as parent of i (path compression)\n" +
                "    if (subsets[i].parent != i)\n" +
                "        subsets[i].parent = find(subsets, subsets[i].parent);\n" +
                " \n" +
                "    return subsets[i].parent;\n" +
                "}\n" +
                " \n" +
                "// A function that does union of two sets of x and y\n" +
                "// (uses union by rank)\n" +
                "void Union(struct subset subsets[], int x, int y)\n" +
                "{\n" +
                "    int xroot = find(subsets, x);\n" +
                "    int yroot = find(subsets, y);\n" +
                " \n" +
                "    // Attach smaller rank tree under root of high rank tree\n" +
                "    // (Union by Rank)\n" +
                "    if (subsets[xroot].rank < subsets[yroot].rank)\n" +
                "        subsets[xroot].parent = yroot;\n" +
                "    else if (subsets[xroot].rank > subsets[yroot].rank)\n" +
                "        subsets[yroot].parent = xroot;\n" +
                " \n" +
                "    // If ranks are same, then make one as root and increment\n" +
                "    // its rank by one\n" +
                "    else\n" +
                "    {\n" +
                "        subsets[yroot].parent = xroot;\n" +
                "        subsets[xroot].rank++;\n" +
                "    }\n" +
                "}\n" +
                " \n" +
                "// Compare two edges according to their weights.\n" +
                "// Used in qsort() for sorting an array of edges\n" +
                "int myComp(const void* a, const void* b)\n" +
                "{\n" +
                "    struct Edge* a1 = (struct Edge*)a;\n" +
                "    struct Edge* b1 = (struct Edge*)b;\n" +
                "    return a1->weight > b1->weight;\n" +
                "}\n" +
                " \n" +
                "// The main function to construct MST using Kruskal's algorithm\n" +
                "void KruskalMST(struct Graph* graph)\n" +
                "{\n" +
                "    int V = graph->V;\n" +
                "    struct Edge result[V];  // Tnis will store the resultant MST\n" +
                "    int e = 0;  // An index variable, used for result[]\n" +
                "    int i = 0;  // An index variable, used for sorted edges\n" +
                " \n" +
                "    // Step 1:  Sort all the edges in non-decreasing order of their weight\n" +
                "    // If we are not allowed to change the given graph, we can create a copy of\n" +
                "    // array of edges\n" +
                "    qsort(graph->edge, graph->E, sizeof(graph->edge[0]), myComp);\n" +
                " \n" +
                "    // Allocate memory for creating V ssubsets\n" +
                "    struct subset *subsets =\n" +
                "        (struct subset*) malloc( V * sizeof(struct subset) );\n" +
                " \n" +
                "    // Create V subsets with single elements\n" +
                "    for (int v = 0; v < V; ++v)\n" +
                "    {\n" +
                "        subsets[v].parent = v;\n" +
                "        subsets[v].rank = 0;\n" +
                "    }\n" +
                " \n" +
                "    // Number of edges to be taken is equal to V-1\n" +
                "    while (e < V - 1)\n" +
                "    {\n" +
                "        // Step 2: Pick the smallest edge. And increment the index\n" +
                "        // for next iteration\n" +
                "        struct Edge next_edge = graph->edge[i++];\n" +
                " \n" +
                "        int x = find(subsets, next_edge.src);\n" +
                "        int y = find(subsets, next_edge.dest);\n" +
                " \n" +
                "        // If including this edge does't cause cycle, include it\n" +
                "        // in result and increment the index of result for next edge\n" +
                "        if (x != y)\n" +
                "        {\n" +
                "            result[e++] = next_edge;\n" +
                "            Union(subsets, x, y);\n" +
                "        }\n" +
                "        // Else discard the next_edge\n" +
                "    }\n" +
                " \n" +
                "    // print the contents of result[] to display the built MST\n" +
                "    printf(\"Following are the edges in the constructed MST\\n\");\n" +
                "    for (i = 0; i < e; ++i)\n" +
                "        printf(\"%d -- %d == %d\\n\", result[i].src, result[i].dest,\n" +
                "                                                   result[i].weight);\n" +
                "    return;\n" +
                "}\n" +
                " \n" +
                "// Driver program to test above functions\n" +
                "int main()\n" +
                "{\n" +
                "    /* Let us create following weighted graph\n" +
                "             10\n" +
                "        0--------1\n" +
                "        |  \\     |\n" +
                "       6|   5\\   |15\n" +
                "        |      \\ |\n" +
                "        2--------3\n" +
                "            4       */\n" +
                "    int V = 4;  // Number of vertices in graph\n" +
                "    int E = 5;  // Number of edges in graph\n" +
                "    struct Graph* graph = createGraph(V, E);\n" +
                " \n" +
                " \n" +
                "    // add edge 0-1\n" +
                "    graph->edge[0].src = 0;\n" +
                "    graph->edge[0].dest = 1;\n" +
                "    graph->edge[0].weight = 10;\n" +
                " \n" +
                "    // add edge 0-2\n" +
                "    graph->edge[1].src = 0;\n" +
                "    graph->edge[1].dest = 2;\n" +
                "    graph->edge[1].weight = 6;\n" +
                " \n" +
                "    // add edge 0-3\n" +
                "    graph->edge[2].src = 0;\n" +
                "    graph->edge[2].dest = 3;\n" +
                "    graph->edge[2].weight = 5;\n" +
                " \n" +
                "    // add edge 1-3\n" +
                "    graph->edge[3].src = 1;\n" +
                "    graph->edge[3].dest = 3;\n" +
                "    graph->edge[3].weight = 15;\n" +
                " \n" +
                "    // add edge 2-3\n" +
                "    graph->edge[4].src = 2;\n" +
                "    graph->edge[4].dest = 3;\n" +
                "    graph->edge[4].weight = 4;\n" +
                " \n" +
                "    KruskalMST(graph);\n" +
                " \n" +
                "    return 0;\n" +
                "}" +
                "\n\nFollowing are the edges in the constructed MST\n" +
                "2 -- 3 == 4\n" +
                "0 -- 3 == 5\n" +
                "0 -- 1 == 10\n" +
                "Time Complexity: O(ElogE) or O(ElogV). Sorting of edges takes O(ELogE) time. After sorting, we iterate through all edges and apply find-union algorithm. The find and union operations can take atmost O(LogV) time. So overall complexity is O(ELogE + ELogV) time. The value of E can be atmost V^2, so O(LogV) are O(LogE) same. Therefore, overall time complexity is O(ElogE) or O(ElogV)" +
                "\n");
    }
}
