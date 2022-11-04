package recurssion;

import java.util.ArrayList;

/**
 * Generate All Subsets Of A Set
 * Generate ALL possible subsets of a given set. The set is given in the form of a string s containing distinct lowercase characters 'a' - 'z'.
 * Example
 * {
 * "s": "xy"
 * }
 * Output:
 * ["", "x", "y", "xy"]
 * Notes
 * Any set is a subset of itself.
 * Empty set is a subset of any set.
 * Output contains ALL possible subsets of given string.
 * Order of strings in the output does not matter. E.g. s = "a", arrays ["", "a"] and ["a", ""] both will be accepted.
 * Order of characters in any subset must be same as in the input string. For s = "xy", array ["", "x", "y", "xy"] will be accepted, but ["", "x", "y", "yx"] will not be accepted.
 */
public class AllSubsetOfASet {
    private static ArrayList<String> result = new ArrayList<>();

    static ArrayList<String> recursive(String s) {
        if(s==null)
            return result;
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        helper(chars,sb,0);
        return result;
    }

    private static void helper(char[] chars,StringBuilder sb, int n){
        if(n==chars.length){
            result.add(sb.toString());
            return;
        }
        helper(chars,sb,n+1);
        sb.append(chars[n]);
        helper(chars,sb,n+1);
        sb.deleteCharAt(sb.length()-1);

    }
}
