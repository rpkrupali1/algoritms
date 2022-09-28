package sort;

import java.util.ArrayList;

/**
 * Selection sort:
 * Locate the smallest item and put it into first place and then select the next smallest item and put it in second place . And so on..
 * Sorting by repeated selection is "Selection Sort"
 * Design Strategy - brute force
 */
public class Selection {
    public ArrayList<Integer> selection_sort(ArrayList<Integer>arr){
        int n = arr.size();
        for (int i = 0; i < n; i++) {
            int temp = arr.get(i);
            for (int j = i+1; j < n; j++) {
                if(arr.get(j)<temp){
                    arr.set(i,arr.get(j));
                    arr.set(j,temp);
                    temp = arr.get(i);
                }
            }
        }
        return arr;
    }
}
