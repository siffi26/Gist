package com.example.hp.above;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class NQueensProblemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nqueens_problem);
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
    public void nqueens_code(View view) {
        TextView tv = (TextView) findViewById(R.id.nqueens_code);
        tv.setText("/* C/C++ program to solve N Queen Problem using\n" +
                "   backtracking */\n" +
                "#define N 4\n" +
                "#include<stdio.h>\n" +
                " \n" +
                "/* A utility function to print solution */\n" +
                "void printSolution(int board[N][N])\n" +
                "{\n" +
                "    for (int i = 0; i < N; i++)\n" +
                "    {\n" +
                "        for (int j = 0; j < N; j++)\n" +
                "            printf(\" %d \", board[i][j]);\n" +
                "        printf(\"\\n\");\n" +
                "    }\n" +
                "}\n" +
                " \n" +
                "/* A utility function to check if a queen can\n" +
                "   be placed on board[row][col]. Note that this\n" +
                "   function is called when \"col\" queens are\n" +
                "   already placed in columns from 0 to col -1.\n" +
                "   So we need to check only left side for\n" +
                "   attacking queens */\n" +
                "bool isSafe(int board[N][N], int row, int col)\n" +
                "{\n" +
                "    int i, j;\n" +
                " \n" +
                "    /* Check this row on left side */\n" +
                "    for (i = 0; i < col; i++)\n" +
                "        if (board[row][i])\n" +
                "            return false;\n" +
                " \n" +
                "    /* Check upper diagonal on left side */\n" +
                "    for (i=row, j=col; i>=0 && j>=0; i--, j--)\n" +
                "        if (board[i][j])\n" +
                "            return false;\n" +
                " \n" +
                "    /* Check lower diagonal on left side */\n" +
                "    for (i=row, j=col; j>=0 && i<N; i++, j--)\n" +
                "        if (board[i][j])\n" +
                "            return false;\n" +
                " \n" +
                "    return true;\n" +
                "}\n" +
                " \n" +
                "/* A recursive utility function to solve N\n" +
                "   Queen problem */\n" +
                "bool solveNQUtil(int board[N][N], int col)\n" +
                "{\n" +
                "    /* base case: If all queens are placed\n" +
                "      then return true */\n" +
                "    if (col >= N)\n" +
                "        return true;\n" +
                " \n" +
                "    /* Consider this column and try placing\n" +
                "       this queen in all rows one by one */\n" +
                "    for (int i = 0; i < N; i++)\n" +
                "    {\n" +
                "        /* Check if queen can be placed on\n" +
                "          board[i][col] */\n" +
                "        if ( isSafe(board, i, col) )\n" +
                "        {\n" +
                "            /* Place this queen in board[i][col] */\n" +
                "            board[i][col] = 1;\n" +
                " \n" +
                "            /* recur to place rest of the queens */\n" +
                "            if ( solveNQUtil(board, col + 1) )\n" +
                "                return true;\n" +
                " \n" +
                "            /* If placing queen in board[i][col]\n" +
                "               doesn't lead to a solution, then\n" +
                "               remove queen from board[i][col] */\n" +
                "            board[i][col] = 0; // BACKTRACK\n" +
                "        }\n" +
                "    }\n" +
                " \n" +
                "     /* If queen can not be place in any row in\n" +
                "        this colum col  then return false */\n" +
                "    return false;\n" +
                "}\n" +
                " \n" +
                "/* This function solves the N Queen problem using\n" +
                "   Backtracking. It mainly uses solveNQUtil() to\n" +
                "   solve the problem. It returns false if queens\n" +
                "   cannot be placed, otherwise return true and\n" +
                "   prints placement of queens in the form of 1s.\n" +
                "   Please note that there may be more than one\n" +
                "   solutions, this function prints one  of the\n" +
                "   feasible solutions.*/\n" +
                "bool solveNQ()\n" +
                "{\n" +
                "    int board[N][N] = { {0, 0, 0, 0},\n" +
                "        {0, 0, 0, 0},\n" +
                "        {0, 0, 0, 0},\n" +
                "        {0, 0, 0, 0}\n" +
                "    };\n" +
                " \n" +
                "    if ( solveNQUtil(board, 0) == false )\n" +
                "    {\n" +
                "      printf(\"Solution does not exist\");\n" +
                "      return false;\n" +
                "    }\n" +
                " \n" +
                "    printSolution(board);\n" +
                "    return true;\n" +
                "}\n" +
                " \n" +
                "// driver program to test above function\n" +
                "int main()\n" +
                "{\n" +
                "    solveNQ();\n" +
                "    return 0;\n" +
                "}" +
                "\n\nOutput: The 1 values indicate placements of queens\n" +
                " 0  0  1  0 \n" +
                " 1  0  0  0 \n" +
                " 0  0  0  1 \n" +
                " 0  1  0  0 ");
    }
}
