package graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Count Islands
 * Given a two-dimensional matrix of 0s and 1s, find the number of islands.
 * An island is a group of connected 1s or a standalone 1.
 * A cell in the matrix can be connected to up to 8 neighbors: 2 vertical, 2 horizontal and 4 diagonal.
 * Example
 * "matrix": [
 * [1, 1, 0, 0, 0],
 * [0, 1, 0, 0, 1],
 * [1, 0, 0, 1, 1],
 * [0, 0, 0, 0, 0],
 * [1, 0, 1, 0, 1]]
 * Output: 5
 */
public class CountIslands {
    private static final int[] rows = {0,-1,-1,-1,0,1,1,1};
    private static final int[] columns = {1,1,0,-1,-1,-1,0,1};
    public static int bfs(ArrayList<ArrayList<Integer>> matrix) {
        // Write your code here.
        int counter = 0;
        for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < matrix.get(0).size(); j++) {
                if(matrix.get(i).get(j)==1){
                    bfs_helper(matrix,i,j);
                    counter++;
                }
            }
        }
        return counter;
    }

    private static void bfs_helper(ArrayList<ArrayList<Integer>> matrix, int row, int column){
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{row,column});
        matrix.get(row).set(column,0);
        while (!queue.isEmpty()){
            int[] current = queue.poll();
            int currentRow = current[0];
            int currentColumn = current[1];
            for (int i = 0; i < 8; i++) {
                int neighbourRow = rows[i] + currentRow;
                int neighbourColumn = columns[i] + currentColumn;
                if(neighbourRow<0 || neighbourRow >= matrix.size() || neighbourColumn < 0 || neighbourColumn >= matrix.get(0).size())
                    continue;
                if(matrix.get(neighbourRow).get(neighbourColumn)!=0){
                    queue.add(new int[]{neighbourRow,neighbourColumn});
                    matrix.get(neighbourRow).set(neighbourColumn,0);
                }
            }
        }
    }
}
