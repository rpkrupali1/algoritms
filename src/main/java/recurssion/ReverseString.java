package recurssion;

/**
 * Write a program to reverse String in Java using Recursion
 */
public class ReverseString {

    public static String recursive_approach(String input){
        char[] chars = input.toCharArray();
        StringBuilder sb = new StringBuilder();
        helper(sb,chars,chars.length-1);
        return sb.toString();
    }

    static void helper(StringBuilder sb, char[] chars, int i){
        if(i<0)
            return;
        sb.append(chars[i]);
        helper(sb,chars,i-1);
    }

    public static String recursive_approach2(String input){
        if(input.isEmpty())
            return input;
        return recursive_approach2(input.substring(1)) + input.charAt(0);
    }

}
