package sort.examples;

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
        //put count of all distinct words into map
        for (String word : words) {
            word_count.put(word, word_count.getOrDefault(word, 0) + 1);
        }

        //priority queue with custom sort
        Queue<String> queue = new PriorityQueue<>((a,b) ->
                word_count.get(a).equals(word_count.get(b)) ? a.compareTo(b): word_count.get(b)-word_count.get(a));

        //sort using queue
        for (String s: word_count.keySet()) {
            queue.offer(s);
        }

        ArrayList<String> result = new ArrayList<>();

        int i = 0;
        while (i < k) {
            result.add(queue.poll());
            i++;
        }

        return result;
    }
}

