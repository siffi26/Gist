package com.example.hp.above;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class PowerFuncActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_power_func);
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
    public void power_code(View view) {
        TextView tv = (TextView) findViewById(R.id.power_code);
        tv.setText("#include<stdio.h>\n" +
                " \n" +
                "/* Function to calculate x raised to the power y */\n" +
                "int power(int x, unsigned int y)\n" +
                "{\n" +
                "    if( y == 0)\n" +
                "        return 1;\n" +
                "    else if (y%2 == 0)\n" +
                "        return power(x, y/2)*power(x, y/2);\n" +
                "    else\n" +
                "        return x*power(x, y/2)*power(x, y/2);\n" +
                " \n" +
                "}\n" +
                " \n" +
                "/* Program to test function power */\n" +
                "int main()\n" +
                "{\n" +
                "    int x = 2;\n" +
                "    unsigned int y = 3;\n" +
                " \n" +
                "    printf(\"%d\", power(x, y));\n" +
                "    getchar();\n" +
                "    return 0;\n" +
                "}" +
                "\n\nTime Complexity: O(n)\n" +
                "Space Complexity: O(1)\n" +
                "Algorithmic Paradigm: Divide and conquer.\n" +
                "\n" +
                "Above function can be optimized to O(logn) by calculating power(x, y/2) only once and storing it.\n" +
                "\n" +
                "/* Function to calculate x raised to the power y in O(logn)*/\n" +
                "int power(int x, unsigned int y)\n" +
                "{\n" +
                "    int temp;\n" +
                "    if( y == 0)\n" +
                "        return 1;\n" +
                "    temp = power(x, y/2);\n" +
                "    if (y%2 == 0)\n" +
                "        return temp*temp;\n" +
                "    else\n" +
                "        return x*temp*temp;\n" +
                "}" +
                "\n\nTime Complexity of optimized solution: O(logn)\n" +
                "Let us extend the pow function to work for negative y and float x.\n" +
                "\n" +
                "/* Extended version of power function that can work\n" +
                " for float x and negative y*/\n" +
                "#include<stdio.h>\n" +
                " \n" +
                "float power(float x, int y)\n" +
                "{\n" +
                "    float temp;\n" +
                "    if( y == 0)\n" +
                "       return 1;\n" +
                "    temp = power(x, y/2);       \n" +
                "    if (y%2 == 0)\n" +
                "        return temp*temp;\n" +
                "    else\n" +
                "    {\n" +
                "        if(y > 0)\n" +
                "            return x*temp*temp;\n" +
                "        else\n" +
                "            return (temp*temp)/x;\n" +
                "    }\n" +
                "}  \n" +
                " \n" +
                "/* Program to test function power */\n" +
                "int main()\n" +
                "{\n" +
                "    float x = 2;\n" +
                "    int y = -3;\n" +
                "    printf(\"%f\", power(x, y));\n" +
                "    getchar();\n" +
                "    return 0;\n" +
                "}");
    }
}
