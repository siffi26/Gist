package com.example.hp.above;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class AssumptionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assumptions);getSupportActionBar().setDisplayHomeAsUpEnabled(true);
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
    public void assume_ques1(View view)
    {
        TextView previewText = (TextView) findViewById(R.id.assume_ques1);
        previewText.setText("Answer with explanation: \n" +
                "\n" +
                "In this the author is not clearly stated whether there is a need to channellise anger into energy or not. So, I is irrelevant. In the statement II it is given that channelizing anger to energy is a skill. Here the assumption of the author is that only those people who has the skill can channelize anger to energy. Only II is implicit.\n");
    }

    public void assume_ques2(View view)
    {
        TextView previewText = (TextView) findViewById(R.id.assume_ques2);
        previewText.setText("Answer with explanation: \n" +
                "\n" +
                "The passage does not state that only the medicine ‘x’ caused ripples in the medical field. Hence (1) cannot be a valid assumption. We cannot say that medicine ‘x’ is a great drug just because it caused ripples in the medical field. Hence, (ii) also is not valid.\n");
    }

    public void assume_ques3(View view)
    {
        TextView previewText = (TextView) findViewById(R.id.assume_ques3);
        previewText.setText("Answer with explanation:\n" +
                "is talking about other classes which cannot be inferred from the given statement. This is not an assumption is an assumption as this is clearly expressed in the given statement with the use of the words atrociously priced\n" +
                "\n");
    }

    public void assume_ques4(View view)
    {
        TextView previewText = (TextView) findViewById(R.id.assume_ques4);
        previewText.setText("Answer: Option E\n" +
                "Explanation:\n" +
                "The performance of the individual has to be tested over a span of time as the statement mentions. So, I is implicit. " +
                "The statement mentions that the individual's worth shall be reviewed (during probation period) before confirmation. " +
                "So, II is also implicit.\n");
    }
    public void assume_ques5(View view)
    {
        TextView previewText = (TextView) findViewById(R.id.assume_ques5);
        previewText.setText("Answer: Option A\n" +
                "    Explanation:\n" +
                "    Since the statement talks of putting the child in school at the age of 5, it means that the " +
                "child is mentally prepared for the same at this age. So, I is implicit. But nothing about admission after 6 years of age is mentioned in the statement." +
                " So, II is not implicit.\n");
    }
    public void assume_ques6(View view)
    {
        TextView previewText = (TextView) findViewById(R.id.assume_ques6);
        previewText.setText("Answer: Option B\n" +
                "    Explanation:\n" +
                "    Assumption I goes against the statement. So, it is not implicit. The allowance will serve as a reward to the employees and shall provoke them to come on time.\n" +
                "    So, II is implicit.");
    }
    public void assume_ques7(View view)
    {
        TextView previewText = (TextView) findViewById(R.id.assume_ques7);
        previewText.setText("Answer: Option A\n" +
                "Explanation:\n" +
                "I directly follows from the statement and so is implicit. Also, the statement is a suggestion and does not tell about a government policy or its position of funds." +
                " So, II is not implicit.\n");
    }
    public void assume_ques8(View view)
    {
        TextView previewText = (TextView) findViewById(R.id.assume_ques8);
        previewText.setText("Answer: Option A\n" +
                "Explanation:\n" +
                "The mother warns her child with the expectation that he would stop troubling her. So, I is implicit." +
                " The general nature of children cannot be derived from the statement. So, II is not implicit.\n\n");
    }





}
