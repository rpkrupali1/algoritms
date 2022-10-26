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
 * Problem
 *
 * Top K Frequent Elements
 * Given an integer array and a number k, find the k most frequent elements in the array.
 *
 * Example One
 * {
 * "arr": [1, 2, 3, 2, 4, 3, 1],
 * "k": 2
 * }
 * Output:
 * [3, 1]
 *
 * Example Two
 * {
 * "arr": [1, 2, 1, 2, 3, 1],
 * "k": 1
 * }
 * Output:
 * [1]
 */
public class KMostFrequent {
    public ArrayList<String> kMostFrequent_words_pq(Integer k, ArrayList<String> words) {
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

    /**
     * Heap solution
     * Time - O(N logK)
     *  Space - O(N+k)
     */
    public ArrayList<Integer> kMostFrequentElements_pq(ArrayList<Integer> arr,int k){
        if(k == arr.size())
            return arr;
        ArrayList<Integer> result = new ArrayList<>();
        //calculate and store frequency of each element into map
        HashMap<Integer,Integer>map = new HashMap<>();

        for (Integer number:arr) {
            map.put(number, map.getOrDefault(number,0)+1);
        }

        //order by frequency using priority queue
        PriorityQueue<pair> pq = new PriorityQueue<>();

        //add it to queue
        for (Integer number: map.keySet() ) {
            int count = map.get(number);
            pq.add(new pair(number,count));
            //remove unwanted
            if(pq.size()>k)
                pq.poll();
        }

        for (int i = 0; i < k; i++) {
            result.add(pq.poll().element);
        }
        return result;
    }
}

class pair implements Comparable<pair> {
    int element, count;
    public pair(int element, int count){
        this.element = element;
        this.count = count;
    }

    @Override
    public int compareTo(pair o){
        return this.count - o.count;
    }
}

