package com.example.hp.above;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MemoryManagementActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memory_management);
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
    public void openmemory(View view)
    {
        Intent i = new Intent(this, MemManageActivity.class);
        startActivity(i);
    }
    public void openvirtual(View view)
    {
        Intent i = new Intent(this, VirtualMemoryActivity.class);
        startActivity(i);
    }
    public void openfile(View view)
    {
        Intent i = new Intent(this, FileSystemActivity.class);
        startActivity(i);
    }

}
