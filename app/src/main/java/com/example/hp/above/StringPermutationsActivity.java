package com.example.hp.above;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class StringPermutationsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_string_permutations);
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
    public void string_permutate_code(View view) {
        TextView tv = (TextView) findViewById(R.id.string_permutate_code);
        tv.setText("// C program to print all permutations with duplicates allowed\n" +
                "#include <stdio.h>\n" +
                "#include <string.h>\n" +
                " \n" +
                "/* Function to swap values at two pointers */\n" +
                "void swap(char *x, char *y)\n" +
                "{\n" +
                "    char temp;\n" +
                "    temp = *x;\n" +
                "    *x = *y;\n" +
                "    *y = temp;\n" +
                "}\n" +
                " \n" +
                "/* Function to print permutations of string\n" +
                "   This function takes three parameters:\n" +
                "   1. String\n" +
                "   2. Starting index of the string\n" +
                "   3. Ending index of the string. */\n" +
                "void permute(char *a, int l, int r)\n" +
                "{\n" +
                "   int i;\n" +
                "   if (l == r)\n" +
                "     printf(\"%s\\n\", a);\n" +
                "   else\n" +
                "   {\n" +
                "       for (i = l; i <= r; i++)\n" +
                "       {\n" +
                "          swap((a+l), (a+i));\n" +
                "          permute(a, l+1, r);\n" +
                "          swap((a+l), (a+i)); //backtrack\n" +
                "       }\n" +
                "   }\n" +
                "}\n" +
                " \n" +
                "/* Driver program to test above functions */\n" +
                "int main()\n" +
                "{\n" +
                "    char str[] = \"ABC\";\n" +
                "    int n = strlen(str);\n" +
                "    permute(str, 0, n-1);\n" +
                "    return 0;\n" +
                "}" +
                "\nOutput:\n" +
                "ABC\n" +
                "ACB\n" +
                "BAC\n" +
                "BCA\n" +
                "CBA\n" +
                "CAB\n" +
                "\n" +
                "Algorithm Paradigm: Backtracking\n" +
                "Time Complexity: O(n*n!) Note that there are n! permutations and it requires O(n) time to print a a permutation.");
    }
}
