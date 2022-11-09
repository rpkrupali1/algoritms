package recurssion;

/**
 * Power
 * Given a base a and an exponent b. Your task is to find ab. The value could be large enough. So, calculate ab % 1000000007.
 * Example
 * input: "a": 2,  "b": 10
 * Output: 1024
 */
public class PowerOfNumber {
    private static long mod = 1000000007;
    public static long mod_approach(long n, long p){
        if( n==1 || n==0)
            return n;
        if(p==0)
            return 1;
        n= n%mod;
        return (n * mod_approach(n,p-1))%mod;
    }

    public static long divide_conquer(long n , long p){
        if( n==1 || n==0)
            return n;
        if(p==1)
            return n%mod;
        long temp = divide_conquer(n,p/2);
        if(p%2==0) return (temp%mod)*(temp%mod)%mod;
        else return ((((temp%mod)*(temp%mod))%mod)*(n%mod))%mod;
    }
}
