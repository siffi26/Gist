package com.example.hp.above;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class BasicSQLActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_sql);
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

    public void opensql_introduction(View view)
    {
        Intent i = new Intent(this, SqlintroActivity.class);
        startActivity(i);
    }
    public void opensql_ddl(View view)
    {
        Intent i = new Intent(this, SqlDdlActivity.class);
        startActivity(i);
    }
    public void opensql_dml(View view)
    {
        Intent i = new Intent(this, SqlDmlActivity.class);
        startActivity(i);
    }
    public void opensql_tcl(View view)
    {
        Intent i = new Intent(this, SqlTclActivity.class);
        startActivity(i);
    }
    public void opensql_dcl(View view)
    {
        Intent i = new Intent(this, SqlDclActivity.class);
        startActivity(i);
    }
    public void opensql_clauses(View view)
    {
        Intent i = new Intent(this, SqlClausesActivity.class);
        startActivity(i);
    }

}