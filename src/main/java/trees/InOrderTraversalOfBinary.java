package trees;

import java.util.ArrayList;

/**
 * Inorder Traversal Of A Binary Tree
 * Given a binary tree, return the inorder traversal of its node values.
 * Example One :
 * Input: 0/1\2 /3\4 /null\null
 * Output: [3, 1, 4, 0, 2]
 * Example Two :
 * Input: 0/1\null null\2 3/null
 * Output: [1, 3, 2, 0]
 */
public class InOrderTraversalOfBinary {
    public static ArrayList<Integer> inOrder(BinaryTreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        helper(root,result);
        return result;
    }

    private static void helper(BinaryTreeNode root,ArrayList<Integer> result){
        if(root==null)
            return;
        helper(root.left,result);
        result.add(root.value);
        helper(root.right,result);
    }
}
