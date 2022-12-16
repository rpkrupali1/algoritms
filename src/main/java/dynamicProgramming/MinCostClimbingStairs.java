package dynamicProgramming;

import java.util.ArrayList;

/**
 * Min Cost Climbing Stairs
 * There are n stairs indexed 0 to n – 1. Each stair has a cost associated with it.
 * After paying the cost, it's allowed either to climb one or two steps further.
 * It's allowed to either start from the step with index 0, or the step with index 1.
 * Given the cost array, find the minimum cost to reach the top of the floor.
 * cost[i] represents the cost of i-th stair.
 * Example One
 * "cost": [1, 1, 2]
 * Output: 1
 * There are 5 ways to reach the top floor.
 * step 0 → step 1 → step 2 → top floor.
 * step 0 → step 1 → top floor.
 * step 0 → step 2 → top floor.
 * step 1 → step 2 → top floor.
 * step 1 → top floor.
 * Here, the last way(step 1 → top floor) will provide the most optimal cost 1.
 * Example Two
 * "cost": [3, 4]
 * Output: 3
 */
public class MinCostClimbingStairs {
    public static int iterative(ArrayList<Integer> cost){
        int result = 0 ;
        int i=0;
        while (i<= cost.size()-2){
            int oneStep=cost.get(i);
            int twoStep = cost.get(i+1);
            if(oneStep>=twoStep){
                result = result + twoStep;
                i = i+2;
            }
            else {
                result = result + oneStep;
                i++;
            }
        }
        return result;
    }
}
