package recurssion;
import java.util.ArrayList;

/**
 * Given a string s that consists of digits ("0".."9") and target, a non-negative integer,
 * find all expressions that can be built from string s that evaluate to the target.
 * When building expressions, you have to insert one of the following operators between each pair of consecutive characters in s:
 * join or * or +.
 * For example, by inserting different operators between the two characters of string "12"
 * we can get either 12 (1 joined with 2 or "12") or 2 ("1*2") or 3 ("1+2").
 * Other operators such as - or ÷ are NOT supported.
 * Expressions that evaluate to the target but only utilize a part of s do not count: entire s has to be consumed.
 * Precedence of the operators is conventional: join has the highest precedence, * – medium and + has the lowest precedence.
 * For example, 1 + 2 * 34 = (1 + (2 * (34))) = 1 + 68 = 69.
 * You have to return ALL expressions that can be built from string s and evaluate to the target.
 * Example
 * input :  "s": "202",  "target": 4
 * Output: ["2+0+2", "2+02", "2*02"]
 */
public class AllPossibleExpressionToTarget {

    private static final ArrayList<String> result = new ArrayList<>();
    private static long target;
    public static ArrayList<String> generate_all_expressions(String s, long goal){
        if(s==null||s.length()==0)
            return result;
        char[] path = new char[s.length()*2];
        char[] digits = s.toCharArray();
        long n=0;
        target = goal;
        for (int i = 0; i < digits.length; i++) {
            n = n*10 + (digits[i]-'0');
            path[i]=digits[i];
            helper(path,digits,i+1,i+1,0,n);
        }
        return result;
    }

    private static void helper(char[] path, char[] digits, int idx,int length,
                               long pre, long curr){
        //base case
        if(idx==digits.length){
            if(curr + pre == target)
                result.add(new String(path,0,length));
        }
        else {
            long n = 0;
            int j = length +1;
            for (int i = idx; i < digits.length; i++) {
                n = n* 10 + (digits[i]-'0');
                path[j++]=digits[i];
                path[length]='*';
                helper(path,digits,i+1,j,pre,curr*n);
                path[length]='+';
                helper(path,digits,i+1,j,pre+curr,n);
            }
        }
    }
}
