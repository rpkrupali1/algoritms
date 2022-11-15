package trees;

public class MinValueInBST {
    public static int getMinValue(BinaryTreeNode bst){
        while (bst.left!=null)
            bst = bst.left;
        return bst.value;
    }
}
