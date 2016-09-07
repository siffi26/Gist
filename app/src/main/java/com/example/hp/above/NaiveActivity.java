package com.example.hp.above;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class NaiveActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_naive);
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
    public void naive_code(View view) {
        TextView tv = (TextView) findViewById(R.id.naive_code);
        tv.setText("// C program for Naive Pattern Searching algorithm\n" +
                "#include<stdio.h>\n" +
                "#include<string.h>\n" +
                " \n" +
                "void search(char *pat, char *txt)\n" +
                "{\n" +
                "    int M = strlen(pat);\n" +
                "    int N = strlen(txt);\n" +
                "  \n" +
                "    /* A loop to slide pat[] one by one */\n" +
                "    for (int i = 0; i <= N - M; i++)\n" +
                "    {\n" +
                "        int j;\n" +
                "  \n" +
                "        /* For current index i, check for pattern match */\n" +
                "        for (j = 0; j < M; j++)\n" +
                "            if (txt[i+j] != pat[j])\n" +
                "                break;\n" +
                " \n" +
                "        if (j == M)  // if pat[0...M-1] = txt[i, i+1, ...i+M-1]\n" +
                "           printf(\"Pattern found at index %d \\n\", i);\n" +
                "    }\n" +
                "}\n" +
                "  \n" +
                "/* Driver program to test above function */\n" +
                "int main()\n" +
                "{\n" +
                "   char txt[] = \"AABAACAADAABAAABAA\";\n" +
                "   char pat[] = \"AABA\";\n" +
                "   search(pat, txt);\n" +
                "   return 0;\n" +
                "}" +
                "\n\nOutput:\n" +
                "Pattern found at index 0 \n" +
                "Pattern found at index 9 \n" +
                "Pattern found at index 13 \n\n" +
                "What is the best case?\n" +
                "The best case occurs when the first character of the pattern is not present in text at all.\n" +
                "\n\n" +
                "txt[]  = \"AABCCAADDEE\"\n" +
                "pat[] = \"FAA\"" +
                "The number of comparisons in best case is O(n).\n" +
                "\n" +
                "What is the worst case ?\n" +
                "The worst case of Naive Pattern Searching occurs in following scenarios.\n" +
                "1) When all characters of the text and pattern are same.\n" +
                "\n" +
                "txt[] = \"AAAAAAAAAAAAAAAAAA\"\n" +
                "pat[] = \"AAAAA\"." +
                "\n\nNumber of comparisons in worst case is O(m*(n-m+1)). Although strings which have repeated characters are not likely to appear in English text, they may well occur in other applications (for example, in binary texts). The KMP matching algorithm improves the worst case to O(n)." +
                "");
    }
}
