package trees;

/**
 * Given a binary tree, find the number of uni-val subtrees.
 * uni-val (single value) tree is a tree that has the same value in every node.
 * Example One
     * Input: 5 | 5, 5 | 5, 5, null, 5
     * Output: 6
     * The input tree has a total of 6 nodes. Each node is a root of a subtree. All those 6 subtrees are uni-val trees.
 * Example two
     * Input: 5 | 5, 5 | 5, 5, 4, 5
     * Output: 5
     * The input tree has a total of 7 nodes, so there are 7 subtrees. Of those 7, all but two subtrees are uni-val.
     * The two non-uni-val subtrees are:
         * The one rooted in the root node and
         * The one rooted in the root's right child.
 */
public class SingleValueTree {
    private static int count = 0;
    public static int uniValues(BinaryTreeNode root){
        helper(root);
        return count;
    }
    private static boolean helper(BinaryTreeNode root){
        if(root==null)
            return true;

        if(root.left==null & root.right==null){
            count++;
            return true;
        }

        boolean isLeftUniVal = root.left == null ? true : helper(root.left);
        boolean isRightUniVal = root.right == null ? true : helper(root.right);

        int leftVal  = root.left==null ? root.value : root.left.value;
        int rightVal = root.right==null ? root.value : root.right.value;

        if(isLeftUniVal && isRightUniVal && leftVal== root.value && rightVal== root.value){
            count++;
            return true;
        }

        return false;
    }
}
