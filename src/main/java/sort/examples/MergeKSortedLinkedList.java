package sort.examples;
import java.util.ArrayList;

public class MergeKSortedLinkedList {

    /**
     * All the individual lists are sorted.
     * Therefore, a brute force is to compare the heads of all the linked lists one by one
     * and choose the linked list whose head has the minimum value.
     * Time - O(k*n)
     * Space - O(n+k)
     */
    public static LinkedListNode recursive(ArrayList<LinkedListNode> lists) {
        if(lists==null|| lists.isEmpty())
            return null;
        int left = 0, right = lists.size()-1;
        while (right>0){
            if(left>=right)
                left=0;
            LinkedListNode result = helper(lists.get(left),lists.get(right));
            lists.set(left,result);
            left++;
            right--;
        }
        return lists.get(0);
    }

    private static LinkedListNode helper(LinkedListNode left, LinkedListNode right){
        if(left==null)
            return right;
        else if (right==null) {
            return left;
        }
        else {
            if(left.value<= right.value){
                left.next = helper(left.next,right);
                return left;
            } else {
                right.next = helper(right.next,left);
                return right;
            }
        }
    }
}
