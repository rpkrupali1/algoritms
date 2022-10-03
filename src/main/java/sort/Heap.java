package sort;

import java.util.ArrayList;

/*
Heap sort is a comparison based sorting technique based on Binary Heap data structure.
It is similar to selection sort where we first find the maximum element and place the maximum element at the end.
We repeat the same process for remaining element.
Heap sort is in-place algorithm.
Typical implementation is not stable but can be made stable
Slower than Quick sort or Merge sort
Design Strategy - Transform and conquer
complexity - O(nlog n)
Spce Complexity - O(n)
Steps:
1) Heapify
2) One by one delete the root node and replace with last leaf node and then heapify
3) Repeat the process
*/

public class Heap {
    public ArrayList<Integer> heap_sort(ArrayList<Integer> arr){
        int n = arr.size();
        //build heap, you only need to consider internal nodes to heapify
        for (int i = n/2-1; i >=0; i--) {
            heapify(arr,n,i);
        }

        //one by one delete the root and replace with last node
        for (int i = n-1; i >0 ; i--) {
            //move current root to end
            int root = arr.get(0);
            arr.set(0,arr.get(i));
            arr.set(i,root);

            //call heapify again
            heapify(arr,i,0);
        }
        return arr;
    }

    // To heapify a subtree rooted with node i which is
    // a root index in arr[]. n is size of heap
    private void heapify(ArrayList<Integer>arr, int n, int i) {
        int largest = i; //initialize largest as root
        int leftIndex = 2 * i + 1; //as per heapify formula, leftIndex = 2*i + 1
        int rightIndex = 2 * i + 2; // as per heapify formula, rightIndex = 2*i + 2

        //compare between left child and parent(root)
        if (leftIndex < n && arr.get(leftIndex) > arr.get(largest) )
            largest = leftIndex;

        //compare right with largest
        if (rightIndex < n && arr.get(rightIndex) > arr.get(largest))
            largest = rightIndex;

        //if root is not the largest then heapify
        if (largest != i) {
            int temp = arr.get(i);
            arr.set(i, arr.get(largest));
            arr.set(largest, temp);

            //recursively heapify the subtrees
            heapify(arr, n, largest);
        }
    }
}
