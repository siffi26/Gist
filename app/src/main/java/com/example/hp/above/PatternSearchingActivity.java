package com.example.hp.above;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class PatternSearchingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pattern_searching);
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
    public void opennaivepattern(View view)
    {
        Intent i = new Intent(this, NaiveActivity.class);
        startActivity(i);
    }
    public void openkmpalgo(View view)
    {
        Intent i = new Intent(this, KMPActivity.class);
        startActivity(i);
    }
    public void openboyermoore(View view)
    {
        Intent i = new Intent(this, BoyerMooreActivity.class);
        startActivity(i);
    }
    public void openrabinkarp(View view)
    {
        Intent i = new Intent(this, RabinKarpActivity.class);
        startActivity(i);
    }
}
