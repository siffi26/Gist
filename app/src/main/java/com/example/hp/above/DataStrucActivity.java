package com.example.hp.above;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class DataStrucActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_struc);
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
    public void openlinkedlist(View view)
    {
        Intent i = new Intent(this, LinkedListActivity.class);
        startActivity(i);
    }
    public void openstack(View view)
    {
        Intent i = new Intent(this, StackActivity.class);
        startActivity(i);
    }
    public void openqueue(View view)
    {
        Intent i = new Intent(this, QueueActivity.class);
        startActivity(i);
    }
    public void open_binary_tree(View view)
    {
        Intent i = new Intent(this, BinaryTreeActivity.class);
        startActivity(i);
    }
    public void openbinarysearchtree(View view)
    {
        Intent i = new Intent(this, BinarySearchTreeActivity.class);
        startActivity(i);
    }
    public void openheaptree(View view)
    {
        Intent i = new Intent(this, HeapActivity.class);
        startActivity(i);
    }
    public void openhashing(View view)
    {
        Intent i = new Intent(this, HashingActivity.class);
        startActivity(i);
    }
    public void opengraph(View view)
    {
        Intent i = new Intent(this, GraphActivity.class);
        startActivity(i);
    }

    public void openarray(View view)
    {
        Intent i = new Intent(this, ArrayActivity.class);
        startActivity(i);
    }
    public void openmatrix(View view)
    {
        Intent i = new Intent(this, MatrixActivity.class);
        startActivity(i);
    }
}
