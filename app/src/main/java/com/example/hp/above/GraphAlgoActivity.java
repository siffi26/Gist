package com.example.hp.above;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class GraphAlgoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graph_algo);
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
    public void opendefinitiongraph(View view)
    {
        Intent i = new Intent(this, GraphDefinitionRepresentationActivity.class);
        startActivity(i);
    }
    public void openbfs(View view)
    {
        Intent i = new Intent(this, BreadthFirstSearchActivity.class);
        startActivity(i);
    }
    public void opendfs(View view)
    {
        Intent i = new Intent(this, DepthFirstSearchActivity.class);
        startActivity(i);
    }
    public void openbipartite(View view)
    {
        Intent i = new Intent(this, BipartiteGraphActivity.class);
        startActivity(i);
    }
    public void opentopological(View view)
    {
        Intent i = new Intent(this, TopologicalSortingActivity.class);
        startActivity(i);
    }
    public void openbiconnected(View view)
    {
        Intent i = new Intent(this, BiconnectedComponentsActivity.class);
        startActivity(i);
    }

}
