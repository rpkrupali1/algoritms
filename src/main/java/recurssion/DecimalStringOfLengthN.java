package recurssion;

import java.util.ArrayList;

/**
 * Print all decimal strings of length n
 * Decimal string permutations for digit 0 to 9 for n number
 *
 * Example1:
 * n=2
 * Output:
 * ['01','02','03','04'...'97', '98', and end with 99 ]
 *
 */
public class DecimalStringOfLengthN {
    public static ArrayList<String> recursive(int n){
        ArrayList<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder("");
        helper(n,sb,result);
        return result;
    }

    private static void helper(int n, StringBuilder sb, ArrayList<String> result){
        if(n==0){
            result.add(sb.toString());
            return;
        }
        for (int i = 0; i < 10; i++) {
            helper(n-1,sb.append(i),result);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
