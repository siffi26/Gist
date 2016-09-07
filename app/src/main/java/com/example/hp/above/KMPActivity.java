package com.example.hp.above;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class KMPActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kmp);
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
    public void kmp_code(View view) {
        TextView tv = (TextView) findViewById(R.id.kmp_code);
        tv.setText("// C program for implementation of KMP pattern searching \n" +
                "// algorithm\n" +
                "#include<stdio.h>\n" +
                "#include<string.h>\n" +
                "#include<stdlib.h>\n" +
                " \n" +
                "void computeLPSArray(char *pat, int M, int *lps);\n" +
                " \n" +
                "void KMPSearch(char *pat, char *txt)\n" +
                "{\n" +
                "    int M = strlen(pat);\n" +
                "    int N = strlen(txt);\n" +
                " \n" +
                "    // create lps[] that will hold the longest prefix suffix\n" +
                "    // values for pattern\n" +
                "    int *lps = (int *)malloc(sizeof(int)*M);\n" +
                "    int j  = 0;  // index for pat[]\n" +
                " \n" +
                "    // Preprocess the pattern (calculate lps[] array)\n" +
                "    computeLPSArray(pat, M, lps);\n" +
                " \n" +
                "    int i = 0;  // index for txt[]\n" +
                "    while (i < N)\n" +
                "    {\n" +
                "      if (pat[j] == txt[i])\n" +
                "      {\n" +
                "        j++;\n" +
                "        i++;\n" +
                "      }\n" +
                " \n" +
                "      if (j == M)\n" +
                "      {\n" +
                "        printf(\"Found pattern at index %d \\n\", i-j);\n" +
                "        j = lps[j-1];\n" +
                "      }\n" +
                " \n" +
                "      // mismatch after j matches\n" +
                "      else if (i < N && pat[j] != txt[i])\n" +
                "      {\n" +
                "        // Do not match lps[0..lps[j-1]] characters,\n" +
                "        // they will match anyway\n" +
                "        if (j != 0)\n" +
                "         j = lps[j-1];\n" +
                "        else\n" +
                "         i = i+1;\n" +
                "      }\n" +
                "    }\n" +
                "    free(lps); // to avoid memory leak\n" +
                "}\n" +
                " \n" +
                "void computeLPSArray(char *pat, int M, int *lps)\n" +
                "{\n" +
                "    int len = 0;  // length of the previous longest prefix suffix\n" +
                "    int i;\n" +
                " \n" +
                "    lps[0] = 0; // lps[0] is always 0\n" +
                "    i = 1;\n" +
                " \n" +
                "    // the loop calculates lps[i] for i = 1 to M-1\n" +
                "    while (i < M)\n" +
                "    {\n" +
                "       if (pat[i] == pat[len])\n" +
                "       {\n" +
                "         len++;\n" +
                "         lps[i] = len;\n" +
                "         i++;\n" +
                "       }\n" +
                "       else // (pat[i] != pat[len])\n" +
                "       {\n" +
                "         if (len != 0)\n" +
                "         {\n" +
                "           // This is tricky. Consider the example \n" +
                "           // AAACAAAA and i = 7.\n" +
                "           len = lps[len-1];\n" +
                " \n" +
                "           // Also, note that we do not increment i here\n" +
                "         }\n" +
                "         else // if (len == 0)\n" +
                "         {\n" +
                "           lps[i] = 0;\n" +
                "           i++;\n" +
                "         }\n" +
                "       }\n" +
                "    }\n" +
                "}\n" +
                " \n" +
                "// Driver program to test above function\n" +
                "int main()\n" +
                "{\n" +
                "   char *txt = \"ABABDABACDABABCABAB\";\n" +
                "   char *pat = \"ABABCABAB\";\n" +
                "   KMPSearch(pat, txt);\n" +
                "   return 0;\n" +
                "}" +
                "\n\nOutput:\n" +
                "Found pattern at index 10");
    }
}
