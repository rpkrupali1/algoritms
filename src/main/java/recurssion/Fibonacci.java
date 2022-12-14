package recurssion;

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

    /**
     * Time - Exponential
     * Space - O(n)
     */
    public int recursive(int n){
        if( n==0 || n==1 )
            return n;
        return recursive(n-1) + recursive(n-2);
    }

    public int recursive_optimal(int n){
        if( n==0 || n==1 )
            return n;
        return recursive(n-1) + recursive(n-2);
    }

    /**
     * Time - O(n)
     * Space - O(1)
     */
    public int iterative(int n){
        if(n==1 || n==0)
            return n;
        int num1=0, num2=1;
        int result=0;
        for (int i = 2; i <= n; i++) {
            result = num1 + num2;
            num1 = num2;
            num2 = result;
        }
        return result;
    }
}

