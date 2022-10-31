package recurssion;

import java.util.ArrayList;

/**
 * N Choose K Combinations
 * Given two integers n and k, find all the possible unique combinations of k numbers in range 1 to n.
 *
 * Example One
 * {
 * "n": 5,
 * "k": 2
 * }
 * Output:
 *
 * [
 * [1, 2],
 * [1, 3],
 * [1, 4],
 * [1, 5],
 * [2, 3],
 * [2, 4],
 * [2, 5],
 * [3, 4],
 * [3, 5],
 * [4, 5]
 * ]
 * Example Two
 * {
 * "n": 6,
 * "k": 6
 * }
 * Output:
 *
 * [
 * [1, 2, 3, 4, 5, 6]
 * ]
 * Notes
 * The answer can be returned in any order.
 *
 * Constraints:
 *
 * 1 <= n <= 20
 * 1 <= k <= n
 */
public class NChooseKCombinations {
    static ArrayList<ArrayList<Integer>> recursive(Integer n, Integer k) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> current = new ArrayList<>();
        recursive_combination(1,n,k,current,result);
        return result;
    }

    static void recursive_combination(int current_number,int n, int k,
                                      ArrayList<Integer> current,ArrayList<ArrayList<Integer>> result){
        if(k==current.size()){
            result.add(new ArrayList<>(current));
            return;
        }
        if(current_number==n+1)
            return;
        current.add(current_number);
        recursive_combination(current_number+1,n,k,current,result);
        current.remove(current.size()-1);
        recursive_combination(current_number+1,n,k,current,result);
    }
}
