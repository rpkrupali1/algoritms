package trees;

/**
 * Given a binary tree, find its diameter.
     * The diameter of binary tree is the length of its longest path between any two leaf nodes of tree
     * The path may or may not pass through root
 * Example One
 * <img src="./images/BinaryTree1.png" />
     * Input: 0| 1,2 | 3,4|
     * Output: 3
 * Example Two
     * Input: 0 |  1, null, | 2, 3, | 4, null, null, 5
     * Output:  4
 */
public class DiameterOfBinaryTree {
    private static int diameter = 0;
    public static int getDiameter(BinaryTreeNode root){
        helper(root);
        return diameter;
    }

    private static int helper(BinaryTreeNode root){
        if (root==null)
            return 0;
        int left = helper(root.left);
        int right = helper(root.right);
        diameter = Integer.max(diameter,left+right);
        return 1 + Integer.max(left,right);
    }
}
