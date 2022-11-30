package graphs;

import java.util.ArrayList;

/**
 * Check If Eulerian Path Exists
 * Given an undirected connected graph,check if there exists any eulerian path in it.
 * The Eulerian Path is a path in the graph that visits every edge exactly once (allowing for revisiting vertices).
 * Example One
 * Input:
 * "n": 4,
 * "edges": [[0, 1],[1, 2],[1, 3],[2, 0],[3, 2]]
 * Output: 1
 * For example, the graph has an Eulerian Path, [1, 2, 0, 1, 3, 2].
 * Example Two
 * Input:
 * "n": 5,
 * "edges": [[0, 3],[1, 2],[1, 3],[3, 2],[4, 1],[4, 2]]
 * Output: 0
 */
public class CheckIfEulerianPathExists {
    public static boolean isPathExist(int n, ArrayList<ArrayList<Integer>> edges){
        if(n==1)
            return true;
        int[] count = new int[n];
        for(ArrayList<Integer> edge:edges){
            for(int vector: edge)
                count[vector]++;
        }
        int ver=0;
        for (int i = 0; i < n; i++) {
            if(count[i]%2!=0)
                ver++;
        }
        if(ver==2 || ver==0)
            return true;
        else return false;
    }
}
