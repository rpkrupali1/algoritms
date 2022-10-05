package sort;

import java.util.ArrayList;

/**
 * Given some balls of three colors arranged in a line, rearrange them such that all the red balls go first, then green and then blue ones.
 * Do rearrange the balls in place. A solution that simply counts colors and overwrites the array is not the one we are looking for.
 * This is an important problem in search algorithms theory proposed by Dutch computer scientist Edsger Dijkstra.
 * Dutch national flag has three colors (albeit different from ones used in this issue).
 * Do this in ONE pass over the array, NOT TWO passes
 * Solution is only allowed to use constant extra memory
 */
public class DutchNationalFlag {
    public ArrayList<Character> dutchNationalFlag(ArrayList<Character>arr){
        int n = arr.size();
        int RIndex = 0, GIndex=0,BIndex=n-1;
        while (GIndex<=BIndex){
            if(arr.get(GIndex)=='R'){
                swap(arr,GIndex,RIndex);
                RIndex++;
                GIndex++;
            } else if (arr.get(GIndex)=='G') {
                GIndex++;
            }
            else {
                swap(arr,GIndex,BIndex);
                BIndex--;
            }
        }
        return arr;
    }

    public void swap(ArrayList<Character>arr, int index1, int index2){
        char temp = arr.get(index1);
        arr.set(index1,arr.get(index2));
        arr.set(index2,temp);
    }
}
