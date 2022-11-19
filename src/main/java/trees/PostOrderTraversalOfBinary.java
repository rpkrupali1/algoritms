package trees;

import java.util.ArrayList;

/**
 * Postorder Traversal Of A Binary Tree
 * Given a binary tree, find its postorder traversal.
 * Example One
 * Input: 0/1\2 /3\4 /null\null
 * Output: [3, 4, 1, 2, 0]
 * Example Two
 * Input: 0/1\null null\2 3/null
 * Output: [3, 2, 1, 0]
 */
public class PostOrderTraversalOfBinary {
    public static ArrayList<Integer> postOrder(BinaryTreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        helper(root,result);
        return result;
    }

    private static void helper(BinaryTreeNode root,ArrayList<Integer>result){
        if(root==null)
            return;
        helper(root.left,result);
        helper(root.right,result);
        result.add(root.value);
    }
}
