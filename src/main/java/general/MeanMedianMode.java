package general;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Given an array, X, N of  integers, calculate and print the respective mean, median, and mode on separate lines.
 * If your array contains more than one modal value, choose the numerically smallest one.
 * Note: Other than the modal value (which will always be an integer), your answers should be in decimal form,
 * rounded to a scale of  decimal place (i.e.,12.3 ,7.0  format).
 * Example
 * N = 6, x = [1,2,3,4,5,5]
 * The mean is 20/6 = 3.3
 * The median is 3+4/2 = 3.5.
 * The mode is 5 because 5 occurs most frequently.
 */
public class MeanMedianMode {
    public static Double[] getMeanMedianMode(int[] arr){
        Double[] result = new Double[3];

        result[0]=getMean(arr);
        Arrays.sort(arr);
        result[1]=getMedian(arr);
        result[2] = getMode(arr);
        return result;
    }

    private static double getMean(int[] arr){
        double mean = 0.0;
        for(int num: arr)
            mean = mean + (double) num;
        mean = mean/arr.length;
        DecimalFormat df = new DecimalFormat("#.#");
        df.format(mean);
        return Double.valueOf(df.format(mean));
    }

    private static double getMedian(int[] arr){
        double median;
        int middle = arr.length/2;
        if(arr.length%2==0)
            median = ((double) arr[middle] + (double) arr[middle - 1])/2;
        else
            median = (double) arr[middle] /2;
        return median;
    }

    private static double getMode(int[] arr){
        Map<Integer,Integer> map = new TreeMap<>();
        for (int num: arr)
            map.put(num,map.getOrDefault(num,0)+1);
        double mode = (double) arr[0];
        int count = 1;
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            double currentMode = (double) entry.getKey();
            int currentCount = entry.getValue();
            if(currentCount>count){
                mode = currentMode;
                count = currentCount;
            }
        }
        return mode;
    }
}
