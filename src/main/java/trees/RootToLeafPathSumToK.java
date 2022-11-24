package trees;

/**
 * Given a binary tree and an integer k,
 * check whether the tree has a root to leaf path with a sum of values equal to k.
 * Example One
 * Input: 0 | 1,2 |3,4,null, null| , k = 4
 *  Output:  1
 * Path 0 -> 1 -> 3 has the sum of node values equal to 4.
 * Example Two
 * Input 2|3|4|5 k = 10
 * Output: 0
 * Constraints:
     * 1 <= number of nodes in the tree <= 105
     * -105 <= node value <= 105
     * -109 <= k <= 109
 */
public class RootToLeafPathSumToK {
    public static boolean dfs(BinaryTreeNode root,int target){
        return helper(root,target);
    }

    private static boolean helper(BinaryTreeNode root,int target){
        if(root==null)
            return false;
        if(root.left==null && root.right==null){
            return target == root.value;
        }
        if(root.left!=null)
            return helper(root.left,target- root.value);
        if(root.right!=null)
            return helper(root.right,target- root.value);
        return false;
    }
}
