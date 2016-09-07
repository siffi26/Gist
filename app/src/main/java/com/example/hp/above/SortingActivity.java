package com.example.hp.above;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class SortingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sorting);
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
    public void openquicksort(View view)
    {
        Intent i = new Intent(this, QuicksortActivity.class);
        startActivity(i);
    }
    public void openmergesort(View view)
    {
        Intent i = new Intent(this, MergesortActivity.class);
        startActivity(i);
    }
    public void openheapsort(View view)
    {
        Intent i = new Intent(this, HeapsortActivity.class);
        startActivity(i);
    }
    public void openinsertionsort(View view)
    {
        Intent i = new Intent(this, InsertionsortActivity.class);
        startActivity(i);
    }
    public void openselectionsort(View view)
    {
        Intent i = new Intent(this, SelectionsortActivity.class);
        startActivity(i);
    }
    public void openbubblesort(View view)
    {
        Intent i = new Intent(this, BubblesortActivity.class);
        startActivity(i);
    }
    public void opencountingsort(View view)
    {
        Intent i = new Intent(this, CountingsortActivity.class);
        startActivity(i);
    }
    public void openradixsort(View view)
    {
        Intent i = new Intent(this, RadixsortActivity.class);
        startActivity(i);
    }
    public void openbucketsort(View view)
    {
        Intent i = new Intent(this, BucketsortActivity.class);
        startActivity(i);
    }
    public void openshellsort(View view)
    {
        Intent i = new Intent(this, ShellsortActivity.class);
        startActivity(i);
    }
}
