package com.example.hp.above;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class BoyerMooreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boyer_moore);
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

    public void boyer_code(View view) {
        TextView tv = (TextView) findViewById(R.id.boyer_code);
        tv.setText("/* Program for Bad Character Heuristic of Boyer Moore String Matching Algorithm */\n" +
                " \n" +
                "# include <limits.h>\n" +
                "# include <string.h>\n" +
                "# include <stdio.h>\n" +
                " \n" +
                "# define NO_OF_CHARS 256\n" +
                " \n" +
                "// A utility function to get maximum of two integers\n" +
                "int max (int a, int b) { return (a > b)? a: b; }\n" +
                " \n" +
                "// The preprocessing function for Boyer Moore's bad character heuristic\n" +
                "void badCharHeuristic( char *str, int size, int badchar[NO_OF_CHARS])\n" +
                "{\n" +
                "    int i;\n" +
                " \n" +
                "    // Initialize all occurrences as -1\n" +
                "    for (i = 0; i < NO_OF_CHARS; i++)\n" +
                "         badchar[i] = -1;\n" +
                " \n" +
                "    // Fill the actual value of last occurrence of a character\n" +
                "    for (i = 0; i < size; i++)\n" +
                "         badchar[(int) str[i]] = i;\n" +
                "}\n" +
                " \n" +
                "/* A pattern searching function that uses Bad Character Heuristic of\n" +
                "   Boyer Moore Algorithm */\n" +
                "void search( char *txt,  char *pat)\n" +
                "{\n" +
                "    int m = strlen(pat);\n" +
                "    int n = strlen(txt);\n" +
                " \n" +
                "    int badchar[NO_OF_CHARS];\n" +
                " \n" +
                "    /* Fill the bad character array by calling the preprocessing\n" +
                "       function badCharHeuristic() for given pattern */\n" +
                "    badCharHeuristic(pat, m, badchar);\n" +
                " \n" +
                "    int s = 0;  // s is shift of the pattern with respect to text\n" +
                "    while(s <= (n - m))\n" +
                "    {\n" +
                "        int j = m-1;\n" +
                " \n" +
                "        /* Keep reducing index j of pattern while characters of\n" +
                "           pattern and text are matching at this shift s */\n" +
                "        while(j >= 0 && pat[j] == txt[s+j])\n" +
                "            j--;\n" +
                " \n" +
                "        /* If the pattern is present at current shift, then index j\n" +
                "           will become -1 after the above loop */\n" +
                "        if (j < 0)\n" +
                "        {\n" +
                "            printf(\"\\n pattern occurs at shift = %d\", s);\n" +
                " \n" +
                "            /* Shift the pattern so that the next character in text\n" +
                "               aligns with the last occurrence of it in pattern.\n" +
                "               The condition s+m < n is necessary for the case when\n" +
                "               pattern occurs at the end of text */\n" +
                "            s += (s+m < n)? m-badchar[txt[s+m]] : 1;\n" +
                " \n" +
                "        }\n" +
                " \n" +
                "        else\n" +
                "            /* Shift the pattern so that the bad character in text\n" +
                "               aligns with the last occurrence of it in pattern. The\n" +
                "               max function is used to make sure that we get a positive\n" +
                "               shift. We may get a negative shift if the last occurrence\n" +
                "               of bad character in pattern is on the right side of the\n" +
                "               current character. */\n" +
                "            s += max(1, j - badchar[txt[s+j]]);\n" +
                "    }\n" +
                "}\n" +
                " \n" +
                "/* Driver program to test above funtion */\n" +
                "int main()\n" +
                "{\n" +
                "    char txt[] = \"ABAAABCD\";\n" +
                "    char pat[] = \"ABC\";\n" +
                "    search(txt, pat);\n" +
                "    return 0;\n" +
                "}" +
                "\n\nOutput:\n" +
                "\n" +
                " pattern occurs at shift = 4\n" +
                "The Bad Character Heuristic may take O(mn) time in worst case. The worst case occurs when all characters of the text and pattern are same. For example, txt[] = “AAAAAAAAAAAAAAAAAA” and pat[] = “AAAAA”." +
                "\n");
    }
}
