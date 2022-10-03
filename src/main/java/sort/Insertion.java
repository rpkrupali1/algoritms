package sort;

import java.util.ArrayList;

/**
 * Insertion sort:
 * Works similar to the way you sort playing cards
 * Array is split into sorted and unsorted array. Values from unsorted part are picked and placed at correct position in sorted array
 * Design Strategy - Decrease and conquer
 * Efficient for - small data sets, already partially sorted arrays
 * Complexity - o(n^2)
 */
public class Insertion {
    public ArrayList<Integer> insertion_sort(ArrayList<Integer> arr){
        int n = arr.size();
        for (int i = 0; i < n ; i++) {
            int temp = arr.get(i);
            int j = i-1;
            while (j>=0 && arr.get(j)>temp){
                arr.set(j+1,arr.get(j));
                j--;
            }
            arr.set(j+1,temp);
        }
        return arr;
    }
}
