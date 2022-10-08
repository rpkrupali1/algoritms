package sort;

import java.util.ArrayList;

/**
 * Quick sort:
 * Select your pivot and then divide. You can pick your pivot different ways as below:
 * 1)First element -Hoare's partition
 * 2)Last Element - Lomuto's partition - Unstable Algorithm
 * 3)Random element -Naive Partition
 * 4)Median
 * Design Strategy - Divide and Conquer
 * Time Complexity -  Ω ( n log n), Θ ( n log n),O ( n ^ 2 )
 * Space complexity - O(1)
 * Best sorting algorithm
 */
public class Quick {

    public ArrayList<Integer> quicksort_naive_partition(ArrayList<Integer> arr){
        naive_sort(arr,0,arr.size()-1);
        return arr;
    }

    private void naive_sort(ArrayList<Integer> arr, int low,int high){
//        if(low>=high)
//            return;
        if(low < high){
            int pivot = naive_partition(arr,low,high);
            naive_sort(arr,low,pivot-1);
            naive_sort(arr,pivot+1,high);
        }
    }

    private int naive_partition(ArrayList<Integer> arr, int low, int high){
        //ArrayList<Integer> temp = new ArrayList<>();
        int[] temp = new int[(high-low) +1];
        // Step2: Choose the pivot based on the type of partition you want, index based for naive partition, first element for Hoare's partition and last element for Lomuto's partition.
        int pivot = arr.get(high);
        //Step 3: Now take two variables indicating left and right of the array excluding the pivot.
        //smaller number
        int index = 0;
        for (int i = low; i <= high; ++i) {
            if(arr.get(i)<pivot){
                temp[index++] = arr.get(i);
            }
        }
        //pivot position
        int pos = index;
        // Placing the pivot to its original position
        temp[index++]= pivot;

        for (int i = low; i <=high; ++i) {
            if(arr.get(i)>pivot){
                temp[index++]=arr.get(i);
            }
        }
        //copy temp values to array
        for (int i = low; i <=high; ++i) {
            arr.set(i, temp[i-low]);
        }
        return pos;
    }

    public ArrayList<Integer> quicksort_lomuto_partition(ArrayList<Integer> arr){
        int n = arr.size();
        lomuto_sort(arr,0,n-1);
        return arr;
    }

    private void lomuto_sort(ArrayList<Integer> arr, int low, int high){
        if(low < high){
            int pivot = lomuto_partition(arr,low,high);
            lomuto_partition(arr,low,pivot-1);
            lomuto_partition(arr,pivot+1,high);
        }
    }

    // This function will partition arr[low ... high] around pivot_element = arr[high] such that all the
    // elements less than pivot_element move to its left and all the elements greater than or equal to
    // pivot_element move to its right.
    private int lomuto_partition(ArrayList<Integer> arr, int low, int high){
        int pivot = arr.get(high);
        int index = low;
        for (int i = low; i < high; i++) {
            if(arr.get(i) < pivot){
                swap(arr,index,i);
                index++;
            }
        }
        swap(arr,index,high);
        return index;
    }

    private void swap(ArrayList<Integer> arr, int index1, int index2){
        int temp = arr.get(index1);
        arr.set(index1, arr.get(index2));
        arr.set(index2,temp);
    }
}
