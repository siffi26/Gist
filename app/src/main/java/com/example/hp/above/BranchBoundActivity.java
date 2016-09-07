package com.example.hp.above;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class BranchBoundActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_branch_bound);
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
    public void open_intro_knapsack(View view)
    {
        Intent i = new Intent(this, KnapsackOneActivity.class);
        startActivity(i);
    }
    public void open_implement_knapsack(View view)
    {
        Intent i = new Intent(this, KnapsackTwoActivity.class);
        startActivity(i);
    }
    public void open_eight_puzzle(View view)
    {
        Intent i = new Intent(this, EightPuzzleBranchActivity.class);
        startActivity(i);
    }
    public void open_job_assignment(View view)
    {
        Intent i = new Intent(this, JobAssignmentActivity.class);
        startActivity(i);
    }
}
