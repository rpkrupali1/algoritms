package dynamicProgramming;

import java.util.ArrayList;

/**
 * Given a string and a dictionary of words,
 * check whether the given string can be broken down into a space-separated sequence of one or more dictionary words.
 * Example One
 * "s": "helloworldhello","words_dictionary": ["world", "hello", "faang"]
 * Output:  1
 * "helloworldhello" can be broken down as hello world hello.
 * Example Two
 * "s": "interviewkickstart", "words_dictionary": ["interview", "preparation"]
 * Output: 0
 * Notes
 * The same word in the dictionary may be used multiple times in the breakdown process.
 */
public class WordBreak {

    static Boolean bottom_up(String s, ArrayList<String> words_dictionary) {
        int size =s.length();
        if(size==0) return true;
        boolean[] table = new boolean[size+1];
        table[0] = true;
        for (int i = 1; i <=size; i++) {
            if(!table[i] && words_dictionary.contains(s.substring(0,i)))
                table[i]= true;
            if(table[i]){
                if(i==size)
                    return true;
                for (int j = i+1; j <= size ; j++) {
                    if(!table[j] && words_dictionary.contains(s.substring(i,j)))
                        table[j]=true;
                    if(j==size && table[j])
                        return true;
                }
            }
        }
        return false;
    }
}
