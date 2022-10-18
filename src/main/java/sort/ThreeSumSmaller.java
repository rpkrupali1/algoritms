package sort;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Given a list of numbers, count the number of triplets having a sum less than a given target.
 * Example One
 * {
 * "target": 4,
 * "numbers": [5, 0, -1, 3, 2]
 * }
 * Output:
 * 2
 * {numbers[1], numbers[2], numbers[3]} and {numbers[1], numbers[2], numbers[4]} are the triplets having sum less than 4.
 */
public class ThreeSumSmaller {
    public int two_pointer(int target, ArrayList<Integer> numbers){
        //int this method first sort the array
        Collections.sort(numbers);
        int threeSumCount=0, n=numbers.size();
        for (int i = 0; i < n; i++) {
            int leftPointer = i+1, rightPointer=n-1;
            while (leftPointer<rightPointer){
                int sum = numbers.get(i) + numbers.get(leftPointer) + numbers.get(rightPointer);
                if(sum<target){
                    threeSumCount+= rightPointer-leftPointer;
                    leftPointer++;
                } else
                    rightPointer--;
            }
        }
        return threeSumCount;
    }
}
