package com.example.hp.above;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class RadixsortActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radixsort);
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
    public void radix_code(View view)
    {
        TextView tv = (TextView) findViewById(R.id.radix_code);
        tv.setText("1) Do following for each digit i where i varies from least significant digit to the most significant digit.\n" +
                "………….a) Sort input array using counting sort (or any stable sort) according to the i’th digit.\n" +
                "\n" +
                "Example:\n" +
                "Original, unsorted list:\n" +
                "\n" +
                "170, 45, 75, 90, 802, 24, 2, 66\n" +
                "Sorting by least significant digit (1s place) gives: [*Notice that we keep 802 before 2, because 802 occurred before 2 in the original list, and similarly for pairs 170 & 90 and 45 & 75.]\n" +
                "\n" +
                "170, 90, 802, 2, 24, 45, 75, 66\n" +
                "Sorting by next digit (10s place) gives: [*Notice that 802 again comes before 2 as 802 comes before 2 in the previous list.]\n" +
                "\n" +
                "802, 2, 24, 45, 66, 170, 75, 90\n" +
                "Sorting by most significant digit (100s place) gives:\n" +
                "\n" +
                "2, 24, 45, 66, 75, 90, 170, 802\n" +
                "What is the running time of Radix Sort?\n" +
                "Let there be d digits in input integers. Radix Sort takes O(d*(n+b)) time where b is the base for representing numbers, for example, for decimal system, b is 10. What is the value of d? If k is the maximum possible value, then d would be O(logb(k)). So overall time complexity is O((n+b) * logb(k)). Which looks more than the time complexity of comparison based sorting algorithms for a large k. Let us first limit k. Let k <= nc where c is a constant. In that case, the complexity becomes O(nLogb(n)). But it still doesn’t beat comparison based sorting algorithms.\n" +
                "What if we make value of b larger?. What should be the value of b to make the time complexity linear? If we set b as n, we get the time complexity as O(n). In other words, we can sort an array of integers with range from 1 to nc if the numbers are represented in base n (or every digit takes log2(n) bits).\n" +
                "\n" +
                "Is Radix Sort preferable to Comparison based sorting algorithms like Quick-Sort?\n" +
                "If we have log2n bits for every digit, the running time of Radix appears to be better than Quick Sort for a wide range of input numbers. The constant factors hidden in asymptotic notation are higher for Radix Sort and Quick-Sort uses hardware caches more effectively. Also, Radix sort uses counting sort as a subroutine and counting sort takes extra space to sort numbers.\n" +
                "\n" +
                "Implementation of Radix Sort\n" +
                "Following is a simple C++ implementation of Radix Sort. For simplicity, the value of d is assumed to be 10." +
                " We recommend you to see Counting Sort for details of countSort() function in below code." +
                "\n\n// C++ implementation of Radix Sort\n" +
                "#include<iostream>\n" +
                "using namespace std;\n" +
                " \n" +
                "// A utility function to get maximum value in arr[]\n" +
                "int getMax(int arr[], int n)\n" +
                "{\n" +
                "    int mx = arr[0];\n" +
                "    for (int i = 1; i < n; i++)\n" +
                "        if (arr[i] > mx)\n" +
                "            mx = arr[i];\n" +
                "    return mx;\n" +
                "}\n" +
                " \n" +
                "// A function to do counting sort of arr[] according to\n" +
                "// the digit represented by exp.\n" +
                "void countSort(int arr[], int n, int exp)\n" +
                "{\n" +
                "    int output[n]; // output array\n" +
                "    int i, count[10] = {0};\n" +
                " \n" +
                "    // Store count of occurrences in count[]\n" +
                "    for (i = 0; i < n; i++)\n" +
                "        count[ (arr[i]/exp)%10 ]++;\n" +
                " \n" +
                "    // Change count[i] so that count[i] now contains actual\n" +
                "    //  position of this digit in output[]\n" +
                "    for (i = 1; i < 10; i++)\n" +
                "        count[i] += count[i - 1];\n" +
                " \n" +
                "    // Build the output array\n" +
                "    for (i = n - 1; i >= 0; i--)\n" +
                "    {\n" +
                "        output[count[ (arr[i]/exp)%10 ] - 1] = arr[i];\n" +
                "        count[ (arr[i]/exp)%10 ]--;\n" +
                "    }\n" +
                " \n" +
                "    // Copy the output array to arr[], so that arr[] now\n" +
                "    // contains sorted numbers according to current digit\n" +
                "    for (i = 0; i < n; i++)\n" +
                "        arr[i] = output[i];\n" +
                "}\n" +
                " \n" +
                "// The main function to that sorts arr[] of size n using \n" +
                "// Radix Sort\n" +
                "void radixsort(int arr[], int n)\n" +
                "{\n" +
                "    // Find the maximum number to know number of digits\n" +
                "    int m = getMax(arr, n);\n" +
                " \n" +
                "    // Do counting sort for every digit. Note that instead\n" +
                "    // of passing digit number, exp is passed. exp is 10^i\n" +
                "    // where i is current digit number\n" +
                "    for (int exp = 1; m/exp > 0; exp *= 10)\n" +
                "        countSort(arr, n, exp);\n" +
                "}\n" +
                " \n" +
                "// A utility function to print an array\n" +
                "void print(int arr[], int n)\n" +
                "{\n" +
                "    for (int i = 0; i < n; i++)\n" +
                "        cout << arr[i] << \" \";\n" +
                "}\n" +
                " \n" +
                "// Driver program to test above functions\n" +
                "int main()\n" +
                "{\n" +
                "    int arr[] = {170, 45, 75, 90, 802, 24, 2, 66};\n" +
                "    int n = sizeof(arr)/sizeof(arr[0]);\n" +
                "    radixsort(arr, n);\n" +
                "    print(arr, n);\n" +
                "    return 0;\n" +
                "}" +
                "\n\nOutput:\n" +
                "2 24 45 66 75 90 170 802");
    }
}
