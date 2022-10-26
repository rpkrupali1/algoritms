package sort.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

/**
 * You have an array of N numbers and a number target.
 * Find out whether the array contains two elements whose sum is target.
 *
 * Example: *
 * array [5, 9, 1, 3] target = 6,
 * answer is yes because 5 + 1 = 6
 * For the same array, if target = 7, answer is no.
 *
 *  Below are the available approaches to choose from:
 *  *      * Transfer and conquer
 *  *      * 3 ways to transform
 *  *      * 1. Sort the input
 *  *      * 2. Build the balanced binary search tree from the input
 *  *      * 3. Build the hash table from the input
 *
 * Which approach to us:
 *  - If extra space is allowed then using Hashtable is the fastest way. Time O(N), Space O(N)
 *  - If array is not sorted then sort array and use 2 pointer approach. Time O(N logN), Space depends on sorting algorithm - O(logN) or O(N)
 *  - If the given array is sorted then use 2 pointer approach. Time O(N), Space (1)
 *
 */
public class TwoSum {

    /**
     * This is the worst time and can be used when you don't have option to sort, or you can not use space
     * Naive approach
     * Time - O(N^2)
     * Space - O(1)
     */
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
     * Use this solution when array is sorted or sort array first
     * Time: O (N logN)
     * O(1)
     */
    public boolean two_sum_twoPointerPass(ArrayList<Integer> arr, int target){
        Collections.sort(arr);
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

    /**
     * Approach - Binary search
     * Look for the solution pair in two halves and if either of halve have it then we are done
     * Else we look for solution that may straddle the two halves and each half has N/2 elements.
     */
//    public boolean binarySearch(ArrayList<Integer> arr, int target){
//        int n = arr.size();
//        Collections.sort(arr);
//        for (int i = 0; i < n; i++) {
//            int output = target- arr.get(i);
//
//        }
//        return false;
//    }


    /**
     * If extra space is allowed then using Hashtable is the fastest way.
     * Time O(N)
     * Space O(N)
     */
    public boolean hashMap(ArrayList<Integer>arr,int target){
        //create hashmap
        HashSet<Integer> map = new HashSet<>();
        for (int i = 0; i < arr.size(); i++) {
            int current = arr.get(i);
            int required = target-current;
            if(map.contains(required))
                return true;
            map.add(arr.get(i));
        }
        return false;
    }


}
