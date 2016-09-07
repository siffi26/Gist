package com.example.hp.above;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class QuicksortActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quicksort);
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
    public void quick_sort(View view) {
        TextView previewText = (TextView) findViewById(R.id.quick_sort);
        previewText.setText("/* C implementation QuickSort */\n" +
                "#include<stdio.h>\n" +
                " \n" +
                "// A utility function to swap two elements\n" +
                "void swap(int* a, int* b)\n" +
                "{\n" +
                "    int t = *a;\n" +
                "    *a = *b;\n" +
                "    *b = t;\n" +
                "}\n" +
                " \n" +
                "/* This function takes last element as pivot, places\n" +
                "   the pivot element at its correct position in sorted\n" +
                "    array, and places all smaller (smaller than pivot)\n" +
                "   to left of pivot and all greater elements to right\n" +
                "   of pivot */\n" +
                "int partition (int arr[], int low, int high)\n" +
                "{\n" +
                "    int pivot = arr[high];    // pivot\n" +
                "    int i = (low - 1);  // Index of smaller element\n" +
                " \n" +
                "    for (int j = low; j <= high- 1; j++)\n" +
                "    {\n" +
                "        // If current element is smaller than or\n" +
                "        // equal to pivot\n" +
                "        if (arr[j] <= pivot)\n" +
                "        {\n" +
                "            i++;    // increment index of smaller element\n" +
                "            swap(&arr[i], &arr[j]);\n" +
                "        }\n" +
                "    }\n" +
                "    swap(&arr[i + 1], &arr[high]);\n" +
                "    return (i + 1);\n" +
                "}\n" +
                " \n" +
                "/* The main function that implements QuickSort\n" +
                " arr[] --> Array to be sorted,\n" +
                "  low  --> Starting index,\n" +
                "  high  --> Ending index */\n" +
                "void quickSort(int arr[], int low, int high)\n" +
                "{\n" +
                "    if (low < high)\n" +
                "    {\n" +
                "        /* pi is partitioning index, arr[p] is now\n" +
                "           at right place */\n" +
                "        int pi = partition(arr, low, high);\n" +
                " \n" +
                "        // Separately sort elements before\n" +
                "        // partition and after partition\n" +
                "        quickSort(arr, low, pi - 1);\n" +
                "        quickSort(arr, pi + 1, high);\n" +
                "    }\n" +
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
                "    int arr[] = {10, 7, 8, 9, 1, 5};\n" +
                "    int n = sizeof(arr)/sizeof(arr[0]);\n" +
                "    quickSort(arr, 0, n-1);\n" +
                "    printf(\"Sorted array: \\n\");\n" +
                "    printArray(arr, n);\n" +
                "    return 0;\n" +
                "}" +
                "\n\n" +
                "Output:\n" +
                "Sorted array:\n" +
                "1 5 7 8 9 10\n" +
                "Illustration of partition() :\n" +
                "arr[] = {10, 80, 30, 90, 40, 50, 70}\n" +
                "Indexes:  0   1   2   3   4   5   6 \n" +
                "\n" +
                "low = 0, high =  6, pivot = arr[h] = 70\n" +
                "Initialize index of smaller element, i = -1\n" +
                "\n" +
                "Traverse elements from j = low to high-1\n" +
                "j = 0 : Since arr[j] <= pivot, do i++ and swap(arr[i], arr[j])\n" +
                "i = 0 \n" +
                "arr[] = {10, 80, 30, 90, 40, 50, 70} // No change as i and j \n" +
                "                                     // are same\n" +
                "\n" +
                "j = 1 : Since arr[j] > pivot, do nothing\n" +
                "// No change in i and arr[]\n" +
                "\n" +
                "j = 2 : Since arr[j] <= pivot, do i++ and swap(arr[i], arr[j])\n" +
                "i = 1\n" +
                "arr[] = {10, 30, 80, 90, 40, 50, 70} // We swap 80 and 30 \n" +
                "\n" +
                "j = 3 : Since arr[j] > pivot, do nothing\n" +
                "// No change in i and arr[]\n" +
                "\n" +
                "j = 4 : Since arr[j] <= pivot, do i++ and swap(arr[i], arr[j])\n" +
                "i = 2\n" +
                "arr[] = {10, 30, 40, 90, 80, 50, 70} // 80 and 40 Swapped\n" +
                "j = 5 : Since arr[j] <= pivot, do i++ and swap arr[i] with arr[j] \n" +
                "i = 3 \n" +
                "arr[] = {10, 30, 40, 50, 80, 90, 70} // 90 and 50 Swapped \n" +
                "\n" +
                "We come out of loop because j is now equal to high-1.\n" +
                "Finally we place pivot at correct position by swapping\n" +
                "arr[i+1] and arr[high] (or pivot) \n" +
                "arr[] = {10, 30, 40, 50, 70, 90, 80} // 80 and 70 Swapped \n" +
                "\n" +
                "Now 70 is at its correct place. All elements smaller than\n" +
                "70 are before it and all elements greater than 70 are after\n" +
                "it." +
                "\n\nAnalysis of QuickSort\n" +
                "Time taken by QuickSort in general can be written as following.\n" +
                " T(n) = T(k) + T(n-k-1) + \\theta(n)\n" +
                "The first two terms are for two recursive calls, the last term is for the partition process. k is the number of elements which are smaller than pivot.\n" +
                "The time taken by QuickSort depends upon the input array and partition strategy. Following are three cases." +
                "\n\nWorst Case: " +
                "\nFollowing is recurrence for worst case.\n" +
                " T(n) = T(0) + T(n-1) + \\theta(n)\n" +
                "which is equivalent to  \n" +
                " T(n) = T(n-1) + \\theta(n)\n" +
                "The solution of above recurrence is \\theta(n2)." +
                "\nBest Case: " +
                "\n Following is recurrence for best case.\n" +
                " T(n) = 2T(n/2) + \\theta(n)\n" +
                "The solution of above recurrence is \\theta(nLogn). It can be solved using case 2 of Master Theorem." +
                "\n\nAverage Case:" +
                "\nWe can get an idea of average case by considering the case when partition puts O(n/9) elements in one set and O(9n/10) elements in other set. Following is recurrence for this case.\n" +
                " T(n) = T(n/9) + T(9n/10) + \\theta(n)\n" +
                "Solution of above recurrence is also O(nLogn)\n" +
                "Although the worst case time complexity of QuickSort is O(n2) which is more than many other sorting algorithms like Merge Sort and Heap Sort, QuickSort is faster in practice, because its inner loop can be efficiently implemented on most architectures, and in most real-world data." +
                "");
    }
}
