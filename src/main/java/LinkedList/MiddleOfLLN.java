package LinkedList;

import java.util.ArrayList;

/**
 * Find Middle Node Of A Linked List
     * Given a linked list, find its middle element. *
     * If the list has even number of nodes, return the second of the two middle nodes.
 * Example One:
     * "head": [1, 2, 3, 4, 5]
     * Output: 3
 * Example Two
     * "head": [1, 2, 3, 4]
     * Output: 3
 */
public class MiddleOfLLN {
    public static int getMiddle(LinkedListNode node){
        ArrayList<Integer> list = new ArrayList<>();
        while (node!=null){
            list.add(node.value);
            node = node.next;
        }
        int mid = list.size()/2;
        return list.get(mid);
    }
}
