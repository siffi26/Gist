package com.example.hp.above;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MixtureAndAlligationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mixture_and_alligation);
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
    public void ma_answers1(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_ma1);
        previewText.setText("SOLUTION: From a vessel of 20 liters pure milk, 1 liter is taken out and replaced with water, so as to keep the volume constant to 20 liters. This process is repeated 5 times. Find the percentage of pure milk left in the vessel after 5 replacements.\n" +
                "Solution : Here, we need to apply the formula P x [1 – (R / P)]n\n" +
                "P = Initial quantity of pure element = 20 liters\n" +
                "R = Quantity replaced every time = 1 liter\n" +
                "n = Number of replacements = 5\n" +
                "So, quantity of pure milk after 5 replacements = 20 x [1 – (1 / 20)]5\n" +
                "Quantity of pure milk after 5 replacements = 20 x (0.95)5 = 20 x 0.773780938 = 15.4756 liters\n" +
                "Therefore, percentage of pure milk left in the vessel after 5 replacements = (15.4756 / 20) x 100 = 77.378 %");
    }
    public void ma_answers2(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_ma2);
        previewText.setText(" Thus, ratio of quantities of cheaper and good quality rice = 10 : 5 = 2 : 1");

        ImageView iv= (ImageView) findViewById(R.id.answers2_image);
        iv.setImageResource(R.drawable.alligation3);
    }
}