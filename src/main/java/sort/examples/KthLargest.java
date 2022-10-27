package sort.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * Find the kth the largest element in an unsorted array.
 * Note that it is the kth the largest element in the sorted order, not the kth distinct element.
 *
 * Example 1:
 * Input: [3,2,1,5,6,4] and k=2
 * Output: 5
 *
 * Example 2:
 * Input: [3,2,1,3,1,2,4,5,5,6] and k =4
 * Output: 4
 *
 *      * Sorting technique may overkill
 *      * sort + Index lookup = O(n logn) + O(1)
 *      * Which element is destined to sort fall into index after n-k sorting
 *      * sort only upto the kth largest element is determined
 */
public class KthLargest {

    /**
     * Sorting technique
     * Time complexity = O(N log N)
     * Space Complexity - O(1)
     */
    public int getkth_sorting(int[] arr, int k){
        //first sort
        Arrays.sort(arr);
        int n = arr.length;
        return arr[n-k];
    }

    /**
     * using priority queue
     * Time complexity = O(N log k)
     * Space Complexity - O(k)
     */
    public int priorityQueue(int[] arr, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);

            if(pq.size()>k)
                pq.poll(); // remove the elements which are greater than pq
        }
        return pq.poll();
    }

    public int priorityQueue(ArrayList<Integer> arr, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < arr.size(); i++) {
            pq.add(arr.get(i));
        }
        for (int i = k; i < arr.size(); i++) {
            pq.poll();
        }
        return pq.poll();
    }
}
