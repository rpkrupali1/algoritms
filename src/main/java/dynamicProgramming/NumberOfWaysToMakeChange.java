package dynamicProgramming;

import java.util.ArrayList;

/**
 *  * Number Of Ways To Make Change
 *  * Given a variety of coin denominations existing in a currency system,
 *  * find the total number of ways a given amount of money can be expressed using coins in that currency system.
 *  * Assume infinite supply of coins of every denomination. Return answer modulo 1000000007.
 *  * Example
 *  * coins ": [1, 2, 3],"amount": 3
 *  * Output: 3
 *  * The three ways are:
 *  * Use the coin with denomination 1 three times.
 *  * Use the coin with denomination 3 once.
 *  * Use the coin with denomination 2 once and coin with denomination 1 once.
 */
public class NumberOfWaysToMakeChange {
    private static int result=0;
    public static int bottom_up(ArrayList<Integer> arr, int target){
        dfs(0,0,target,arr);
        return result;
    }

    private static void dfs(int i, int sum, int target,ArrayList<Integer> arr){
        if(sum==target)
            result++;
        if(i>= arr.size())
            return;
        
    }
}
