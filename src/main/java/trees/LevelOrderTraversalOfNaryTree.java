package trees;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Level Order Traversal Of A Tree
 * Given a tree, list node values level by level from left to right.
 * Example One:
 * Input Tree: 1 | 3,4,2 | null,[5,6], null
 * Output: [[1],[3, 4, 2],[5, 6]]
 * Example Two
 * Input tree: 1 |  2,null |  null,4 |  3,null
 * Output: [[1],[2],[4],[3]]
 */

public class LevelOrderTraversalOfNaryTree {
    static ArrayList<ArrayList<Integer>> level_order_traversal(TreeNode root) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if(root==null)
            return result;
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (queue.size()>0){
            int n = queue.size();
            ArrayList<Integer> subResult = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                TreeNode node = queue.poll();
                if(node!=null){
                    for (TreeNode child: node.children ) {
                        queue.add(child);
                    }
                    subResult.add(node.value);
                }
            }
            if(subResult.size()>0)
                result.add(subResult);
        }
        return result;
    }
}
