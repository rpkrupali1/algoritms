package sort.examples;

import java.util.ArrayList;

/**
 * How do we group numbers in an array by parity?
 * even first and odd then
 *
 * Example:
 * input: [1,2,3,4]
 * output: [4,2,1,3] or [2,4,1,3] or [2,4,3,1] or [4,2,3,1]
 *
 * Order does not matter. Return the same array even on left side and odd on right side.
 */
public class GroupTheNumbers {
    /**
     * Time - Linear complexity - O(n)
     * Space - O(1)
     */
    public ArrayList<Integer> twoPointer(ArrayList<Integer>arr){
        int even=-1;
        for (int i = 0; i < arr.size() ; i++) {
            if(arr.get(i)%2==0){
                even++;
                swap(arr,even,i);
            }
        }
        return arr;
    }

    private void swap(ArrayList<Integer>arr, int index1, int index2){
        int temp = arr.get(index1);
        arr.set(index1, arr.get(index2));
        arr.set(index2,temp);
    }
}
