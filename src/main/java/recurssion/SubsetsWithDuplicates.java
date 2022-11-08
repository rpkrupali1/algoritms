package recurssion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Subsets With Duplicate Characters
 * Given a string that might contain duplicate characters, find all the possible distinct subsets of that string.
 * Example One
 * {
 * "s": "aab"
 * }
 * Output:
 * ["", "a", "aa", "aab", "ab", "b"]
 * Example Two
 * {
 * "s": "dc"
 * }
 * Output:
 * ["", "c", "cd", "d"]
 */
public class SubsetsWithDuplicates {

    private static ArrayList<String> result = new ArrayList<>();
    public static ArrayList<String> recursive_approach(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        helper(0,chars, new StringBuilder());
        Set<String> hs = new HashSet<>(result);
        ArrayList<String> finalResult = new ArrayList<>(hs);
        return finalResult;
    }

    private static void helper(int i, char[] chars,StringBuilder sb ){
        if(i==chars.length){
            result.add(new String(sb));
            return;
        }
        // include
        sb.append(chars[i]);
        helper(i+1,chars,sb);
        sb.deleteCharAt(sb.length()-1);
        //exclude
        helper(i+1,chars,sb);
    }

}
