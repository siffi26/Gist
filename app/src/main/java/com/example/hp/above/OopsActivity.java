package com.example.hp.above;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class OopsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oops);
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

    public void openbasic_java(View view)
    {
        Intent i = new Intent(this, BasicJavaActivity.class);
        startActivity(i);
    }

    public void openoops_concepts(View view)
    {
        Intent i = new Intent(this, JavaOopsActivity.class);
        startActivity(i);
    }

    public void openadvanced_java(View view)
    {
        Intent i = new Intent(this, AdvancedJavaActivity.class);
        startActivity(i);
    }
}