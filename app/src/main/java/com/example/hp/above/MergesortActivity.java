package com.example.hp.above;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MergesortActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mergesort);
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
    public void merge_sort(View view) {
        TextView previewText = (TextView) findViewById(R.id.merge_sort);
        previewText.setText("MergeSort(arr[], l,  r)\n" +
                "If r > l\n" +
                "     1. Find the middle point to divide the array into two halves:  \n" +
                "             middle m = (l+r)/2\n" +
                "     2. Call mergeSort for first half:   \n" +
                "             Call mergeSort(arr, l, m)\n" +
                "     3. Call mergeSort for second half:\n" +
                "             Call mergeSort(arr, m+1, r)\n" +
                "     4. Merge the two halves sorted in step 2 and 3:\n" +
                "             Call merge(arr, l, m, r)" +
                "\n\n/* C program for Merge Sort */\n" +
                "#include<stdlib.h>\n" +
                "#include<stdio.h>\n" +
                " \n" +
                "// Merges two subarrays of arr[].\n" +
                "// First subarray is arr[l..m]\n" +
                "// Second subarray is arr[m+1..r]\n" +
                "void merge(int arr[], int l, int m, int r)\n" +
                "{\n" +
                "    int i, j, k;\n" +
                "    int n1 = m - l + 1;\n" +
                "    int n2 =  r - m;\n" +
                " \n" +
                "    /* create temp arrays */\n" +
                "    int L[n1], R[n2];\n" +
                " \n" +
                "    /* Copy data to temp arrays L[] and R[] */\n" +
                "    for (i = 0; i < n1; i++)\n" +
                "        L[i] = arr[l + i];\n" +
                "    for (j = 0; j < n2; j++)\n" +
                "        R[j] = arr[m + 1+ j];\n" +
                " \n" +
                "    /* Merge the temp arrays back into arr[l..r]*/\n" +
                "    i = 0; // Initial index of first subarray\n" +
                "    j = 0; // Initial index of second subarray\n" +
                "    k = l; // Initial index of merged subarray\n" +
                "    while (i < n1 && j < n2)\n" +
                "    {\n" +
                "        if (L[i] <= R[j])\n" +
                "        {\n" +
                "            arr[k] = L[i];\n" +
                "            i++;\n" +
                "        }\n" +
                "        else\n" +
                "        {\n" +
                "            arr[k] = R[j];\n" +
                "            j++;\n" +
                "        }\n" +
                "        k++;\n" +
                "    }\n" +
                " \n" +
                "    /* Copy the remaining elements of L[], if there\n" +
                "       are any */\n" +
                "    while (i < n1)\n" +
                "    {\n" +
                "        arr[k] = L[i];\n" +
                "        i++;\n" +
                "        k++;\n" +
                "    }\n" +
                " \n" +
                "    /* Copy the remaining elements of R[], if there\n" +
                "       are any */\n" +
                "    while (j < n2)\n" +
                "    {\n" +
                "        arr[k] = R[j];\n" +
                "        j++;\n" +
                "        k++;\n" +
                "    }\n" +
                "}\n" +
                " \n" +
                "/* l is for left index and r is right index of the\n" +
                "   sub-array of arr to be sorted */\n" +
                "void mergeSort(int arr[], int l, int r)\n" +
                "{\n" +
                "    if (l < r)\n" +
                "    {\n" +
                "        // Same as (l+r)/2, but avoids overflow for\n" +
                "        // large l and h\n" +
                "        int m = l+(r-l)/2;\n" +
                " \n" +
                "        // Sort first and second halves\n" +
                "        mergeSort(arr, l, m);\n" +
                "        mergeSort(arr, m+1, r);\n" +
                " \n" +
                "        merge(arr, l, m, r);\n" +
                "    }\n" +
                "}\n" +
                " \n" +
                "/* UTILITY FUNCTIONS */\n" +
                "/* Function to print an array */\n" +
                "void printArray(int A[], int size)\n" +
                "{\n" +
                "    int i;\n" +
                "    for (i=0; i < size; i++)\n" +
                "        printf(\"%d \", A[i]);\n" +
                "    printf(\"\\n\");\n" +
                "}\n" +
                " \n" +
                "/* Driver program to test above functions */\n" +
                "int main()\n" +
                "{\n" +
                "    int arr[] = {12, 11, 13, 5, 6, 7};\n" +
                "    int arr_size = sizeof(arr)/sizeof(arr[0]);\n" +
                " \n" +
                "    printf(\"Given array is \\n\");\n" +
                "    printArray(arr, arr_size);\n" +
                " \n" +
                "    mergeSort(arr, 0, arr_size - 1);\n" +
                " \n" +
                "    printf(\"\\nSorted array is \\n\");\n" +
                "    printArray(arr, arr_size);\n" +
                "    return 0;\n" +
                "}" +
                "\n\nOutput:\n" +
                "Given array is\n" +
                "12 11 13 5 6 7\n" +
                "\n" +
                "Sorted array is\n" +
                "5 6 7 11 12 13\n" +
                "Time Complexity: Sorting arrays on different machines. Merge Sort is a recursive algorithm and time complexity can be expressed as following recurrence relation.\n" +
                "T(n) = 2T(n/2) + \\Theta(n)\n" +
                "The above recurrence can be solved either using Recurrence Tree method or Master method. It falls in case II of Master Method and solution of the recurrence is \\Theta(nLogn).\n" +
                "Time complexity of Merge Sort is \\Theta(nLogn) in all 3 cases (worst, average and best) as merge sort always divides the array in two halves and take linear time to merge two halves.\n" +
                "Auxiliary Space: O(n)\n" +
                "Algorithmic Paradigm: Divide and Conquer\n" +
                "Sorting In Place: No in a typical implementation\n" +
                "Stable: Yes\n" +
                "Applications of Merge Sort\n" +
                "Merge Sort is useful for sorting linked lists in O(nLogn) time.In case of linked lists the case is different mainly due to difference in memory allocation of arrays and linked lists. Unlike arrays, linked list nodes may not be adjacent in memory. Unlike array, in linked list, we can insert items in the middle in O(1) extra space and O(1) time. Therefore merge operation of merge sort can be implemented without extra space for linked lists.\n" +
                "In arrays, we can do random access as elements are continuous in memory. Let us say we have an integer (4-byte) array A and let the address of A[0] be x then to access A[i], we can directly access the memory at (x + i*4). Unlike arrays, we can not do random access in linked list. Quick Sort requires a lot of this kind of access. In linked list to access i’th index, we have to travel each and every node from the head to i’th node as we don’t have continuous block of memory. Therefore, the overhead increases for quick sort. Merge sort accesses data sequentially and the need of random access is low.");
    }
}
