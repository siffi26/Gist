package com.example.hp.above;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class BasicJavaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_java);
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

    public void openjava_overview(View view)
    {
        Intent i = new Intent(this, JavaOverviewActivity.class);
        startActivity(i);
    }

    public void openjava_variables(View view)
    {
        Intent i = new Intent(this, JavaVariablesActivity.class);
        startActivity(i);
    }

    public void openjava_array(View view)
    {
        Intent i = new Intent(this, JavaArrayActivity.class);
        startActivity(i);
    }
}