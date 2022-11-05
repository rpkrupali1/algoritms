package recurssion;

/**
 * Write a program to calculate the sum of arithmetic series from 1 to N
 */
public class SumOfArithmeticSeries {
    public static int recursive(int n){
        if (n==1)
            return 1;
        return n + recursive(n-1);
    }
}
