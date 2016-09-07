package com.example.hp.above;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MedianSortedArrayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_median_sorted_array);
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
    public void median_code(View view) {
        TextView tv = (TextView) findViewById(R.id.median_code);
        tv.setText("// A Simple Merge based O(n) solution to find median of\n" +
                "// two sorted arrays\n" +
                "#include <stdio.h>\n" +
                " \n" +
                "/* This function returns median of ar1[] and ar2[].\n" +
                "   Assumptions in this function:\n" +
                "   Both ar1[] and ar2[] are sorted arrays\n" +
                "   Both have n elements */\n" +
                "int getMedian(int ar1[], int ar2[], int n)\n" +
                "{\n" +
                "    int i = 0;  /* Current index of i/p array ar1[] */\n" +
                "    int j = 0; /* Current index of i/p array ar2[] */\n" +
                "    int count;\n" +
                "    int m1 = -1, m2 = -1;\n" +
                " \n" +
                "    /* Since there are 2n elements, median will be average\n" +
                "     of elements at index n-1 and n in the array obtained after\n" +
                "     merging ar1 and ar2 */\n" +
                "    for (count = 0; count <= n; count++)\n" +
                "    {\n" +
                "        /*Below is to handle case where all elements of ar1[] are\n" +
                "          smaller than smallest(or first) element of ar2[]*/\n" +
                "        if (i == n)\n" +
                "        {\n" +
                "            m1 = m2;\n" +
                "            m2 = ar2[0];\n" +
                "            break;\n" +
                "        }\n" +
                " \n" +
                "        /*Below is to handle case where all elements of ar2[] are\n" +
                "          smaller than smallest(or first) element of ar1[]*/\n" +
                "        else if (j == n)\n" +
                "        {\n" +
                "            m1 = m2;\n" +
                "            m2 = ar1[0];\n" +
                "            break;\n" +
                "        }\n" +
                " \n" +
                "        if (ar1[i] < ar2[j])\n" +
                "        {\n" +
                "            m1 = m2;  /* Store the prev median */\n" +
                "            m2 = ar1[i];\n" +
                "            i++;\n" +
                "        }\n" +
                "        else\n" +
                "        {\n" +
                "            m1 = m2;  /* Store the prev median */\n" +
                "            m2 = ar2[j];\n" +
                "            j++;\n" +
                "        }\n" +
                "    }\n" +
                " \n" +
                "    return (m1 + m2)/2;\n" +
                "}\n" +
                " \n" +
                "/* Driver program to test above function */\n" +
                "int main()\n" +
                "{\n" +
                "    int ar1[] = {1, 12, 15, 26, 38};\n" +
                "    int ar2[] = {2, 13, 17, 30, 45};\n" +
                " \n" +
                "    int n1 = sizeof(ar1)/sizeof(ar1[0]);\n" +
                "    int n2 = sizeof(ar2)/sizeof(ar2[0]);\n" +
                "    if (n1 == n2)\n" +
                "        printf(\"Median is %d\", getMedian(ar1, ar2, n1));\n" +
                "    else\n" +
                "        printf(\"Doesn't work for arrays of unequal size\");\n" +
                "    getchar();\n" +
                "    return 0;\n" +
                "}" +
                "\n\nOutput\n" +
                "\n" +
                "Median is 16\n" +
                "Time Complexity: O(n)" +
                "\n\nMethod 2 (By comparing the medians of two arrays)\n" +
                "This method works by first getting medians of the two sorted arrays and then comparing them.\n" +
                "\n" +
                "Let ar1 and ar2 be the input arrays.\n" +
                "\n" +
                "Algorithm:\n" +
                "\n" +
                "1) Calculate the medians m1 and m2 of the input arrays ar1[] \n" +
                "   and ar2[] respectively.\n" +
                "2) If m1 and m2 both are equal then we are done.\n" +
                "     return m1 (or m2)\n" +
                "3) If m1 is greater than m2, then median is present in one \n" +
                "   of the below two subarrays.\n" +
                "    a)  From first element of ar1 to m1 (ar1[0...|_n/2_|])\n" +
                "    b)  From m2 to last element of ar2  (ar2[|_n/2_|...n-1])\n" +
                "4) If m2 is greater than m1, then median is present in one    \n" +
                "   of the below two subarrays.\n" +
                "   a)  From m1 to last element of ar1  (ar1[|_n/2_|...n-1])\n" +
                "   b)  From first element of ar2 to m2 (ar2[0...|_n/2_|])\n" +
                "5) Repeat the above process until size of both the subarrays \n" +
                "   becomes 2.\n" +
                "6) If size of the two arrays is 2 then use below formula to get \n" +
                "  the median.\n" +
                "    Median = (max(ar1[0], ar2[0]) + min(ar1[1], ar2[1]))/2\n" +
                "Example:\n" +
                "\n" +
                "   ar1[] = {1, 12, 15, 26, 38}\n" +
                "   ar2[] = {2, 13, 17, 30, 45}\n" +
                "For above two arrays m1 = 15 and m2 = 17\n" +
                "\n" +
                "For the above ar1[] and ar2[], m1 is smaller than m2. So median is present in one of the following two subarrays.\n" +
                "\n" +
                "   [15, 26, 38] and [2, 13, 17]\n" +
                "Let us repeat the process for above two subarrays:\n" +
                "\n" +
                "    m1 = 26 m2 = 13.\n" +
                "m1 is greater than m2. So the subarrays become\n" +
                "\n" +
                "  [15, 26] and [13, 17]\n" +
                "Now size is 2, so median = (max(ar1[0], ar2[0]) + min(ar1[1], ar2[1]))/2\n" +
                "                       = (max(15, 13) + min(26, 17))/2 \n" +
                "                       = (15 + 17)/2\n" +
                "                       = 16\n" +
                "Implementation:\n" +
                "\n" +
                "// A divide and conquer based efficient solution to find median\n" +
                "// of two sorted arrays of same size.\n" +
                "#include<bits/stdc++.h>\n" +
                "using namespace std;\n" +
                " \n" +
                "int median(int [], int); /* to get median of a sorted array */\n" +
                " \n" +
                "/* This function returns median of ar1[] and ar2[].\n" +
                "   Assumptions in this function:\n" +
                "   Both ar1[] and ar2[] are sorted arrays\n" +
                "   Both have n elements */\n" +
                "int getMedian(int ar1[], int ar2[], int n)\n" +
                "{\n" +
                "    /* return -1  for invalid input */\n" +
                "    if (n <= 0)\n" +
                "        return -1;\n" +
                "    if (n == 1)\n" +
                "        return (ar1[0] + ar2[0])/2;\n" +
                "    if (n == 2)\n" +
                "        return (max(ar1[0], ar2[0]) + min(ar1[1], ar2[1])) / 2;\n" +
                " \n" +
                "    int m1 = median(ar1, n); /* get the median of the first array */\n" +
                "    int m2 = median(ar2, n); /* get the median of the second array */\n" +
                " \n" +
                "    /* If medians are equal then return either m1 or m2 */\n" +
                "    if (m1 == m2)\n" +
                "        return m1;\n" +
                " \n" +
                "    /* if m1 < m2 then median must exist in ar1[m1....] and\n" +
                "        ar2[....m2] */\n" +
                "    if (m1 < m2)\n" +
                "    {\n" +
                "        if (n % 2 == 0)\n" +
                "            return getMedian(ar1 + n/2 - 1, ar2, n - n/2 +1);\n" +
                "        return getMedian(ar1 + n/2, ar2, n - n/2);\n" +
                "    }\n" +
                " \n" +
                "    /* if m1 > m2 then median must exist in ar1[....m1] and\n" +
                "        ar2[m2...] */\n" +
                "    if (n % 2 == 0)\n" +
                "        return getMedian(ar2 + n/2 - 1, ar1, n - n/2 + 1);\n" +
                "    return getMedian(ar2 + n/2, ar1, n - n/2);\n" +
                "}\n" +
                " \n" +
                "/* Function to get median of a sorted array */\n" +
                "int median(int arr[], int n)\n" +
                "{\n" +
                "    if (n%2 == 0)\n" +
                "        return (arr[n/2] + arr[n/2-1])/2;\n" +
                "    else\n" +
                "        return arr[n/2];\n" +
                "}\n" +
                " \n" +
                "/* Driver program to test above function */\n" +
                "int main()\n" +
                "{\n" +
                "    int ar1[] = {1, 2, 3, 6};\n" +
                "    int ar2[] = {4, 6, 8, 10};\n" +
                "    int n1 = sizeof(ar1)/sizeof(ar1[0]);\n" +
                "    int n2 = sizeof(ar2)/sizeof(ar2[0]);\n" +
                "    if (n1 == n2)\n" +
                "        printf(\"Median is %d\", getMedian(ar1, ar2, n1));\n" +
                "    else\n" +
                "        printf(\"Doesn't work for arrays of unequal size\");\n" +
                "    return 0;\n" +
                "}" +
                "\n\nOutput :\n" +
                "\n" +
                "Median is 5\n" +
                "Time Complexity: O(logn)\n" +
                "Algorithmic Paradigm: Divide and Conquer");
    }
}
