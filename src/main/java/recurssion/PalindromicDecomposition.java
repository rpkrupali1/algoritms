package recurssion;

import java.util.ArrayList;

/**
 * Find all palindromic decompositions of a given string s.
 * A palindromic decomposition of string is a decomposition of the string into substrings,
 * such that all those substrings are valid palindromes.
 * Example:
 * Input:  "s": "abracadabra"
 * Output: ["a|b|r|a|c|ada|b|r|a", "a|b|r|aca|d|a|b|r|a", "a|b|r|a|c|a|d|a|b|r|a"]
 * Notes
 * - Any string is its own substring.
 * - Output should include ALL possible palindromic decompositions of the given string.
 * - Order of decompositions in the output does not matter.
 * - To separate substrings in the decomposed string, use | as a separator.
 * - Order of characters in a decomposition must remain the same as in the given string. For example, for s = "ab", return ["a|b"] and not ["b|a"].
 * - Strings in the output must not contain whitespace. For example, ["a |b"] or ["a| b"] is incorrect.
 */
public class PalindromicDecomposition {
    private static ArrayList<String> result = new ArrayList<>();
    public static ArrayList<String> recursive(String s){
        String slate = s.substring(0,1);
        String last_String = s.substring(0,1);
        helper(1,s,slate,last_String);
        return result;
    }

    private static void helper(int i, String s, String slate, String las_string){
        if(i==s.length()){
            if(is_palindrome(las_string))
                result.add(slate);
            return;
        }
        //concat option
        slate = slate + s.charAt(i);
        helper(i+1,s,slate,las_string+s.charAt(i));
        slate = slate.substring(0,slate.length()-1);

        if(!is_palindrome(las_string))
            return;

        //add partition
        slate = slate + '|' + s.charAt(i);
        las_string = String.valueOf(s.charAt(i));
        helper(i+1,s,slate,las_string);
        slate = slate.substring(0,slate.length()-2);
    }

    private static boolean is_palindrome(String s){
        int l = 0;
        int r = s.length()-1;
        while (l<r){
            if(s.charAt(l++)!=s.charAt(r--))
                return false;
        }
        return true;
    }
}
