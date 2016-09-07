package com.example.hp.above;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class LinearSearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_search);
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
    public void lin_search(View view) {
        TextView previewText = (TextView) findViewById(R.id.lin_search);
        previewText.setText("\n\nfunction findIndex(values, target)\n" +
                " {\n" +
                "   for(var i = 0; i < values.length; ++i)\n" +
                "     {\n" +
                "       if (values[i] == target) \n" +
                "         {       \n" +
                "           return i; \n" +
                "         }\n" +
                "     }\n" +
                "   return -1;\n" +
                " }\n" +
                "//call the function findIndex with array and number to be searched\n" +
                "findIndex([ 8 , 2 , 6 , 3 , 5 ] , 5) ;");
    }
}
