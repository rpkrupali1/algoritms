package graphs;

import java.util.*;

/**
 * DFS Traversal Of A Graph
    * Given an undirected graph, perform a Depth-First Search Traversal on it.
 * Example
     * Input
         * "n": 6,
         * "edges": [[0, 1],[0, 2],[1, 4],[3, 5]]
     * Output: [0, 1, 4, 2, 3, 5]
         * Below are some other valid outputs if the DFS traversal starts from the vertex 0:
         * [0, 2, 1, 4, 5, 3]
         * [0, 2, 1, 4, 3, 5]
         * [0, 1, 4, 2, 5, 3]
         * DFS starting from any other node will also be considered valid.
 */
public class DFSTraversalOfAUndirectedGraph {
    private static final ArrayList<Integer> result = new ArrayList<>();
    private static ArrayList<ArrayList<Integer>> aList = new ArrayList<>(); //adjacent list

    public static ArrayList<Integer> stack_approach(int n, ArrayList<ArrayList<Integer>> edges){
        aList = ConvertEdgeListToAdjacencyList.getAdjecentList(n,edges);
        boolean[] visited = new boolean[n];
        Arrays.fill(visited,false);
        for (int i = 0; i < n; i++) {
            if(!visited[i])
                stack_helper(i,visited);
        }
        return result;
    }

    public static ArrayList<Integer> recursive_approach(int n, ArrayList<ArrayList<Integer>> edges){
        aList = ConvertEdgeListToAdjacencyList.getAdjecentList(n,edges);
        boolean[] visited = new boolean[n];
        Arrays.fill(visited,false);
        for (int i = 0; i < n; i++) {
            if(!visited[i])
                recuse_helper(i,visited);
        }
        return result;
    }

    private static void stack_helper(int source,boolean[] visited){
        Stack<Integer> q = new Stack<>();
        q.push(source);
        visited[source] = true;
        while (!q.isEmpty()){
            int node = q.pop();
            result.add(node);
            for(int tempNode: aList.get(node)){
                if(!visited[tempNode]){
                    q.push(tempNode);
                    visited[tempNode]=true;
                }
            }
        }
    }

    private static void recuse_helper(int source,boolean[] visited){
        result.add(source);
        visited[source]=true;
        for (int i : aList.get(source)){
            if(!visited[i]){
                visited[i]=true;
                recuse_helper(i,visited);
            }
        }

    }
}
