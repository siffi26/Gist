package com.example.hp.above;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class EnglishActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english);
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
    public void opensentencerearrange(View view)
    {
        Intent i = new Intent(this, SentenceRearrangeActivity.class);
        startActivity(i);
    }
    public void openerrordetect(View view)
    {
        Intent i = new Intent(this, ErrorDetectCorrectActivity.class);
        startActivity(i);
    }
    public void openfillinblank(View view)
    {
        Intent i = new Intent(this, FillInBlankActivity.class);
        startActivity(i);
    }
    public void opencomprehension(View view)
    {
        Intent i = new Intent(this, ComprehendActivity.class);
        startActivity(i);
    }
    public void openidioms(View view)
    {
        Intent i = new Intent(this, Idioms_Activity.class);
        startActivity(i);
    }
    public void openoneword(View view)
    {
        Intent i = new Intent(this, OneWordSubstituteActivity.class);
        startActivity(i);
    }
}
