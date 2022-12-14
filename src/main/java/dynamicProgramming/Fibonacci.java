package dynamicProgramming;

import java.util.ArrayList;

/**
 * Fibonacci Number
 * Given a number n, find the n-th Fibonacci Number.
 * Example
 * "n": 2
 * Output: 1
 * 2nd Fibonacci Number is the sum of the 0th and 1st Fibonacci Number = 0 + 1 = 1.
 * Notes
 * In mathematics, the Fibonacci numbers, commonly denoted Fn, form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
 * F(0) = 0, F(1) = 1 and F(n) = F(n − 1) + F(n − 2) for n > 1.
 * Constraints:
 * 0 <= n <= 46
 */
public class Fibonacci {
    private static ArrayList<Integer> value = new ArrayList<>();
    public static int recursive_memoized(int n){
        value.add(0,0);
        value.add(1,1);
        if(n==0||n==1)
            return value.get(n);
        return helper(n);
    }

    private static int helper(int n){
        if(n< value.size())
            return value.get(n);
        value.add(n,helper(n-1) + helper(n-2));
        return value.get(n);
    }

    public static int space_optimal(int n){
        if(n==0||n==1)
            return n;
        int super_prev = 0;
        int prev = 1;
        int current;
        for (int i = 2; i <= n; i++) {
            current = super_prev + prev;
            super_prev = prev;
            prev = current;
        }
        return prev;
    }
}
