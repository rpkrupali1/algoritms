package trees;

/**
 * The height of a binary search tree is the number of edges between the tree's root and its furthest leaf.
 * You are given a pointer pointing to the root of a binary search tree.
 * Complete the getHeight function provided in your editor so that it returns the height of the binary search tree.
 * Get maximum height of a given tree
 */
public class GetHeight {
    public static int getHeight(BinaryTreeNode root){
        return helper(root);
    }

    private static int helper(BinaryTreeNode root){
        if(root==null)
            return -1;
        int left = helper(root.left);
        int right = helper(root.right);
        if(left>right)
            return 1 + left;
        else return 1 + right;
    }
}
