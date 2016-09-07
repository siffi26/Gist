package com.example.hp.above;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class KCentreProbActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kcentre_prob);
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
    public void kcentre_code(View view) {
        TextView tv = (TextView) findViewById(R.id.kcentre_code);
        tv.setText("Example (k = 3 in the above shown Graph)\n" +
                "a) Let the first arbitrarily picked vertex be 0.\n" +
                "\n" +
                "b) The next vertex is 1 because 1 is the farthest vertex from 0.\n" +
                "\n" +
                "c) Remaining cities are 2 and 3. Calculate their distances from already selected centers (0 and 1). The greedy algorithm basically calculates following values.\n" +
                "\n" +
                "        Minimum of all distanced from 2 to already considered centers\n" +
                "        Min[dist(2, 0), dist(2, 1)] = Min[7, 8] = 7\n" +
                "\n" +
                "        Minimum of all distanced from 3 to already considered centers\n" +
                "        Min[dist(3, 0), dist(3, 1)] = Min[6, 5] = 5\n" +
                "\n" +
                "        After computing the above values, the city 2 is picked as the value corresponding to 2 is maximum.\n" +
                "\n" +
                "Note that the greedy algorithm doesn’t give best solution for k = 2 as this is just an approximate algorithm with bound as twice of optimal.\n" +
                "\n" +
                "Proof that the above greedy algorithm is 2 approximate.\n" +
                "Let OPT be the maximum distance of a city from a center in the Optimal solution. We need to show that the maximum distance obtained from Greedy algorithm is 2*OPT.\n" +
                "\n" +
                "The proof can be done using contradiction.\n" +
                "\n" +
                "a) Assume that the distance from the furthest point to all centers is > 2·OPT.\n" +
                "\n" +
                "b) This means that distances between all centers are also > 2·OPT.\n" +
                "\n" +
                "c) We have k + 1 points with distances > 2·OPT between every pair.\n" +
                "\n" +
                "d) Each point has a center of the optimal solution with distance <= OPT to it.\n" +
                "\n" +
                "e) There exists a pair of points with the same center X in the optimal solution (pigeonhole principle: k optimal centers, k+1 points)\n" +
                "\n" +
                "f) The distance between them is at most 2·OPT (triangle inequality) which is a contradiction.");
    }
}
