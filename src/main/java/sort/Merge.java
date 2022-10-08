package sort;

import java.util.ArrayList;

/**
 * Merge sort:
 * Arrays in initially divided into two equal halves, and then they are combined in sorted array
 * continuously split array in half until it can not be further divided that is stop the recursion when array is empty or has only one element left
 * If the array has multiple elements split the array into halves, recursively invoke merge sort on each half
 * When both halves are sorted then combine
 * Design Strategy - Divide and Conquer
 * Time Complexity -  Ω(n log(n)), Θ(n log(n)), O(n log(n))
 * space complexity - O(n)
 * Recurrence relation - T(n) = 2.T(n/2) + o (n log n)
 */
public class Merge {

    ArrayList<Integer> aux = new ArrayList<Integer>();
    public ArrayList<Integer> merge_sort(ArrayList<Integer> arr){
        int n = arr.size();
        split(arr,0,n-1);
        return arr;
    }
    private void split(ArrayList<Integer>arr, int leftIndex, int rightIndex){
        if(leftIndex >= rightIndex)
            return;
        int mid = (leftIndex + rightIndex)/2;
        // call merge sort for first half
        split(arr,leftIndex,mid);
        //call merge sort for second half
        split(arr,mid+1,rightIndex);
        // merge two sorted arrays
        mergeSort(arr,leftIndex,mid,rightIndex);

    }

    private void mergeSort(ArrayList<Integer>arr, int leftIndex, int mid, int rightIndex){
        int[] l = new int[mid-leftIndex + 1];
        int[] r = new int[rightIndex-mid];
        for (int i = 0; i < l.length; i++) {
            l[i] = arr.get(leftIndex +i);
        }
        for (int i = 0; i < r.length; i++) {
            r[i] = arr.get(mid + i + 1);
        }
        //merge l and r
        int i=0,j=0,k=leftIndex;
        while (i<l.length && j<r.length){
            if(l[i]<r[j]){
                arr.set(k,l[i]);
                i++;
            }
            else {
                arr.set(k,r[j]);
                j++;
            }
            k++;
        }
        //merge remaining elements of l or r
        while (i<l.length){
            arr.set(k++,l[i++]);
        }
        while (j<r.length){
            arr.set(k++,r[j++]);
        }
    }

    //this solution not working
    public ArrayList<Integer> merge_sort2(ArrayList<Integer> arr){
        int n = arr.size();
        merge2(arr,0,n-1);
        for (int k = 0; k <= arr.size(); k++) {
            arr.set(k,aux.get(k));
        }
        return arr;
    }

    //this solution not working
    public void merge2(ArrayList<Integer>arr,int left,int right){
        if(left >= right)
            return;
        int mid = left + (right-left)/2;
        merge2(arr,left,mid);
        merge2(arr,mid+1,right);

        int i=left,j=mid+1;
        while (i<=mid && j<=right){
            if(arr.get(i)<arr.get(j)){
                aux.add(arr.get(i));
                i++;
            }
            else {
                aux.add(arr.get(j));
                j++;
            }
        }
        while (i<=mid){
            aux.add(arr.get(i));
            i++;
        }
        while (j<=right){
            aux.add(arr.get(j));
            j++;
        }

        System.out.println(aux);

    }
}
