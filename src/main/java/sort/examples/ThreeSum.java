package sort.examples;

import java.util.*;

/**
 * Given an integer array arr of size n, find all magic triplets in it.
 * Magic triplet is a group of three numbers whose sum is zero.
 * Note that magic triplets may or may not be made of consecutive numbers in arr
 * Example
 * {
 * "arr": [10, 3, -4, 1, -6, 9]
 * }
 * Output:
 * ["10,-4,-6", "3,-4,1"]
 * Function must return an array of strings. Each string (if any) in the array must represent a unique magic triplet
 * and strictly follow this format: "1,2,-3" (no whitespace, one comma between numbers).
 */
public class ThreeSum {
    public ArrayList<String> find_zero_sum_bruteForce(ArrayList<Integer> arr){
        Set<String> output = new HashSet<>();
        int n = arr.size();
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    int sum = arr.get(i) + arr.get(j)+ arr.get(k);
                    if(sum==0)
                        output.add(arr.get(i) + "," + arr.get(j) + "," + arr.get(k));
                }
            }
        }
        return new ArrayList<>(output);
    }

    // In this solution we have to make sure array is sorted
    public ArrayList<String> find_zero_sum_optimalSolution(ArrayList<Integer> arr) {
        Collections.sort(arr); //A prerequisite for the two pointer technique to work.
        Set<String> output = new HashSet<>();
        int n = arr.size();
        for (int i = 0; i < n; i++) {
            int target = - arr.get(i);
            int leftIndex = i+1;
            int rightIndex = n-1;
            while (leftIndex < rightIndex){
                int sum = arr.get(leftIndex) + arr.get(rightIndex);
                if(sum==target){
                    output.add(arr.get(i) + "," + arr.get(leftIndex) + "," + arr.get(rightIndex));
                    leftIndex ++;
                } else if (sum > target) {
                    rightIndex--;
                }
                else
                    leftIndex++;
            }
        }
        return new ArrayList<>(output);
    }
}
