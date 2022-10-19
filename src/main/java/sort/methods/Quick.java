package sort.methods;

import java.util.ArrayList;
import java.util.Random;

/**
 * Quick sort:
 * Select your pivot and then divide. You can pick your pivot different ways as below:
 * 1)First element -Hoare's partition
 * 2)Last Element - Lomuto's partition - Unstable Algorithm
 * 3)Random element -Naive Partition
 * 4)Median
 * Design Strategy - Divide and Conquer
 * Time Complexity -  Ω(n log(n)), Θ(n log(n)), O(n^2 )
 * Space complexity - O(1), O(log(n))
 * Best sorting algorithm
 */
public class Quick {

    private void swap(ArrayList<Integer> arr, int index1, int index2){
        int temp = arr.get(index1);
        arr.set(index1, arr.get(index2));
        arr.set(index2,temp);
    }

    public ArrayList<Integer>firstIndex_quick_sort(ArrayList<Integer>arr){
        int n = arr.size();
        firstIndex_helper(arr,0,n-1);
        return arr;
    }

    private void firstIndex_helper(ArrayList<Integer>arr, int low, int high){
        if(low>=high)
            return;
        int pivot = firstIndex_partition(arr,low,high);
        firstIndex_helper(arr,low,pivot-1);
        firstIndex_helper(arr,pivot+1,high);
    }

    private int firstIndex_partition(ArrayList<Integer>arr, int low, int high){
        int pivot = high;
        int pivot_element = arr.get(low);
        for (int i = high; i >low ; i--) {
            if(arr.get(i)>pivot_element){
                swap(arr,i,pivot);
                pivot--;
            }
        }
        //taking pivot element to pivot position
        swap(arr,pivot,low);
        return pivot;
    }

    public ArrayList<Integer> lastIndex_quickSort(ArrayList<Integer> arr){
        int n = arr.size();
        lastIndex_helper(arr,0,n-1);
        return arr;
    }

    private void lastIndex_helper(ArrayList<Integer>arr, int low, int high){
        if(low>=high)
            return;
        int pivot = lastIndex_partition(arr,low,high);
        lastIndex_helper(arr,low,pivot-1);
        lastIndex_helper(arr,pivot+1,high);
    }

    private int lastIndex_partition(ArrayList<Integer>arr, int low, int high){
        int pivot = low;
        int pivotElement = arr.get(high);
        for (int i = low; i < high; i++) {
            if(arr.get(i)<pivotElement){
                swap(arr,i,pivot);
                pivot++;
            }
        }
        //swap pivot point
        swap(arr,pivot,high);
        return pivot;
    }

    public ArrayList<Integer> random_quickSort(ArrayList<Integer> arr){
        int n = arr.size();
        random_helper(arr,0,n-1);
        return arr;
    }

    private void random_helper(ArrayList<Integer>arr, int low, int high){
        if(low>=high)
            return;
        int pivot = random_partition(arr,low,high);
        lastIndex_helper(arr,low,pivot-1);
        lastIndex_helper(arr,pivot+1,high);
    }

    private int random_partition(ArrayList<Integer>arr, int low, int high){
        Random random = new Random();
        int randomIndex = random.nextInt(high-low) + low;
        swap(arr,randomIndex,high);

        int pivot = low;
        int pivotElement = arr.get(high);
        for (int i = low; i < high; i++) {
            if(arr.get(i)<pivotElement){
                swap(arr,i,pivot);
                pivot++;
            }
        }
        //swap pivot point
        swap(arr,pivot,high);
        return pivot;
    }


}
