package com.example.hp.above;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class ReasoningActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reasoning);
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
    public void openseries(View view)
    {
        Intent i = new Intent(this, SeriesActivity.class);
        startActivity(i);
    }
    public void opendatasufficiency(View view)
    {
        Intent i = new Intent(this, DatasufficiencyActivity.class);
        startActivity(i);
    }
    public void opensentencerearrange(View view)
    {
        Intent i = new Intent(this, SentenceRearrangeActivity.class);
        startActivity(i);
    }
    public void openassumptions(View view)
    {
        Intent i = new Intent(this, AssumptionsActivity.class);
        startActivity(i);
    }
    public void openpuzzles(View view)
    {
        Intent i = new Intent(this, PuzzlesActivity.class);
        startActivity(i);
    }
    public void opensyllogism(View view)
    {
        Intent i = new Intent(this, SyllogismActivity.class);
        startActivity(i);
    }
    public void opendatainterpretation(View view)
    {
        Intent i = new Intent(this, DataInterpretationActivity.class);
        startActivity(i);
    }
}
