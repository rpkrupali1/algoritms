package trees;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Given a binary tree, list the node values level by level from left to right.
 * Example One:  0 / 1 \ 2 / 4 \ 3
 * Output:
 * [[0],
 * [1],
 * [2],
 * [4],
 * [3]]
 * Example two: 2 /5\4 /0\1 /3\6
 * Output:
 * [ [2],
 * [5, 4],
 * [0, 1, 3, 6]]
 */
public class LevelOrderTraversalOfBST {
    static ArrayList<ArrayList<Integer>> level_order_traversal(BinaryTreeNode root) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if(root==null)
            return result;
        LinkedList<BinaryTreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (queue.size()>0){
            int n = queue.size();
            ArrayList<Integer> subresult = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                BinaryTreeNode node = queue.poll();
                if(node!=null){
                    if(node.left!=null) queue.add(node.left);
                    if(node.right!=null) queue.add(node.right);
                    subresult.add(node.value);
                }
            }
            if(subresult.size()>0)
                result.add(subresult);
        }
        return result;
    }
}
