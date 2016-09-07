package com.example.hp.above;

import android.app.ActionBar;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //ActionBar actionBar = getActionBar();
        //actionBar.setDisplayHomeAsUpEnabled(true);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
              this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }



    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.about) {
            // Handle the camera action
            Intent i = new Intent(this, AboutActivity.class);
            startActivity(i);


        } else if (id == R.id.help) {
            Intent i = new Intent(this, HelpActivity.class);
            startActivity(i);
        }

        else if (id == R.id.feedback) {
            Intent intent = new Intent(Intent.ACTION_SENDTO);
            intent.setData(Uri.parse("mailto:gist2908@gmail.com")); // only email apps should handle this
            intent.putExtra(Intent.EXTRA_SUBJECT, "Feedback for Gist");
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
            }
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


    public void openaptitude(View view)
    {
        Intent i = new Intent(this, AptitudeActivity.class);
        startActivity(i);
    }

    public void openreasoning(View view)
    {
        Intent i = new Intent(this, ReasoningActivity.class);
        startActivity(i);
    }

    public void openenglish(View view)
    {
        Intent i = new Intent(this, EnglishActivity.class);
        startActivity(i);
    }

    public void opends(View view)
    {
        Intent i = new Intent(this, DataStrucActivity.class);
        startActivity(i);
    }

    public void openalgorithm(View view)
    {
        Intent i = new Intent(this, AlgorithmsActivity.class);
        startActivity(i);
    }

    public void openprogramming(View view)
    {
        Intent i = new Intent(this, ProgrammingActivity.class);
        startActivity(i);
    }

    public void openoops(View view)
    {
        Intent i = new Intent(this, OopsActivity.class);
        startActivity(i);
    }

    public void opendbms(View view)
    {
        Intent i = new Intent(this, DbmsActivity.class);
        startActivity(i);
    }

    public void openos(View view)
    {
        Intent i = new Intent(this, OperatingSysActivity.class);
        startActivity(i);
    }
    public void opencn(View view)
    {
        Intent i = new Intent(this, ComputerNetworksActivity.class);
        startActivity(i);
    }


}
