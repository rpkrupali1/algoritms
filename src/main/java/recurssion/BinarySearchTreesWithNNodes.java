package recurssion;

/**
 * Write a function that returns the number of distinct binary search trees that can be constructed with n nodes. For the purpose of this exercise, do solve the problem using recursion first even if you see some non-recursive approaches.
 * Example One
 * input: "n": 1
 * Output:  1
 * Example Two
 * input: "n": 2
 * Output: 2
 * Suppose the values are 1 and 2, then the two trees that are possible are
 *    (2)            (1)
 *   /       and       \
 * (1)                  (2)
 * Example Three
 * input:  "n": 3
 * Output: 5
 * Suppose the values are 1, 2, 3 then the possible trees are
 *        (3)
 *       /
 *     (2)
 *    /
 * (1)
 * <p>
 *    (3)
 *   /
 * (1)
 *    \
 *    (2)
 * <p>
 * (1)
 *    \
 *     (2)
 *       \
 *        (3)
 * <p>
 * (1)
 *    \
 *     (3)
 *    /
 * (2)
 * <p>
 *    (2)
 *   /   \
 * (1)    (3)
 */
public class BinarySearchTreesWithNNodes {
    public static int recursive(int n){
        if(n==0||n==1)
            return 1;
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            ans = ans + (recursive(i-1) * recursive(n-i));
        }
        return ans;
    }
}
