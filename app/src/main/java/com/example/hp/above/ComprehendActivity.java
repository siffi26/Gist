package com.example.hp.above;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class ComprehendActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comprehend);
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
    public void answers_comprehend(View view) {
        TextView priceTextView = (TextView) findViewById(R.id.comprehend_button);
        priceTextView.setText("\nParagraph 1: \n Q1. C   Q2. C   Q3. D   \nParagraph 2\nQ1. B   Q2. A   Q3. D  Q4. A");
    }
}
