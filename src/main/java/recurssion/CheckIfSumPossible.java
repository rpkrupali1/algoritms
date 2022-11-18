package recurssion;

import java.util.ArrayList;

/**
 * Given a set of integers and a target value k, find whether there is a non-empty subset that sums up to k.
 * Example One
 * Input: "arr": [2, 4, 8], "k": 6
 * Output: 1 Because 2 + 4 = 6.
 * Example Two
 * Input : "arr": [2, 4, 6], "k": 5
 * Output: 0 Because no subset of numbers from the input sums up to 5.
 */
public class CheckIfSumPossible {
    public static boolean checkSum(ArrayList<Long> arr, long k){
        return helper(0,0,arr,k);
    }

    private static boolean helper(int n, long sum, ArrayList<Long> arr,long target){
        if(n>0 && sum==target)
            return true;

        if(n==arr.size()){
            return false;
        }

        //include and recurse
        long num = arr.get(n);
        if(helper(n+1,sum+num,arr,target))
            return true;

        //exclude
        return helper(n+1,sum,arr,target);
    }

}
