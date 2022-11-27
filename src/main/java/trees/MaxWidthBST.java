package trees;

import java.util.LinkedList;

/**
 * Find the maximum width of a given binary tree.
     * The width of a particular level is the number of nodes (including null nodes)
     * between the end nodes (the leftmost and rightmost non-null nodes) of that level.
     * The maximum width of the tree is the maximum width among all levels.
 * Example
     * Input : 1| 2,3 | 4,null,5,null|
     * Output: 3
     * The maximum width exists at the third level with length 3 (4, null, 5).
 */
public class MaxWidthBST {
    public static int bfs(BinaryTreeNode root){
        if(root==null)
            return 0;
        int count = 0;
        LinkedList<BinaryTreeNode> que = new LinkedList<>();
        que.add(root);
        while (que.size()>0){
            int n = que.size();
            count = Math.max(count,n);
            for (int i = 0; i < n; i++) {
                BinaryTreeNode node = que.pop();
                if(node!=null){
                    if(node.left!=null) que.add(node.left);
                    if(node.right!=null) que.add(node.right);
                }
            }
        }
        return count;
    }
}
