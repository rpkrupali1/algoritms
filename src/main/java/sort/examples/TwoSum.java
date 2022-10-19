package sort.examples;

import java.util.ArrayList;

/**
 * You have an array of N numbers and a number target.
 * Find out whether the array contains two elements whose sum is target.
 *
 * When Array is sorted then use two pinter solution
 *
 * Another solutions:
 *      * Transfer and conquer
 *      * 3 ways to transform
 *      * 1. Sort the input
 *      * 2. Build the balanced binary search tree from the input
 *      * 3. Build the hash table from the input
 *
 * Example: *
 * array [5, 9, 1, 3] target = 6,
 * answer is yes because 5 + 1 = 6
 * For the same array, if target = 7, answer is no.
 */
public class TwoSum {

    public boolean two_sum_bruteForce(ArrayList<Integer> arr, int target){
        int n = arr.size();
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n ; j++) {
                int sum = arr.get(i) + arr.get(j);
                if(sum==target)
                    return true;
            }
        }
        return false;
    }

    /**
     * Use this solution when array is sorted
     */
    public boolean two_sum_twoPointerPass(ArrayList<Integer> arr, int target){
        int n = arr.size();
        int leftIndex =0, rightIndex = n-1;
        while(leftIndex < rightIndex){
            int sum = arr.get(leftIndex) + arr.get(rightIndex);
            if(sum > target)
                rightIndex--;
            else if (sum < target) {
                leftIndex++;
            }
            else
                return true;
        }
        return false;
    }

}
