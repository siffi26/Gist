package com.example.hp.above;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class BacktrackingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_backtracking);
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
    public void openstring_permutations(View view)
    {
        Intent i = new Intent(this, StringPermutationsActivity.class);
        startActivity(i);
    }
    public void openhamiltonian_cycle(View view)
    {
        Intent i = new Intent(this, HamiltonianCycleActivity.class);
        startActivity(i);
    }
    public void openn_queens(View view)
    {
        Intent i = new Intent(this, NQueensProblemActivity.class);
        startActivity(i);
    }
    public void openm_coloring(View view)
    {
        Intent i = new Intent(this, MColoringProblemActivity.class);
        startActivity(i);
    }
    public void opensudoku(View view)
    {
        Intent i = new Intent(this, SudokuActivity.class);
        startActivity(i);
    }
    public void opensubset_sum(View view)
    {
        Intent i = new Intent(this, SubsetSumBacktrackingActivity.class);
        startActivity(i);
    }

}
