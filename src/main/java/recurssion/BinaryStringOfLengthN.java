package recurssion;

import java.util.ArrayList;

/**
 * Generate Binary Strings Of Length N
 * Given a number n, generate all possible binary strings of length n.
 * Example
 * {
 * "n": 3
 * }
 * Output:
 * ["000", "001", "010", "011", "100", "101", "110", "111"]
 * Notes
 * A string consisting of only 0s and 1s is called a binary string.
 * Return the output list in any order.
 * Constraints:
 *
 * 1 <= n <= 16
 */
public class BinaryStringOfLengthN {


    static ArrayList<String> recursive(Integer n) {
        // Write your code here.
        ArrayList<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder("");
        helper(n,sb,result);
        return result;
    }

    static void helper(int n, StringBuilder slate, ArrayList<String> result){
        if(n==0){
            result.add(slate.toString());
            return;
        }
        slate.append("0");
        helper(n-1,slate,result);
        slate.deleteCharAt(slate.length()-1);

        slate.append("1");
        helper(n-1,slate,result);
        slate.deleteCharAt(slate.length()-1);

        return;
    }
}
