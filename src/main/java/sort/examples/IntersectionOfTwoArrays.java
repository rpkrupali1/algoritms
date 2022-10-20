package sort.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/**
 * Given two arrays, write a function to compute their intersection
 *
 * Example1:
 * Input: nums1 = [1,2,2,1], nums2=[2,2]
 * output: [2]
 *
 * Example2:
 * Input: nums1 = [4,9,5], nums2=[9,4,9,8,4]
 * Output: [9,4]
 *
 * Note: Each element in the result must be unique and the result can be in any order
 */
public class IntersectionOfTwoArrays {
    public ArrayList<Integer> usingHash(int[] arr1, int[] arr2){
        ArrayList<Integer> output = new ArrayList<>();
        HashSet<Integer> hs1 = new HashSet<>();
        Arrays.sort(arr2);
        for (int i = 0; i < arr1.length; i++) {
            hs1.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            if(i!=0 && arr2[i]==arr2[i-1])
                continue;
            if(hs1.contains(arr2[i]))
                output.add(arr2[i]);
        }
        return output;
    }


}
