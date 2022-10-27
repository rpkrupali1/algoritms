package sort.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Online Median
 * Given a list of numbers, the task is to insert these numbers into a stream and find the median of the stream after each insertion.
 * If the median is a non-integer, consider it’s floor value.
 *
 * The median of a sorted array is defined as the middle element when the number of elements is odd
 * and the mean of the middle two elements when the number of elements is even.
 *
 * Example
 * {
 * "stream": [3, 8, 5, 2]
 * }
 * Output:
 * [3, 5, 5, 4]
 * Iteration	Stream	Sorted Stream	Median
 * 1	[3]	[3]	3
 * 2	[3, 8]	[3, 8]	(3 + 8) / 2 => 5
 * 3	[3, 8, 5]	[3, 5, 8]	5
 * 4	[3, 8, 5, 2]	[2, 3, 5, 8]	(3 + 5) / 2 => 4
 * Notes
 * Constraints:
 *
 * 1 <= length of stream <= 105
 * 1 <= any value in the stream <= 105
 * The stream can contain duplicates.
 */
public class OnlineMedian {
    PriorityQueue<Integer> min_heap = new PriorityQueue<>();
    PriorityQueue<Integer> max_heap = new PriorityQueue<>(Comparator.reverseOrder());

    public ArrayList<Integer> bruteForce(ArrayList<Integer>stream){
        ArrayList<Integer> result = new ArrayList<>();
        result.add(stream.get(0));

        ArrayList<Integer>arr = new ArrayList<>();
        arr.add(stream.get(0));
        for (int i = 1; i < stream.size(); i++) {
            arr.add(stream.get(i));
            Collections.sort(arr);
            int n = arr.size();
            int median;
            if(n%2==0)
                median = (arr.get(n/2) + arr.get((n/2)-1))/2;
            else
                median = arr.get(n/2);
            result.add(median);
        }
        return result;
    }

    public ArrayList<Integer> heapSolution(ArrayList<Integer>stream) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < stream.size(); i++) {
            add_new_element(stream.get(i));
            result.add(get_median());
        }
        return result;
    }

    private void add_new_element(int num){
        max_heap.add(num);
        min_heap.add(max_heap.poll());

        //maintain size property
        //1. max_heap.size() = min_heap.size(), when number of elements is even
        //2. max_heap.size() = min_heap.size()+1, when number of elements is odd
        if(min_heap.size()> max_heap.size())
            max_heap.add(min_heap.poll());
    }

    private int get_median(){
        if( max_heap.size() == min_heap.size()) //when number of elements is even
            return (max_heap.peek() + min_heap.peek())/2;
//        else if (min_heap.size()> max_heap.size())
//            return min_heap.peek();
        return max_heap.peek();
    }
}
