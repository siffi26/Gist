package com.example.hp.above;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class AdvancedSQLActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced_sql);
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

    public void opensql_constraints(View view)
    {
        Intent i = new Intent(this, SqlConstraintsActivity.class);
        startActivity(i);
    }

    public void opensql_functions(View view)
    {
        Intent i = new Intent(this, SqlFunctionsActivity.class);
        startActivity(i);
    }

    public void opensql_join(View view)
    {
        Intent i = new Intent(this, SqlJoinActivity.class);
        startActivity(i);
    }

    public void opensql_set(View view)
    {
        Intent i = new Intent(this, SqlSetActivity.class);
        startActivity(i);
    }

    public void opensql_view(View view)
    {
        Intent i = new Intent(this, SqlViewActivity.class);
        startActivity(i);
    }
}