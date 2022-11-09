package recurssion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Write a function to generate all possible n pairs of balanced parentheses.
 * Examples:
 * Input: n=1
 * Output: {}
 * Explanation: This the only sequence of balanced
 * parenthesis formed using 1 pair of balanced parenthesis.
 * Input : n=2
 * Output:
 * {}{}
 * {{}}
 * Explanation: This the only two sequences of balanced
 * parenthesis formed using 2 pair of balanced parenthesis.
 */
public class GenerateParentheses {
    private static ArrayList<String> result = new ArrayList<>();
    public static ArrayList<String> recursive(int n){
        helper(n,0,0,"");
        Set<String> hs = new HashSet<>(result);
        ArrayList<String> finalResult = new ArrayList<>(hs);
        return finalResult;
    }

    private static void helper(int n, int open,int close, String s){
        if(open==n && close==n){
            result.add(s);
            return;
        }
        if(open<n)
            helper(n,open+1,close,s +"{" );

        if(close<n)
            helper(n,open,close+1,s +"}" );

        if(close<open)
            helper(n,open,close+1,s +"}" );
    }
}
