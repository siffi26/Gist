package com.example.hp.above;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class CountingsortActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_countingsort);
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
    public void counting_code(View view)
    {
        TextView tv = (TextView) findViewById(R.id.counting_code);
        tv.setText("Following is C implementation of counting sort." +
                "\n// C Program for counting sort\n" +
                "#include <stdio.h>\n" +
                "#include <string.h>\n" +
                "#define RANGE 255\n" +
                " \n" +
                "// The main function that sort the given string arr[] in\n" +
                "// alphabatical order\n" +
                "void countSort(char arr[])\n" +
                "{\n" +
                "    // The output character array that will have sorted arr\n" +
                "    char output[strlen(arr)];\n" +
                " \n" +
                "    // Create a count array to store count of inidividul\n" +
                "    // characters and initialize count array as 0\n" +
                "    int count[RANGE + 1], i;\n" +
                "    memset(count, 0, sizeof(count));\n" +
                " \n" +
                "    // Store count of each character\n" +
                "    for(i = 0; arr[i]; ++i)\n" +
                "        ++count[arr[i]];\n" +
                " \n" +
                "    // Change count[i] so that count[i] now contains actual\n" +
                "    // position of this character in output array\n" +
                "    for (i = 1; i <= RANGE; ++i)\n" +
                "        count[i] += count[i-1];\n" +
                " \n" +
                "    // Build the output character array\n" +
                "    for (i = 0; arr[i]; ++i)\n" +
                "    {\n" +
                "        output[count[arr[i]]-1] = arr[i];\n" +
                "        --count[arr[i]];\n" +
                "    }\n" +
                " \n" +
                "    // Copy the output array to arr, so that arr now\n" +
                "    // contains sorted characters\n" +
                "    for (i = 0; arr[i]; ++i)\n" +
                "        arr[i] = output[i];\n" +
                "}\n" +
                " \n" +
                "// Driver program to test above function\n" +
                "int main()\n" +
                "{\n" +
                "    char arr[] = \"geeksforgeeks\";//\"applepp\";\n" +
                " \n" +
                "    countSort(arr);\n" +
                " \n" +
                "    printf(\"Sorted character array is %s\\n\", arr);\n" +
                "    return 0;\n" +
                "}\n"  +
                "\n" +
                "Output:\n" +
                "Sorted character array is eeeefggkkorss\n" +
                "Time Complexity: O(n+k) where n is the number of elements in input array and k is the range of input.\n" +
                "Auxiliary Space: O(n+k)\n" +
                "\n" +
                "Points to be noted:\n" +
                "1. Counting sort is efficient if the range of input data is not significantly greater than the number of objects to be sorted. Consider the situation where the input sequence is between range 1 to 10K and the data is 10, 5, 10K, 5K.\n" +
                "2. It is not a comparison based sorting. It running time complexity is O(n) with space proportional to the range of data.\n" +
                "3. It is often used as a sub-routine to another sorting algorithm like radix sort.\n" +
                "4. Counting sort uses a partial hashing to count the occurrence of the data object in O(1).\n" +
                "5. Counting sort can be extended to work for negative inputs also.");
    }
}
