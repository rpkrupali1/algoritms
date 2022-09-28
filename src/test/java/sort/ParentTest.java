package sort;

import java.util.ArrayList;

public class ParentTest {
    public void printTest(ArrayList<Integer> arr){
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
    }

    public boolean isSorted(ArrayList<Integer> arr){
        for (int i = 0; i < arr.size() - 1; i++) {
            if(arr.get(i)>arr.get((i+1)))
                return false;
        }
        return true;
    }
}
