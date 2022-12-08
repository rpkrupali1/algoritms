package graphs;

import java.util.ArrayList;

/**
 * Find The Town Judge
 * Find the judge among a group of people in a town.
 * If the town judge exists, then:
 * The town judge trusts nobody.
 * Everybody (except for the town judge) trusts the town judge.
 * Example One
 * "n": 4,
 * "trust": [[1, 4],[2, 4],[3, 4]]
 * Output:4
 * Person-1 trusts person-4.
 * Person-2 trusts person-4.
 * Person-3 trusts person-4.
 * Everyone trusts the person-4 and the person-4 trusts no one.
 * Example Two
 * "n": 3,
 * "trust": [[1, 2], [2, 3],[3, 1],[3, 2]]}
 * Output: -1
 */
public class FindTownJudge {
    public static int bfs(int n, ArrayList<ArrayList<Integer>> edges){
        ArrayList<ArrayList<Integer>> aL = new ArrayList<>();
        for (int i = 0; i < n ; i++) {
            aL.add(new ArrayList<>());
        }

        for(ArrayList<Integer> edge: edges)
            aL.get(edge.get(1)-1).add(edge.get(0)-1);

        int counter=0;

        for(ArrayList<Integer> trust: aL){
            counter++;
            if(trust.size()==n-1) {
                return counter;
            }
        }

        return -1;
    }
}
