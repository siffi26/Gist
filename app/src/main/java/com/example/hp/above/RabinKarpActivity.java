package com.example.hp.above;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class RabinKarpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rabin_karp);
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

    public void rabin_code(View view) {
        TextView tv = (TextView) findViewById(R.id.rabin_code);
        tv.setText("/* Following program is a C implementation of Rabin Karp\n" +
                "Algorithm given in the CLRS book */\n" +
                "#include<stdio.h>\n" +
                "#include<string.h>\n" +
                " \n" +
                "// d is the number of characters in input alphabet\n" +
                "#define d 256\n" +
                " \n" +
                "/* pat -> pattern\n" +
                "    txt -> text\n" +
                "    q -> A prime number\n" +
                "*/\n" +
                "void search(char pat[], char txt[], int q)\n" +
                "{\n" +
                "    int M = strlen(pat);\n" +
                "    int N = strlen(txt);\n" +
                "    int i, j;\n" +
                "    int p = 0; // hash value for pattern\n" +
                "    int t = 0; // hash value for txt\n" +
                "    int h = 1;\n" +
                " \n" +
                "    // The value of h would be \"pow(d, M-1)%q\"\n" +
                "    for (i = 0; i < M-1; i++)\n" +
                "        h = (h*d)%q;\n" +
                " \n" +
                "    // Calculate the hash value of pattern and first\n" +
                "    // window of text\n" +
                "    for (i = 0; i < M; i++)\n" +
                "    {\n" +
                "        p = (d*p + pat[i])%q;\n" +
                "        t = (d*t + txt[i])%q;\n" +
                "    }\n" +
                " \n" +
                "    // Slide the pattern over text one by one\n" +
                "    for (i = 0; i <= N - M; i++)\n" +
                "    {\n" +
                " \n" +
                "        // Check the hash values of current window of text\n" +
                "        // and pattern. If the hash values match then only\n" +
                "        // check for characters on by one\n" +
                "        if ( p == t )\n" +
                "        {\n" +
                "            /* Check for characters one by one */\n" +
                "            for (j = 0; j < M; j++)\n" +
                "            {\n" +
                "                if (txt[i+j] != pat[j])\n" +
                "                    break;\n" +
                "            }\n" +
                " \n" +
                "            // if p == t and pat[0...M-1] = txt[i, i+1, ...i+M-1]\n" +
                "            if (j == M)\n" +
                "                printf(\"Pattern found at index %d \\n\", i);\n" +
                "        }\n" +
                " \n" +
                "        // Calculate hash value for next window of text: Remove\n" +
                "        // leading digit, add trailing digit\n" +
                "        if ( i < N-M )\n" +
                "        {\n" +
                "            t = (d*(t - txt[i]*h) + txt[i+M])%q;\n" +
                " \n" +
                "            // We might get negative value of t, converting it\n" +
                "            // to positive\n" +
                "            if (t < 0)\n" +
                "            t = (t + q);\n" +
                "        }\n" +
                "    }\n" +
                "}\n" +
                " \n" +
                "/* Driver program to test above function */\n" +
                "int main()\n" +
                "{\n" +
                "    char txt[] = \"GEEKS FOR GEEKS\";\n" +
                "    char pat[] = \"GEEK\";\n" +
                "    int q = 101; // A prime number\n" +
                "    search(pat, txt, q);\n" +
                "    return 0;\n" +
                "}" +
                "\n\nOutput:\n" +
                "Pattern found at index 0\n" +
                "Pattern found at index 10\n" +
                "The average and best case running time of the Rabin-Karp algorithm is O(n+m), but its worst-case time is O(nm). Worst case of Rabin-Karp algorithm occurs when all characters of pattern and text are same as the hash values of all the substrings of txt[] match with hash value of pat[]. For example pat[] = “AAA” and txt[] = “AAAAAAA”." +
                "");
    }
}
