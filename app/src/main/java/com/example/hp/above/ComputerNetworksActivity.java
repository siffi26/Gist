package com.example.hp.above;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class ComputerNetworksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer_networks);
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
    public void openIntroCn(View view)
    {
        Intent i = new Intent(this, IntroComputerNetworksActivity.class);
        startActivity(i);
    }
    public void openTransmissionMedia(View view)
    {
        Intent i = new Intent(this, TransmissionMediaActivity.class);
        startActivity(i);
    }
    public void openCommunicationNetwork(View view)
    {
        Intent i = new Intent(this, CommunicationNetworkActivity.class);
        startActivity(i);
    }
    public void openIntroModel(View view)
    {
        Intent i = new Intent(this, IntroModelActivity.class);
        startActivity(i);
    }
    public void openOsiModel(View view)
    {
        Intent i = new Intent(this, OsiModelActivity.class);
        startActivity(i);
    }
    public void openTcpIp(View view)
    {
        Intent i = new Intent(this, TcpIpActivity.class);
        startActivity(i);
    }
    public void openKeyTerms(View view)
    {
        Intent i = new Intent(this, KeyTermsActivity.class);
        startActivity(i);
    }
}
