package graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Given an undirected graph, find its total number of connected components.
 * Example One
     * Input:
         * "n": 5,
         * "edges": [[0 ,1], [1, 2], [0, 2], [3, 4]]
     * Output: 2
 * Example Two
     * Input
         * "n": 4,
         * "edges": [[0 , 1], [0 , 3], [0 , 2], [2 , 1], [2 , 3]]
     * Output: 1
 */
public class CountConnCompInUndirectGraph {

    public static int bfs(Integer n, ArrayList<ArrayList<Integer>> edges) {
       int count=0;
       ArrayList<ArrayList<Integer>> aL = ConvertEdgeListToAdjacencyList.getAdjecentList(n,edges);
       boolean[] visited = new boolean[n];
       Arrays.fill(visited,false);
        for (int i = 0; i < n; i++) {
            if(!visited[i]){
                count++;
                bfs_helper(i,aL,visited);
            }
        }
       return count;
    }

    public static int dfs(Integer n, ArrayList<ArrayList<Integer>> edges) {
        int count=0;
        ArrayList<ArrayList<Integer>> aL = ConvertEdgeListToAdjacencyList.getAdjecentList(n,edges);
        boolean[] visited = new boolean[n];
        Arrays.fill(visited,false);
        for (int i = 0; i < n; i++) {
            if(!visited[i]){
                count++;
                dfs_helper(i,aL,visited);
            }
        }
        return count;
    }

    private static void bfs_helper(int source, ArrayList<ArrayList<Integer>> aL, boolean[] visited){
        Queue<Integer> q = new LinkedList<>();
        q.add(source);
        visited[source] = true;
        while (!q.isEmpty()){
            int node = q.poll();
            for(int tempnode: aL.get(node)){
                if(!visited[tempnode]){
                    q.add(tempnode);
                    visited[tempnode]=true;
                }
            }
        }
    }

    private static void dfs_helper(int source, ArrayList<ArrayList<Integer>> aL, boolean[] visited){
        visited[source] = true;
        for (int temp : aL.get(source)) {
            if(!visited[temp])
                dfs_helper(temp,aL,visited);
        }
    }

}
