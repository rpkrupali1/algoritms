package recurssion;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Tower Of Hanoi
 * Tower of Hanoi is a mathematical puzzle where we have three pegs and n disks.
 * The objective of the puzzle is to move the entire stack to another peg, obeying the following simple rules:
 *  - Only one disk can be moved at a time.
 *  - Each move consists of taking the upper disk from one of the stacks and placing it on top of another stack i.e. a disk can only be moved if it is the uppermost disk on a stack.
 *  - No disk may be placed on top of a smaller disk.
 *  - Given n denoting the number of disks in the first peg, return all the steps required to move all disks from the first peg to the third peg in minimal number of steps.
 *
 * Example
 * {
 * "n": 4
 * }
 * Output:
 *
 * [
 * [1, 2],
 * [1, 3],
 * [2, 3],
 * [1, 2],
 * [3, 1],
 * [3, 2],
 * [1, 2],
 * [1, 3],
 * [2, 3],
 * [2, 1],
 * [3, 1],
 * [2, 3],
 * [1, 2],
 * [1, 3],
 * [2, 3]
 * ]
 * Following steps:
 * [1, 2] = Shift top disk of the first peg to top of the second peg.
 * Picture after this step will be:
 * First peg: 2 3 4
 * Second peg: 1
 * Third peg: Empty
 *
 * [1, 3] = Shift top disk of the first peg to top of the third peg.
 * Picture after this step will be:
 * First peg: 3 4
 * Second peg: 1
 * Third peg: 2
 *
 * Similarly after following remaining steps, the final configuration will be:
 * First peg: Empty
 * Second peg: Empty
 * Third peg: 1 2 3 4
 *
 * Hence, our objective is achieved.
 *
 * Notes
 * Return a 2d integer array containing all the steps taken to move all n disks from the first peg to the third peg in minimal number of steps. Each row will have two integers denoting from peg and to peg, for example, if the ith row is [2, 3], then it means in this step, we moved the top disk on peg 2 to peg 3.
 * Constraints:
 *
 * 1 <= n <= 20
 */
public class TowerOfHanoi {
    public static ArrayList<ArrayList<Integer>> recursive_approach(int n) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        helper(n,1,2,3,result);
        return result;
    }

    private static void helper(int n, int source,int aux,int destination,ArrayList<ArrayList<Integer>> result){
        if(n==1){
            result.add(new ArrayList<>(Arrays.asList(source,destination)));
            return;
        }
        helper(n-1,source,destination,aux,result);
        result.add(new ArrayList<>(Arrays.asList(source,destination)));
        helper(n-1,aux,source,destination,result);
    }
}
