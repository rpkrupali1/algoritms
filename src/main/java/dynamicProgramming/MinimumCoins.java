package dynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Given a variety of coin types defining a currency system,
 * find the minimum number of coins required to express a given amount of money.
 * Assume infinite supply of coins of every type.
 * Example
 * "coins": [1, 3, 5],"value": 9
 * Output: 3
 * Here are all the unique ways to express 9 as a sum of coins 1, 3 and 5:
 * 1, 1, 1, 1, 1, 1, 1, 1, 1
 * 1, 1, 1, 1, 1, 1, 3
 * 1, 1, 1, 1, 5
 * 1, 1, 1, 3, 3
 * 1, 3, 5
 * 3, 3, 3
 * Last two ways use the minimal number of coins, 3.
 * Notes
 * There will be no duplicate coin types in the input.
 */
public class MinimumCoins {

    public static Integer minimum_coins(ArrayList<Integer> coins, Integer value) {
        // Write your code here.
        int[] result = new int[value+1];
        Arrays.fill(result,Integer.MAX_VALUE);
        result[0] = 0;
        for(int coin: coins) {
            for (int i = coin; i < value + 1; i++) {
                result[i] = Math.min(result[i], result[i-coin]+1);
            }
        }
        return result[value];
    }
}
