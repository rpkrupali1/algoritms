package trees;

import java.util.ArrayList;
import java.util.LinkedList;

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
        if(result.size()==level)
            result.add(root.value);
        helper(root.right,level+1);
        helper(root.left,level+1);
    }

    public static ArrayList<Integer> bfs(BinaryTreeNode root){
        if(root==null)
            return result;
        LinkedList<BinaryTreeNode> q = new LinkedList<>();
        q.add(root);
        while (q.size()>0){
            int n = q.size();
            BinaryTreeNode node = null;
            for (int i = 0; i < n; i++) {
                node = q.poll();
                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);
            }
            if(node!=null)
                result.add(node.value);
        }
        return result;
    }
}
