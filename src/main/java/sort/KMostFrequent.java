package sort;

import java.util.*;

/**
 * Given a number and a list of words, return the given number of most frequent words.
 *
 * Example
 * {
 * "k": 4,
 * "words": ["car", "bus", "taxi", "car", "driver", "candy", "race", "car", "driver", "fare", "taxi"]
 * }
 *
 * Output:
 * ["car", "driver", "taxi", "bus"]
 */
public class KMostFrequent {
    public ArrayList<String> k_most_frequent(Integer k, ArrayList<String> words) {
        Map<String,Integer> word_count = new HashMap<>();
        int n = words.size();
        //put count of all distinct words into map
        for (int i = 0; i < n; i++) {
            word_count.put(words.get(i),word_count.getOrDefault(words.get(i),0)+1);
        }
        // create arraylist from above  map
        ArrayList<Map.Entry<String,Integer>> list = new ArrayList<>(word_count.entrySet());

        //sort the list by frequency
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                if(o1.getValue().equals(o2.getValue()))
                    return o2.getValue().compareTo(o1.getValue());
                else
                    return o1.getKey().compareTo(o2.getKey());
            }
        });



        return new ArrayList<>();
    }
}

