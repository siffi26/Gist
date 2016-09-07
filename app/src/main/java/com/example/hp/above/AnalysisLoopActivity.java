package com.example.hp.above;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class AnalysisLoopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analysis_loop);
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
    public void examples(View view) {
        TextView tv = (TextView) findViewById(R.id.examples);
        tv.setText("\n\n" +
                "   // Here c is a constant\n" +
                "   for (int i = 1; i <= c; i++) {\n" +
                "        // some O(1) expressions\n" +
                "   }" +
                "\n\n" +
                "\n\n2) O(n): Time Complexity of a loop is considered as O(n) if the loop variables is incremented / decremented by a constant amount. For example following functions have O(n) time complexity.\n" +
                "\n" +
                "   // Here c is a positive integer constant\n" +
                "   for (int i = 1; i <= n; i += c) {\n" +
                "        // some O(1) expressions\n" +
                "   }\n" +
                "\n" +
                "   for (int i = n; i > 0; i -= c) {\n" +
                "        // some O(1) expressions\n" +
                "   }" +
                "\n\n" +
                "\n\n3) O(nc): Time complexity of nested loops is equal to the number of times the innermost statement is executed. For example the following sample loops have O(n2) time complexity\n" +
                "\n" +
                "\n" +
                "   for (int i = 1; i <=n; i += c) {\n" +
                "       for (int j = 1; j <=n; j += c) {\n" +
                "          // some O(1) expressions\n" +
                "       }\n" +
                "   }\n" +
                "\n" +
                "   for (int i = n; i > 0; i += c) {\n" +
                "       for (int j = i+1; j <=n; j += c) {\n" +
                "          // some O(1) expressions\n" +
                "   }\n" +
                "\n\nFor example Selection sort and Insertion Sort have O(n2) time complexity." +
                "\n\n" +
                "" +
                "" +
                "\n\n4) O(Logn) Time Complexity of a loop is considered as O(Logn) if the loop variables is divided / multiplied by a constant amount.\n" +
                "\n" +
                "   for (int i = 1; i <=n; i *= c) {\n" +
                "       // some O(1) expressions\n" +
                "   }\n" +
                "   for (int i = n; i > 0; i /= c) {\n" +
                "       // some O(1) expressions\n" +
                "   }\n" +
                "\n\nFor example Binary Search(refer iterative implementation) has O(Logn) time complexity." +
                "\n\n" +
                "" +
                "\n\n5) O(LogLogn) Time Complexity of a loop is considered as O(LogLogn) if the loop variables is reduced / increased exponentially by a constant amount.\n" +
                "\n" +
                "   // Here c is a constant greater than 1\n" +
                "   for (int i = 2; i <=n; i = pow(i, c)) {\n" +
                "       // some O(1) expressions\n" +
                "   }\n" +
                "   //Here fun is sqrt or cuberoot or any other constant root\n" +
                "   for (int i = n; i > 0; i = fun(i)) {\n" +
                "       // some O(1) expressions\n" +
                "  }" +
                "" +
                "\n\n" +
                "\n\nHow to combine time complexities of consecutive loops?\n" +
                "\n\nWhen there are consecutive loops, we calculate time complexity as sum of time complexities of individual loops.\n" +
                "\n" +
                "   for (int i = 1; i <=m; i += c) {  \n" +
                "        // some O(1) expressions\n" +
                "   }\n" +
                "   for (int i = 1; i <=n; i += c) {\n" +
                "        // some O(1) expressions\n" +
                "   }\n" +
                "\n\n   Time complexity of above code is O(m) + O(n) which is O(m+n)\n" +
                "\n   If m == n, the time complexity becomes O(2n) which is O(n). ");
    }
}
