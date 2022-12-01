package graphs;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Convert Edge List To Adjacency List
     * Convert the given edge list to the adjacency list of an undirected connected graph.
     * An adjacency list represents a graph as a list of lists.
     * The list index represents a vertex, and each element in its inner list represents
     * the other vertices that form an edge with the vertex.
 * Example
     * Input:
         * "n": 5,
         * "edges": [[0, 1],[1, 4],[1, 2],[1, 3],[3, 4]]
     * Output:[[1],[0, 2, 3, 4],[1],[1, 4],[1, 3]]
 * Notes
 * There are n nodes in the graph, and each node has a distinct value from 0 to n - 1.
 * Edges are given as a list of pairs. Each pair [u, v] represents an undirected edge between node u and node v.
 * The list won't contain duplicate edges. That is, if [u, v] is present, then there will be no other occurrence of [u, v] or [v, u].
 * Every inner list of the output list should hold the nodes in ascending order.
 */
public class ConvertEdgeListToAdjacencyList {
    public static ArrayList<ArrayList<Integer>> getAList(int n, ArrayList<ArrayList<Integer>> edges){
        ArrayList<ArrayList<Integer>> aL = getAdjecentList(n,edges);
        for (ArrayList<Integer> list: aL )
            Collections.sort(list);

        return aL;
    }

    public static ArrayList<ArrayList<Integer>> getAdjecentList(int n, ArrayList<ArrayList<Integer>> edges){
        ArrayList<ArrayList<Integer>> aL = new ArrayList<>();
        for (int i = 0; i < n; i++)
            aL.add(new ArrayList<>());

        for (ArrayList<Integer> currentEdge : edges) {
            aL.get(currentEdge.get(0)).add(currentEdge.get(1));
            aL.get(currentEdge.get(1)).add(currentEdge.get(0));
        }

        return aL;
    }


}
