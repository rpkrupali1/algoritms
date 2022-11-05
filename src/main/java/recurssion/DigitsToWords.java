package recurssion;

/**
 * Write a Java program to print digitsToWords(int number) for example digitToWords(321) should print three two ones
 */
public class DigitsToWords {
    public static String recursive(int num){
        String output = helper(num,"");
        return output.trim();
    }

    private static String helper(int num, String output){
        if(num<=0)
            return output;
        int lastDigit = num%10;
        output = numberToWord(lastDigit) + " " + output ;
        return helper(num/10, output);
    }

    private static String numberToWord(int n){
        String[] tens = new String[]{"zero","one","two","three","four","five","six","seven","eight","nine"};
        for (int i = 0; i < 10; i++) {
            if(i==n)
                return tens[i];
        }
        return "null";
    }

}
