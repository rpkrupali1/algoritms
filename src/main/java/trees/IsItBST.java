package trees;

import java.util.LinkedList;

/**
 * Given a binary tree, check if it is a binary search tree (BST).
 * A valid BST does not have to be complete or balanced.
 * Consider this definition of a BST:
     * All nodes values of left subtree are less than or equal to parent node value.
     * All nodes value of right subtree are greater than or equal to parent node value.
     * Both left subtree and right subtree must be BSTs.
     * NULL tree is a BST.
     * Single node trees (including leaf nodes of any tree) are BSTs.
 * Example One
     * Input: 100 | 200,300
     * Output:  0/false
     * Left child value 200 is greater than the parent node value 100; violates the definition of BST.
 * Example Two
 * Input: 200 | 100,300
 * Output: 1/false
 */
public class IsItBST {
    public static boolean dfs(BinaryTreeNode root){
        return helper(root,Integer.MIN_VALUE,Integer.MAX_VALUE );
    }

    private static boolean helper (BinaryTreeNode root, Integer min, Integer max){
        if(root==null)
            return true;
        if((max!=null && root.value > max) || (min!=null && root.value < min))
            return false;
        boolean left = helper(root.left, min, root.value);
        boolean right = helper(root.right, root.value, max);
        return left && right ;
    }

    public static boolean bfs(BinaryTreeNode root){
        if(root==null)
            return true;
        LinkedList<BinaryTreeNode> q = new LinkedList<>();
        q.add(root);
        boolean found = true;
        while (q.size()>0){
            int n = q.size();
            for (int i = 0; i < n; i++) {
                BinaryTreeNode node = q.poll();
                if(node!=null) {
                    int val = node.value;
                    if (node.left != null) {
                        if(node.left.value > val)
                            return false;
                        else q.add(node.left);
                    }
                    if (node.right != null) {
                        if(node.right.value < val)
                            return false;
                        else q.add(node.right);
                    }
                }
            }
        }
        return found;
    }
}
