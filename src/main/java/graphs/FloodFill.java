package graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * One pixel on a grayscale image changes color.
 * Recolor all the adjacent pixels of the same color to the same new color.
 * Grayscale colors are simply numbers.
 * Example One
 * "pixel_row": 0,
 * "pixel_column": 1,
 * "new_color": 2,
 * "image": [
 * [0, 1, 3],
 * [1, 1, 1],
 * [1, 5, 4]]
 * I.e. the pixel at row 0 and column 1 changes to color 2.
 * Output: [
 * [0, 2, 3],
 * [2, 2, 2],
 * [2, 5, 4]]
 * Example Two
     * Input:
     * "pixel_row": 1,
     * "pixel_column": 0,
     * "new_color": 9,
     * "image": [
     * [0, 2, 1],
     * [1, 1, 2],
     * [2, 5, 4]]
     * I.e. the pixel at row 1 and column 0 changes to color 9.
     * Output:
     * [0, 2, 1],
     * [9, 9, 2],
     * [2, 5, 4]]
 * Notes
 * Two pixels are considered adjacent if they share a side; sharing a diagonal is not enough.
 */
public class FloodFill {
    private static final int[] rows = new int[] {-1,0,0,1};
    private static final int[] columns = new int[] {0,-1,1,0};
    public static ArrayList<ArrayList<Integer>> bfs(int pixel_row, int pixel_column,
                                                    int new_color, ArrayList<ArrayList<Integer>> image) {
        int currentColor = image.get(pixel_row).get(pixel_column);
        if(currentColor==new_color)
            return image;

        Queue<int[]> queue=new LinkedList<>();
        queue.add(new int[]{pixel_row,pixel_column});
        image.get(pixel_row).set(pixel_column,new_color);

        while (!queue.isEmpty()){
            int[] current = queue.poll();
            int cR = current[0];
            int cC = current[1];
            for (int i = 0; i < 4; i++) {
                int newRow = cR + rows[i];
                int newColumn = cC + columns[i];
                if(newRow < 0 || newRow >= image.size() || newColumn < 0 || newColumn >= image.get(0).size())
                    continue;
                if(image.get(newRow).get(newColumn)==currentColor) {
                    queue.add(new int[]{newRow,newColumn});
                    image.get(newRow).set(newColumn, new_color);
                }
            }
        }
        return image;
    }

}
