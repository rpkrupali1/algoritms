package sort.examples;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * We have list of points on the plane. Find the k closest point to origin (0,0)
 * Here the distance between two points on a plane is the Euclidean distance
 * You may return the answer in any order.
 * The answer is guaranteed to be unique (except for order that it is in)
 * The distance between two points on the X-Y plane is the Euclidean distance (i.e., √(x1 - x2) ^ 2 + (y1 - y2) ^2).
 * Square if the distance from origin is 0,0 = ( X * X ) + (Y * Y)
 *
 * Examples:
 Input : point = [[3, 3], [5, -1], [-2, 4]], K = 2
 Output : [[3, 3], [-2, 4]]
 Square of Distance of origin from this point is
 (3, 3) = 18
 (5, -1) = 26
 (-2, 4) = 20
 So the closest two points are [3, 3], [-2, 4].

 Input : point = [[1, 3], [-2, 2]], K  = 1
 Output : [[-2, 2]]
 Square of Distance of origin from this point is
 (1, 3) = sqrt(10)
 (-2, 2) = sqrt(8)
 So the closest point to origin is (-2, 2)

 */
public class KClosestToOrigin {
    public int[][] kClosest(int[][] points, int K) {
        int len =  points.length, l = 0, r = len - 1;
        while (l <= r) {
            int mid = helper(points, l, r);
            if (mid == K) break;
            if (mid < K) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return Arrays.copyOfRange(points, 0, K);
    }

    private int helper(int[][] A, int l, int r) {
        int[] pivot = A[l];
        while (l < r) {
            while (l < r && compare(A[r], pivot) >= 0) r--;
            A[l] = A[r];
            while (l < r && compare(A[l], pivot) <= 0) l++;
            A[r] = A[l];
        }
        A[l] = pivot;
        return l;
    }

    private int compare(int[] p1, int[] p2) {
        return p1[0] * p1[0] + p1[1] * p1[1] - p2[0] * p2[0] - p2[1] * p2[1];
    }
}
