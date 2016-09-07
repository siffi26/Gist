package com.example.hp.above;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class ProgrammingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programming);
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
    public void open_c_programs(View view)
    {
        Intent i = new Intent(this, CProgramsActivity.class);
        startActivity(i);
    }
    public void open_overview_c(View view)
    {
        Intent i = new Intent(this, OverviewCActivity.class);
        startActivity(i);
    }
    public void open_c_io(View view)
    {
        Intent i = new Intent(this, CInputOutputActivity.class);
        startActivity(i);
    }
    public void open_data_types(View view)
    {
        Intent i = new Intent(this, DataTypesCActivity.class);
        startActivity(i);
    }
    public void open_decision_making(View view)
    {
        Intent i = new Intent(this, DecisionMakingActivity.class);
        startActivity(i);
    }
    public void open_func(View view)
    {
        Intent i = new Intent(this, FunctionInCActivity.class);
        startActivity(i);
    }
    public void open_c_struc(View view)
    {
        Intent i = new Intent(this, StrucInCActivity.class);
        startActivity(i);
    }
    public void open_pointer(View view)
    {
        Intent i = new Intent(this, PointerCActivity.class);
        startActivity(i);
    }
    public void open_file_handling(View view)
    {
        Intent i = new Intent(this, FileHandlingCActivity.class);
        startActivity(i);
    }
    public void open_dynamic(View view)
    {
        Intent i = new Intent(this, DynamicCProgramActivity.class);
        startActivity(i);
    }
}
