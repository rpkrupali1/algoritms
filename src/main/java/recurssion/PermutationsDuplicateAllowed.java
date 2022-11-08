package recurssion;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Permute Array Of Integers Duplicates Allowed
 * Given an array of numbers with possible duplicates, return all of its permutations in any order.
 * Example
 * {
 * "arr": [1, 2, 2]
 * }
 * Output:
 * [
 * [1, 2, 2],
 * [2, 1, 2],
 * [2, 2, 1]
 * ]
 * Notes
 * Constraints:
 *
 * 1 <= size of the input array <= 9
 * 0 <= any array element <= 9
 */
public class PermutationsDuplicateAllowed {
    private static ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    public static ArrayList<ArrayList<Integer>> recursive_approach(ArrayList<Integer> arr){
        helper(arr,0);
        Set<ArrayList<Integer>> hs = new HashSet<>(result);
        ArrayList<ArrayList<Integer>> finalResult = new ArrayList<>(hs);
        return finalResult;
    }

    private static void helper(ArrayList<Integer>arr,int i){
        if(i==arr.size()){
            result.add(new ArrayList<>(arr));
            return;
        }
        for (int j = i; j < arr.size(); j++) {
            Collections.swap(arr,i,j);
            helper(arr,i+1);
            Collections.swap(arr,i,j);
        }
    }

}
