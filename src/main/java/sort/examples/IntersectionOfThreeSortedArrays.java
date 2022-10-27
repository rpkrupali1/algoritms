package sort.examples;

import java.util.ArrayList;

/**
 * Given three integer arrays arr1, arr2 and arr3 sorted in strictly increasing order, return sorted array of only the integers that appeared in all three arrays.
 *
 * Example 1:
 * Input: arr1 = [1,2,3,4,5], arr2 = [1,2,5,7,9], arr3 = [1,3,4,5,8]
 * Output: [1,5]
 * Explanation: Only 1 and 5 appeared in all three arrays
 */
public class IntersectionOfThreeSortedArrays {
    public int[] threeSorted_bruteForce(int[]arr1, int[]arr2, int[]arr3){
        ArrayList<Integer> output = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                for (int k = 0; k < arr3.length; k++) {
                    if(arr1[i]==arr2[j] && arr2[j]==arr3[k]){
                        output.add(arr1[i]);
                        break;
                    }
                }
            }
        }
       return output.stream().mapToInt(i->i).toArray();
    }

    public int[] threeSorted(int[]arr1, int[]arr2, int[]arr3){
        ArrayList<Integer> output = new ArrayList<>();
        int i=0,j=0,k=0;
        while (i< arr1.length && j< arr2.length && k < arr3.length){
            if(arr1[i]==arr2[j] && arr2[j]==arr3[k]){
                output.add(arr1[i]);
                i++; j++;k++;
            } else if (arr1[i]<=arr2[j] && arr1[i]<=arr3[k]) {
                i++;
            } else if (arr2[j]<=arr1[i] && arr2[j]<=arr3[k]) {
                j++;
            } else
                k++;
        }
        return output.stream().mapToInt(n->n).toArray();
    }
}
