package recurssion;

/**
 * Count All Subsets Of A Set Of Size N
 * Given a number denoting the size of a set, count the number of unique subsets of that set.
 *
 * Example
 * {
 * "n": 3
 * }
 * Output:
 * 8
 * If we have a set {1, 2, 3}, then all the possible subsets are: {}, {1}, {2}, {3}, {1, 2}, {1, 3}, {2, 3}, {1, 2, 3}.
 *
 * Notes
 * Empty subset should also be counted.
 *
 * Constraints:
 * 0 <= input number <= 30.
 */
public class CountAllSubset {
    /**
     * math formula = 2 ^ n
     * time: O(n)
     * space: O(n) = space taken by input + auxiliary space + space taken by output
     */
    public int recursive(int n){
        if(n==0)
            return 1;
        return 2 * recursive(n-1);
    }

    /**
     * Recursive divide and conquer
     * In this solution, we will use this recurrence to find the result in an optimal manner. In this approach
     * 1) Given a value n, we will first recur to find the value of 2n/2 and will store it in our result subsets_count.
     * 2) We will then update subsets_count to subsets_count * subsets_count.
     * 3) Next, we will check if the current value of n is even or odd. If it is odd, we will multiply 2 to subsets_count. Finally, we will return subsets_count.
     * math formula = 2 ^ n
     * time: O(log n)
     * space: O(log n)
     */
    public int dividendcon_recursive(int n){
        if(n==0)
            return 1;
        int sub_result = dividendcon_recursive(n/2);
        int count = sub_result * sub_result;
        if (n%2!=0)
            count*=2;
        return count;
    }

    /**
     * time - o(n)
     * space - o(1)
     */
    public int iterative(int n){
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * 2;
        }
        return result;
    }


}
