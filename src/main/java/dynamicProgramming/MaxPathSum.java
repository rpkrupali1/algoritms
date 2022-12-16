package dynamicProgramming;

import java.util.ArrayList;

/**
 * Maximum Path Sum
 * Given a two-dimensional grid of numbers. Find a path from top-left corner to bottom-right corner,
 * which maximizes the sum of all numbers along its path.
 * You can only move either down or right from your current position.
 * Example One
 * "grid": [
 * [4, 5, 8],
 * [3, 6, 4],
 * [2, 4, 7]]
 * Output: 28
 * Example 1 illustration
 * The path 4 -> 5 -> 8 -> 4 -> 7 maximizes the sum. Every other path from top left to bottom right has sum less than 28.
 * Example Two
 * "grid": [
 * [1, -4, 3],
 * [4, -2, 2]]
 * Output: 5
 * The path 1 -> 4 -> -2 -> 2 maximizes the sum. Note that there can be negative values in the grid as well.
 */
public class MaxPathSum {
    public static int iterative(ArrayList<ArrayList<Integer>> grid){
        int m =grid.size();
        int n = grid.get(0).size();
        int[][] table = new int[m][n];
        for (int row = 0; row < m ; row++) {
            for (int column = 0; column < n ; column++) {
                if(row==0 && column==0)
                    table[row][column]=grid.get(row).get(column);
                else if(column==0)
                    table[row][column] = table[row-1][column] + grid.get(row).get(column);
                else if (row==0)
                    table[row][column] = table[row][column-1] + grid.get(row).get(column);
                else
                    table[row][column]=Math.max(table[row][column-1],table[row-1][column]) + grid.get(row).get(column);
            }
        }
        return table[m-1][n-1];
    }

    public static int space_optimal(ArrayList<ArrayList<Integer>> grid){
        return 0;
    }
}
