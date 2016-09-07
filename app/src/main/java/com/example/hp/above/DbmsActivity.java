package com.example.hp.above;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class DbmsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dbms);
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
    public void opendbms_overview(View view)
    {
        Intent i = new Intent(this, OverviewActivity.class);
        startActivity(i);
    }
    public void opendbms_architecture(View view)
    {
        Intent i = new Intent(this, DatabaseArchitectureActivity.class);
        startActivity(i);
    }
    public void opendbms_model(View view)
    {
        Intent i = new Intent(this, DatabaseModelActivity.class);
        startActivity(i);
    }
    public void opendbms_codd(View view)
    {
        Intent i = new Intent(this, CoddRulesActivity.class);
        startActivity(i);
    }
    public void opendbms_rdbms(View view)
    {
        Intent i = new Intent(this, RDBMSActivity.class);
        startActivity(i);
    }
    public void opendbms_normalization(View view)
    {
        Intent i = new Intent(this, NormalizationActivity.class);
        startActivity(i);
    }
    public void opendbms_specialization(View view)
    {
        Intent i = new Intent(this, GeneralizationAndSpecializationActivity.class);
        startActivity(i);
    }
    public void opendbms_ER(View view)
    {
        Intent i = new Intent(this, ERDiagramActivity.class);
        startActivity(i);
    }
    public void opendbms_SQL(View view)
    {
        Intent i = new Intent(this, SQLActivity.class);
        startActivity(i);
    }

}
