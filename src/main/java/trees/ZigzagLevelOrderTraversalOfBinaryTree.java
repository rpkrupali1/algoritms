package trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

/**
 * Zigzag Level Order Traversal Of A Binary Tree
 * Given a binary tree, return the zigzag level order traversal of the node values
 * listing the odd levels from left to right and the even levels from right to left.
 * Example One
 * Input: 0| 1,2 | 3,4,null|
 * Output: [ [0],[2, 1],[3, 4]]
 * Example Two
 * Input : 0| 1,null| null, 2| 3, null
 * Output: [[0],[1],[2],[3]]
 */
public class ZigzagLevelOrderTraversalOfBinaryTree {
    public static ArrayList<ArrayList<Integer>> zigzag(BinaryTreeNode root){
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if(root==null)
            return result;
        LinkedList<BinaryTreeNode> que = new LinkedList<>();
        que.add(root);
        boolean zigzag = false;
        while (que.size()>0){
            ArrayList<Integer> subResult = new ArrayList<>();
            int n = que.size();
            for (int i = 0; i < n; i++) {
                BinaryTreeNode node = que.poll();
                if(node!=null){
                    subResult.add(node.value);
                    if(node.left!=null) que.add(node.left);
                    if (node.right!=null) que.add(node.right);
                }
            }
            if(subResult.size()>0) {
                if(zigzag) Collections.reverse(subResult);
                result.add(subResult);
            }
            zigzag = !zigzag;
        }
        return result;
    }
}
