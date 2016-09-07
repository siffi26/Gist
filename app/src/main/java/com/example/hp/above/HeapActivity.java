package com.example.hp.above;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class HeapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heap);
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
    public void heap_more(View view)
    {
        TextView previewText = (TextView) findViewById(R.id.heap_more);
        previewText.setText("\n\nFollowing is C++ implementation of basic heap operations.\n" +
                "\n\n// A C++ program to demonstrate common Binary Heap Operations\n" +
                "\n#include<iostream>\n" +
                "#include<climits>\n" +
                "using namespace std;\n" +
                " \n" +
                "// Prototype of a utility function to swap two integers\n" +
                "void swap(int *x, int *y);\n" +
                " \n" +
                "// A class for Min Heap\n" +
                "class MinHeap\n" +
                "{\n" +
                "    int *harr; // pointer to array of elements in heap\n" +
                "    int capacity; // maximum possible size of min heap\n" +
                "    int heap_size; // Current number of elements in min heap\n" +
                "public:\n" +
                "    // Constructor\n" +
                "    MinHeap(int capacity);\n" +
                " \n" +
                "    // to heapify a subtree with root at given index\n" +
                "    void MinHeapify(int );\n" +
                " \n" +
                "    int parent(int i) { return (i-1)/2; }\n" +
                " \n" +
                "    // to get index of left child of node at index i\n" +
                "    int left(int i) { return (2*i + 1); }\n" +
                " \n" +
                "    // to get index of right child of node at index i\n" +
                "    int right(int i) { return (2*i + 2); }\n" +
                " \n" +
                "    // to extract the root which is the minimum element\n" +
                "    int extractMin();\n" +
                " \n" +
                "    // Decreases key value of key at index i to new_val\n" +
                "    void decreaseKey(int i, int new_val);\n" +
                " \n" +
                "    // Returns the minimum key (key at root) from min heap\n" +
                "    int getMin() { return harr[0]; }\n" +
                " \n" +
                "    // Deletes a key stored at index i\n" +
                "    void deleteKey(int i);\n" +
                " \n" +
                "    // Inserts a new key 'k'\n" +
                "    void insertKey(int k);\n" +
                "};\n" +
                " \n" +
                "\n// Constructor: Builds a heap from a given array a[] of given size\n" +
                "MinHeap::MinHeap(int cap)\n" +
                "{\n" +
                "    heap_size = 0;\n" +
                "    capacity = cap;\n" +
                "    harr = new int[cap];\n" +
                "}\n" +
                " \n" +
                "// Inserts a new key 'k'\n" +
                "void MinHeap::insertKey(int k)\n" +
                "{\n" +
                "    if (heap_size == capacity)\n" +
                "    {\n" +
                "        cout << \"\\nOverflow: Could not insertKey\\n\";\n" +
                "        return;\n" +
                "    }\n" +
                " \n" +
                "    // First insert the new key at the end\n" +
                "    heap_size++;\n" +
                "    int i = heap_size - 1;\n" +
                "    harr[i] = k;\n" +
                " \n" +
                "    // Fix the min heap property if it is violated\n" +
                "    while (i != 0 && harr[parent(i)] > harr[i])\n" +
                "    {\n" +
                "       swap(&harr[i], &harr[parent(i)]);\n" +
                "       i = parent(i);\n" +
                "    }\n" +
                "}\n" +
                " \n" +
                "\n// Decreases value of key at index 'i' to new_val.  It is assumed that\n" +
                "// new_val is smaller than harr[i].\n" +
                "void MinHeap::decreaseKey(int i, int new_val)\n" +
                "{\n" +
                "    harr[i] = new_val;\n" +
                "    while (i != 0 && harr[parent(i)] > harr[i])\n" +
                "    {\n" +
                "       swap(&harr[i], &harr[parent(i)]);\n" +
                "       i = parent(i);\n" +
                "    }\n" +
                "}\n" +
                " \n" +
                "// Method to remove minimum element (or root) from min heap\n" +
                "int MinHeap::extractMin()\n" +
                "{\n" +
                "    if (heap_size <= 0)\n" +
                "        return INT_MAX;\n" +
                "    if (heap_size == 1)\n" +
                "    {\n" +
                "        heap_size--;\n" +
                "        return harr[0];\n" +
                "    }\n" +
                " \n" +
                "    // Store the minimum vakue, and remove it from heap\n" +
                "    int root = harr[0];\n" +
                "    harr[0] = harr[heap_size-1];\n" +
                "    heap_size--;\n" +
                "    MinHeapify(0);\n" +
                " \n" +
                "    return root;\n" +
                "}\n" +
                " \n" +
                " \n" +
                "// This function deletes key at index i. It first reduced value to minus\n" +
                "// infinite, then calls extractMin()\n" +
                "void MinHeap::deleteKey(int i)\n" +
                "{\n" +
                "    decreaseKey(i, INT_MIN);\n" +
                "    extractMin();\n" +
                "}\n" +
                " \n" +
                "// A recursive method to heapify a subtree with root at given index\n" +
                "// This method assumes that the subtrees are already heapified\n" +
                "void MinHeap::MinHeapify(int i)\n" +
                "{\n" +
                "    int l = left(i);\n" +
                "    int r = right(i);\n" +
                "    int smallest = i;\n" +
                "    if (l < heap_size && harr[l] < harr[i])\n" +
                "        smallest = l;\n" +
                "    if (r < heap_size && harr[r] < harr[smallest])\n" +
                "        smallest = r;\n" +
                "    if (smallest != i)\n" +
                "    {\n" +
                "        swap(&harr[i], &harr[smallest]);\n" +
                "        MinHeapify(smallest);\n" +
                "    }\n" +
                "}\n" +
                " \n" +
                "// A utility function to swap two elements\n" +
                "void swap(int *x, int *y)\n" +
                "{\n" +
                "    int temp = *x;\n" +
                "    *x = *y;\n" +
                "    *y = temp;\n" +
                "}\n" +
                " \n" +
                "// Driver program to test above functions\n" +
                "int main()\n" +
                "{\n" +
                "    MinHeap h(11);\n" +
                "    h.insertKey(3);\n" +
                "    h.insertKey(2);\n" +
                "    h.deleteKey(1);\n" +
                "    h.insertKey(15);\n" +
                "    h.insertKey(5);\n" +
                "    h.insertKey(4);\n" +
                "    h.insertKey(45);\n" +
                "    cout << h.extractMin() << \" \";\n" +
                "    cout << h.getMin() << \" \";\n" +
                "    h.decreaseKey(2, 1);\n" +
                "    cout << h.getMin();\n" +
                "    return 0;\n" +
                "}" +
                "\nOutput:\n" +
                "2 4 1" +
                "\n\n\nBinary Representation of a number and Binomial Heaps\n" +
                "\nA Binomial Heap with n nodes has number of Binomial Trees equal to the number of set bits in Binary representation of n. For example let n be 13, there 3 set bits in binary representation of n (00001101), hence 3 Binomial Trees. We can also relate degree of these Binomial Trees with positions of set bits. With this relation we can conclude that there are O(Logn) Binomial Trees in a Binomial Heap with ‘n’ nodes.\n" +
                "\n" +
                "\n\nOperations of Binomial Heap:\n" +
                "\nThe main operation in Binomial Heap is union(), all other operations mainly use this operation. The union() operation is to combine two Binomial Heaps into one. Let us first discuss other operations, we will discuss union later.\n" +
                "\n" +
                "\n1) insert(H, k): Inserts a key ‘k’ to Binomial Heap ‘H’. This operation first creates a Binomial Heap with single key ‘k’, then calls union on H and the new Binomial heap.\n" +
                "\n" +
                "\n2) getMin(H): A simple way to getMin() is to traverse the list of root of Binomial Trees and return the minimum key. This implementation requires O(Logn) time. It can be optimized to O(1) by maintaining a pointer to minimum key root.\n" +
                "\n" +
                "\n3) extractMin(H): This operation also uses union(). We first call getMin() to find the minimum key Binomial Tree, then we remove the node and create a new Binomial Heap by connecting all subtrees of the removed minimum node. Finally we call union() on H and the newly created Binomial Heap. This operation requires O(Logn) time.\n" +
                "\n" +
                "\n4) delete(H): Like Binary Heap, delete operation first reduces the key to minus infinite, then calls extractMin().\n" +
                "\n" +
                "\n5) decreaseKey(H): decreaseKey() is also similar to Binary Heap. We compare the decreases key with it parent and if parent’s key is more, we swap keys and recur for parent. We stop when we either reach a node whose parent has smaller key or we hit the root node. Time complexity of decreaseKey() is O(Logn).\n" +
                "\n" +
                "\n\nUnion operation in Binomial Heap:\n" +
                "\nGiven two Binomial Heaps H1 and H2, union(H1, H2) creates a single Binomial Heap.\n" +
                "\n1) The first step is to simply merge the two Heaps in non-decreasing order of degrees. In the following diagram, figure(b) shows the result after merging.\n" +
                "\n" +
                "\n2) After the simple merge, we need to make sure that there is at-most one Binomial Tree of any order. To do this, we need to combine Binomial Trees of same order. We traverse the list of merged roots, we keep track of three pointers, prev, x and next-x. There can be following 4 cases when we traverse the list of roots.\n" +
                "\n—–Case 1: Orders of x and next-x are not same, we simply move ahead.\n" +
                "\nIn following 3 cases orders of x and next-x are same.\n" +
                "\n—–Case 2: If order of next-next-x is also same, move ahead.\n" +
                "\n—–Case 3: If key of x is smaller than or equal to key of next-x, then make next-x as a child of x by linking it with x.\n" +
                "\n—–Case 4: If key of x is greater, then make x as child of next." +
                "\n\nFIBBONACCI HEAP" +
                "\n\nBelow are some interesting facts about Fibonacci Heap\n" +
                "\n" +
                "\nThe reduced time complexity of Decrease-Key has importance in Dijkstra and Prim algorithms. With Binary Heap, time complexity of these algorithms is O(VLogV + ELogV). If Fibonacci Heap is used, then time complexity is improved to O(VLogV + E)\n" +
                "\nAlthough Fibonacci Heap looks promising time complexity wise, it has been found slow in practice as hidden constants are high (Source Wiki).\n" +
                "\nFibonacci heap are mainly called so because Fibonacci numbers are used in the running time analysis. Also, every node in Fibonacci Heap has degree at most O(log n) and the size of a subtree rooted in a node of degree k is at least Fk+2, where Fk is the kth Fibonacci number.");
    }
}
