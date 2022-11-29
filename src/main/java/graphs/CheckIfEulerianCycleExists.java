package graphs;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Check If Eulerian Cycle Exists
     * Check if there exists any eulerian cycle in a given undirected connected graph.
     * The Euler cycle is a path in the graph that visits
     * every edge exactly once and starts and finishes at the same vertex.
 * Example One
     * Input:
         * "n": 5,
         * "edges": [[0, 1],[0, 2],[1, 3],[3, 0],[3, 2],[4, 3],[4, 0]]
     * Output: 1
     * For example, the graph has an Eulerian Cycle, [2, 0, 1, 3, 0, 4, 3, 2].
 * Example Two
     * Input:
         * "n": 6,
         * "edges": [[0, 4],[0, 5],[1, 2],[2, 3],[3, 1],[4, 3]]
     * Output: 0
 */
public class CheckIfEulerianCycleExists {
    public static Boolean is_exists(Integer n, ArrayList<ArrayList<Integer>> edges) {
        int[] count = new int[n];
        Arrays.fill(count,0);
        for (ArrayList<Integer> edge: edges) {
            for (int vertex: edge) {
                count[vertex]++;
            }
        }

        for (int i = 0; i < n; i++) {
            if(count[i]%2!=0)
                return false;
        }
        return true;
    }
}
