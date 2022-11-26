package trees;

/**
 * Given a binary tree, check whether it is a mirror of itself i.e. symmetric around its centre.
 */
public class SymmetricTree {
    public static boolean isItMirror(BinaryTreeNode root){
        if(root==null)
            return true;
        return helper(root.left,root.right);
    }

    private static boolean helper(BinaryTreeNode left,BinaryTreeNode right){
        if(left==null && right==null)
            return true;
        if(left==null || right==null || !left.value.equals(right.value))
            return false;
        boolean leftVal = helper(left.left,right.right);
        boolean rightVal = helper(left.right,right.left);
        return  leftVal && rightVal;
    }
}
