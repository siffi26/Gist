package com.example.hp.above;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class TrainsBoatsStreamsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trains_boats_streams);
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
    public void tbs_answers1(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_tbs1);
        previewText.setText("SOLUTION: Here, time taken by the train to pass the bridge completely would be the time it takes to cover 1000 + 500 = 1500 m at the speed of 90 km / hr = 90 x (5/18) = 25 m / sec.\n" +
                "Therefore, time required = 1500 / 25 = 60 sec = 1 minute ");
    }
    public void tbs_answers2(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_tbs2);
        previewText.setText("SOLUTION:  Let the length of the train be L meters.\n" +
                "=> The train covers L meters in 80 seconds and L + 180 meters in 200 seconds, with the same speed.\n" +
                "We know that Speed = Distance / Time.\n" +
                "=> Speed = L / 80 = (L + 180) / 200\n" +
                "=> L / 80 = (L + 180) / 200\n" +
                "=> 2.5 L = L + 180\n" +
                "=> 1.5 L = 180\n" +
                "=> L = 120\n" +
                "Thus, speed of the train = 120 / 80 = 1.5 m / sec ");
    }
    public void tbs_answers3(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_tbs3);
        previewText.setText("SOLUTION:  Total distance to be covered = 140 + 160 m = 300 m\n" +
                "Relative speed = 40 + 50 = 90 km / hr = 90 x (5 / 18) m / sec = 25 m / sec\n" +
                "Therefore, time taken to pass each other = 300 / 25 = 12 sec ");
    }
    public void tbs_answers4(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_tbs4);
        previewText.setText("SOLUTION: Let the speed of the train be T km / hr.\n" +
                "=> Relative speed = T + 10 km / hr\n" +
                "=> Length of the train = 500 m = 0.5 km\n" +
                "We know that Distance = Speed x Time\n" +
                "=> 0.5 = (T + 10) x (36 / 3600)\n" +
                "=> 50 = T + 10\n" +
                "=> T = 40 km / hr\n" +
                "Therefore, speed of the train is 40 km / hr. ");
    }
    public void tbs_answers5(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_tbs5);
        previewText.setText("SOLUTION: We know that for two trains starting at the same time, S1 : S2 = T2^1/2 : T1^1/2\n" +
                "Here, S2 = 90 km / hr\n" +
                "T1 = 9  hrs\n" +
                "T2 = 16  hrs\n" +
                "=> S1 : 90 = 4 : 3\n" +
                "=> S1 = 120 km / hr\n" +
                "Therefore, speed of train that started from Delhi = 120 km / hr ");
    }
    public void tbs_answers6(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_tbs6);
        previewText.setText("SOLUTION: We are given that speed downstream, D = 20 km / hr and speed upstream, U = 14 km / hr\n" +
                "Therefore, Speed of boat in still water = 0.5 x (D + U) km / hr = 0.5 x (14 + 20) = 17 km / hr\n" +
                "Also, speed of the stream = 0.5 x (D – U) km / hr = 0.5 x (20 – 14) = 3 km / hr\n" +
                "Another method : \n" +
                "Speed of the stream = 0.5 x (D – U) = 0.5 x 6 = 3 km / hr\n" +
                "Speed of the boat in still water = Speed of the stream + Speed Upstream = 3 + 14 = 17 km / hr ");
    }
    public void tbs_answers7(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_tbs7);
        previewText.setText("SOLUTION: We are given that the boatman covers 5 km upstream in 2.5 hours and 15 km downstream in 10 hours.\n" +
                "=> Speed upstream, U = 5 / 2.5 = 2 km / hr\n" +
                "=> Speed downstream, D = 15 / 1.5 = 10 km / hr\n" +
                "Therefore, Speed of boat in still water = 0.5 x (D + U) km / hr = 0.5 x (10 + 2) = 6 km / hr\n" +
                "Also, speed of the stream = 0.5 x (D – U) km / hr = 0.5 x (10 – 2) = 4 km / hr ");
    }
    public void tbs_answers8(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_tbs8);
        previewText.setText("SOLUTION: Speed upstream = 7 – 2 = 5 km / hr\n" +
                "Speed downstream = 7 + 2 = 9 km / hr\n" +
                "Let the distance between the port and the island be D km. Also, we know that Time = Distance / Speed\n" +
                "=> (D/5) + (D/9) = 56/60\n" +
                "=> (14 D) / 45 = 56 / 60\n" +
                "=> D = 3 km\n" +
                "Therefore, distance between the port and the island = 3 km ");
    }
    public void tbs_answers9(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_tbs9);
        previewText.setText("Let the speed of the boat in still water be B km / hr.\n" +
                "=> Speed upstream = (B – 2) km / hr\n" +
                "=> Speed downstream = (B + 2) km / hr\n" +
                "We know that Time = Distance / Speed\n" +
                "=> 6/(B-2) + 6/(B+2) = 4\n" +
                "=> 6 B + 12 + 6 B – 12 = 4 (B – 2) (B + 2)\n" +
                "=> 12 B = 4 (B – 2) (B + 2)\n" +
                "=> 3 B = B2 – 4\n" +
                "=> B2 – 3 B – 4 = 0\n" +
                "=> (B + 1) (B – 4) = 0\n" +
                "=> B = 4 km / hr (Speed cannot be negative) ");
    }
    public void tbs_answers10(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_tbs10);
        previewText.setText("SOLUTION:  Let the speed upstream be U km / hr and speed downstream be D km / hr.\n" +
                "We know that Distance / Speed = Time\n" +
                "=> (30 / U) + (44 / D) = 10 and (40 / U) + (55 / D) = 13\n" +
                "Solving the above pair of linear equations, we get\n" +
                "D = 11 km / hr\n" +
                "U = 5 km / hr\n" +
                "Therefore, Speed of boat in still water = 0.5 x (D + U) km / hr = 0.5 x (11 + 5) = 8 km / hr\n" +
                "Also, speed of the stream = 0.5 x (D – U) km / hr = 0.5 x (11 – 5) = 3 km / hr ");
    }

}