package sort;

import java.util.ArrayList;

/**
 * Given an array of numbers, rearrange them in-place so that even numbers appear before odd ones.
 * Example:
 **** {
 **** "numbers": [1, 2, 3, 4]
 **** }
 * Output:
 **** [4, 2, 3, 1]
 * The order within the group of even numbers does not matter; same with odd numbers.
 *  So the following are also correct outputs: [4, 2, 1, 3], [2, 4, 1, 3], [2, 4, 3, 1].
 */
public class SegregateEvenAndOdd {
    public ArrayList<Integer> sortByEvenAndOdd(ArrayList<Integer> arr){
        int n = arr.size();
        int leftIndex = 0, rightIndex=n-1;
        while (rightIndex >= leftIndex){
            if(arr.get(rightIndex)%2==0){
                int temp = arr.get(rightIndex);
                arr.set(rightIndex, arr.get(leftIndex));
                arr.set(leftIndex,temp);
                leftIndex++;
            }
            else
                rightIndex--;
        }
        return arr;
    }
}
