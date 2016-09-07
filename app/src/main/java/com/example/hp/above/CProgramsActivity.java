package com.example.hp.above;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class CProgramsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cprograms);
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

    public void openfactorialc(View view)
    {
        Intent i = new Intent(this, FactorialProgramActivity.class);
        startActivity(i);
    }
    public void openreverse(View view)
    {
        Intent i = new Intent(this, ReverseProgramActivity.class);
        startActivity(i);
    }
    public void openfibonacci(View view)
    {
        Intent i = new Intent(this, FibonacciProgramActivity.class);
        startActivity(i);
    }
    public void opensum(View view)
    {
        Intent i = new Intent(this, SumProgramActivity.class);
        startActivity(i);
    }
    public void opensort(View view)
    {
        Intent i = new Intent(this, SortingProgramActivity.class);
        startActivity(i);
    }
    public void openswap(View view)
    {
        Intent i = new Intent(this, SwapProgramActivity.class);
        startActivity(i);
    }
    public void openlargest(View view)
    {
        Intent i = new Intent(this, LargestProgramActivity.class);
        startActivity(i);
    }
    public void openpalindrome(View view)
    {
        Intent i = new Intent(this, PalindromeProgramActivity.class);
        startActivity(i);
    }
    public void openremove(View view)
    {
        Intent i = new Intent(this, RemoveProgramActivity.class);
        startActivity(i);
    }

}
