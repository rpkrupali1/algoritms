package graphs;

import java.util.*;

/**
 * Is It A Tree
 * Given an undirected graph, find out whether it is a tree. *
 * The undirected edges are given by two arrays edge_start and edge_end of equal size.
 * Edges of the given graph connect nodes edge_start[i] and edge_end[i] for all valid i.
 * Example One
     * Input:
         * "node_count": 4,
         * "edge_start": [0, 0, 0],
         * "edge_end": [1, 2, 3]
     * Output:  1
        * This graph is a tree because all the nodes are connected, and it does not have cycles.
 * Example Two
     * Input:
         * "node_count": 4,
         * "edge_start": [0, 0],
         * "edge_end": [1, 2]
     * Output:  0
        * This graph is not a tree because node 3 is not connected to the other nodes.
 * Example Three
     * Input:
         * "node_count": 4,
         * "edge_start": [0, 0, 1, 2],
         * "edge_end": [3, 1, 2, 0]
     * Output: 0
        * This graph is not a tree: nodes 0, 1 and 2 form a cycle.
 * Example Four
     * Input:
         * "node_count": 4,
         * "edge_start": [0, 0, 0, 1],
         * "edge_end": [1, 2, 3, 0]
     * Output: 0
        * This graph is not a tree because the two edges that connect nodes 0 and 1 form a cycle.
 * Solution:
 * Here are properties that graph must have to become tree
 * 1) The graph has to be connected
 * 2) The graph can not have cycle
 * 3) The graph can not have multi-edges
 * 4) The graph can not have self loops
 * 5) The graph must have node_count - 1 edges ( otherwise it will not be connected)
 */
public class IsItItreeUndirectGraph {
    private static final ArrayList<ArrayList<Integer>> aL = new ArrayList<>();
    private static boolean[] visited = null;
    private static int[] parent = null;
    public static boolean bfs(int n, ArrayList<Integer> edge_start, ArrayList<Integer> edge_end){
        if(edge_start.size()!=n-1)
            return false;

        HashSet<String> unique_edges = new HashSet<>();

        for (int i = 0; i < n; i++) {
            aL.add(new ArrayList<>());
        }

        for (int i = 0; i < edge_start.size(); i++) {
            int start = edge_start.get(i);
            int end = edge_end.get(i);

            // if it is self loop then it is not a tree
            if(start==end)
                return false;

            //create aL for undirected graph
            aL.get(start).add(end);
            aL.get(end).add(start);

            // check for multi edges- if multi edges then it is not a tree
            String current_edge = Math.min(start,end) + " " + Math.max(start,end);
            if(unique_edges.contains(current_edge))
                return false;
            unique_edges.add(current_edge);
        }

        visited = new boolean[n];
        parent = new int[n];
        Arrays.fill(visited,false);
        Arrays.fill(parent,-1);
         int count =0;

        for (int i = 0; i < n; i++) {
            if(!visited[i]){
                if(!bfs_helper(i) || count >0)
                    return false;
                count++;
            }
        }

        return true;
    }

    private static boolean bfs_helper(int source){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(source);
        visited[source] = true;

        while (!queue.isEmpty()){
            int node = queue.poll();
            for(int tempnode : aL.get(node)){
                if(!visited[tempnode]){
                    queue.add(tempnode);
                    visited[tempnode]=true;
                    parent[tempnode] = node;
                }
                else if(tempnode != parent[node])
                    return false; //cross edge
            }
        }
        return true;
    }
}
