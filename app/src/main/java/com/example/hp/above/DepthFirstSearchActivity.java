package com.example.hp.above;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class DepthFirstSearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_depth_first_search);
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
    public void dfs_code(View view) {
        TextView tv = (TextView) findViewById(R.id.dfs_code);
        tv.setText("// C++ program to print DFS traversal from a given vertex in a  given graph\n" +
                "#include<iostream>\n" +
                "#include        <list>\n" +
                " \n" +
                "using namespace std;\n" +
                " \n" +
                "// Graph class represents a directed graph using adjacency list representation\n" +
                "class Graph\n" +
                "{\n" +
                "    int V;    // No. of vertices\n" +
                "    list<int> *adj;    // Pointer to an array containing adjacency lists\n" +
                "    void DFSUtil(int v, bool visited[]);  // A function used by DFS\n" +
                "public:\n" +
                "    Graph(int V);   // Constructor\n" +
                "    void addEdge(int v, int w);   // function to add an edge to graph\n" +
                "    void DFS(int v);    // DFS traversal of the vertices reachable from v\n" +
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
                "void Graph::DFSUtil(int v, bool visited[])\n" +
                "{\n" +
                "    // Mark the current node as visited and print it\n" +
                "    visited[v] = true;\n" +
                "    cout << v << \" \";\n" +
                " \n" +
                "    // Recur for all the vertices adjacent to this vertex\n" +
                "    list<int>::iterator i;\n" +
                "    for (i = adj[v].begin(); i != adj[v].end(); ++i)\n" +
                "        if (!visited[*i])\n" +
                "            DFSUtil(*i, visited);\n" +
                "}\n" +
                " \n" +
                "// DFS traversal of the vertices reachable from v. It uses recursive DFSUtil()\n" +
                "void Graph::DFS(int v)\n" +
                "{\n" +
                "    // Mark all the vertices as not visited\n" +
                "    bool *visited = new bool[V];\n" +
                "    for (int i = 0; i < V; i++)\n" +
                "        visited[i] = false;\n" +
                " \n" +
                "    // Call the recursive helper function to print DFS traversal\n" +
                "    DFSUtil(v, visited);\n" +
                "}\n" +
                " \n" +
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
                "    cout << \"Following is Depth First Traversal (starting from vertex 2) \\n\";\n" +
                "    g.DFS(2);\n" +
                " \n" +
                "    return 0;\n" +
                "}" +
                "\n\nOutput:\n" +
                "Following is Depth First Traversal (starting from vertex 2)\n" +
                "2 0 1 3" +
                "\n\n" +
                "Note that the above code traverses only the vertices reachable from a given source vertex. All the vertices may not be reachable from a given vertex (example Disconnected graph). To do complete DFS traversal of such graphs, we must call DFSUtil() for every vertex. Also, before calling DFSUtil(), we should check if it is already printed by some other call of DFSUtil(). Following implementation does the complete graph traversal even if the nodes are unreachable. The differences from the above code are highlighted in the below code." +
                "\n\n// C++ program to print DFS traversal for a given given graph\n" +
                "#include<iostream>\n" +
                "#include        <list>\n" +
                "using namespace std;\n" +
                " \n" +
                "class Graph\n" +
                "{\n" +
                "    int V;    // No. of vertices\n" +
                "    list<int> *adj;    // Pointer to an array containing adjacency lists\n" +
                "    void DFSUtil(int v, bool visited[]);  // A function used by DFS\n" +
                "public:\n" +
                "    Graph(int V);   // Constructor\n" +
                "    void addEdge(int v, int w);   // function to add an edge to graph\n" +
                "    void DFS();    // prints DFS traversal of the complete graph\n" +
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
                "void Graph::DFSUtil(int v, bool visited[])\n" +
                "{\n" +
                "    // Mark the current node as visited and print it\n" +
                "    visited[v] = true;\n" +
                "    cout << v << \" \";\n" +
                " \n" +
                "    // Recur for all the vertices adjacent to this vertex\n" +
                "    list<int>::iterator i;\n" +
                "    for(i = adj[v].begin(); i != adj[v].end(); ++i)\n" +
                "        if(!visited[*i])\n" +
                "            DFSUtil(*i, visited);\n" +
                "}\n" +
                " \n" +
                "// The function to do DFS traversal. It uses recursive DFSUtil()\n" +
                "void Graph::DFS()\n" +
                "{\n" +
                "    // Mark all the vertices as not visited\n" +
                "    bool *visited = new bool[V];\n" +
                "    for (int i = 0; i < V; i++)\n" +
                "        visited[i] = false;\n" +
                " \n" +
                "    // Call the recursive helper function to print DFS traversal\n" +
                "    // starting from all vertices one by one\n" +
                "    for (int i = 0; i < V; i++)\n" +
                "        if (visited[i] == false)\n" +
                "            DFSUtil(i, visited);\n" +
                "}\n" +
                " \n" +
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
                "    cout << \"Following is Depth First Traversal\\n\";\n" +
                "    g.DFS();\n" +
                " \n" +
                "    return 0;\n" +
                "}" +
                "\n\nOutput:\n" +
                "Following is Depth First Traversal\n" +
                "0 1 2 3\n" +
                "\nTime Complexity: O(V+E) where V is number of vertices in the graph and E is number of edges in the graph");
    }
}
