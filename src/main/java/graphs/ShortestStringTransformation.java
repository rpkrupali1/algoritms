package graphs;

import java.util.*;

/**
 * You are given a dictionary called words and two string arguments called start and stop.
 * All given strings have equal length.
 * Transform string start to string stop one character per step using words from the dictionary.
 * For example, "abc" → "abd" is a valid transformation step because only one character is changed
 * ("c" → "d"), but "abc" → "axy" is not a valid one because two characters are changed ("b" → "x" and "c" → "y").
 * You need to find the shortest possible sequence of strings (two or more) such that:
     * First string is start.
     * Last string is stop.
     * Every string (except the first one) differs from the previous one by exactly one character.
     * Every string (except, possibly, first and last ones) are in the dictionary of words.
 * Example One
     * "words": ["cat", "hat", "bad", "had"],
     * "start": "bat",
     * "stop": "had"
     * Output: ["bat", "bad", "had"] OR ["bat", "hat", "had"]
     * In "bat", change "t" → "d" to get "bad".
     * In "bad", change "b" → "h"to get "had".
     * OR
     * In "bat", change "b" → "h" to get "hat".
     * In "hat", change "t" → "d" to get "had".
 * Example Two
     * "words": [],
     * "start": bbb,
     * "stop": bbc
     * Output: ["bbb", "bbc"]
     * In "bbb", the last character to "b" and get "bbc".
 * Example Three
 * "words": [],
 * "start": "zzzzzz",
 * "stop": "zzzzzz"
 * Output: ["-1"]
 */
public class ShortestStringTransformation {
    private static int length, no_of_words=0;
    private static boolean[] visited;
    private static final HashMap<String,Integer> position = new HashMap<>();
    private static final HashMap<Integer,Integer> parent = new HashMap<>();

    public static ArrayList<String> usingDictionary(ArrayList<String> words, String start, String stop) {
        length = start.length();
        // stop word needs to be added at the end of dictionary
        if(words.contains(stop))
            words.remove(stop);
        words.add(stop);

        no_of_words = words.size();
        visited = new boolean[no_of_words];
        Arrays.fill(visited,false);
        bfs(words,start);

        ArrayList<String> result = new ArrayList<>();
        int stop_index = no_of_words-1;
        if(!parent.containsKey(stop_index)){
            result.add("-1");
            return result;
        }

        while (stop_index!=-1){
            result.add(words.get(stop_index));
            stop_index = parent.get(stop_index);
        }
        result.add(start);
        Collections.reverse(result);
        return result;
    }

    private static void bfs(ArrayList<String> words, String start){
        // When no_of_words > length * 26, we are going to use hashmap
        // So, we need to use hash map for faster search.
        // For search if string is present in words array or not in O(length) time.

        for (int i = 0; i < no_of_words; i++) {
            position.put(words.get(i), i);
        }

        Queue<Integer> queue = new LinkedList<>();
        queue.add(-1); //-1 means start String

        while (!queue.isEmpty()){
            int index = queue.poll();
            String current_word;
            if(index==-1)
                current_word = start;
            else current_word = words.get(index);
            StringBuilder sb = new StringBuilder(current_word);
            for (int i = 0; i < length; i++) {
                for (char ch = 'a'; ch <= 'z' ; ch++) {
                    if(ch==current_word.charAt(i))
                        continue;
                    // Store the original character, this will help to reverse the change.
                    char orig_char = sb.charAt(i);
                    sb.setCharAt(i,ch);
                    //now check if new string is in words dictionary
                    int it = position.getOrDefault(sb.toString(),-1);
                    System.out.println(it);
                    if(it != -1){
                        if(!visited[it]){
                            visited[it]=true;
                            parent.put(it,index);
                            if(it==no_of_words-1)
                                return;
                            queue.add(it);
                        }
                    }
                    sb.setCharAt(i,orig_char);
                }
            }

        }
    }
}
