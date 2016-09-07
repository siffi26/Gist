package com.example.hp.above;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class AptitudeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aptitude);
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
    public void opennumbers(View view)
    {
        Intent i = new Intent(this, NumbersActivity.class);
        startActivity(i);
    }
    public void open_lcm_hcf(View view)
    {
        Intent i = new Intent(this, LCMandHCFActivity.class);
        startActivity(i);
    }
    public void openworkwages(View view)
    {
        Intent i = new Intent(this, WorkAndWagesActivity.class);
        startActivity(i);
    }
    public void openpipescisterns(View view)
    {
        Intent i = new Intent(this, PipesAndCisternsActivity.class);
        startActivity(i);
    }
    public void opentimespeeddistance(View view)
    {
        Intent i = new Intent(this, TimeSpeedDistanceActivity.class);
        startActivity(i);
    }
    public void opentrainsboatsstreams(View view)
    {
        Intent i = new Intent(this, TrainsBoatsStreamsActivity.class);
        startActivity(i);
    }
    public void openpercentage(View view)
    {
        Intent i = new Intent(this, PercentageActivity.class);
        startActivity(i);
    }
    public void openratioproprtionpartnership(View view)
    {
        Intent i = new Intent(this, RatioProportionPartnershipActivity.class);
        startActivity(i);
    }
    public void openmixturesalligation(View view)
    {
        Intent i = new Intent(this, MixtureAndAlligationActivity.class);
        startActivity(i);
    }
    public void openaverage(View view)
    {
        Intent i = new Intent(this, AverageActivity.class);
        startActivity(i);
    }
    public void openage(View view)
    {
        Intent i = new Intent(this, AgeActivity.class);
        startActivity(i);
    }
    public void openprofitloss(View view)
    {
        Intent i = new Intent(this, ProfitAndLossActivity.class);
        startActivity(i);
    }
    public void opensimpleinterest(View view)
    {
        Intent i = new Intent(this, SimpleInterestActivity.class);
        startActivity(i);
    }
    public void opencompoundinterest(View view)
    {
        Intent i = new Intent(this, CompoundInterestActivity.class);
        startActivity(i);
    }
    public void openmensuration2d(View view)
    {
        Intent i = new Intent(this, Mensuration2dActivity.class);
        startActivity(i);
    }
    public void openmensuration3d(View view)
    {
        Intent i = new Intent(this, Mensuration3dActivity.class);
        startActivity(i);
    }

    public void openprogression(View view)
    {
        Intent i = new Intent(this, ProgressionsActivity.class);
        startActivity(i);
    }
    public void openpermutation_combination(View view)
    {
        Intent i = new Intent(this, PermutationAndCombinationActivity.class);
        startActivity(i);
    }
    public void openprobability(View view)
    {
        Intent i = new Intent(this, ProbabilityActivity.class);
        startActivity(i);
    }
    public void openclocks(View view)
    {
        Intent i = new Intent(this, ClocksActivity.class);
        startActivity(i);
    }
    public void opencalenders(View view)
    {
        Intent i = new Intent(this, CalendersActivity.class);
        startActivity(i);
    }
    public void openrace(View view)
    {
        Intent i = new Intent(this, RaceActivity.class);
        startActivity(i);
    }

}
