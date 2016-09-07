package com.example.hp.above;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class BinarySearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_binary_search);
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
    public void bin_search(View view) {
        TextView previewText = (TextView) findViewById(R.id.bin_search);
        previewText.setText("#include <stdio.h>\n" +
                " \n" +
                "// A recursive binary search function. It returns location of x in\n" +
                "// given array arr[l..r] is present, otherwise -1\n" +
                "int binarySearch(int arr[], int l, int r, int x)\n" +
                "{\n" +
                "   if (r >= l)\n" +
                "   {\n" +
                "        int mid = l + (r - l)/2;\n" +
                " \n" +
                "        // If the element is present at the middle itself\n" +
                "        if (arr[mid] == x)  return mid;\n" +
                " \n" +
                "        // If element is smaller than mid, then it can only be present\n" +
                "        // in left subarray\n" +
                "        if (arr[mid] > x) return binarySearch(arr, l, mid-1, x);\n" +
                " \n" +
                "        // Else the element can only be present in right subarray\n" +
                "        return binarySearch(arr, mid+1, r, x);\n" +
                "   }\n" +
                " \n" +
                "   // We reach here when element is not present in array\n" +
                "   return -1;\n" +
                "}\n" +
                " \n" +
                "int main(void)\n" +
                "{\n" +
                "   int arr[] = {2, 3, 4, 10, 40};\n" +
                "   int n = sizeof(arr)/ sizeof(arr[0]);\n" +
                "   int x = 10;\n" +
                "   int result = binarySearch(arr, 0, n-1, x);\n" +
                "   (result == -1)? printf(\"Element is not present in array\")\n" +
                "                 : printf(\"Element is present at index %d\", result);\n" +
                "   return 0;\n" +
                "}" +
                "\n\nOutput:\n" +
                "Element is present at index 3\n" +
                "Following is Iterative implementation of Binary Search." +
                "\n\n#include <stdio.h>\n" +
                " \n" +
                "// A iterative binary search function. It returns location of x in\n" +
                "// given array arr[l..r] if present, otherwise -1\n" +
                "int binarySearch(int arr[], int l, int r, int x)\n" +
                "{\n" +
                "  while (l <= r)\n" +
                "  {\n" +
                "    int m = l + (r-l)/2;\n" +
                " \n" +
                "    // Check if x is present at mid\n" +
                "    if (arr[m] == x) \n" +
                "        return m;  \n" +
                " \n" +
                "    // If x greater, ignore left half  \n" +
                "    if (arr[m] < x) \n" +
                "        l = m + 1; \n" +
                " \n" +
                "    // If x is smaller, ignore right half \n" +
                "    else\n" +
                "         r = m - 1; \n" +
                "  }\n" +
                " \n" +
                "  // if we reach here, then element was not present\n" +
                "  return -1; \n" +
                "}\n" +
                " \n" +
                "int main(void)\n" +
                "{\n" +
                "   int arr[] = {2, 3, 4, 10, 40};\n" +
                "   int n = sizeof(arr)/ sizeof(arr[0]);\n" +
                "   int x = 10;\n" +
                "   int result = binarySearch(arr, 0, n-1, x);\n" +
                "   (result == -1)? printf(\"Element is not present in array\")\n" +
                "                 : printf(\"Element is present at index %d\", result);\n" +
                "   return 0;\n" +
                "}" +
                "\n\nOutput:\n" +
                "Element is present at index 3\n" +
                "Time Complexity:\n" +
                "The time complexity of Binary Search can be written as\n" +
                "T(n) = T(n/2) + c \n" +
                "The above recurrence can be solved either using Recurrence T ree method or Master method. It falls in case II of Master Method and solution of the recurrence is \\Theta(Logn).\n" +
                "Auxiliary Space: O(1) in case of iterative implementation. In case of recursive implementation, O(Logn) recursion call stack space.\n" +
                "Algorithmic Paradigm: Divide and Conquer");
    }
}
