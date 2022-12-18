package sort.examples;

import java.util.ArrayList;

/**
 * Given three integer arrays arr1, arr2 and arr3 sorted in strictly increasing order, return sorted array of only the integers that appeared in all three arrays.
 * <p>
 * Example 1:
 * Input: arr1 = [1,2,3,4,5], arr2 = [1,2,5,7,9], arr3 = [1,3,4,5,8]
 * Output: [1,5]
 * Explanation: Only 1 and 5 appeared in all three arrays
 */
public class IntersectionOfThreeSortedArrays {
    public int[] threeSorted_bruteForce(int[]arr1, int[]arr2, int[]arr3){
        ArrayList<Integer> output = new ArrayList<>();
        for (int value : arr1) {
            for (int i : arr2) {
                for (int j : arr3) {
                    if (value == i && i == j) {
                        output.add(value);
                        break;
                    }
                }
            }
        }
       return output.stream().mapToInt(i->i).toArray();
    }

    public Integer[] threeSorted(int[] arr1, int[] arr2, int[] arr3){
        ArrayList<Integer> output = new ArrayList<>();
        int i=0,j=0,k=0;
        while (i< arr1.length && j< arr2.length && k < arr3.length){
            if(arr1[i]==arr2[j] && arr2[j]==arr3[k]){
                output.add(arr1[i]);
                i++; j++;k++;
            } else if (arr1[i]<=arr2[j] && arr1[i]<=arr3[k]) {
                i++;
            } else if (arr2[j]<=arr1[i] && arr2[j]<=arr3[k]) {
                j++;
            } else
                k++;
        }

        Integer[] result = new Integer[output.size()];
        for (int l = 0; l < result.length; l++) {
            result[l]=output.get(l);
        }

        //return output.stream().mapToInt(n->n).toArray();
        return result;
    }

    /**
     *The idea is to use the merging technique of the Merge Sort algorithm.
     * We simulate merging the three arrays into one.
     * While doing so, we will always consider the elements of the three arrays in sorted order,
     * thus we can check for equality of the three elements being considered and get the common elements.
     * <p>
     * Time - O(l + m + n)
     * Space - O(l + m +n)
     */
    public ArrayList<Integer> pointer(ArrayList<Integer> arr1, ArrayList<Integer> arr2, ArrayList<Integer> arr3) {
        ArrayList<Integer> result = new ArrayList<>();
        int i=0,j=0,k=0;
        while ((i<arr1.size() && j<arr2.size() && k<arr3.size())){
            if(arr1.get(i).equals(arr2.get(j)) && arr1.get(i).equals(arr3.get(k))){
                result.add(arr1.get(i));
                i++;j++;k++;
            } else {
                int min = Math.min(arr1.get(i) , arr2.get(j));
                min = Math.min(arr3.get(k),min);
                if (arr1.get(i)==min)
                    i++;
                else if (arr2.get(j) == min)
                    j++;
                else k++;
            }
        }

        if(result.isEmpty())
            result.add(-1);

        return result;
    }
}
