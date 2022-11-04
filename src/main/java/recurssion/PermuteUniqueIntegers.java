package recurssion;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Permute Array Of Unique Integers
 * Given an array of unique numbers, return in any order all its permutations.
 * Example
 * {
 * "arr": [1, 2, 3]
 * }
 * Output:
 * [
 * [1, 2, 3],
 * [1, 3, 2],
 * [2, 1, 3],
 * [2, 3, 1],
 * [3, 2, 1],
 * [3, 1, 2]
 * ]
 * Notes
 * Constraints:
 * 1 <= size of the input array <= 9
 * 0 <= any array element <= 99
 */
public class PermuteUniqueIntegers {

    static ArrayList<ArrayList<Integer>> result = new ArrayList<>();

    /*
    Asymptotic complexity in terms of `n` =  size of the input array:
    * Time: O(n * n!).
    * Auxiliary space: O(n).
    * Total space: O(n * n!).
    */
    static ArrayList<ArrayList<Integer>> recursive(ArrayList<Integer> arr) {
        helper(0,arr);
        return result;
    }
    static void helper(int n,ArrayList<Integer> arr){
        if(n == arr.size()){
            result.add((ArrayList) arr.clone());
        }
        for (int i = n; i < arr.size() ; i++) {
            Collections.swap(arr,n,i);
            helper(n+1,arr);
            Collections.swap(arr,n,i);
        }
    }

    //incomplete
    static ArrayList<ArrayList<Integer>> iterative(ArrayList<Integer> arr) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            ArrayList<Integer>temp = new ArrayList<>();
            temp.add(arr.get(i));
        }
        return result;
    }
}
