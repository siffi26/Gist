package com.example.hp.above;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class GreedyAlgoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greedy_algo);
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
    public void openactivityselecprob(View view)
    {
        Intent i = new Intent(this, ActivitySelectionProbActivity.class);
        startActivity(i);
    }
    public void openkruskalmst(View view)
    {
        Intent i = new Intent(this, KruskalActivity.class);
        startActivity(i);
    }
    public void openhuffmancoding(View view)
    {
        Intent i = new Intent(this, HuffmanCodingActivity.class);
        startActivity(i);
    }
    public void openprimmst(View view)
    {
        Intent i = new Intent(this, PrimActivity.class);
        startActivity(i);
    }
    public void opendijkstra(View view)
    {
        Intent i = new Intent(this, DijkstraActivity.class);
        startActivity(i);
    }
    public void openkcentreprob(View view)
    {
        Intent i = new Intent(this, KCentreProbActivity.class);
        startActivity(i);
    }
}
