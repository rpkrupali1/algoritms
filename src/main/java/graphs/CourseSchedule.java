package graphs;

import java.util.*;

/**
 * Course Schedule
 * There are n courses to take, they are referred to by numbers from 0 to n - 1.
 * Some of them have prerequisites, e.g.,
 * courses A and B must be completed before course C can be taken (in other words, course C depends on A and B).
 * Find and return an ordering in which all the given courses can be taken while satisfying all the prerequisites.
 * If there exists more than one such ordering, any one of them would be a correct answer.
 * If no such ordering exists, return a special value: [-1].
 * Example
 * "n": 4,
 * "prerequisites": [[1, 0],[2, 0],[3, 1],[3, 2]]
 * Output: [0, 2, 1, 3]
 * According to the input
 * course 0 must be done before both 1 and 2,
 * courses 1 and 2 must be done before course 3.
 * There are two orderings in which one can take all four courses:
 * [0, 2, 1, 3] and [0, 1, 2, 3]. Either is a correct answers.
 */
public class CourseSchedule {

    private static final ArrayList<Integer> result = new ArrayList<>();
    private static final ArrayList<ArrayList<Integer>> aL = new ArrayList<>();
    public static ArrayList<Integer> bfs(Integer n, ArrayList<ArrayList<Integer>> edges) {

        for (int i = 0; i < n; i++) {
            aL.add(new ArrayList<>());
        }

        ArrayList<Integer> in_degree = new ArrayList<>(Collections.nCopies(n,0));

        for(ArrayList<Integer> edge: edges )
            aL.get(edge.get(1)).add(edge.get(0));

        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if(!visited[i])
                bfs_helper(i,visited);
        }

        if(result.size()==n)
            return result;
        return new ArrayList<>(List.of(-1));
    }

    private static void bfs_helper(int source, boolean[] visited){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(source);
        while (!queue.isEmpty()){
            int node = queue.poll();
            for(int tempNode: aL.get(node)){
                if(!visited[tempNode]){
                    visited[tempNode] = true;
                    queue.add(tempNode);
                    result.add(tempNode);
                }
            }
        }
        if(!visited[source]){
            result.add(source);
            visited[source] = true;
        }
    }
}
