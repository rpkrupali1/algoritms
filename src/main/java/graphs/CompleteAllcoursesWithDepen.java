package graphs;

import java.util.ArrayList;

/**
 * Complete All Courses With Dependencies
 * A university has n courses to offer.
 * To graduate from that university, a student must complete all those courses.
 * Some courses have prerequisite courses.
 * One can take a course only after completing all of its prerequisites.
 * Dependencies between the courses are described by two arrays a and b of the same size:
 * course a[i] must be taken before course b[i] for all valid indices.
 * Is it possible to complete all the courses without violating constraints?
 * Example One
 * Input:
 * "n": 4,
 * "a": [1, 1, 3],
 * "b": [0, 2, 1]
 * Output: 1
 * One possible ordering is 3, 1, 0, 2.
 * Example Two
 * Input
 * "n": 4,
 * "a": [1, 1, 3, 0],
 * "b": [0, 2, 1, 3]
 * Output: 0
 * Every possible ordering of the courses violates at least one of the constraints.
 * Notes
 * The courses are labeled from 0 to n - 1.
 */
public class CompleteAllcoursesWithDepen {

    private static int timestmap = 0;
    private static final ArrayList<ArrayList<Integer>> aL = new ArrayList<>();
    public static Boolean dfs(Integer n, ArrayList<Integer> a, ArrayList<Integer> b) {
        // Write your code here.

        for (int i = 0; i < n; i++) {
            aL.add(new ArrayList<>());
        }
        for (int i = 0; i < a.size(); i++) {
            aL.get(a.get(i)).add(b.get(i));
        }

        int[] visited = new int[n];
        int[] arrival = new int[n];
        int[] depart = new int[n];

        for (int i = 0; i < n; i++) {
            if(visited[i]==0){
                if(!dfs(i,visited,arrival,depart))
                    return false;
            }
        }
        return true;
    }

    private static boolean dfs(int source, int[] visited, int[] arrival, int[] depart){
        visited[source] = 1;
        arrival[source] = timestmap++;
        for (Integer node : aL.get(source)){
            if(node!=null){
                if(visited[node]==0){
                    visited[node]=1;
                    if(!dfs(node,visited,arrival,depart))
                        return false;
                } else if (depart[node]==0) {
                    return false;
                }
            }
        }
        depart[source] = timestmap++;
        return true;
    }
}
