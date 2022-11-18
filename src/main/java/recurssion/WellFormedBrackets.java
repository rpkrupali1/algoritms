package recurssion;

import java.util.ArrayList;

/**
 * Find All Well-formed Brackets
 * Given a positive integer n, return ALL strings of length 2 * n with well-formed round brackets.
 * Example:
 * Input: "n": 3
 * Output:
 * ["((()))",
 * "(()())",
 * "(())()",
 * "()(())",
 * "()()()"]
 * Any array containing these five strings in any order is a correct output.
 */
public class WellFormedBrackets {
    private static ArrayList<String> result = new ArrayList<>();
    public static ArrayList<String> brackets(int n){
        StringBuilder sb = new StringBuilder();
        helper(0,0,n,sb);
        return result;
    }

    private static void helper(int left, int right, int n, StringBuilder slate){
        //backtrack
        if(right>left || right>n || left>n)
            return;

        //base case
        if(left==n && right==n) {
            result.add(new String(slate));
            return;
        }

        //return
        slate.append("(");
        helper(left+1,right,n,slate);
        slate.deleteCharAt(slate.length()-1);
        slate.append(")");
        helper(left,right+1,n,slate);
        slate.deleteCharAt(slate.length()-1);
    }

    private boolean isValid(StringBuilder slate){
        return false;
    }
}
