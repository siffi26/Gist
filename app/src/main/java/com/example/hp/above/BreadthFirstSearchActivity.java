package com.example.hp.above;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class BreadthFirstSearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breadth_first_search);
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
    public void bfs_code(View view) {
        TextView tv = (TextView) findViewById(R.id.bfs_code);
        tv.setText("// Program to print BFS traversal from a given source vertex. BFS(int s) \n" +
                "// traverses vertices reachable from s.\n" +
                "#include<iostream>\n" +
                "#include <list>\n" +
                " \n" +
                "using namespace std;\n" +
                " \n" +
                "// This class represents a directed graph using adjacency list representation\n" +
                "class Graph\n" +
                "{\n" +
                "    int V;    // No. of vertices\n" +
                "    list<int> *adj;    // Pointer to an array containing adjacency lists\n" +
                "public:\n" +
                "    Graph(int V);  // Constructor\n" +
                "    void addEdge(int v, int w); // function to add an edge to graph\n" +
                "    void BFS(int s);  // prints BFS traversal from a given source s\n" +
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
                "    adj[v].push_back(w); // Add w to v’s list.\n" +
                "}\n" +
                " \n" +
                "void Graph::BFS(int s)\n" +
                "{\n" +
                "    // Mark all the vertices as not visited\n" +
                "    bool *visited = new bool[V];\n" +
                "    for(int i = 0; i < V; i++)\n" +
                "        visited[i] = false;\n" +
                " \n" +
                "    // Create a queue for BFS\n" +
                "    list<int> queue;\n" +
                " \n" +
                "    // Mark the current node as visited and enqueue it\n" +
                "    visited[s] = true;\n" +
                "    queue.push_back(s);\n" +
                " \n" +
                "    // 'i' will be used to get all adjacent vertices of a vertex\n" +
                "    list<int>::iterator i;\n" +
                " \n" +
                "    while(!queue.empty())\n" +
                "    {\n" +
                "        // Dequeue a vertex from queue and print it\n" +
                "        s = queue.front();\n" +
                "        cout << s << \" \";\n" +
                "        queue.pop_front();\n" +
                " \n" +
                "        // Get all adjacent vertices of the dequeued vertex s\n" +
                "        // If a adjacent has not been visited, then mark it visited\n" +
                "        // and enqueue it\n" +
                "        for(i = adj[s].begin(); i != adj[s].end(); ++i)\n" +
                "        {\n" +
                "            if(!visited[*i])\n" +
                "            {\n" +
                "                visited[*i] = true;\n" +
                "                queue.push_back(*i);\n" +
                "            }\n" +
                "        }\n" +
                "    }\n" +
                "}\n" +
                " \n" +
                "// Driver program to test methods of graph class\n" +
                "int main()\n" +
                "{\n" +
                "    // Create a graph given in the above diagram\n" +
                "    Graph g(4);\n" +
                "    g.addEdge(0, 1);\n" +
                "    g.addEdge(0, 2);\n" +
                "    g.addEdge(1, 2);\n" +
                "    g.addEdge(2, 0);\n" +
                "    g.addEdge(2, 3);\n" +
                "    g.addEdge(3, 3);\n" +
                " \n" +
                "    cout << \"Following is Breadth First Traversal (starting from vertex 2) \\n\";\n" +
                "    g.BFS(2);\n" +
                " \n" +
                "    return 0;\n" +
                "}" +
                "\n\nOutput:\n" +
                "Following is Breadth First Traversal (starting from vertex 2)\n" +
                "2 0 3 1" +
                "\nTime Complexity: O(V+E) where V is number of vertices in the graph and E is number of edges in the graph.");
    }
}
