package com.example.hp.above;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class SelectionsortActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selectionsort);
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
    public void selection_code(View view) {
        TextView tv = (TextView) findViewById(R.id.selection_code);
        tv.setText("arr[] = 64 25 12 22 11\n" +
                "\n" +
                "// Find the minimum element in arr[0...4]\n" +
                "// and place it at beginning\n" +
                "11 25 12 22 64\n" +
                "\n" +
                "// Find the minimum element in arr[1...4]\n" +
                "// and place it at beginning of arr[1...4]\n" +
                "11 12 25 22 64\n" +
                "\n" +
                "// Find the minimum element in arr[2...4]\n" +
                "// and place it at beginning of arr[2...4]\n" +
                "11 12 22 25 64\n" +
                "\n" +
                "// Find the minimum element in arr[3...4]\n" +
                "// and place it at beginning of arr[3...4]\n" +
                "11 12 22 25 64 " +
                "\n\n" +
                "// C program for implementation of selection sort\n" +
                "#include <stdio.h>\n" +
                " \n" +
                "void swap(int *xp, int *yp)\n" +
                "{\n" +
                "    int temp = *xp;\n" +
                "    *xp = *yp;\n" +
                "    *yp = temp;\n" +
                "}\n" +
                " \n" +
                "void selectionSort(int arr[], int n)\n" +
                "{\n" +
                "    int i, j, min_idx;\n" +
                " \n" +
                "    // One by one move boundary of unsorted subarray\n" +
                "    for (i = 0; i < n-1; i++)\n" +
                "    {\n" +
                "        // Find the minimum element in unsorted array\n" +
                "        min_idx = i;\n" +
                "        for (j = i+1; j < n; j++)\n" +
                "          if (arr[j] < arr[min_idx])\n" +
                "            min_idx = j;\n" +
                " \n" +
                "        // Swap the found minimum element with the first element\n" +
                "        swap(&arr[min_idx], &arr[i]);\n" +
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
                "    int arr[] = {64, 25, 12, 22, 11};\n" +
                "    int n = sizeof(arr)/sizeof(arr[0]);\n" +
                "    selectionSort(arr, n);\n" +
                "    printf(\"Sorted array: \\n\");\n" +
                "    printArray(arr, n);\n" +
                "    return 0;\n" +
                "}" +
                "\n\nOutput:\n" +
                "Sorted array:\n" +
                "11 12 22 25 64\n" +
                "Time Complexity: O(n*n) as there are two nested loops.\n" +
                "Auxiliary Space: O(1)\n" +
                "The good thing about selection sort is it never makes more than O(n) swaps and can be useful when memory write is a costly operation.");
    }
}
