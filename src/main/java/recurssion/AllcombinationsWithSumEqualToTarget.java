package recurssion;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Generate All Combinations With Sum Equal To Target
 * Given an integer array, generate all the unique combinations of the array numbers that sum up to a given target value.
 *
 * Example One
 * Input:  "arr": [1, 2, 3],  "target": 3
 * Output: [[3], [1, 2]]
 * Example Two
 * Input:  "arr": [1, 1, 1, 1], "target": 2
 * Output: [[1, 1]]
 */
public class AllcombinationsWithSumEqualToTarget {
    private static ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    public static ArrayList<ArrayList<Integer>> recursive_approach(ArrayList<Integer> arr, int target) {
        Collections.sort(arr);
        helper(0,arr,target,new ArrayList<>());
        return result;
    }

    private static void helper(int i, ArrayList<Integer> arr, int target, ArrayList<Integer> slate){
        if(target<=0){
            if(target==0)
                result.add(new ArrayList<>(slate));
            return;
        }
        for (int j = i; j < arr.size(); j++) {
            int current_num = arr.get(i);
            if(j>i && current_num==arr.get(j-1)) continue;
            slate.add(current_num);
            helper(i+1,arr,target-current_num,slate);
            slate.remove(slate.size()-1);
        }
    }
}
