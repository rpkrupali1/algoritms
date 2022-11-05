package recurssion;

/**
 * Program to reverse a number using Recursion in Java?
 * Mathematical expression to reverse number
 * 1. Isolate the last digit number = number%10
 * 2. Append the last digit to reverse = (reverse * 10) + last digit
 * 3. Remove the last digit from number = number/10
 */
public class ReverseNumber {
    public static int recursive(int num){
        int reverse = 0;
        reverse  = helper(num,reverse);
        return reverse;
    }

    private static int helper(int num, int reverse){
        if(num==0)
            return reverse;
        int lastNumber = num % 10;
        reverse = (reverse * 10) + lastNumber;
        return helper(num / 10, reverse);

    }

}
