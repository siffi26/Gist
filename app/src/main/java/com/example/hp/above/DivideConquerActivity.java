package com.example.hp.above;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class DivideConquerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_divide_conquer);
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
    public void open_intro_divide(View view)
    {
        Intent i = new Intent(this, IntroDivideAndConquerActivity.class);
        startActivity(i);
    }
    public void open_power_function(View view)
    {
        Intent i = new Intent(this, PowerFuncActivity.class);
        startActivity(i);
    }
    public void open_median_arrays(View view)
    {
        Intent i = new Intent(this, MedianSortedArrayActivity.class);
        startActivity(i);
    }
    public void open_strassens_multiplication(View view)
    {
        Intent i = new Intent(this, StrassensMatrixActivity.class);
        startActivity(i);
    }
}
