package com.example.hp.above;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class TimeSpeedDistanceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_speed_distance);
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
    public void tds_answers1(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_tds1);
        previewText.setText("SOLUTION:Let time taken by postman to travel from post office to village=t minutes.\n" +
                "According to the given situation, distance from post office to village, say d1=25/60*t km {25 km/hr = 25/60 km/minutes}\n" +
                "And\n" +
                "distance from village to post office, say d2=4/60*(174-t) km {2 hours 54 minutes = 174 minutes}\n" +
                "Since distance between village and post office will always remain same i.e. d1 = d2\n" +
                "=> 25/60*t = 4/60*(174-t) => t = 24 minutes.\n" +
                "=> Distance between post office and village = speed*time =>25/60*24 = 10km\n" +
                "  ");
    }
    public void tds_answers2(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_tds2);
        previewText.setText("SOLUTION: Let the distance between his home and the station be ‘d’ km.\n" +
                "=> Time required to reach the station at 5 km / hr = d/5 hours\n" +
                "=> Time required to reach the station at 6 km / hr = d/6 hours\n" +
                "Now, the difference between these times is 12 minutes = 0.2 hours. (7 minutes late – 5 minutes early = (7) – (-5) = 12 minutes)\n" +
                "Therefore, (d / 5) – (d / 6) = 0.2\n" +
                "=> d / 30 = 0.2\n" +
                "=> d = 6\n" +
                "Thus, the distance between his home and the station is 6 km. ");
    }
    public void tds_answers3(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_tds3);
        previewText.setText("SOLUTION:The train leaving from B leaves an hour early than the train that leaves from M.\n" +
                "=> Distance covered by train leaving from B = 65 km / hr x 1 hr = 65 km\n" +
                "Distance left = 465 – 65 = 400 km\n" +
                "Now, the train from M also gets moving and both are moving towards each other.\n" +
                "Applying the formula for relative speed,\n" +
                "Relative speed = 65 + 35 = 100 km / hr\n" +
                "=> Time required by the trains to meet = 400 km / 100 km / hr = 4 hours\n" +
                "Thus, the trains meet at 4 hours after 11 AM, i.e., 3 PM. ");
    }
    public void tds_answers4(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_tds4);
        previewText.setText("SOLUTION:Since both are running in the same direction, relative speed = 10 – 8 = 2 km / hr\n" +
                "Now, to catch the robber if he were stagnant, the policeman would have to run 300 m. But since both are moving, the policeman needs to finish off this separation of 300 m.\n" +
                "=> 300 m (or 0.3 km)is to be covered at the relative speed of 2 km / hr.\n" +
                "=> Time taken = 0.3 / 2 = 0.15 hours\n" +
                "Therefore, distance run by robber before being caught = Distance run in 0.15 hours\n" +
                "=> Distance run by the robber = 8 x 0.15 = 1.2 km\n" +
                " \n" +
                "Another Solution : \n" +
                "Time of running for both the policeman and the robber is same.\n" +
                "We know that Distance = Speed x Time\n" +
                "=> Time = Distance / Speed\n" +
                "Let the distance run by the robber be ‘x’ km at the speed of 8 km / hr.\n" +
                "=> Distance run by policeman at the speed of 10 km / hr = x + 0.3\n" +
                "Therefore, x / 8 = (x + 0.3) / 10\n" +
                "=> 10 x = 8 (x + 0.3)\n" +
                "=> 10 x = 8 x + 2.4\n" +
                "=> 2 x = 2.4\n" +
                "=> x = 1.2\n" +
                "Therefore, Distance run by the robber before getting caught = 1.2 km ");
    }
    public void tds_answers5(View view)
    {
        TextView previewText= (TextView)findViewById(R.id.solution_tds5);
        previewText.setText("SOLUTION:Time taken to walk one side + Time taken to ride one side = 4 hours\n" +
                "Time taken to ride both sides = 2 x Time taken to walk one side = 6 hours\n" +
                "=> Time taken to walk one side = 3 hours\n" +
                "Therefore, time taken to ride one side = 4 – 3 = 1 hour\n" +
                "Thus, time taken to ride both sides = 2 x 1 = 2 hours\n" +
                " ");
    }
}