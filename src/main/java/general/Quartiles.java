package general;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Given an array, arr of n integers, calculate the respective first quartile (Q1), second quartile (Q2), and third quartile (Q3).
 * It is guaranteed that Q1, Q2, and Q3 are integers.
 * Example 1
 * arr = [9,5,7,1,3]
 * The sorted array is [1,3,5,7,9] which has an odd number of elements.
 * The lower half consists of [1,3], and its median is [1+3]/2 = 2.
 * The middle element is 5 and represents the second quartile.
 * The upper half is [7,9] and its median is [7+9]/2=8. Return [2,5,8] .
 * Example 2:
 * arr = [1,3,5,7]
 * The array is already sorted.
 * The lower half is [1,3] with a median = [1+3]/2 = 2.
 * The median of the entire array is [3+5]/2 = 4,
 * and of the upper half is [5+7]/2=6 . Return [2,4,6] .
 */
public class Quartiles {
    public static List<Integer> quartiles(List<Integer> arr) {
        Collections.sort(arr);
        List<Integer> result = new ArrayList<>();
        int middle = arr.size()/2;
        List<Integer> q1List = arr.subList(0,middle);
        int q1 = getMedian(q1List);
        int q2 = getMedian(arr);
        if(arr.size()%2!=0)
            middle = middle+1;
        List<Integer> q3List = arr.subList(middle,arr.size());
        int q3 = getMedian(q3List);
        result.add(q1);
        result.add(q2);
        result.add(q3);
        return result;
    }

    private static int getMedian(List<Integer> arr){
        int middle = arr.size()/2;
        int median = arr.get(middle);
        if(arr.size()%2==0)
            median = (median + arr.get(middle - 1)) / 2;
        return median;
    }
}
