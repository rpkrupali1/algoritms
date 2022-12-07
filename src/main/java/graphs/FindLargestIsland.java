package graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Find Largest Island
 * Given a two-dimensional grid of 0s and 1s, find the size of the largest island. If there is no island return 0.
 * An island is a group of 1s connected vertically or horizontally.
 * Example One
     * "grid": [
     * [1, 1, 0],
     * [1, 1, 0],
     * [0, 0, 1]]
     * Output:  4
     * There are two islands:
     * [(0, 0), (0, 1), (1, 0), (1, 1)], [(2, 2)]
     * Size of the largest (first) island is 4.
 * Example Two
     * "grid": [
     * [0, 0, 0],
     * [0, 0, 0],
     * [0, 0, 0]]
     * Output: 0
 */

public class FindLargestIsland {
    private static final int[] rows = new int[]{-1,0,0,1};
    private static final int[] columns = new int[]{0,-1,1,0};
    private static final ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    public static Integer bfs(ArrayList<ArrayList<Integer>> grid) {
        for (int i = 0; i < grid.size(); i++) {
            for (int j = 0; j < grid.get(0).size(); j++) {
                if(grid.get(i).get(j)==1){
                   bfs_helper(grid,i,j);
                }
            }
        }
        int count =0;
        for (ArrayList<Integer> integers : result) {
            if (integers.size() > count)
                count = integers.size();
        }
        return count/2;
    }

    private static void bfs_helper(ArrayList<ArrayList<Integer>> grid, int row, int column){
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{row,column});
        grid.get(row).set(column,0);
        ArrayList<Integer> island = new ArrayList<>();
        island.add(row);
        island.add(column);
        while (!queue.isEmpty()){
            int[] current = queue.poll();
            int currentRow = current[0];
            int currentColumn = current[1];
            for (int i = 0; i < 4; i++) {
                int nR = currentRow + rows[i];
                int nC = currentColumn + columns[i];
                if(nR <0 || nR >= grid.size() || nC <0 || nC>=grid.get(0).size())
                    continue;
                if(grid.get(nR).get(nC)!=0){
                    island.add(nR);
                    island.add(nC);
                    queue.add(new int[]{nR,nC});
                    grid.get(nR).set(nC,0);
                }
            }
        }
        result.add(island);
    }
}
