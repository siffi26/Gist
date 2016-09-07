package com.example.hp.above;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class ShellsortActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shellsort);
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
    public void shell_sort(View view)
    {
        TextView previewText = (TextView) findViewById(R.id.shell_sort);
        previewText.setText("Time Complexity: Time complexity of above implementation of shellsort is O(n2). In the above implementation gap is reduce by half in every iteration. There are many other ways to reduce gap which lead to better time complexity." +
                "// C++ implementation of Shell Sort\n" +
                "#include  <iostream>\n" +
                "using namespace std;\n" +
                " \n" +
                "/* function to sort arr using shellSort */\n" +
                "int shellSort(int arr[], int n)\n" +
                "{\n" +
                "    // Start with a big gap, then reduce the gap\n" +
                "    for (int gap = n/2; gap > 0; gap /= 2)\n" +
                "    {\n" +
                "        // Do a gapped insertion sort for this gap size.\n" +
                "        // The first gap elements a[0..gap-1] are already in gapped order\n" +
                "        // keep adding one more element until the entire array is\n" +
                "        // gap sorted \n" +
                "        for (int i = gap; i < n; i += 1)\n" +
                "        {\n" +
                "            // add a[i] to the elements that have been gap sorted\n" +
                "            // save a[i] in temp and make a hole at position i\n" +
                "            int temp = arr[i];\n" +
                " \n" +
                "            // shift earlier gap-sorted elements up until the correct \n" +
                "            // location for a[i] is found\n" +
                "            int j;            \n" +
                "            for (j = i; j >= gap && arr[j - gap] > temp; j -= gap)\n" +
                "                arr[j] = arr[j - gap];\n" +
                "             \n" +
                "            //  put temp (the original a[i]) in its correct location\n" +
                "            arr[j] = temp;\n" +
                "        }\n" +
                "    }\n" +
                "    return 0;\n" +
                "}\n" +
                " \n" +
                "void printArray(int arr[], int n)\n" +
                "{\n" +
                "    for (int i=0; i<n; i++)\n" +
                "        cout << arr[i] << \" \";\n" +
                "}\n" +
                " \n" +
                "int main()\n" +
                "{\n" +
                "    int arr[] = {12, 34, 54, 2, 3}, i;\n" +
                "    int n = sizeof(arr)/sizeof(arr[0]);\n" +
                " \n" +
                "    cout << \"Array before sorting: \\n\";\n" +
                "    printArray(arr, n);\n" +
                " \n" +
                "    shellSort(arr, n);\n" +
                " \n" +
                "    cout << \"\\nArray after sorting: \\n\";\n" +
                "    printArray(arr, n);\n" +
                " \n" +
                "    return 0;\n" +
                "}" +
                "\n\nOutput:\n" +
                "Array before sorting:\n" +
                "12 34 54 2 3\n" +
                "Array after sorting:\n" +
                "2 3 12 34 54\n");
    }
}
