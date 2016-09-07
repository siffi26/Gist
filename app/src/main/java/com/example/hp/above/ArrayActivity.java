package com.example.hp.above;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class ArrayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array);
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
    public void array_code(View view)
    {
        TextView previewText= (TextView) findViewById(R.id.array_code);
        previewText.setText("\n\n\nExample of array in C programming\n" +
                "\n" +
                "/* C program to find the sum marks of n students using arrays */\n" +
                "\n" +
                "#include <stdio.h>\n" +
                "int main(){\n" +
                "     int marks[10],i,n,sum=0;\n" +
                "     printf(\"Enter number of students: \");\n" +
                "     scanf(\"%d\",&n);\n" +
                "     for(i=0;i<n;++i){\n" +
                "          printf(\"Enter marks of student%d: \",i+1);\n" +
                "          scanf(\"%d\",&marks[i]);\n" +
                "          sum+=marks[i];\n" +
                "     }\n" +
                "     printf(\"Sum= %d\",sum);\n" +
                "return 0;\n" +
                "}\n" +
                "\n" +
                "Output\n" +
                "\n" +
                "Enter number of students: 3\n" +
                "Enter marks of student1: 12\n" +
                "Enter marks of student2: 31\n" +
                "Enter marks of student3: 2\n" +
                "sum=45");
    }
    public void answers_array(View view)
    {
        TextView previewText= (TextView) findViewById(R.id.answers_array);
        previewText.setText("\n\nSource Code to Calculate Average Using Arrays\n" +
                "\n" +
                "#include <stdio.h>\n" +
                "int main(){\n" +
                "    int n, i;\n" +
                "    float num[100], sum=0.0, average;\n" +
                "    printf(\"Enter the numbers of data: \");\n" +
                "    scanf(\"%d\",&n);\n" +
                "    while (n>100 || n<=0)\n" +
                "    {\n" +
                "        printf(\"Error! number should in range of (1 to 100).\\n\");\n" +
                "        printf(\"Enter the number again: \");\n" +
                "        scanf(\"%d\",&n);\n" +
                "    }\n" +
                "   for(i=0; i<n; ++i)\n" +
                "   {\n" +
                "      printf(\"%d. Enter number: \",i+1);\n" +
                "      scanf(\"%f\",&num[i]);\n" +
                "      sum+=num[i];\n" +
                "   }\n" +
                "   average=sum/n;\n" +
                "   printf(\"Average = %.2f\",average);\n" +
                "   return 0;\n" +
                "}\n" +
                "\n\nOutput\n" +
                "\n" +
                "\n" +
                "Enter the numbers of data: 6\n" +
                "1. Enter number: 45.3\n" +
                "2. Enter number: 67.5\n" +
                "3. Enter number: -45.6\n" +
                "4. Enter number: 20.34\n" +
                "5. Enter number: 33\n" +
                "6. Enter number: 45.6\n" +
                "Average = 27.69" +
                "\n\n\n\nSource Code to Display Largest Element of an array\n" +
                "\n" +
                "#include <stdio.h>\n" +
                "int main(){\n" +
                "    int i,n;\n" +
                "    float arr[100];\n" +
                "    printf(\"Enter total number of elements(1 to 100): \");\n" +
                "    scanf(\"%d\",&n);\n" +
                "    printf(\"\\n\");\n" +
                "    for(i=0;i<n;++i)  /* Stores number entered by user. */\n" +
                "    {\n" +
                "       printf(\"Enter Number %d: \",i+1);\n" +
                "       scanf(\"%f\",&arr[i]);\n" +
                "    }\n" +
                "    for(i=1;i<n;++i)  /* Loop to store largest number to arr[0] */\n" +
                "    {\n" +
                "       if(arr[0]<arr[i]) /* Change < to > if you want to find smallest element*/\n" +
                "           arr[0]=arr[i];\n" +
                "    }\n" +
                "    printf(\"Largest element = %.2f\",arr[0]);\n" +
                "    return 0;\n" +
                "}\n" +
                "\n\nOutput\n" +
                "\n" +
                "\n" +
                "Enter total number of elements(1 to 100): 8\n" +
                "\n" +
                "Enter Number 1: 23.4\n" +
                "Enter Number 2: -34.5\n" +
                "Enter Number 3: 50\n" +
                "Enter Number 4: 33.5\n" +
                "Enter Number 5: 55.5\n" +
                "Enter Number 6: 43.7\n" +
                "Enter Number 7: 5.7\n" +
                "Enter Number 8: -66.5" +
                "\n\nSource Code to Calculate Standard Deviation by Passing it to Function\n" +
                "\n" +
                "/* Source code to calculate standard deviation. */\n" +
                "\n" +
                "#include <stdio.h>\n" +
                "#include <math.h>\n" +
                "float standard_deviation(float data[], int n);\n" +
                "int main()\n" +
                "{\n" +
                "    int n, i;\n" +
                "    float data[100];\n" +
                "    printf(\"Enter number of datas( should be less than 100): \");\n" +
                "    scanf(\"%d\",&n);\n" +
                "    printf(\"Enter elements: \");\n" +
                "    for(i=0; i<n; ++i)\n" +
                "        scanf(\"%f\",&data[i]);\n" +
                "    printf(\"\\n\");\n" +
                "    printf(\"Standard Deviation = %.2f\", standard_deviation(data,n));\n" +
                "    return 0;\n" +
                "}\n" +
                "float standard_deviation(float data[], int n)\n" +
                "{\n" +
                "    float mean=0.0, sum_deviation=0.0;\n" +
                "    int i;\n" +
                "    for(i=0; i<n;++i)\n" +
                "    {\n" +
                "        mean+=data[i];\n" +
                "    }\n" +
                "    mean=mean/n;\n" +
                "    for(i=0; i<n;++i)\n" +
                "    sum_deviation+=(data[i]-mean)*(data[i]-mean);\n" +
                "    return sqrt(sum_deviation/n);           \n" +
                "}" +
                "\n\nOutput\n" +
                "\n" +
                "\n" +
                "Enter number of datas( should be less than 100): 6\n" +
                "Enter elements: 12\n" +
                "24.5\n" +
                "65.4\n" +
                "10.3\n" +
                "29.9\n" +
                "34.3");
    }
}
