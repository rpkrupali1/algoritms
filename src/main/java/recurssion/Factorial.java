package recurssion;

/**
 * Write a program to calculate factorial using recursion in Java?
 * Example: 4! is shorthand for 4 × 3 × 2 × 1
 */
public class Factorial {
    public static int recursive_approach(int n){
        if(n==1)
            return 1;
        return n * recursive_approach(n-1);
    }
}
