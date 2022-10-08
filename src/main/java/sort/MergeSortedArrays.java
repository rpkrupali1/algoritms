package sort;

import java.util.ArrayList;

/**
 * Merge One Sorted Array Into Another sorted such that sorted array is merged array
 * First array has n positive numbers, and they are sorted in the non-descending order. *
 * Second array has 2n numbers: first n are also positive and sorted in the same way but the last n are all zeroes. *
 * Merge the first array into the second and return the latter. You should get 2n positive integers sorted in the non-descending order.
 *
 * Example
 * {
 * "first": [1, 3, 5],
 * "second": [2, 4, 6, 0, 0, 0]
 * }
 *
 * Output:
 * [1, 2, 3, 4, 5, 6]
 */
public class MergeSortedArrays {
    public ArrayList<Integer> mergeSortedArray(ArrayList<Integer> first, ArrayList<Integer> second){
        int n = first.size();
        int i = n-1, j= n-1, k= second.size()-1;
        while (i>=0 && j>=0){
            if(first.get(i)>second.get(j)){
                second.set(k, first.get(i));
                i--;
            }
            else {
                second.set(k,second.get(j));
                j--;
            }
            k--;
        }
        //Gather phase, add remaining from first
        while (i>=0){
            second.set(k, first.get(i));
            k--; i--;
        }
        return second;
    }

}
