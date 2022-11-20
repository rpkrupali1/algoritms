package sort.examples;

/**
 * Merge K Sorted Linked Lists
 * Given k linked lists where each one is sorted in the ascending order, merge all of them into a single sorted linked list.
 * Example
 * "lists": [[1, 3, 5],[3, 4],[7]]
 * Output: [1, 3, 3, 4, 5, 7]
 * Constraints:
 * 0 <= k <= 104
 * 0 <= length of any given linked list <= 103
 * -109 <= node values <= 109
 * Sum of the lengths of all given lists won't exceed 105.
 * Approach to test:
 * 1) Brute Force
 * 2) Divide and conquer
 * 3) Priority Queue
 */

public class LinkedListNode {
    public int value;
    public LinkedListNode next;

    public LinkedListNode(int value) {
        this.value = value;
        this.next = null;
    }
}
