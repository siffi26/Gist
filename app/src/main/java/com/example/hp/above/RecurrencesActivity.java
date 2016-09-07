package com.example.hp.above;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class RecurrencesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recurrences);
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
    public void recurrences(View view)
    {
        TextView previewText= (TextView) findViewById(R.id.recurrences);
        previewText.setText("1) Substitution Method: We make a guess for the solution and then we use mathematical induction to prove the the guess is correct or incorrect.\n" +
                "\n" +
                "For example consider the recurrence T(n) = 2T(n/2) + n\n" +
                "\n" +
                "We guess the solution as T(n) = O(nLogn). Now we use induction\n" +
                "to prove our guess.\n" +
                "\n" +
                "We need to prove that T(n) <= cnLogn. We can assume that it is true\n" +
                "for values smaller than n.\n" +
                "\n" +
                "T(n) = 2T(n/2) + n\n" +
                "    <= cn/2Log(n/2) + n\n" +
                "    =  cnLogn - cnLog2 + n\n" +
                "    =  cnLogn - cn + n\n" +
                "    <= cnLogn\n" +
                "2) Recurrence Tree Method: In this method, we draw a recurrence tree and calculate the time taken by every level of tree. Finally, we sum the work done at all levels. To draw the recurrence tree, we start from the given recurrence and keep drawing till we find a pattern among levels. The pattern is typically a arithmetic or geometric series.\n" +
                "\n" +
                "For example consider the recurrence relation \n" +
                "T(n) = T(n/4) + T(n/2) + cn2\n" +
                "\n" +
                "           cn2\n" +
                "         /      \\\n" +
                "     T(n/4)     T(n/2)\n" +
                "\n" +
                "If we further break down the expression T(n/4) and T(n/2), \n" +
                "we get following recursion tree.\n" +
                "\n" +
                "                cn2\n" +
                "           /           \\      \n" +
                "       c(n2)/16      c(n2)/4\n" +
                "      /      \\          /     \\\n" +
                "  T(n/16)     T(n/8)  T(n/8)    T(n/4) \n" +
                "Breaking down further gives us following\n" +
                "                 cn2\n" +
                "            /            \\      \n" +
                "       c(n2)/16          c(n2)/4\n" +
                "       /      \\            /      \\\n" +
                "c(n2)/256   c(n2)/64  c(n2)/64    c(n2)/16\n" +
                " /    \\      /    \\    /    \\       /    \\  \n" +
                "\n" +
                "To know the value of T(n), we need to calculate sum of tree \n" +
                "nodes level by level. If we sum the above tree level by level, \n" +
                "we get the following series\n" +
                "T(n)  = c(n^2 + 5(n^2)/16 + 25(n^2)/256) + ....\n" +
                "The above series is geometrical progression with ratio 5/16.\n" +
                "\n" +
                "To get an upper bound, we can sum the infinite series. \n" +
                "We get the sum as (n2)/(1 - 5/16) which is O(n2)\n" +
                "3) Master Method:\n" +
                "Master Method is a direct way to get the solution. The master method works only for following type of recurrences or for recurrences that can be transformed to following type.\n" +
                "\n" +
                "T(n) = aT(n/b) + f(n) where a >= 1 and b > 1\n" +
                "There are following three cases:\n" +
                "1. If f(n) = Θ(nc) where c < Logba then T(n) = Θ(nLogba)\n" +
                "\n" +
                "2. If f(n) = Θ(nc) where c = Logba then T(n) = Θ(ncLog n)\n" +
                "\n" +
                "3.If f(n) = Θ(nc) where c > Logba then T(n) = Θ(f(n))\n" +
                "\n" +
                "How does this work?\n" +
                "Master method is mainly derived from recurrence tree method. If we draw recurrence tree of T(n) = aT(n/b) + f(n), we can see that the work done at root is f(n) and work done at all leaves is Θ(nc) where c is Logba. " +
                "And the height of recurrence tree is Logbn");


        ImageView iv= (ImageView) findViewById(R.id.recurrence_image);
        iv.setImageResource(R.drawable.recurrence1);

        TextView tv = (TextView) findViewById(R.id.recurrences1);
        tv.setText("In recurrence tree method, we calculate total work done. If the work done at leaves is polynomially more, then leaves are the dominant part, and our result becomes the work done at leaves (Case 1). If work done at leaves and root is asymptotically same, then our result becomes height multiplied by work done at any level (Case 2). If work done at root is asymptotically more, then our result becomes work done at root (Case 3).\n" +
                "\n" +
                "Examples of some standard algorithms whose time complexity can be evaluated using Master Method \n" +
                "Merge Sort: T(n) = 2T(n/2) + Θ(n). It falls in case 2 as c is 1 and Logba] is also 1. So the solution is Θ(n Logn)\n" +
                "\n" +
                "Binary Search: T(n) = T(n/2) + Θ(1). It also falls in case 2 as c is 0 and Logba is also 0. So the solution is Θ(Logn)\n" +
                "\n" +
                "Notes: \n" +
                "1) It is not necessary that a recurrence of the form T(n) = aT(n/b) + f(n) can be solved using Master Theorem. The given three cases have some gaps between them. For example, the recurrence T(n) = 2T(n/2) + n/Logn cannot be solved using master method.\n" +
                "\n" +
                "2) Case 2 can be extended for f(n) = Θ(ncLogkn)\n" +
                "If f(n) = Θ(ncLogkn) for some constant k >= 0 and c = Logba, then T(n) = Θ(ncLogk+1n)");
    }

}
