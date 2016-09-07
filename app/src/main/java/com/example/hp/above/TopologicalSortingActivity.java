package com.example.hp.above;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class TopologicalSortingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topological_sorting);
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
    public void topological_code(View view) {
        TextView tv = (TextView) findViewById(R.id.topological_code);
        tv.setText("// A C++ program to print topological sorting of a DAG\n" +
                "#include<iostream>\n" +
                "#include <list>\n" +
                "#include <stack>\n" +
                "using namespace std;\n" +
                " \n" +
                "// Class to represent a graph\n" +
                "class Graph\n" +
                "{\n" +
                "    int V;    // No. of vertices'\n" +
                " \n" +
                "    // Pointer to an array containing adjacency listsList\n" +
                "    list<int> *adj;\n" +
                " \n" +
                "    // A function used by topologicalSort\n" +
                "    void topologicalSortUtil(int v, bool visited[], stack<int> &Stack);\n" +
                "public:\n" +
                "    Graph(int V);   // Constructor\n" +
                " \n" +
                "     // function to add an edge to graph\n" +
                "    void addEdge(int v, int w);\n" +
                " \n" +
                "    // prints a Topological Sort of the complete graph\n" +
                "    void topologicalSort();\n" +
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
                "// A recursive function used by topologicalSort\n" +
                "void Graph::topologicalSortUtil(int v, bool visited[], \n" +
                "                                stack<int> &Stack)\n" +
                "{\n" +
                "    // Mark the current node as visited.\n" +
                "    visited[v] = true;\n" +
                " \n" +
                "    // Recur for all the vertices adjacent to this vertex\n" +
                "    list<int>::iterator i;\n" +
                "    for (i = adj[v].begin(); i != adj[v].end(); ++i)\n" +
                "        if (!visited[*i])\n" +
                "            topologicalSortUtil(*i, visited, Stack);\n" +
                " \n" +
                "    // Push current vertex to stack which stores result\n" +
                "    Stack.push(v);\n" +
                "}\n" +
                " \n" +
                "// The function to do Topological Sort. It uses recursive \n" +
                "// topologicalSortUtil()\n" +
                "void Graph::topologicalSort()\n" +
                "{\n" +
                "    stack<int> Stack;\n" +
                " \n" +
                "    // Mark all the vertices as not visited\n" +
                "    bool *visited = new bool[V];\n" +
                "    for (int i = 0; i < V; i++)\n" +
                "        visited[i] = false;\n" +
                " \n" +
                "    // Call the recursive helper function to store Topological\n" +
                "    // Sort starting from all vertices one by one\n" +
                "    for (int i = 0; i < V; i++)\n" +
                "      if (visited[i] == false)\n" +
                "        topologicalSortUtil(i, visited, Stack);\n" +
                " \n" +
                "    // Print contents of stack\n" +
                "    while (Stack.empty() == false)\n" +
                "    {\n" +
                "        cout << Stack.top() << \" \";\n" +
                "        Stack.pop();\n" +
                "    }\n" +
                "}\n" +
                " \n" +
                "// Driver program to test above functions\n" +
                "int main()\n" +
                "{\n" +
                "    // Create a graph given in the above diagram\n" +
                "    Graph g(6);\n" +
                "    g.addEdge(5, 2);\n" +
                "    g.addEdge(5, 0);\n" +
                "    g.addEdge(4, 0);\n" +
                "    g.addEdge(4, 1);\n" +
                "    g.addEdge(2, 3);\n" +
                "    g.addEdge(3, 1);\n" +
                " \n" +
                "    cout << \"Following is a Topological Sort of the given graph \\n\";\n" +
                "    g.topologicalSort();\n" +
                " \n" +
                "    return 0;\n" +
                "}" +
                "\n\nOutput:\n" +
                "Following is a Topological Sort of the given graph\n" +
                "5 4 2 3 1 0\n" +
                "Time Complexity: The above algorithm is simply DFS with an extra stack. So time complexity is same as DFS which is O(V+E).\n" +
                "\n" +
                "Applications:\n" +
                "Topological Sorting is mainly used for scheduling jobs from the given dependencies among jobs. In computer science, applications of this type arise in instruction scheduling, ordering of formula cell evaluation when recomputing formula values in spreadsheets, logic synthesis, determining the order of compilation tasks to perform in makefiles, data serialization, and resolving symbol dependencies in linkers " +
                "");
    }
}
