package sort;

import java.util.ArrayList;

public class insertion {
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
