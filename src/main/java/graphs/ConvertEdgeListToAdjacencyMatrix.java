package graphs;

import java.util.ArrayList;

/**
 * Convert the given edge list to the adjacency matrix of an undirected connected graph.
     * The adjacency matrix is a matrix with rows and columns labeled by graph vertices,
     * with a 1 or 0 in position (u, v) according to whether vertices u and v are adjacent or not.
 * Example
     * Input:
         * "n": 5,
         * "edges": [[0, 1],[1, 4],[1, 2],[1, 3],[3, 4]]
     * Output:
         * [[0, 1, 0, 0, 0],
         * [1, 0, 1, 1, 1],
         * [0, 1, 0, 0, 0],
         * [0, 1, 0, 0, 1],
         * [0, 1, 0, 1, 0]]
 */
public class ConvertEdgeListToAdjacencyMatrix {
    public static ArrayList<ArrayList<Integer>> getMatrix(int n, ArrayList<ArrayList<Integer>> edges){
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        for (int i = 0; i < n; i++)
            matrix.add(new ArrayList<>());

        for (ArrayList<Integer> list: matrix) {
            for (int i = 0; i < n; i++)
                list.add(0);
        }

        for(ArrayList<Integer> edge: edges){
            matrix.get(edge.get(0)).set(edge.get(1),1);
            matrix.get(edge.get(1)).set(edge.get(0),1);
        }
        return matrix;
    }
}
