package com.example.hp.above;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class OsiModelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_osi_model);
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
    public void openPhysical(View view)
    {
        Intent i = new Intent(this, PhysicalLayerActivity.class);
        startActivity(i);
    }
    public void openDatalink(View view)
    {
        Intent i = new Intent(this, DatalinkLayerActivity.class);
        startActivity(i);
    }
    public void openNetwork(View view)
    {
        Intent i = new Intent(this, NetworkLayerActivity.class);
        startActivity(i);
    }
    public void openTransport(View view)
    {
        Intent i = new Intent(this, TransportLayerActivity.class);
        startActivity(i);
    }
    public void openSession(View view)
    {
        Intent i = new Intent(this, SessionLayerActivity.class);
        startActivity(i);
    }
    public void openPresentation(View view)
    {
        Intent i = new Intent(this, PresentationLayerActivity.class);
        startActivity(i);
    }
    public void openApplication(View view)
    {
        Intent i = new Intent(this, ApplicationLayerActivity.class);
        startActivity(i);
    }

}
