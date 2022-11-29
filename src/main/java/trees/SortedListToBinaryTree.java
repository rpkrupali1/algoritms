package trees;

import LinkedList.LinkedListNode;

import java.util.ArrayList;

/**
 * Convert Sorted List To Binary Search Tree
 * Given a linked list with elements sorted in ascending order, convert it into a height-balanced binary search tree.
 * Example One
     * Input : "head": [-1, 2, 3, 5, 6, 7, 10]
     * Output: 5| 2,7|-1, 3, 6, 10
     * Output
 * Example Two
     * Input: "head": [-1, 2]
     * Output: -1, | null, 2
 * Notes:
     * A binary tree is called height-balanced if for any node, the difference in the heights of its left and right subtree does not exceed one.
     * Input list does not contain duplicates.
     * Return the root node of the created hight-balanced BST.
 */
public class SortedListToBinaryTree {
    static BinaryTreeNode sorted_list_to_bst(LinkedListNode head) {
        // Write your code here.
        ArrayList<Integer> arr = new ArrayList<>();
        while (head != null){
            arr.add(head.value);
            head = head.next;
        }
        return helper(arr,0, arr.size()-1);
    }

    static BinaryTreeNode helper(ArrayList<Integer> arr, int start, int end){
        if (start>end)
            return null;
//        if(start==end)
//            return new BinaryTreeNode(arr.get(start));
        int mid = start + (end-start)/2;
        BinaryTreeNode root = new BinaryTreeNode(arr.get(mid));
        root.left = helper(arr,start,mid-1);
        root.right = helper(arr,mid+1,end);
        return root;
    }
}
