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
    public static int bfs(int n, ArrayList<ArrayList<Integer>> edges) {
        int[] trusts = new int[n+1];
        int[] trustedBy = new int[n+1];
        for(ArrayList<Integer> list: edges){
            trusts[list.get(0)]++;
            trustedBy[list.get(1)]++;
        }
        for (int i = 1; i <= n; i++) {
            if(trusts[i]==0 && trustedBy[i]==n-1)
                return i;
        }
        return -1;
    }
}
