package com.example.hp.above;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class GraphActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graph);
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
    public void code_graph(View view)
    {
        TextView previewText = (TextView) findViewById(R.id.code_graph);
        previewText.setText("\n\nBelow is C code for adjacency list representation of an undirected graph:\n" +
                "// A C Program to demonstrate adjacency list representation of graphs\n" +
                " \n" +
                "#include <stdio.h>\n" +
                "#include <stdlib.h>\n" +
                " \n" +
                "// A structure to represent an adjacency list node\n" +
                "struct AdjListNode\n" +
                "{\n" +
                "    int dest;\n" +
                "    struct AdjListNode* next;\n" +
                "};\n" +
                " \n" +
                "// A structure to represent an adjacency list\n" +
                "struct AdjList\n" +
                "{\n" +
                "    struct AdjListNode *head;  // pointer to head node of list\n" +
                "};\n" +
                " \n" +
                "// A structure to represent a graph. A graph is an array of adjacency lists.\n" +
                "// Size of array will be V (number of vertices in graph)\n" +
                "struct Graph\n" +
                "{\n" +
                "    int V;\n" +
                "    struct AdjList* array;\n" +
                "};\n" +
                " \n" +
                "// A utility function to create a new adjacency list node\n" +
                "struct AdjListNode* newAdjListNode(int dest)\n" +
                "{\n" +
                "    struct AdjListNode* newNode =\n" +
                "            (struct AdjListNode*) malloc(sizeof(struct AdjListNode));\n" +
                "    newNode->dest = dest;\n" +
                "    newNode->next = NULL;\n" +
                "    return newNode;\n" +
                "}\n" +
                " \n" +
                "// A utility function that creates a graph of V vertices\n" +
                "struct Graph* createGraph(int V)\n" +
                "{\n" +
                "    struct Graph* graph = (struct Graph*) malloc(sizeof(struct Graph));\n" +
                "    graph->V = V;\n" +
                " \n" +
                "    // Create an array of adjacency lists.  Size of array will be V\n" +
                "    graph->array = (struct AdjList*) malloc(V * sizeof(struct AdjList));\n" +
                " \n" +
                "     // Initialize each adjacency list as empty by making head as NULL\n" +
                "    int i;\n" +
                "    for (i = 0; i < V; ++i)\n" +
                "        graph->array[i].head = NULL;\n" +
                " \n" +
                "    return graph;\n" +
                "}\n" +
                " \n" +
                "// Adds an edge to an undirected graph\n" +
                "void addEdge(struct Graph* graph, int src, int dest)\n" +
                "{\n" +
                "    // Add an edge from src to dest.  A new node is added to the adjacency\n" +
                "    // list of src.  The node is added at the begining\n" +
                "    struct AdjListNode* newNode = newAdjListNode(dest);\n" +
                "    newNode->next = graph->array[src].head;\n" +
                "    graph->array[src].head = newNode;\n" +
                " \n" +
                "    // Since graph is undirected, add an edge from dest to src also\n" +
                "    newNode = newAdjListNode(src);\n" +
                "    newNode->next = graph->array[dest].head;\n" +
                "    graph->array[dest].head = newNode;\n" +
                "}\n" +
                " \n" +
                "// A utility function to print the adjacenncy list representation of graph\n" +
                "void printGraph(struct Graph* graph)\n" +
                "{\n" +
                "    int v;\n" +
                "    for (v = 0; v < graph->V; ++v)\n" +
                "    {\n" +
                "        struct AdjListNode* pCrawl = graph->array[v].head;\n" +
                "        printf(\"\\n Adjacency list of vertex %d\\n head \", v);\n" +
                "        while (pCrawl)\n" +
                "        {\n" +
                "            printf(\"-> %d\", pCrawl->dest);\n" +
                "            pCrawl = pCrawl->next;\n" +
                "        }\n" +
                "        printf(\"\\n\");\n" +
                "    }\n" +
                "}\n" +
                " \n" +
                "// Driver program to test above functions\n" +
                "int main()\n" +
                "{\n" +
                "    // create the graph given in above fugure\n" +
                "    int V = 5;\n" +
                "    struct Graph* graph = createGraph(V);\n" +
                "    addEdge(graph, 0, 1);\n" +
                "    addEdge(graph, 0, 4);\n" +
                "    addEdge(graph, 1, 2);\n" +
                "    addEdge(graph, 1, 3);\n" +
                "    addEdge(graph, 1, 4);\n" +
                "    addEdge(graph, 2, 3);\n" +
                "    addEdge(graph, 3, 4);\n" +
                " \n" +
                "    // print the adjacency list representation of the above graph\n" +
                "    printGraph(graph);\n" +
                " \n" +
                "    return 0;\n" +
                "}\n" +
                "\n" +
                "\n" +
                "\n" +
                "\nOutput:\n" +
                " Adjacency list of vertex 0\n" +
                " head -> 4-> 1\n" +
                "\n" +
                " Adjacency list of vertex 1\n" +
                " head -> 4-> 3-> 2-> 0\n" +
                "\n" +
                " Adjacency list of vertex 2\n" +
                " head -> 3-> 1\n" +
                "\n" +
                " Adjacency list of vertex 3\n" +
                " head -> 4-> 2-> 1\n" +
                "\n" +
                " Adjacency list of vertex 4\n" +
                " head -> 3-> 1-> 0\n" +
                "\n" +
                "\n" +
                "Pros: Saves space O(|V|+|E|) . In the worst case, there can be C(V, 2) number of edges in a graph thus consuming O(V^2) space. Adding a vertex is easier.\n" +
                "\n" +
                "Cons: Queries like whether there is an edge from vertex u to vertex v are not efficient and can be done O(V).\n");

    }
    public void code_graph1(View view) {
        TextView previewText = (TextView) findViewById(R.id.code_graph1);
        previewText.setText("\n\n// Program to print BFS traversal from a given source vertex. BFS(int s) \n" +
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
                "}\n" +
                "\n" +
                "\n" +
                "\n" +
                "\nOutput:\n" +
                "\nFollowing is Breadth First Traversal (starting from vertex 2)\n" +
                "2 0 3 1\n\n\n" +
                "\nNote that the above code traverses only the vertices reachable from a given source vertex. All the vertices may not be reachable from a given vertex (example Disconnected graph). To print all the vertices, we can modify the BFS function to do traversal starting from all nodes one by one (Like the DFS modified version) .\n" +
                "\n\nTime Complexity: O(V+E) where V is number of vertices in the graph and E is number of edges in the graph.\n");
    }

    public void read_graph(View view)
    {
        TextView previewText=(TextView) findViewById(R.id.read_graph);
        previewText.setText("\n\nApplications of Depth First Search\n" +
                "\nDepth-first search (DFS) is an algorithm (or technique) for traversing a graph.\n" +
                "\nFollowing are the problems that use DFS as a building block.\n" +
                "\n1) For an unweighted graph, DFS traversal of the graph produces the minimum spanning tree and all pair shortest path tree.\n" +
                "\n2) Detecting cycle in a graph \n" +
                "\nA graph has cycle if and only if we see a back edge during DFS. So we can run DFS for the graph and check for back edges. \n" +
                "\n3) Path Finding\n" +
                "\nWe can specialize the DFS algorithm to find a path between two given vertices u and z.\n" +
                "\ni) Call DFS(G, u) with u as the start vertex.\n" +
                "\nii) Use a stack S to keep track of the path between the start vertex and the current vertex.\n" +
                "\niii) As soon as destination vertex z is encountered, return the path as the\n" +
                "\ncontents of the stack\n" +
                "\n4) Topological Sorting\n" +
                "\nTopological Sorting is mainly used for scheduling jobs from the given dependencies among jobs. In computer science, applications of this type arise in instruction scheduling, ordering of formula cell evaluation when recomputing formula values in spreadsheets, logic synthesis, determining the order of compilation tasks to perform in makefiles, data serialization, and resolving symbol dependencies in linkers .\n" +
                "\n5) To test if a graph is bipartite\n" +
                "\nWe can augment either BFS or DFS when we first discover a new vertex, color it opposited its parents, and for each other edge, check it doesn’t link two vertices of the same color. The first vertex in any connected component can be red or black! See this for details.\n" +
                "\n6) Finding Strongly Connected Components of a graph A directed graph is called strongly connected if there is a path from each vertex in the graph to every other vertex. \n" +
                "\n7) Solving puzzles with only one solution, such as mazes. (DFS can be adapted to find all solutions to a maze by only including nodes on the current path in the visited set.)\n" +
                "\n"+
                "\n" +
                "\nApplications of Breadth First Traversal\n" +
                "\nWe have earlier discussed Breadth First Traversal Algorithm for Graphs. \n" +
                "\n1) Shortest Path and Minimum Spanning Tree for unweighted graph In unweighted graph, the shortest path is the path with least number of edges. With Breadth First, we always reach a vertex from given source using minimum number of edges. Also, in case of unweighted graphs, any spanning tree is Minimum Spanning Tree and we can use either Depth or Breadth first traversal for finding a spanning tree.\n" +
                "\n2) Peer to Peer Networks. In Peer to Peer Networks like BitTorrent, Breadth First Search is used to find all neighbor nodes.\n" +
                "\n3) Crawlers in Search Engines: Crawlers build index using Breadth First. The idea is to start from source page and follow all links from source and keep doing same. Depth First Traversal can also be used for crawlers, but the advantage with Breadth First Traversal is, depth or levels of built tree can be limited.\n" +
                "\n4) Social Networking Websites: In social networks, we can find people within a given distance ‘k’ from a person using Breadth First Search till ‘k’ levels.\n" +
                "\n5) GPS Navigation systems: Breadth First Search is used to find all neighboring locations.\n" +
                "\n6) Broadcasting in Network: In networks, a broadcasted packet follows Breadth First Search to reach all nodes.\n" +
                "\n7) In Garbage Collection:  Breadth First Search is preferred over Depth First Search because of better locality of reference:\n" +
                "\n8) Cycle detection in undirected graph: In undirected graphs, either Breadth First Search or Depth First Search can be used to detect cycle. In directed graph, only depth first search can be used.\n" +
                "\n9) To test if a graph is Bipartite We can either use Breadth First or Depth First Traversal.\n" +
                "\n10) Path Finding We can either use Breadth First or Depth First Traversal to find if there is a path between two vertices.\n" +
                "\n11) Finding all nodes within one connected component: We can either use Breadth First or Depth First Traversal to find all nodes reachable from a given node.\n" +
                "\n\nMany algorithms like Prim’s Minimum Spanning Tree and Dijkstra’s Single Source Shortest Path use structure similar to Breadth First Search.\n" +
                "\n\nThere can be many more applications as Breadth First Search is one of the core algorithm for Graphs.\n");
    }
}
