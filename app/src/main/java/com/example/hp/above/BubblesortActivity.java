package com.example.hp.above;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class BubblesortActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bubblesort);
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
    public void bubble_code(View view)
    {
        TextView tv = (TextView)  findViewById(R.id.bubble_code);
        tv.setText("Example:\n" +
                "First Pass:\n" +
                "( 5 1 4 2 8 ) –> ( 1 5 4 2 8 ), Here, algorithm compares the first two elements, and swaps since 5 > 1.\n" +
                "( 1 5 4 2 8 ) –>  ( 1 4 5 2 8 ), Swap since 5 > 4\n" +
                "( 1 4 5 2 8 ) –>  ( 1 4 2 5 8 ), Swap since 5 > 2\n" +
                "( 1 4 2 5 8 ) –> ( 1 4 2 5 8 ), Now, since these elements are already in order (8 > 5), algorithm does not swap them.\n" +
                "Second Pass:\n" +
                "( 1 4 2 5 8 ) –> ( 1 4 2 5 8 )\n" +
                "( 1 4 2 5 8 ) –> ( 1 2 4 5 8 ), Swap since 4 > 2\n" +
                "( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )\n" +
                "( 1 2 4 5 8 ) –>  ( 1 2 4 5 8 )\n" +
                "Now, the array is already sorted, but our algorithm does not know if it is completed. The algorithm needs one whole pass without any swap to know it is sorted.\n" +
                "Third Pass:\n" +
                "( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )\n" +
                "( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )\n" +
                "( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )\n" +
                "( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )\n" +
                "Following are implementations of Bubble Sort." +
                "\n\n// C program for implementation of Bubble sort\n" +
                "#include <stdio.h>\n" +
                " \n" +
                "void swap(int *xp, int *yp)\n" +
                "{\n" +
                "    int temp = *xp;\n" +
                "    *xp = *yp;\n" +
                "    *yp = temp;\n" +
                "}\n" +
                " \n" +
                "// A function to implement bubble sort\n" +
                "void bubbleSort(int arr[], int n)\n" +
                "{\n" +
                "   int i, j;\n" +
                "   for (i = 0; i < n-1; i++)      \n" +
                " \n" +
                "       // Last i elements are already in place   \n" +
                "       for (j = 0; j < n-i-1; j++) \n" +
                "           if (arr[j] > arr[j+1])\n" +
                "              swap(&arr[j], &arr[j+1]);\n" +
                "}\n" +
                " \n" +
                "/* Function to print an array */\n" +
                "void printArray(int arr[], int size)\n" +
                "{\n" +
                "    for (int i=0; i < size; i++)\n" +
                "        printf(\"%d \", arr[i]);\n" +
                "    printf(\"\\n\");\n" +
                "}\n" +
                " \n" +
                "// Driver program to test above functions\n" +
                "int main()\n" +
                "{\n" +
                "    int arr[] = {64, 34, 25, 12, 22, 11, 90};\n" +
                "    int n = sizeof(arr)/sizeof(arr[0]);\n" +
                "    bubbleSort(arr, n);\n" +
                "    printf(\"Sorted array: \\n\");\n" +
                "    printArray(arr, n);\n" +
                "    return 0;\n" +
                "}" +
                "\n\nOutput:\n" +
                "Sorted array:\n" +
                "11 12 22 25 34 64 90\n" +
                "Optimized Implementation:\n" +
                "The above function always runs O(n^2) time even if the array is sorted. It can be optimized by stopping the algorithm if inner loop didn’t cause any swap.\n" +
                "// Optimized implementation of Bubble sort\n" +
                "#include <stdio.h>\n" +
                " \n" +
                "void swap(int *xp, int *yp)\n" +
                "{\n" +
                "    int temp = *xp;\n" +
                "    *xp = *yp;\n" +
                "    *yp = temp;\n" +
                "}\n" +
                " \n" +
                "// An optimized version of Bubble Sort\n" +
                "void bubbleSort(int arr[], int n)\n" +
                "{\n" +
                "   int i, j;\n" +
                "   bool swapped;\n" +
                "   for (i = 0; i < n-1; i++)\n" +
                "   {\n" +
                "     swapped = false;\n" +
                "     for (j = 0; j < n-i-1; j++)\n" +
                "     {\n" +
                "        if (arr[j] > arr[j+1])\n" +
                "        {\n" +
                "           swap(&arr[j], &arr[j+1]);\n" +
                "           swapped = true;\n" +
                "        }\n" +
                "     }\n" +
                " \n" +
                "     // IF no two elements were swapped by inner loop, then break\n" +
                "     if (swapped == false)\n" +
                "        break;\n" +
                "   }\n" +
                "}\n" +
                " \n" +
                "/* Function to print an array */\n" +
                "void printArray(int arr[], int size)\n" +
                "{\n" +
                "    int i;\n" +
                "    for (i=0; i < size; i++)\n" +
                "        printf(\"%d \", arr[i]);\n" +
                "    printf(\"\\n\");\n" +
                "}\n" +
                " \n" +
                "// Driver program to test above functions\n" +
                "int main()\n" +
                "{\n" +
                "    int arr[] = {64, 34, 25, 12, 22, 11, 90};\n" +
                "    int n = sizeof(arr)/sizeof(arr[0]);\n" +
                "    bubbleSort(arr, n);\n" +
                "    printf(\"Sorted array: \\n\");\n" +
                "    printArray(arr, n);\n" +
                "    return 0;\n" +
                "}" +
                "\n\nOutput:\n" +
                "Sorted array:\n" +
                "11 12 22 25 34 64 90\n" +
                "Worst and Average Case Time Complexity: O(n*n). Worst case occurs when array is reverse sorted.\n" +
                "Best Case Time Complexity: O(n). Best case occurs when array is already sorted.\n" +
                "Auxiliary Space: O(1)\n" +
                "Boundary Cases: Bubble sort takes minimum time (Order of n) when elements are already sorted.\n" +
                "Sorting In Place: Yes\n" +
                "Stable: Yes\n" +
                "Due to its simplicity, bubble sort is often used to introduce the concept of a sorting algorithm.");
    }
}
