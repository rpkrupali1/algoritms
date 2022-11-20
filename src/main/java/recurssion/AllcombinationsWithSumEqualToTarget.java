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
        helper(0,0,target,arr,new ArrayList<Integer>());
        //generateCombinationSum(arr, target, result, new ArrayList<Integer>(), 0, 0);
        return result;
    }

    private static void helper(final int n, final int sum,final int tarrget,
                               final ArrayList<Integer> arr, final ArrayList<Integer>slate){
        if(sum==tarrget){
            result.add(new ArrayList<>(slate));
            return;
        }

        if(n>=arr.size())
            return;

        Integer preVal = null;
        for (int i = n; i < arr.size(); i++) {
            int num = arr.get(i);
            if(preVal==null || !preVal.equals(num)){
                preVal = num;
                slate.add(num);
                helper(i + 1, sum+num, tarrget, arr, slate);
                slate.remove(slate.size() - 1);
            }
        }
    }

    private static void generateCombinationSum(final ArrayList<Integer> input, final int target, final ArrayList<ArrayList<Integer>> results,
                                               final ArrayList<Integer> candidate,
                                               final int index, final int runningSum) {
        if (runningSum == target) {
            results.add(new ArrayList<>(candidate));
            return;
        }

        if (index >= input.size()) {
            return;
        }

        Integer prevValue = null;
        for (int nextIndex = index; nextIndex < input.size(); nextIndex++) {
            Integer nextValue = input.get(nextIndex);
            if (prevValue == null || !prevValue.equals(nextValue)) {
                prevValue = nextValue;
                candidate.add(nextValue);
                generateCombinationSum(input, target, results, candidate, nextIndex + 1, runningSum + nextValue);
                candidate.remove(candidate.size() - 1);
            }
        }

        return;
    }
}
