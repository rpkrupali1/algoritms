package trees;

import java.util.ArrayList;

/**
 * Right Side View Of A Binary Tree
 * Given a binary tree, imagine yourself standing on the right side of it
 * and return a list of the node values that you can see from the top to the bottom.
 * Example One
 * input: 0 | 1,2 |3,4,null, null
 * Output: [0, 2, 4]
 * Example Two
 * input: 0 |1,null|null,2|3
 * Output: [0, 1, 2, 3]
 */
public class RightSideViewOfBinaryTree {
    private static final ArrayList<Integer> result = new ArrayList<>();
    public static ArrayList<Integer> dfs(BinaryTreeNode root){
        if(root==null)
            return result;
        helper(root,0);
        return result;
    }
    private static void helper(BinaryTreeNode root,int level){
        if(root==null)
            return;
        if(result.size()==level){
            result.add(root.value);
        }
        helper(root.right,level+1);
        helper(root.left,level+1);
    }
}
