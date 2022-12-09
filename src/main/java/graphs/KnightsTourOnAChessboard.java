package graphs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Knight's Tour On A Chessboard
 * You are given a chessboard with rows and cols columns and
 * a knight - that moves like in normal chess - located at the start_row-th row and start_col-th column.
 * The knight needs to reach the position at the end_row-th row and end_col-th column.
 * Find minimum number of moves that knight needs to make to get from starting position to ending position.
 * start_row, start_col, end_row and end_col are all zero-indexed.
 * Example
 * Input
     * "rows": 5,
     * "cols": 5,
     * "start_row": 0,
     * "start_col": 0,
     * "end_row": 4,
     * "end_col": 1
 * Output: 3
 * 3 moves to reach from (0, 0) to (4, 1):
 * (0, 0) → (1, 2) → (3, 3) → (4, 1).
 * Notes
 * If it is not possible to reach from starting position to ending position, then return -1.
 */
public class KnightsTourOnAChessboard {
    private static final int[] add_row = new int[]{-2,-2,2,2,1,1,-1,-1};
    private static final int[] add_column = new int[]{1,-1,1,-1,2,-2,2,-2};
    public static int bfs(int rows, int cols, int start_row, int start_col, int end_row, int end_col) {
        if(start_row==end_row && start_col==end_col)
            return 0;

        int[][] distance = new int[rows][cols];
        for (int[] row : distance)
            Arrays.fill(row,-1);
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{start_row,start_col});
        distance[start_row][start_col]=0;
        while (!queue.isEmpty()){
            int[] current = queue.poll();
            int cR = current[0];
            int cC = current[1];
            for (int i = 0; i < 8; i++) {
                int nR = cR + add_row[i];
                int nC = cC + add_column[i];
                if(nR < 0 || nR >= rows || nC < 0 || nC >= cols)
                    continue;
                if(distance[nR][nC]==-1){
                    distance[nR][nC]=distance[cR][cC]+1;
                    if(nR==end_row && nC==end_col)
                        return distance[nR][nC];
                    queue.add(new int[]{nR,nC});
                }
            }
        }
        return -1;
    }

}
