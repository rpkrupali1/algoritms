package recurssion;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Generate All Combinations With Sum Equal To Target
 * Given an integer array, generate all the unique combinations of the array numbers that sum up to a given target value.
 * Example One
 * Input:  "arr": [1, 2, 3],  "target": 3
 * Output: [[3], [1, 2]]
 * Example Two
 * Input:  "arr": [1, 1, 1, 1], "target": 2
 * Output: [[1, 1]]
 */
public class AllcombinationsWithSumEqualToTarget {
    private static final ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    public static ArrayList<ArrayList<Integer>> recursive_approach(ArrayList<Integer> arr, int target) {
        Collections.sort(arr);
        helper(0,0,target,arr,new ArrayList<>());
        return result;
    }

    private static void helper(int n, int sum,int tarrget,ArrayList<Integer> arr,ArrayList<Integer>slate){
        if(sum==tarrget){
            result.add(new ArrayList<>(slate));
            return;
        }

        if(n>arr.size())
            return;

        Integer preVal = null;
        for (int i = n; i < arr.size(); i++) {
            int num = arr.get(i);
            if(preVal==null || !preVal.equals(num)){
                preVal = num;
                slate.add(num);
                helper(n + 1, sum+num, tarrget, arr, slate);
                slate.remove(slate.size() - 1);
            }
        }
    }
}
