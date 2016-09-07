package com.example.hp.above;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MatrixActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matrix);
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
    public void matrix_code(View view)
    {
        TextView previewText = (TextView) findViewById(R.id.matrix_code);
        previewText.setText("\n\nExample of Multidimensional Array In C\n" +
                "Write a C program to find sum of two matrix of order 2*2 using multidimensional arrays where, elements of matrix are entered by user.\n" +
                "\n" +
                "\n" +
                "#include <stdio.h>\n" +
                "int main(){\n" +
                "   float a[2][2], b[2][2], c[2][2];\n" +
                "   int i,j;\n" +
                "   printf(\"Enter the elements of 1st matrix\\n\");\n" +
                "/* Reading two dimensional Array with the help of two for loop. If there was an array of 'n' dimension, 'n' numbers of loops are needed for inserting data to array.*/   \n" +
                "   for(i=0;i<2;++i)      \n" +
                "       for(j=0;j<2;++j){\n" +
                "       printf(\"Enter a%d%d: \",i+1,j+1);\n" +
                "       scanf(\"%f\",&a[i][j]);\n" +
                "       }\n" +
                "   printf(\"Enter the elements of 2nd matrix\\n\");\n" +
                "   for(i=0;i<2;++i)\n" +
                "       for(j=0;j<2;++j){\n" +
                "       printf(\"Enter b%d%d: \",i+1,j+1);\n" +
                "       scanf(\"%f\",&b[i][j]);\n" +
                "       }\n" +
                "   for(i=0;i<2;++i)\n" +
                "       for(j=0;j<2;++j){\n" +
                "/* Writing the elements of multidimensional array using loop. */\n" +
                "       c[i][j]=a[i][j]+b[i][j];  /* Sum of corresponding elements of two arrays. */\n" +
                "       }\n" +
                "   printf(\"\\nSum Of Matrix:\");\n" +
                "   for(i=0;i<2;++i)\n" +
                "       for(j=0;j<2;++j){\n" +
                "       printf(\"%.1f\\t\",c[i][j]);  \n" +
                "           if(j==1)             /* To display matrix sum in order. */\n" +
                "              printf(\"\\n\");\n" +
                "      }\n" +
                "return 0;\n" +
                "}" +
                "\n\nOuput\n" +
                "\n" +
                "Enter the elements of 1st matrix\n" +
                "Enter a11: 2;\n" +
                "Enter a12: 0.5;\n" +
                "Enter a21: -1.1;\n" +
                "Enter a22: 2;\n" +
                "Enter the elements of 2nd matrix\n" +
                "Enter b11: 0.2;\n" +
                "Enter b12: 0;\n" +
                "Enter b21: 0.23;\n" +
                "Enter b22: 23;\n" +
                "\n" +
                "Sum Of Matrix:\n" +
                "2.2     0.5\n" +
                "-0.9    25.0");
    }
    public void answers_matrix(View view)
    {
        TextView previewText = (TextView) findViewById(R.id.answers_matrix);
        previewText.setText("\n\nSource Code to Add Two Matrix in C programming\n" +
                "\n" +
                "#include <stdio.h>\n" +
                "int main(){\n" +
                "    int r,c,a[100][100],b[100][100],sum[100][100],i,j;\n" +
                "    printf(\"Enter number of rows (between 1 and 100): \");\n" +
                "    scanf(\"%d\",&r);\n" +
                "    printf(\"Enter number of columns (between 1 and 100): \");\n" +
                "    scanf(\"%d\",&c);\n" +
                "    printf(\"\\nEnter elements of 1st matrix:\\n\");\n" +
                "\n" +
                "/* Storing elements of first matrix entered by user. */\n" +
                "\n" +
                "    for(i=0;i<r;++i)\n" +
                "       for(j=0;j<c;++j)\n" +
                "       {\n" +
                "           printf(\"Enter element a%d%d: \",i+1,j+1);\n" +
                "           scanf(\"%d\",&a[i][j]);\n" +
                "       }\n" +
                "\n" +
                "/* Storing elements of second matrix entered by user. */\n" +
                "\n" +
                "    printf(\"Enter elements of 2nd matrix:\\n\");\n" +
                "    for(i=0;i<r;++i)\n" +
                "       for(j=0;j<c;++j)\n" +
                "       {\n" +
                "           printf(\"Enter element a%d%d: \",i+1,j+1);\n" +
                "           scanf(\"%d\",&b[i][j]);\n" +
                "       }\n" +
                "\n" +
                "/*Adding Two matrices */\n" +
                "\n" +
                "   for(i=0;i<r;++i)\n" +
                "       for(j=0;j<c;++j)\n" +
                "           sum[i][j]=a[i][j]+b[i][j];\n" +
                "\n" +
                "/* Displaying the resultant sum matrix. */\n" +
                "\n" +
                "    printf(\"\\nSum of two matrix is: \\n\\n\");\n" +
                "    for(i=0;i<r;++i)\n" +
                "       for(j=0;j<c;++j)\n" +
                "       {\n" +
                "           printf(\"%d   \",sum[i][j]);\n" +
                "           if(j==c-1)\n" +
                "               printf(\"\\n\\n\");\n" +
                "       }\n" +
                "\n" +
                "    return 0;\n" +
                "}\n" +
                "Output\n" +
                "\n" +
                "Enter element a12: -4\n" +
                "Enter element a21: 8\n" +
                "Enter element a22: 5\n" +
                "Enter element a31: 1\n" +
                "Enter element a32: 0\n" +
                "Enter elements of 2nd matrix:\n" +
                "Enter element a11: 4\n" +
                "Enter element a12: -7\n" +
                "Enter element a21: 9\n" +
                "Enter element a22: 1\n" +
                "Enter element a31: 4\n" +
                "Enter element a32: 5\n" +
                "\n" +
                "Sum of two matrix is:\n" +
                "\n" +
                "8   -11\n" +
                "\n" +
                "17   6\n" +
                "\n" +
                "5   5" +
                "\n\nSource code to multiply to matrix in C programming\n" +
                "\n" +
                "#include <stdio.h>\n" +
                "int main()\n" +
                "{\n" +
                "    int a[10][10], b[10][10], mult[10][10], r1, c1, r2, c2, i, j, k;\n" +
                "    printf(\"Enter rows and column for first matrix: \");\n" +
                "    scanf(\"%d%d\", &r1, &c1);\n" +
                "    printf(\"Enter rows and column for second matrix: \");\n" +
                "    scanf(\"%d%d\",&r2, &c2);\n" +
                "\n" +
                "/* If colum of first matrix in not equal to row of second matrix, asking user to enter the size of matrix again. */\n" +
                "    while (c1!=r2)\n" +
                "    {\n" +
                "        printf(\"Error! column of first matrix not equal to row of second.\\n\\n\");\n" +
                "        printf(\"Enter rows and column for first matrix: \");\n" +
                "        scanf(\"%d%d\", &r1, &c1);\n" +
                "        printf(\"Enter rows and column for second matrix: \");\n" +
                "        scanf(\"%d%d\",&r2, &c2);\n" +
                "    }\n" +
                "\n" +
                "/* Storing elements of first matrix. */\n" +
                "    printf(\"\\nEnter elements of matrix 1:\\n\");\n" +
                "    for(i=0; i<r1; ++i)\n" +
                "    for(j=0; j<c1; ++j)\n" +
                "    {\n" +
                "        printf(\"Enter elements a%d%d: \",i+1,j+1);\n" +
                "        scanf(\"%d\",&a[i][j]);\n" +
                "    }\n" +
                "\n" +
                "/* Storing elements of second matrix. */\n" +
                "    printf(\"\\nEnter elements of matrix 2:\\n\");\n" +
                "    for(i=0; i<r2; ++i)\n" +
                "    for(j=0; j<c2; ++j)\n" +
                "    {\n" +
                "        printf(\"Enter elements b%d%d: \",i+1,j+1);\n" +
                "        scanf(\"%d\",&b[i][j]);\n" +
                "    }\n" +
                "\n\nSource Code to Find Transpose of a Matrix\n" +
                "#include <stdio.h>\n" +
                "int main()\n" +
                "{\n" +
                "    int a[10][10], trans[10][10], r, c, i, j;\n" +
                "    printf(\"Enter rows and column of matrix: \");\n" +
                "    scanf(\"%d %d\", &r, &c);\n" +
                "\n" +
                "/* Storing element of matrix entered by user in array a[][]. */\n" +
                "    printf(\"\\nEnter elements of matrix:\\n\");\n" +
                "    for(i=0; i<r; ++i)\n" +
                "    for(j=0; j<c; ++j)\n" +
                "    {\n" +
                "        printf(\"Enter elements a%d%d: \",i+1,j+1);\n" +
                "        scanf(\"%d\",&a[i][j]);\n" +
                "    }\n" +
                "/* Displaying the matrix a[][] */\n" +
                "    printf(\"\\nEntered Matrix: \\n\");\n" +
                "    for(i=0; i<r; ++i)\n" +
                "    for(j=0; j<c; ++j)\n" +
                "    {\n" +
                "        printf(\"%d  \",a[i][j]);\n" +
                "        if(j==c-1)\n" +
                "            printf(\"\\n\\n\");\n" +
                "    }\n" +
                "\n" +
                "/* Finding transpose of matrix a[][] and storing it in array trans[][]. */\n" +
                "    for(i=0; i<r; ++i)\n" +
                "    for(j=0; j<c; ++j)\n" +
                "    {\n" +
                "       trans[j][i]=a[i][j];\n" +
                "    }\n" +
                "\n" +
                "/* Displaying the transpose,i.e, Displaying array trans[][]. */\n" +
                "    printf(\"\\nTranspose of Matrix:\\n\");\n" +
                "    for(i=0; i<c; ++i)\n" +
                "    for(j=0; j<r; ++j)\n" +
                "    {\n" +
                "        printf(\"%d  \",trans[i][j]);\n" +
                "        if(j==r-1)\n" +
                "            printf(\"\\n\\n\");\n" +
                "    }\n" +
                "    return 0;\n" +
                "}\n" +
                "Output\n" +
                "\n" +
                "Enter rows and column of matrix: 2\n" +
                "3\n" +
                "\n" +
                "Enter elements of matrix:\n" +
                "Enter elements a11: 1\n" +
                "Enter elements a12: 2\n" +
                "Enter elements a13: 9\n" +
                "Enter elements a21: 0\n" +
                "Enter elements a22: 4\n" +
                "Enter elements a23: 7\n" +
                "\n" +
                "Entered Matrix:\n" +
                "1  2  9\n" +
                "\n" +
                "0  4  7\n" +
                "\n" +
                "\n" +
                "Transpose of Matrix:\n" +
                "1  0\n" +
                "\n" +
                "2  4\n" +
                "\n" +
                "9  7");
    }
}
