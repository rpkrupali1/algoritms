package sort.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Given a list of numbers, find all the unique quadruples that sum up to a given target value.
 *
 * Example
 * {
 * "arr": [0, 0, 1, 3, 2, -1],
 * "target": 3
 * }
 *
 * Output:
 * [
 * [-1, 0, 1, 3],
 * [0, 0, 1, 2]
 * ]
 *
 * Solutions:
 * 1) Brute Force Solution
 * 2) Two pointer solution
 * 3) Two pointer Generic solution
 * 4) Hash based pair sum solution
 */
public class FourSum {


    /**
     * brute force solution
     * Time complexity = O(n^4)
     * Space Complexity = O(n^4)
     */
    public ArrayList<ArrayList<Integer>> brute_force(ArrayList<Integer> arr, int target){
        ArrayList<ArrayList<Integer>> output = new ArrayList<>();
        int n = arr.size();
        //We will initially sort the array so that all of the duplicate occurrences of any element come adjacent to each other.
        Collections.sort(arr);
        //The outermost loop will fix an element arr[i] so that the 3 nested inner loops could find the triplets with sum equal to (target - arr[i]).
        for (int i = 0; i < n; i++) {
            // If number = arr[i] has previously been used as a first element of any
            // quadruple, we skip it to avoid duplicate quadruples.
            if(i>0 && arr.get(i).equals(arr.get(i - 1)))
                continue;
            //The second loop will fix an element arr[j] ahead of the index i so that the 2 nested inner loops could find the pairs with sum equal to (target - arr[i] - arr[j]).
            for (int j = i+1; j < n; j++) {
                // If number = arr[j] has previously been used as a second element of any
                // quadruple, we skip it to avoid duplicate quadruples.
                if(j>i+1 && arr.get(j).equals(arr.get(j - 1)))
                    continue;
                //The third loop will fix an element arr[k] ahead of the index j so that the next inner loop could find the numbers equal to (target - arr[i] - arr[j] - arr[k]).
                for (int k = j+1; k < n; k++) {
                    // If number = arr[k] has previously been used as a third element of any
                    // quadruple, we skip it to avoid duplicate quadruples.
                    if(k>j+1 && arr.get(k).equals(arr.get(k - 1)))
                        continue;
                    //The innermost loop will find an element arr[l] ahead of the index k such that (arr[i] + arr[j] + arr[k] + arr[l]) equals target.
                    for (int l = k+1; l < n; l++) {
                        // If number = arr[l] has previously been used as a fourth element of any
                        // quadruple, we skip it to avoid duplicate quadruples.
                        if(l>k+1 && arr.get(l).equals(arr.get(l - 1)))
                            continue;
                        int sum = arr.get(i)+ arr.get(j)+ arr.get(k)+arr.get(l);
                        if(sum==target)
                            output.add(new ArrayList<>(Arrays.asList(arr.get(i),arr.get(j),arr.get(k),arr.get(l))));
                    }
                }
            }
        }
        return output;
    }

    /**
     * brute force solution
     * Time complexity = O(n^3)
     * Space Complexity = O(n^4)
     */
    // two pointer solution
    public ArrayList<ArrayList<Integer>> two_pointer(ArrayList<Integer> arr, int target){
        ArrayList<ArrayList<Integer>> output = new ArrayList<>();
        int n = arr.size();
        //this solution assumes that array is sorted
        Collections.sort(arr);
        for (int i = 0; i < n; i++) {
            //to avoid duplication
            if(i>0 && arr.get(i).equals(arr.get(i-1)))
                continue;
            for (int j = i+1; j < n; j++) {
                //to avoid duplication
                if(j>i+1 && arr.get(j).equals(arr.get(j-1)))
                    continue;
                int rightIndex=n-1, leftIndex=j+1;
                while (leftIndex<rightIndex){
                    int sum = arr.get(i)+ arr.get(j)+arr.get(leftIndex)+arr.get(rightIndex);
                    if(sum==target){
                        output.add(new ArrayList<>(Arrays.asList(arr.get(i),arr.get(j),arr.get(leftIndex),arr.get(rightIndex))));
                        leftIndex++;
                        rightIndex--;
                    }
                    else if(sum>target)
                        rightIndex--;
                    else
                        leftIndex++;
                    //skipping duplicates from left side
                    if(leftIndex>j+1){
                        while (leftIndex<=rightIndex && arr.get(leftIndex).equals(arr.get(leftIndex-1)))
                            leftIndex++;
                    }
                    //skipping duplicates from right side
                    if(rightIndex<n-1){
                        while (rightIndex>=leftIndex && arr.get(rightIndex).equals(arr.get(rightIndex+1)))
                            rightIndex--;
                    }
                }
            }
        }
        return output;
    }
}
