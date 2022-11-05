package recurssion;

import common.Common;

import java.util.LinkedList;

/**
 * Write a Java program to reverse Linked List using Recursion?
 * Examples:
 * Input: Head of following linked list
 * 1->2->3->4->NULL
 * Output: Linked list should be changed to,
 * 4->3->2->1->NULL
 *
 * Input: Head of following linked list
 * 1->2->3->4->5->NULL
 * Output: Linked list should be changed to,
 * 5->4->3->2->1->NULL
 */
public class ReverseLinkedList extends Common {
    public static LinkedList<Integer> recursion(LinkedList<Integer> arr){
        helper(arr,0, arr.size()-1);
        return arr;
    }

    private static void helper(LinkedList<Integer>arr, int start, int end){
        if(start>=end)
            return;
        swap(arr,start,end);
        helper(arr,start+1,end-1);
    }
}
