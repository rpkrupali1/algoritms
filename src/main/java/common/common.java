package common;

import java.util.ArrayList;

public class common {
    static void swap(ArrayList<Integer>arr,int index1, int index2){
        int temp = arr.get(index1);
        arr.set(index1, arr.get(index2));
        arr.set(index2,temp);
    }

    static void reverse(ArrayList<Integer>arr,int start){
        int i = start,j=arr.size()-1;
        while (i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
}
