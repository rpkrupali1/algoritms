package recurssion;

public class BasicLearning {

    /**
     * Write a function that prints 1 to n
     */
    static void basicPrint(int num){
        basicRecursion(1,num);
    }

    private static void basicRecursion(int num, int size){
        if(num>size)
            return;
        System.out.print(num + " ");
        basicRecursion(num+1,size);
    }

    /**
     * Write a function that prints 1 to n
     */
    static void basicPrint_recursionHead(int num){
        if(num==0)
            return;
        basicPrint_recursionHead(num-1);
        System.out.print(num + " ");
    }

    /**
     * Write a recursive function which calculates the sum of 1 to n numbers when n is given.
     * Eg : f(n=3) should return 6 (1 + 2 + 3 = 6)
     */
    static int sumOf1toN(int n){
        if(n==1)
            return 1;
        return n + sumOf1toN(n-1);
    }

}
