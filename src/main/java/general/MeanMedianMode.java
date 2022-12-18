package general;

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
        return result;
    }

    private static double getMean(int[] arr){
        double mean = 0.0;
        for(int num: arr)
            mean = mean + Double.valueOf(num);
        mean = mean/arr.length;
        return mean;
    }
}
