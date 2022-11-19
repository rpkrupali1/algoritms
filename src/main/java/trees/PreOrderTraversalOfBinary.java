package trees;

import java.util.ArrayList;

/**
 * Given a binary tree, return node values in the preorder traversal order.
 * Example One
 * 0/1\2 /3\4 /null\null
 * Output:  [0, 1, 3, 4, 2]
 * Example Two
 * 0/1\null null\2 3/null
 * Output: [0, 1, 2, 3]
 */
public class PreOrderTraversalOfBinary {

    public static ArrayList<Integer> preorder(BinaryTreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        helper(root,result);
        return result;
    }

    private static void helper(BinaryTreeNode root,ArrayList<Integer> result){
//        result.add(root.value);
//        if(root.left!=null)
//            helper(root.left,result);
//        if(root.right!=null)
//            helper(root.right,result);
        if(root==null)
            return;
        result.add(root.value);
        helper(root.left,result);
        helper(root.right,result);
    }
}
