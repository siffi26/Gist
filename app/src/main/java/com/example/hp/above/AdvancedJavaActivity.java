package com.example.hp.above;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class AdvancedJavaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced_java);
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


    public void openjava_string(View view)
    {
        Intent i = new Intent(this, StringHandlingActivity.class);
        startActivity(i);
    }

    public void openjava_exception(View view)
    {
        Intent i = new Intent(this, ExceptionHandlingActivity.class);
        startActivity(i);
    }

    public void openjava_multithreading(View view)
    {
        Intent i = new Intent(this, MultithreadingActivity.class);
        startActivity(i);
    }

    public void openjava_synchronization(View view)
    {
        Intent i = new Intent(this, SynchronizationActivity.class);
        startActivity(i);
    }

    public void openjava_autoboxing(View view)
    {
        Intent i = new Intent(this, AutoboxingActivity.class);
        startActivity(i);
    }
}