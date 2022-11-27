package trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

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

    public static ArrayList<Integer> recursion(BinaryTreeNode root) {
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

    public static ArrayList<Integer> stack_reverse(BinaryTreeNode root){
        ArrayList<Integer> result = new ArrayList<>();
        if(root==null)
            return result;
        Stack<BinaryTreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            BinaryTreeNode node = stack.pop();
            if (node!=null){
                if (node.left!=null) stack.add(node.left);
                if (node.right!=null) stack.add(node.right);
                result.add(node.value);
            }
        }
        Collections.reverse(result);
        return result;
    }

}
