package dynamicProgramming;

/**
 * N Choose R
 * Consider you have n distinct elements,
 * find the number of ways through which you can choose exactly r number of elements out of those.
 * Example One
 * "n": 5, "r": 3
 * Output: 10
 * There is a set of 5 elements {1, 2, 3, 4, 5}.
 * You need to pick a subset of size 3. Eligible subsets are
 * {1, 2, 3}, {1, 2, 4}, {1, 2, 5}, {1, 3, 4}, {1, 3, 5}, {1, 4, 5}, {2, 3, 4}, {2, 3, 5}, {2, 4, 5}, {3, 4, 5}.
 * There are 10 subsets of size 3.
 * Example Two
 * "n": 3, "r: 5
 * Output: 0
 * There is a set of 3 elements {1, 2, 3}. You need to pick a subset of size 5.
 * Which is not possible, that's why the answer is 0.
 * Notes
 * Here the answer can be very big, find it modulo 109 + 7.
 */
public class NChooseK {

}
