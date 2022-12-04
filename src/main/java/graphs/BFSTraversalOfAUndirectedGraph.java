package graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * BFS Traversal Of A Graph
    * Given an undirected graph, perform a Breadth-First Search Traversal on it.
 * Example
     * Input:
         * "n": 6,
         * "edges": [[0, 1],[0, 2],[0, 4],[2, 3]]
     * Output: [0, 1, 2, 4, 3, 5]
         * Below are some other following valid outputs if the BFS traversal starts from the vertex 0:
         * [0, 1, 4, 2, 3, 5]
         * [0, 2, 1, 4, 3, 5]
         * [0, 2, 4, 1, 3, 5]
         * [0, 4, 1, 2, 3, 5]
         * [0, 4, 2, 1, 3, 5]
         * BFS starting from another node will also be considered valid.
 */
public class BFSTraversalOfAUndirectedGraph {

    private static final ArrayList<Integer> result = new ArrayList<>();

    /**
     * Steps: 1)Build 2)Traverse 3)Process
     */
    public static ArrayList<Integer> traversal(int n, ArrayList<ArrayList<Integer>> edges) {
        // Build
        //convert edge into adjacent list
        ArrayList<ArrayList<Integer>> aList = ConvertEdgeListToAdjacencyList.getAdjecentList(n,edges);

        //call bfs for every node
        boolean[] visited = new boolean[n];
        Arrays.fill(visited,false);
        for (int i = 0; i < n; i++) {
            if(!visited[i])
                bfs(i,aList,visited);
        }
        return result;
    }

    private static void bfs(int source, ArrayList<ArrayList<Integer>> aList, boolean[] visited){
        Queue<Integer> q = new LinkedList<>();
        q.add(source);
        visited[source] = true;
        while (!q.isEmpty()){
            int node = q.poll();
            result.add(node);
            for (int tempNode : aList.get(node)){
                if(visited[tempNode])
                    continue;
                q.add(tempNode);
                visited[tempNode] = true;
            }
        }
    }
}
