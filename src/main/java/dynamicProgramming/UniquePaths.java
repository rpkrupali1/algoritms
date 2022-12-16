package dynamicProgramming;

/**
 * Unique Paths
 * Given a grid of size n x m and a robot initially staying at the top-left position,
 * return the number of unique paths for the robot to reach the bottom-right corner of the grid.
 * The robot is allowed to move either down or right at any point in time.
 *  Example One
 * "n": 3, "m": 2
 * Output: 3
 * From the top-left corner, there are a total of 3 ways to reach the bottom-right corner:
 * Right -> Down -> Down
 * Down -> Down -> Right
 * Down -> Right -> Down
 * Example Two
 * "n": 4, "m": 1
 * Output: 1
 * From the top-left corner, there is only one way to reach bottom-right corner:
 * Down -> Down -> Down
 * Notes
 * Return the answer modulo 10 power9 + 7.
 */
public class UniquePaths {
    public static int iterative(int n , int m){
        int[][] table = new int[n][m];
        for (int i = 0; i < n; i++) {
            table[i][0]=1;
        }
        for (int i = 0; i < m; i++) {
            table[0][i]=1;
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                table[i][j] = table[i-1][j] + table[i][j-1];
            }
        }
        return table[n-1][m-1];
    }
}
