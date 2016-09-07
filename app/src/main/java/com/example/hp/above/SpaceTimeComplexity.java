package com.example.hp.above;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class SpaceTimeComplexity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_space_time_complexity);
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
    public void space_time(View view)
    {
        TextView tv = (TextView) findViewById(R.id.space_time);
        tv.setText("What is the time complexity of following function fun()? Assume that log(x) returns log value in base 2.\n" +
                "\n" +
                "void fun()\n" +
                "{\n" +
                "   int i, j;\n" +
                "   for (i=1; i<=n; i++)\n" +
                "      for (j=1; j<=log(i); j++)\n" +
                "         printf(\"GeeksforGeeks\");\n" +
                "}\n" +
                "Time Complexity of the above function can be written as Θ(log 1) + Θ(log 2) + Θ(log 3) + . . . . + Θ(log n) which is Θ (log n!)\n" +
                "\n" +
                "Order of growth of ‘log n!’ and ‘n log n’ is same for large values of n, i.e., Θ (log n!) = Θ(n log n). So time complexity\n" +
                " of fun() is Θ(n log n)." +
                "\n\nRefer to Big-O-Complexity Chart for space and time complexity of different Data Structures and Algorithms.");
    }
}
