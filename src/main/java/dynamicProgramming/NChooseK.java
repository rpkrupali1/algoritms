package dynamicProgramming;

/**
 * N Choose R
 * Consider you have n distinct elements,
 * find the number of ways through which you can choose exactly r number of elements out of those.
 * Example One
 * "n": 5, "r": 3
 * Output: 10
 * There is a set of 5 elements {1, 2, 3, 4, 5}.
 * You need to pick a subset of size 3. Eligible subsets are
 * {1, 2, 3}, {1, 2, 4}, {1, 2, 5}, {1, 3, 4}, {1, 3, 5}, {1, 4, 5}, {2, 3, 4}, {2, 3, 5}, {2, 4, 5}, {3, 4, 5}.
 * There are 10 subsets of size 3.
 * Example Two
 * "n": 3, "r: 5
 * Output: 0
 * There is a set of 3 elements {1, 2, 3}. You need to pick a subset of size 5.
 * Which is not possible, that's why the answer is 0.
 * Notes
 * Here the answer can be very big, find it modulo 109 + 7.
 */
public class NChooseK {

    public static int optimal_solution(int n, int k){
        if(k>n)
            return 0;
        if(k==0||k==n)
            return 1;
        int[][] value = new int[2][k+1];
        value[0][0]=1;
        value[1][0]=1;
        value[1][1]=1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= Math.min(i,k); j++) {
                value[i%2][j]= value[(i+1)%2][j-1] + value[(i+1)%2][j];
            }
            
        }
        return value[n%2][k];
    }

    public static int dynamic_recursion(int n, int k){
        if(k>n)
            return 0;
        int[][] value = new int[n+1][k+1];
        for (int i = 0; i <= n; i++)
            value[i][0] = 1;


        for (int i = 0; i <= k; i++)
            value[i][i]=1;

        return helper(n,k,value);
    }

    private static int helper(int n, int k, int[][] value){
        if(value[n][k]!=0)
            return value[n][k];
        value[n][k]=helper(n-1,k,value) + helper(n-1,k-1,value);
        return value[n][k];
    }

}
