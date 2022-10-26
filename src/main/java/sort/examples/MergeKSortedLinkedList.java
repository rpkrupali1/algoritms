package sort.examples;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Merge K Sorted Linked Lists
 * Given k linked lists where each one is sorted in the ascending order, merge all of them into a single sorted linked list.
 *
 * Example
 * {
 * "lists": [
 * [1, 3, 5],
 * [3, 4],
 * [7]
 * ]
 * }
 *
 * Output:
 * [1, 3, 3, 4, 5, 7]
 *
 * Constraints:
 * 0 <= k <= 104
 * 0 <= length of any given linked list <= 103
 * -109 <= node values <= 109
 * Sum of the lengths of all given lists won't exceed 105.
 *
 * Approach to test:
 * 1) Brute Force
 * 2) Divide and conquer
 * 3) Priority Queue
 */

class LinkedListNode {
    int value;
    LinkedListNode next;

    LinkedListNode(int value) {
        this.value = value;
        this.next = null;
    }
}

public class MergeKSortedLinkedList {

    /**
     * All the individual lists are sorted.
     * Therefore, a brute force is to compare the heads of all the linked lists one by one
     * and choose the linked list whose head has the minimum value.
     * Time - O(k*n)
     * Space - O(n+k)
     */
    static LinkedListNode brute_force(ArrayList<LinkedListNode> lists) {
        LinkedListNode head = null;
        LinkedListNode tail = null;
        int min_index;

//        while (true){
//            for (int i = 0; i <lists.size(); i++) {
//
//            }
//        }
        return null;
    }

}
