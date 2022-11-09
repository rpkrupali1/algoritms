package recurssion;

/**
 * Write a Java program to calculate the power of a number like power(int number, int power) like power(2, 3) should return 8
 */
public class PowerOfNumber {
    public static int recursive(int n, int p){
        //System.out.println(p);
//        if(p==0)
//            return 1;
        if(p==1 || n==1 || n==0)
            return n;
        return n * recursive(n,p-1);
    }
}
