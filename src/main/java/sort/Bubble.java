package sort;

import java.util.ArrayList;

/**
 * Bubble sort:
 * Repeatedly swapping the adjacent elements if they are in the wrong order
 * Design Strategy - Brute force
 * Not suitable for large data sets
 * Complexity - Worst case = average case = O(n ^2)
 * Space Complexity -
 */
public class Bubble {
    public ArrayList<Integer> bubble_sort(ArrayList<Integer> arr){
        int n = arr.size();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-1; j++) {
                if(arr.get(j)>arr.get(j+1)){
                    int temp = arr.get(j);
                    arr.set(j,arr.get(j+1));
                    arr.set(j+1,temp);
                }
            }
        }
        return arr;
    }
}
