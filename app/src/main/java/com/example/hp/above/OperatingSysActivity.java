package com.example.hp.above;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class OperatingSysActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operating_sys);
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
    public void open_os_intro(View view)
    {
        Intent i = new Intent(this, OsIntroductionActivity.class);
        startActivity(i);
    }
    public void open_process_scheduling(View view)
    {
        Intent i = new Intent(this, ProcessSchedulingActivity.class);
        startActivity(i);
    }
    public void open_cpu_scheduling(View view)
    {
        Intent i = new Intent(this, CpuSchedulingActivity.class);
        startActivity(i);
    }
    public void open_intro_threads(View view)
    {
        Intent i = new Intent(this, IntroThreadsActivity.class);
        startActivity(i);
    }
    public void open_process_sync(View view)
    {
        Intent i = new Intent(this, ProcessSynchronizationActivity.class);
        startActivity(i);
    }
    public void open_deadlocks(View view)
    {
        Intent i = new Intent(this, DeadlocksActivity.class);
        startActivity(i);
    }
    public void open_memory_mgmt(View view)
    {
        Intent i = new Intent(this, MemoryManagementActivity.class);
        startActivity(i);
    }
}
