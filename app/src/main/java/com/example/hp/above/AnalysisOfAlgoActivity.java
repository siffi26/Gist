package com.example.hp.above;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class AnalysisOfAlgoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analysis_of_algo);
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
    public void openasymptoticnotation(View view)
    {
        Intent i = new Intent(this, AsymptoticActivity.class);
        startActivity(i);
    }
    public void openanalysisloops(View view)
    {
        Intent i = new Intent(this, AnalysisLoopActivity.class);
        startActivity(i);
    }
    public void openrecurrences(View view)
    {
        Intent i = new Intent(this, RecurrencesActivity.class);
        startActivity(i);
    }
    public void openspacetimecomplexity(View view)
    {
        Intent i = new Intent(this, SpaceTimeComplexity.class);
        startActivity(i);
    }
    public void opennpcomplete(View view)
    {
        Intent i = new Intent(this, NPCompleteActivity.class);
        startActivity(i);
    }

}
