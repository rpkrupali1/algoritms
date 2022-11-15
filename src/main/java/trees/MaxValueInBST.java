package trees;

public class MaxValueInBST {
    public static int getMaxValue(BinaryTreeNode bst){
        while (bst.right!=null)
            bst = bst.right;
        return bst.value;
    }
}
