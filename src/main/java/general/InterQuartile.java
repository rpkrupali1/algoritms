package general;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The interquartile range of an array is the difference between its first (Qi) and third (
 * Q3) quartiles (i.e., Q3 — Q1).
 * Given an array, values, of n integers and an array, freqs,
 * representing the respective frequencies of values's elements,
 * construct a data set, 5, where each values[i\ occurs at frequency freqs[i\.
 * Then calculate and print S's interquartile range, rounded to a scale of 1 decimal place (i.e., 12.3 format).
 * Tip: Be careful to not use integer division when averaging the middle two elements for a data set with an even number of elements, and be sure to not include the median in your upper and lower data sets.
 * Example
 * values = [1,2,3] freqs = [3, 2,1]
 * Apply the frequencies to the values to get the expanded array S = [1,1,1,2,2,3].
 * Here left = [1,1,1], right = [2,2,3].
 * The median of the left half, Qi = 1.0, the middle element.
 * For the right half, Q3 = 2.0.
 * Print the difference to one decimal place: Q3 - Qi = 2.0 — 1.0 = 1, so print 1.0.
 */
public class InterQuartile {
    public static double interQuartile(List<Integer> values, List<Integer> freqs) {
        // Print your answer to 1 decimal place within this function
        List<Integer> dataSet = new ArrayList<>();
        for (int i = 0; i < values.size(); i++) {
            for (int j = 0; j < freqs.get(i); j++) {
                dataSet.add(values.get(i));
            }
        }
        Collections.sort(dataSet);
        int middle = dataSet.size()/2;
        if(dataSet.size()%2!=0)
            middle = middle+1;
        List<Integer> q1List = dataSet.subList(0,middle);
        double q1 = getMedian(q1List);
        List<Integer> q3List = dataSet.subList(middle,dataSet.size());
        double q3 = getMedian(q3List);
        return q3-q1;

    }

    private static double getMedian(List<Integer> dataSet) {
        double median;
        int mid = dataSet.size()/2;
        median = dataSet.get(mid);
        if(dataSet.size()%2==0)
            median = (median + dataSet.get(mid-1)) /2;
        return median;
    }
}
