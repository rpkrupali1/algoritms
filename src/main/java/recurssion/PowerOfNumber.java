package recurssion;

/**
 * Write a Java program to calculate the power of a number like power(int number, int power) like power(2, 3) should return 8
 */
public class PowerOfNumber {
    public static int recursive(int n, int p){
        if(p==0)
            return 1;
        return n * recursive(n,p-1);
    }
}
