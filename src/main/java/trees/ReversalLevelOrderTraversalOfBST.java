package trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

/**
 * Reverse Level Order Traversal Of A Binary Tree
 * Given a binary tree, return the bottom-up level order traversal of the node values listing each level from left to right.
 * Example one
 * Input: 1| 1,2 | 3,4,null|
 * Output: [[3, 4],[1, 2],[0]]
 * Example Two
 * Input: 0| 1,null| null, 2| 3, null
 * Output: [[3],[2],[1],[0]]
 */
public class ReversalLevelOrderTraversalOfBST {
    public static ArrayList<ArrayList<Integer>> reversal_order(BinaryTreeNode root){
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if(root==null)
            return result;
        LinkedList<BinaryTreeNode> que = new LinkedList<>();
        que.add(root);
        while (que.size() > 0){
            ArrayList<Integer> subResult = new ArrayList<>();
            int n = que.size();
            for (int i = 0; i < n; i++) {
                BinaryTreeNode node = que.poll();
                if(node!=null) {
                    subResult.add(node.value);
                    if (node.left != null) que.add(node.left);
                    if (node.right != null) que.add(node.right);
                }
            }
            result.add(subResult);
        }
        Collections.reverse(result);
        return result;
    }
}
