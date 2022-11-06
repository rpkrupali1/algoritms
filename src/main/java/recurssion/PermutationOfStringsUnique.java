package recurssion;

import common.Common;

import java.util.ArrayList;

/**
 * Java program to find all permutations of a given String using recursion.
 * For example, given a String "XYZ", this program will print all 6 possible permutations of input
 * e.g. XYZ, XZY, YXZ, YZX, ZXY, XYX
 */
public class PermutationOfStringsUnique extends Common {

    private static final ArrayList<String> result = new ArrayList<>();
    public static ArrayList<String> recursive(String s){
        helper(s,0);
        return result;
    }

    private static void helper(String s, int i){
        if(i==s.length()-1){
            //String strCopy = s;
            result.add(s);
            return;
        }
        for (int j = i; j < s.length(); j++) {
            //swap(s,i,j);
            String temp = swap(s,i,j);
            helper(temp,i+1);
            //swap(s,i,j);
        }
    }
}
