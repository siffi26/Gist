package com.example.hp.above;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class AlgorithmsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algorithms);
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

    public void openAnalysisOfAlgo(View view)
    {
        Intent i = new Intent(this, AnalysisOfAlgoActivity.class);
        startActivity(i);
    }
    public void opensearchingsorting(View view)
    {
        Intent i = new Intent(this, SeachingSortingActivity.class);
        startActivity(i);
    }
    public void openbigo_cheatsheet(View view)
    {
        Intent i = new Intent(this, BigOCheatsheetActivity.class);
        startActivity(i);
    }
    public void opengreedyalgo(View view)
    {
        Intent i = new Intent(this, GreedyAlgoActivity.class);
        startActivity(i);
    }
    public void opendynamicalgo(View view)
    {
        Intent i = new Intent(this, DynamicProgramActivity.class);
        startActivity(i);
    }
    public void openpatternsearch(View view)
    {
        Intent i = new Intent(this, PatternSearchingActivity.class);
        startActivity(i);
    }
    public void openbacktrack(View view)
    {
        Intent i = new Intent(this, BacktrackingActivity.class);
        startActivity(i);
    }
    public void opendivideconquer(View view)
    {
        Intent i = new Intent(this, DivideConquerActivity.class);
        startActivity(i);
    }
    public void openbranchbound(View view)
    {
        Intent i = new Intent(this, BranchBoundActivity.class);
        startActivity(i);
    }
    public void opengraphalgo(View view)
    {
        Intent i = new Intent(this, GraphAlgoActivity.class);
        startActivity(i);
    }
}
