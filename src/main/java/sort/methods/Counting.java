package sort.methods;

import java.util.ArrayList;

/**
 * Sorting based on keys between a specific range.
 * Works by counting the number of objects having distinct values
 * Input data has to be all real numbers, and it has to be in specific range.
 * It is NOT a comparison based algorithm, and  it is NON im-place algorithm.
 * Counting sort is used when there are small integers with multiple counts or the need is linear
 * Time Complexity -  Ω(n+k), Θ(n+k), O(n+2)
 * Space Complexity - O(k)
 */
public class Counting {
    public ArrayList<Integer> counting_sort(ArrayList<Integer>arr){
        int n = arr.size();
        int[] ouput = new int[n];

        //find the largest values of array
        int max = arr.get(0);
        for (Integer integer : arr) {
            if (integer > max)
                max = integer;
        }

        //define count array

        int[] count = new int[max+1];

        //initialize count array with all zeros
//        for (int i = 0; i < count.length; i++) {
//            count[i] = 0;
//        }

        //store the count of each element
        for (Integer integer : arr) {
            count[integer]++;
        }

        //store the cumulative count of each array
        for (int i = 2; i <= max; i++) {
            count[i] += count[i-1];
        }

        //place the element into output array
        for (int i = n-1; i >=0 ; i--) {
            ouput[count[arr.get(i)]-1] = arr.get(i);
            count[arr.get(i)]--;
        }

        //copy output array into original
        for (int i = 0; i < n; i++) {
            arr.set(i,ouput[i]);
        }
        return arr;
    }


}
