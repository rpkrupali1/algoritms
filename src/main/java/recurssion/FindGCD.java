package recurssion;

/**
 * Write a program to calculate Greatest Common Division  GCD using Euclid's algorithm
 * The Euclidean Algorithm for finding GCD(A,B) is as follows:
     * If A = 0 then GCD(A,B)=B, since the GCD(0,B)=B, and we can stop.
     * If B = 0 then GCD(A,B)=A, since the GCD(A,0)=A, and we can stop.
     * Write A in quotient remainder form (A = B⋅Q + R)
     * Find GCD(B,R) using the Euclidean Algorithm since GCD(A,B) = GCD(B,R)
 */
public class FindGCD {
    public static int recursive(int n1, int n2){
        if(n1==0)
            return n2;
        if(n2==0)
            return n1;
        int remainder = n1%n2;
        return recursive(n2,remainder);
    }
}
