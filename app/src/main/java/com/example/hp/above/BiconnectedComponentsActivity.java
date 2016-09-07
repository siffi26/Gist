package com.example.hp.above;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class BiconnectedComponentsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biconnected_components);
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
    public void biconnected_code(View view) {
        TextView tv = (TextView) findViewById(R.id.biconnected_code);
        tv.setText("\n\n// A C++ program to find if a given undirected graph is\n" +
                "\n\n// biconnected\n" +
                "#include<iostream>\n" +
                "#include <list>\n" +
                "#define NIL -1\n" +
                "using namespace std;\n" +
                " \n" +
                "// A class that represents an undirected graph\n" +
                "class Graph\n" +
                "{\n" +
                "    int V;    // No. of vertices\n" +
                "    list<int> *adj;    // A dynamic array of adjacency lists\n" +
                "    bool isBCUtil(int v, bool visited[], int disc[], int low[],\n" +
                "                 int parent[]);\n" +
                "public:\n" +
                "    Graph(int V);   // Constructor\n" +
                "    void addEdge(int v, int w); // to add an edge to graph\n" +
                "    bool isBC();    // returns true if graph is Biconnected\n" +
                "};\n" +
                " \n" +
                "Graph::Graph(int V)\n" +
                "{\n" +
                "    this->V = V;\n" +
                "    adj = new list<int>[V];\n" +
                "}\n" +
                " \n" +
                "void Graph::addEdge(int v, int w)\n" +
                "{\n" +
                "    adj[v].push_back(w);\n" +
                "    adj[w].push_back(v);  // Note: the graph is undirected\n" +
                "}\n" +
                " \n" +
                "// A recursive function that returns true if there is an articulation\n" +
                "// point in given graph, otherwise returns false.\n" +
                "// This function is almost same as isAPUtil() here ( http://goo.gl/Me9Fw )\n" +
                "// u --> The vertex to be visited next\n" +
                "// visited[] --> keeps tract of visited vertices\n" +
                "// disc[] --> Stores discovery times of visited vertices\n" +
                "// parent[] --> Stores parent vertices in DFS tree\n" +
                "bool Graph::isBCUtil(int u, bool visited[], int disc[],int low[],int parent[])\n" +
                "{\n" +
                "    // A static variable is used for simplicity, we can avoid use of static\n" +
                "    // variable by passing a pointer.\n" +
                "    static int time = 0;\n" +
                " \n" +
                "    // Count of children in DFS Tree\n" +
                "    int children = 0;\n" +
                " \n" +
                "    // Mark the current node as visited\n" +
                "    visited[u] = true;\n" +
                " \n" +
                "    // Initialize discovery time and low value\n" +
                "    disc[u] = low[u] = ++time;\n" +
                " \n" +
                "    // Go through all vertices aadjacent to this\n" +
                "    list<int>::iterator i;\n" +
                "    for (i = adj[u].begin(); i != adj[u].end(); ++i)\n" +
                "    {\n" +
                "        int v = *i;  // v is current adjacent of u\n" +
                " \n" +
                "        // If v is not visited yet, then make it a child of u\n" +
                "        // in DFS tree and recur for it\n" +
                "        if (!visited[v])\n" +
                "        {\n" +
                "            children++;\n" +
                "            parent[v] = u;\n" +
                " \n" +
                "            // check if subgraph rooted with v has an articulation point\n" +
                "            if (isBCUtil(v, visited, disc, low, parent))\n" +
                "               return true;\n" +
                " \n" +
                "            // Check if the subtree rooted with v has a connection to\n" +
                "            // one of the ancestors of u\n" +
                "            low[u]  = min(low[u], low[v]);\n" +
                " \n" +
                "            // u is an articulation point in following cases\n" +
                " \n" +
                "            // (1) u is root of DFS tree and has two or more chilren.\n" +
                "            if (parent[u] == NIL && children > 1)\n" +
                "               return true;\n" +
                " \n" +
                "            // (2) If u is not root and low value of one of its child is\n" +
                "            // more than discovery value of u.\n" +
                "            if (parent[u] != NIL && low[v] >= disc[u])\n" +
                "               return true;\n" +
                "        }\n" +
                " \n" +
                "        // Update low value of u for parent function calls.\n" +
                "        else if (v != parent[u])\n" +
                "            low[u]  = min(low[u], disc[v]);\n" +
                "    }\n" +
                "    return false;\n" +
                "}\n" +
                " \n" +
                "// The main function that returns true if graph is Biconnected, \n" +
                "// otherwise false. It uses recursive function isBCUtil()\n" +
                "bool Graph::isBC()\n" +
                "{\n" +
                "    // Mark all the vertices as not visited\n" +
                "    bool *visited = new bool[V];\n" +
                "    int *disc = new int[V];\n" +
                "    int *low = new int[V];\n" +
                "    int *parent = new int[V];\n" +
                " \n" +
                "    // Initialize parent and visited, and ap(articulation point) \n" +
                "    //  arrays\n" +
                "    for (int i = 0; i < V; i++)\n" +
                "    {\n" +
                "        parent[i] = NIL;\n" +
                "        visited[i] = false;\n" +
                "    }\n" +
                " \n" +
                "    // Call the recursive helper function to find if there is an articulation \n" +
                "    // point in given graph. We do DFS traversal starring from vertex 0\n" +
                "    if (isBCUtil(0, visited, disc, low, parent) == true)\n" +
                "        return false;\n" +
                " \n" +
                "    // Now check whether the given graph is connected or not. An undirected\n" +
                "    // graph is connected if all vertices are reachable from any starting \n" +
                "    // point (we have taken 0 as starting point)\n" +
                "    for (int i = 0; i < V; i++)\n" +
                "        if (visited[i] == false)\n" +
                "            return false;\n" +
                " \n" +
                "    return true;\n" +
                "}\n" +
                " \n" +
                "// Driver program to test above function\n" +
                "int main()\n" +
                "{\n" +
                "    // Create graphs given in above diagrams\n" +
                "    Graph g1(2);\n" +
                "    g1.addEdge(0, 1);\n" +
                "    g1.isBC()? cout << \"Yes\\n\" : cout << \"No\\n\";\n" +
                " \n" +
                "    Graph g2(5);\n" +
                "    g2.addEdge(1, 0);\n" +
                "    g2.addEdge(0, 2);\n" +
                "    g2.addEdge(2, 1);\n" +
                "    g2.addEdge(0, 3);\n" +
                "    g2.addEdge(3, 4);\n" +
                "    g2.addEdge(2, 4);\n" +
                "    g2.isBC()? cout << \"Yes\\n\" : cout << \"No\\n\";\n" +
                " \n" +
                "    Graph g3(3);\n" +
                "    g3.addEdge(0, 1);\n" +
                "    g3.addEdge(1, 2);\n" +
                "    g3.isBC()? cout << \"Yes\\n\" : cout << \"No\\n\";\n" +
                " \n" +
                "    Graph g4(5);\n" +
                "    g4.addEdge(1, 0);\n" +
                "    g4.addEdge(0, 2);\n" +
                "    g4.addEdge(2, 1);\n" +
                "    g4.addEdge(0, 3);\n" +
                "    g4.addEdge(3, 4);\n" +
                "    g4.isBC()? cout << \"Yes\\n\" : cout << \"No\\n\";\n" +
                " \n" +
                "    Graph g5(3);\n" +
                "    g5.addEdge(0, 1);\n" +
                "    g5.addEdge(1, 2);\n" +
                "    g5.addEdge(2, 0);\n" +
                "    g5.isBC()? cout << \"Yes\\n\" : cout << \"No\\n\";\n" +
                " \n" +
                "    return 0;\n" +
                "}" +
                "\n\n\nOutput:\n" +
                "Yes\n" +
                "Yes\n" +
                "No\n" +
                "No\n" +
                "Yes\n" +
                "\n\nTime Complexity: The above function is a simple DFS with additional arrays. So time complexity is same as DFS which is O(V+E) for adjacency list representation of graph." +
                "");
    }
}
