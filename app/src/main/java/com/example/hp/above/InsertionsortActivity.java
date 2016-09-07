package com.example.hp.above;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class InsertionsortActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insertionsort);
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
    public void insertion_code(View view) {
        TextView tv = (TextView) findViewById(R.id.insertion_code);
        tv.setText("Algorithm\n" +
                "// Sort an arr[] of size n\n" +
                "insertionSort(arr, n)\n" +
                "Loop from i = 1 to n-1.\n" +
                "……a) Pick element arr[i] and insert it into sorted sequence arr[0…i-1]\n" +
                "Example: \n" +
                "12, 11, 13, 5, 6\n" +
                "Let us loop for i = 1 (second element of the array) to 5 (Size of input array)\n" +
                "i = 1. Since 11 is smaller than 12, move 12 and insert 11 before 12\n" +
                "11, 12, 13, 5, 6\n" +
                "i = 2. 13 will remain at its position as all elements in A[0..I-1] are smaller than 13\n" +
                "11, 12, 13, 5, 6\n" +
                "i = 3. 5 will move to the beginning and all other elements from 11 to 13 will move one position ahead of their current position.\n" +
                "5, 11, 12, 13, 6\n" +
                "i = 4. 6 will move to position after 5, and elements from 11 to 13 will move one position ahead of their current position.\n" +
                "5, 6, 11, 12, 13" +
                "\n\n// C program for insertion sort\n" +
                "#include <stdio.h>\n" +
                "#include <math.h>\n" +
                " \n" +
                "/* Function to sort an array using insertion sort*/\n" +
                "void insertionSort(int arr[], int n)\n" +
                "{\n" +
                "   int i, key, j;\n" +
                "   for (i = 1; i < n; i++)\n" +
                "   {\n" +
                "       key = arr[i];\n" +
                "       j = i-1;\n" +
                " \n" +
                "       /* Move elements of arr[0..i-1], that are\n" +
                "          greater than key, to one position ahead\n" +
                "          of their current position */\n" +
                "       while (j >= 0 && arr[j] > key)\n" +
                "       {\n" +
                "           arr[j+1] = arr[j];\n" +
                "           j = j-1;\n" +
                "       }\n" +
                "       arr[j+1] = key;\n" +
                "   }\n" +
                "}\n" +
                " \n" +
                "// A utility function ot print an array of size n\n" +
                "void printArray(int arr[], int n)\n" +
                "{\n" +
                "   int i;\n" +
                "   for (i=0; i < n; i++)\n" +
                "       printf(\"%d \", arr[i]);\n" +
                "   printf(\"\\n\");\n" +
                "}\n" +
                " \n" +
                " \n" +
                " \n" +
                "/* Driver program to test insertion sort */\n" +
                "int main()\n" +
                "{\n" +
                "    int arr[] = {12, 11, 13, 5, 6};\n" +
                "    int n = sizeof(arr)/sizeof(arr[0]);\n" +
                " \n" +
                "    insertionSort(arr, n);\n" +
                "    printArray(arr, n);\n" +
                " \n" +
                "    return 0;\n" +
                "}" +
                "\n\nOutput:\n" +
                "5 6 11 12 13\n" +
                "Time Complexity: O(n*n)\n" +
                "Auxiliary Space: O(1)\n" +
                "Boundary Cases: Insertion sort takes maximum time to sort if elements are sorted in reverse order. And it takes minimum time (Order of n) when elements are already sorted.\n" +
                "Algorithmic Paradigm: Incremental Approach\n" +
                "Sorting In Place: Yes\n" +
                "Stable: Yes\n" +
                "Online: Yes\n" +
                "Uses: Insertion sort is uses when number of elements is small. It can also be useful when input array is almost sorted, only few elements are misplaced in complete big array.\n" +
                "What is Binary Insertion Sort?\n" +
                "We can use binary search to reduce the number of comparisons in normal insertion sort. Binary Insertion Sort find use binary search to find the proper location to insert the selected item at each iteration. In normal insertion, sort it takes O(i) (at ith iteration) in worst case. we can reduce it to O(logi) by using binary search. The algorithm as a whole still has a running worst case running time of O(n2) because of the series of swaps required for each insertion. Refer this for implementation.\n" +
                "How to implement Insertion Sort for Linked List?\n" +
                "Below is simple insertion sort algorithm for linked list.\n" +
                "1) Create an empty sorted (or result) list\n" +
                "2) Traverse the given list, do following for every node.\n" +
                "......a) Insert current node in sorted way in sorted or result list.\n" +
                "3) Change head of given linked list to head of sorted (or result) list. \n");
    }
}
