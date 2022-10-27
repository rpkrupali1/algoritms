package sort.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

/**
 * Kth Largest In A Stream
 * Given an initial list along with another list of numbers to be appended with the initial list and an integer k,
 * return an array consisting of the k-th the largest element after adding each element from the first list to the second list.
 *
 * Example
 * {
 * "k": 2,
 * "initial_stream": [4, 6],
 * "append_stream": [5, 2, 20]
 * }
 * Output:
 * [5, 5, 6]
 * Append	Stream	Sorted Stream	2nd largest
 * 5	[4, 6, 5]	[4, 5, 6]	5
 * 2	[4, 6, 5, 2]	[2, 4, 5, 6]	5
 * 20	[4, 6, 5, 2, 20]	[2, 4, 5, 6, 20]	6
 *
 * Notes
 * The stream can contain duplicates.
 * Constraints:
 *
 * 1 <= length of both lists <= 105.
 * 1 <= k <= length of initial list + 1.
 * 0 <= any value in the list <= 109.
 */
public class KthLargestInAStream {

    /**
     * In brute force the idea is to follow the exact same steps described in the problem statement.
     *
     *  for i = 1 to m:
     *      1) Add append_stream[i] to initial_stream.
     *      2) Sort initial_stream in non-decreasing order.
     *      3) The k-th element from the end will be the k-th largest element.
     *
     * Time complexity = O(m * (m + n) * log(m + n))
     *      for sort = O(n log(n)
     *      add element to sorted stream = O((m+n) * log(M+n))
     *      we are adding m number of elements to sorted stream
     *
     * Space Complexity = O(n+m)
     *      memory used for input = O(n+m)
     *      memory used for output = O(m)
     *      Auxiliary space = O(m)
     */
    public ArrayList<Integer> brute_force(Integer k, ArrayList<Integer> initial_stream, ArrayList<Integer> append_stream) {
        // Write your code here.
        ArrayList<Integer> result = new ArrayList<>();
        int n = append_stream.size();
        for (int i = 0; i < n; i++) {
            initial_stream.add(append_stream.get(i));
            Collections.sort(initial_stream);
            result.add(initial_stream.get(initial_stream.size()-k));
        }
        return result;
    }

    /**
     * Min heap solution is an efficient solution when considering time complexity
     * Idea is to keep track of only the kth largest element of a stream
     * To create such a heap, sort the initial stream and push k largest elements in the heap but this will require O(n * log(n))
     * Instead, we will directly push elements from initial_stream to min-heap to achieve a complexity of O(n * log(k)).
     * While pushing the elements we will keep a check such that the size of min-heap does not exceed k which can be achieved by popping the top element of the heap when its size becomes k + 1
     * How to process a new element of the append_stream?
     *    - If the new element is smaller than the top element of the heap, ignore it.
     *    - else remove the topmost element of the heap and insert the new element in the heap. To remove or insert a new element, the time complexity is O(log(k)).
     * The top element of the heap is always the k-th largest element of the current stream.
     *
     * Time complexity = O( log(k) * ( n + m ))
     *      To maintain a heap of size k = O(log(k)).
     *      We push and pop every element of the initial and append stream at most once.
     *
     * Space Complexity = O(n + m + k)
     *      memory used for input = O(n+m)
     *      memory used for output = O(m)
     *      Auxiliary space = O(k)
     */
    public ArrayList<Integer> min_heap(Integer k, ArrayList<Integer> initial_stream, ArrayList<Integer> append_stream) {
        // Write your code here.
        ArrayList<Integer> result = new ArrayList<>();

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < initial_stream.size(); i++) {
            pq.add(initial_stream.get(i));
            if(pq.size()>k)
                pq.poll();
        }

        for (int i = 0; i < append_stream.size(); i++) {
            pq.add(append_stream.get(i));
            if(pq.size()>k)
                pq.poll();
            result.add(pq.peek());
        }
        return result;
    }
}
