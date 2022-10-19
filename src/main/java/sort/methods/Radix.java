package sort.methods;

import java.util.ArrayList;
import java.util.Arrays;

public class Radix {

    //using counting sort
    public ArrayList<Integer> radix_sort(ArrayList<Integer> arr){
        int n = arr.size();
        int max = getMax(arr,n);

        //apply counting sort to sort elements based on place value, i represents digits here
        for (int i = 1; max/i > 0 ; i*=10) {
            counting_sort(arr,n,i);
        }

        return arr;
    }

    private void counting_sort(ArrayList<Integer>arr, int n, int digits){
        int[] output = new int[n];
        int[] count = new int[10];
        Arrays.fill(count,0);

        //calculate count of each element
        for (int i = 0; i < n; i++) {
            count[(arr.get(i)/digits)%10]++;
        }

        //calculate cumulative count
        for (int i = 1; i < 10; i++) {
            count[i] += count[i-1];
        }

        //sort and add elements into output array
        for (int i = n-1; i >=0 ; i--) {
            output[count[(arr.get(i)/digits)%10]-1]=arr.get(i);
            count[(arr.get(i)/digits)%10]--;
        }
        
        //copy output array to its original array
        for (int i = 0; i < n; i++) {
            arr.set(i,output[i]);
        }
    }

    private int getMax(ArrayList<Integer> arr, int n){
        int max = arr.get(0);
        for (int i = 1; i < n ; i++) {
            if(arr.get(i) > max)
                max = arr.get(i);
        }
        return max;
    }
}
