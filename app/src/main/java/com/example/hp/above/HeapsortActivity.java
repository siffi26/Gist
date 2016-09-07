package com.example.hp.above;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class HeapsortActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heapsort);
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
    public void heap_sort(View view) {
        TextView previewText = (TextView) findViewById(R.id.heap_sort);
        previewText.setText("Input data: 4, 10, 3, 5, 1\n" +
                "                 4(0)\n" +
                "\t\t/   \\\n" +
                "\t     10(1)   3(2)\n" +
                "            /   \\\n" +
                "\t 5(3)    1(4)\n" +
                "\n" +
                "The numbers in bracket represent the indices in the array \n" +
                "representation of data.\n" +
                "\n" +
                "Applying heapify procedure to index 1:\n" +
                " \t\t4(0)\n" +
                "\t\t/   \\\n" +
                "            10(1)    3(2)\n" +
                "           /   \\\n" +
                "\t5(3)    1(4)\n" +
                "\n" +
                "Applying heapify procedure to index 0:\n" +
                "\t        10(0)\n" +
                "\t\t/  \\\n" +
                "\t     5(1)  3(2)\n" +
                "            /   \\\n" +
                "         4(3)    1(4)\n" +
                "The heapify procedure calls itself recursively to build heap\n" +
                " in top down manner." +
                "\n// C++ program for implementation of Heap Sort\n" +
                "#include <iostream>\n" +
                "using namespace std;\n" +
                " \n" +
                "// To heapify a subtree rooted with node i which is\n" +
                "// an index in arr[]. n is size of heap\n" +
                "void heapify(int arr[], int n, int i)\n" +
                "{\n" +
                "    int largest = i;  // Initialize largest as root\n" +
                "    int l = 2*i + 1;  // left = 2*i + 1\n" +
                "    int r = 2*i + 2;  // right = 2*i + 2\n" +
                " \n" +
                "    // If left child is larger than root\n" +
                "    if (l < n && arr[l] > arr[largest])\n" +
                "        largest = l;\n" +
                " \n" +
                "    // If right child is larger than largest so far\n" +
                "    if (r < n && arr[r] > arr[largest])\n" +
                "        largest = r;\n" +
                " \n" +
                "    // If largest is not root\n" +
                "    if (largest != i)\n" +
                "    {\n" +
                "        swap(arr[i], arr[largest]);\n" +
                " \n" +
                "        // Recursively heapify the affected sub-tree\n" +
                "        heapify(arr, n, largest);\n" +
                "    }\n" +
                "}\n" +
                " \n" +
                "// main function to do heap sort\n" +
                "void heapSort(int arr[], int n)\n" +
                "{\n" +
                "    // Build heap (rearrange array)\n" +
                "    for (int i = n / 2 - 1; i >= 0; i--)\n" +
                "        heapify(arr, n, i);\n" +
                " \n" +
                "    // One by one extract an element from heap\n" +
                "    for (int i=n-1; i>=0; i--)\n" +
                "    {\n" +
                "        // Move current root to end\n" +
                "        swap(arr[0], arr[i]);\n" +
                " \n" +
                "        // call max heapify on the reduced heap\n" +
                "        heapify(arr, i, 0);\n" +
                "    }\n" +
                "}\n" +
                " \n" +
                "/* A utility function to print array of size n */\n" +
                "void printArray(int arr[], int n)\n" +
                "{\n" +
                "    for (int i=0; i<n; ++i)\n" +
                "        cout << arr[i] << \" \";\n" +
                "    cout << \"\\n\";\n" +
                "}\n" +
                " \n" +
                "// Driver program\n" +
                "int main()\n" +
                "{\n" +
                "    int arr[] = {12, 11, 13, 5, 6, 7};\n" +
                "    int n = sizeof(arr)/sizeof(arr[0]);\n" +
                " \n" +
                "    heapSort(arr, n);\n" +
                " \n" +
                "    cout << \"Sorted array is \\n\";\n" +
                "    printArray(arr, n);\n" +
                "}" +
                "\n\nOutput:\n" +
                "Sorted array is\n" +
                "5 6 7 11 12 13" +
                "\n\nNotes:\n" +
                "Heap sort is an in-place algorithm.\n" +
                "Its typical implementation is not stable, but can be made stable (See this)\n" +
                "Time Complexity: Time complexity of heapify is O(Logn). Time complexity of createAndBuildHeap() is O(n) and overall time complexity of Heap Sort is O(nLogn).\n" +
                "Applications of HeapSort\n" +
                "1. Sort a nearly sorted (or K sorted) array\n" +
                "2. k largest(or smallest) elements in an array\n" +
                "Heap sort algorithm has limited uses because Quicksort and Mergesort are better in practice. Nevertheless, the Heap data structure itself is enormously used.");
    }
}
