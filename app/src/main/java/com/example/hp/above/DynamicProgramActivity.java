package com.example.hp.above;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class DynamicProgramActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamic_program);
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
    public void openknapsack(View view)
    {
        Intent i = new Intent(this, KnapsackProbActivity.class);
        startActivity(i);
    }
    public void openwarshall(View view)
    {
        Intent i = new Intent(this, FloydWarshallActivity.class);
        startActivity(i);
    }
    public void openbellmanford(View view)
    {
        Intent i = new Intent(this, BellmanFordActivity.class);
        startActivity(i);
    }
    public void opensubsetsum(View view)
    {
        Intent i = new Intent(this, SubsetSumActivity.class);
        startActivity(i);
    }
    public void openweightedjobsch(View view)
    {
        Intent i = new Intent(this, WeightedJobScheduleActivity.class);
        startActivity(i);
    }
}
