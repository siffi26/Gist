package com.example.hp.above;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class Idioms_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_idioms_);
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
    public void answers_idiom(View view) {
        TextView priceTextView = (TextView) findViewById(R.id.idiom_button);
        priceTextView.setText("\nQuestion I. \nQ1. A   Q2. C   Q3. C   Q4. B   Q5. C   Q6. D\nQuestion II. \n  Q1. B  Q2. A  Q3. D  Q4. D");
    }
}
