package com.example.hp.above;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class BucketsortActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bucketsort);
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
    public void bucket_code(View view)
    {
        TextView tv = (TextView) findViewById(R.id.bucket_code);
        tv.setText("bucketSort(arr[], n)\n" +
                "1) Create n empty buckets (Or lists).\n" +
                "2) Do following for every array element arr[i].\n" +
                ".......a) Insert arr[i] into bucket[n*array[i]]\n" +
                "3) Sort individual buckets using insertion sort.\n" +
                "4) Concatenate all sorted buckets." +
                "\n\nTime Complexity: If we assume that insertion in a bucket takes O(1) time then steps 1 and 2 of the above algorithm clearly take O(n) time. The O(1) is easily possible if we use a linked list to represent a bucket (In the following code, C++ vector is used for simplicity). Step 4 also takes O(n) time as there will be n items in all buckets.\n" +
                "The main step to analyze is step 3. This step also takes O(n) time on average if all numbers are uniformly distributed (please refer CLRS book for more details)\n" +
                "\n" +
                "Following is C++ implementation of the above algorithm.\n" +
                "\n" +
                "// C++ program to sort an array using bucket sort\n" +
                "#include <iostream>\n" +
                "#include <algorithm>\n" +
                "#include <vector>\n" +
                "using namespace std;\n" +
                " \n" +
                "// Function to sort arr[] of size n using bucket sort\n" +
                "void bucketSort(float arr[], int n)\n" +
                "{\n" +
                "    // 1) Create n empty buckets\n" +
                "    vector<float> b[n];\n" +
                "    \n" +
                "    // 2) Put array elements in different buckets\n" +
                "    for (int i=0; i<n; i++)\n" +
                "    {\n" +
                "       int bi = n*arr[i]; // Index in bucket\n" +
                "       b[bi].push_back(arr[i]);\n" +
                "    }\n" +
                " \n" +
                "    // 3) Sort individual buckets\n" +
                "    for (int i=0; i<n; i++)\n" +
                "       sort(b[i].begin(), b[i].end());\n" +
                " \n" +
                "    // 4) Concatenate all buckets into arr[]\n" +
                "    int index = 0;\n" +
                "    for (int i = 0; i < n; i++)\n" +
                "        for (int j = 0; j < b[i].size(); j++)\n" +
                "          arr[index++] = b[i][j];\n" +
                "}\n" +
                " \n" +
                "/* Driver program to test above funtion */\n" +
                "int main()\n" +
                "{\n" +
                "    float arr[] = {0.897, 0.565, 0.656, 0.1234, 0.665, 0.3434};\n" +
                "    int n = sizeof(arr)/sizeof(arr[0]);\n" +
                "    bucketSort(arr, n);\n" +
                " \n" +
                "    cout << \"Sorted array is \\n\";\n" +
                "    for (int i=0; i<n; i++)\n" +
                "       cout << arr[i] << \" \";\n" +
                "    return 0;\n" +
                "}" +
                "\n\nOutput:\n" +
                "\n" +
                "Sorted array is\n" +
                "0.1234 0.3434 0.565 0.656 0.665 0.897");
    }
}
