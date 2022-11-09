package recurssion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Words From Phone Number
 * Given a seven-digit phone number, return all the character combinations that can be generated
 * according to the following mapping:
 * Return the combinations in the lexicographical order.
 * Example One
 * {
 * "phone_number": "23"
 * }
 * Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
 */
public class WordsFromPhoneNumber {
    private static ArrayList<String> result = new ArrayList<>();
    public static ArrayList<String> recursion(String phone_number) {
        // remove 0 and 1 from string as they do not have any mapping in phonepad"
        phone_number = phone_number.replace("0","").replace("1","");
        if(phone_number.length()==0 || phone_number==""){
            result.add("");
            return result;
        }
        char[] chars = phone_number.toCharArray();

        // create mapping
        Map<Character, String> mapping = new HashMap<>();
        mapping.put('2',"abc");
        mapping.put('3',"def");
        mapping.put('4',"ghi");
        mapping.put('5',"jkl");
        mapping.put('6',"mno");
        mapping.put('7',"pqrs");
        mapping.put('8',"tuv");
        mapping.put('9',"wxyz");

        helper(0,chars,mapping,new StringBuilder());
        return result;
    }

    private static void helper(int i, char[] chars,Map<Character,String> mapping, StringBuilder sb){
        if(i==chars.length){
            result.add(new String(sb));
            return;
        }
        String letters = mapping.get(chars[i]);
        for (char ch:  letters.toCharArray() ) {
            sb.append(ch);
            helper(i+1,chars,mapping,sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }

}
