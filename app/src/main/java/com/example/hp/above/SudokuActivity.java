package com.example.hp.above;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class SudokuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sudoku);
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
    public void sudoku_code(View view) {
        TextView tv = (TextView) findViewById(R.id.sudoku_code);
        tv.setText("// A Backtracking program  in C++ to solve Sudoku problem\n" +
                "#include <stdio.h>\n" +
                " \n" +
                "// UNASSIGNED is used for empty cells in sudoku grid\n" +
                "#define UNASSIGNED 0\n" +
                " \n" +
                "// N is used for size of Sudoku grid. Size will be NxN\n" +
                "#define N 9\n" +
                " \n" +
                "// This function finds an entry in grid that is still unassigned\n" +
                "bool FindUnassignedLocation(int grid[N][N], int &row, int &col);\n" +
                " \n" +
                "// Checks whether it will be legal to assign num to the given row,col\n" +
                "bool isSafe(int grid[N][N], int row, int col, int num);\n" +
                " \n" +
                "/* Takes a partially filled-in grid and attempts to assign values to\n" +
                "  all unassigned locations in such a way to meet the requirements\n" +
                "  for Sudoku solution (non-duplication across rows, columns, and boxes) */\n" +
                "bool SolveSudoku(int grid[N][N])\n" +
                "{\n" +
                "    int row, col;\n" +
                " \n" +
                "    // If there is no unassigned location, we are done\n" +
                "    if (!FindUnassignedLocation(grid, row, col))\n" +
                "       return true; // success!\n" +
                " \n" +
                "    // consider digits 1 to 9\n" +
                "    for (int num = 1; num <= 9; num++)\n" +
                "    {\n" +
                "        // if looks promising\n" +
                "        if (isSafe(grid, row, col, num))\n" +
                "        {\n" +
                "            // make tentative assignment\n" +
                "            grid[row][col] = num;\n" +
                " \n" +
                "            // return, if success, yay!\n" +
                "            if (SolveSudoku(grid))\n" +
                "                return true;\n" +
                " \n" +
                "            // failure, unmake & try again\n" +
                "            grid[row][col] = UNASSIGNED;\n" +
                "        }\n" +
                "    }\n" +
                "    return false; // this triggers backtracking\n" +
                "}\n" +
                " \n" +
                "/* Searches the grid to find an entry that is still unassigned. If\n" +
                "   found, the reference parameters row, col will be set the location\n" +
                "   that is unassigned, and true is returned. If no unassigned entries\n" +
                "   remain, false is returned. */\n" +
                "bool FindUnassignedLocation(int grid[N][N], int &row, int &col)\n" +
                "{\n" +
                "    for (row = 0; row < N; row++)\n" +
                "        for (col = 0; col < N; col++)\n" +
                "            if (grid[row][col] == UNASSIGNED)\n" +
                "                return true;\n" +
                "    return false;\n" +
                "}\n" +
                " \n" +
                "/* Returns a boolean which indicates whether any assigned entry\n" +
                "   in the specified row matches the given number. */\n" +
                "bool UsedInRow(int grid[N][N], int row, int num)\n" +
                "{\n" +
                "    for (int col = 0; col < N; col++)\n" +
                "        if (grid[row][col] == num)\n" +
                "            return true;\n" +
                "    return false;\n" +
                "}\n" +
                " \n" +
                "/* Returns a boolean which indicates whether any assigned entry\n" +
                "   in the specified column matches the given number. */\n" +
                "bool UsedInCol(int grid[N][N], int col, int num)\n" +
                "{\n" +
                "    for (int row = 0; row < N; row++)\n" +
                "        if (grid[row][col] == num)\n" +
                "            return true;\n" +
                "    return false;\n" +
                "}\n" +
                " \n" +
                "/* Returns a boolean which indicates whether any assigned entry\n" +
                "   within the specified 3x3 box matches the given number. */\n" +
                "bool UsedInBox(int grid[N][N], int boxStartRow, int boxStartCol, int num)\n" +
                "{\n" +
                "    for (int row = 0; row < 3; row++)\n" +
                "        for (int col = 0; col < 3; col++)\n" +
                "            if (grid[row+boxStartRow][col+boxStartCol] == num)\n" +
                "                return true;\n" +
                "    return false;\n" +
                "}\n" +
                " \n" +
                "/* Returns a boolean which indicates whether it will be legal to assign\n" +
                "   num to the given row,col location. */\n" +
                "bool isSafe(int grid[N][N], int row, int col, int num)\n" +
                "{\n" +
                "    /* Check if 'num' is not already placed in current row,\n" +
                "       current column and current 3x3 box */\n" +
                "    return !UsedInRow(grid, row, num) &&\n" +
                "           !UsedInCol(grid, col, num) &&\n" +
                "           !UsedInBox(grid, row - row%3 , col - col%3, num);\n" +
                "}\n" +
                " \n" +
                "/* A utility function to print grid  */\n" +
                "void printGrid(int grid[N][N])\n" +
                "{\n" +
                "    for (int row = 0; row < N; row++)\n" +
                "    {\n" +
                "       for (int col = 0; col < N; col++)\n" +
                "             printf(\"%2d\", grid[row][col]);\n" +
                "        printf(\"\\n\");\n" +
                "    }\n" +
                "}\n" +
                " \n" +
                "/* Driver Program to test above functions */\n" +
                "int main()\n" +
                "{\n" +
                "    // 0 means unassigned cells\n" +
                "    int grid[N][N] = {{3, 0, 6, 5, 0, 8, 4, 0, 0},\n" +
                "                      {5, 2, 0, 0, 0, 0, 0, 0, 0},\n" +
                "                      {0, 8, 7, 0, 0, 0, 0, 3, 1},\n" +
                "                      {0, 0, 3, 0, 1, 0, 0, 8, 0},\n" +
                "                      {9, 0, 0, 8, 6, 3, 0, 0, 5},\n" +
                "                      {0, 5, 0, 0, 9, 0, 6, 0, 0},\n" +
                "                      {1, 3, 0, 0, 0, 0, 2, 5, 0},\n" +
                "                      {0, 0, 0, 0, 0, 0, 0, 7, 4},\n" +
                "                      {0, 0, 5, 2, 0, 6, 3, 0, 0}};\n" +
                "    if (SolveSudoku(grid) == true)\n" +
                "          printGrid(grid);\n" +
                "    else\n" +
                "         printf(\"No solution exists\");\n" +
                " \n" +
                "    return 0;\n" +
                "}" +
                "\n\nOutput:\n" +
                "\n" +
                "  3 1 6 5 7 8 4 9 2\n" +
                "  5 2 9 1 3 4 7 6 8\n" +
                "  4 8 7 6 2 9 5 3 1\n" +
                "  2 6 3 4 1 5 9 8 7\n" +
                "  9 7 4 8 6 3 1 2 5\n" +
                "  8 5 1 7 9 2 6 4 3\n" +
                "  1 3 8 9 4 7 2 5 6\n" +
                "  6 9 2 3 5 1 8 7 4\n" +
                "  7 4 5 2 8 6 3 1 9");
    }
}
