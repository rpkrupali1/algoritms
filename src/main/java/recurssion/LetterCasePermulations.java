package recurssion;
import java.util.ArrayList;

/**
 * Letter Case Permutation
 * Given a string, return all strings that can be generated by changing case of one or more letters in it.
 * Example One
 * {
 * "s": "a1z"
 * }
 * Output:
 * ["A1Z", "A1z", "a1Z", "a1z"]
 * Example Two
 * {
 * "s": "123"
 * }
 * Output:
 * ["123"]
 * Notes
 * Return strings in any order.
 * Constraints:
 * Input string may contain only: 'a'..'z', 'A'..'Z', '0'..'9'
 * 1 <= length of the string <= 12
 */
public class LetterCasePermulations {

    public static ArrayList<String> recursion(String s){
        ArrayList<String> result = new ArrayList<>();
        helper(s,0,new char[s.length()],result);
        return result;
    }

    private static void helper(String s, int i, char[] slate, ArrayList<String> result){
        if(i==s.length()){
            result.add(new String(slate));
            return;
        }
        char ch = s.charAt(i);
        if(Character.isLetter(ch)) {
            slate[i] = Character.toUpperCase(ch);
            helper(s,i+1,slate,result);

            slate[i] = Character.toLowerCase(ch);
            helper(s,i+1,slate,result);
        }
        else{
            slate[i] = ch;
            helper(s,i+1,slate,result);
        }
    }
}