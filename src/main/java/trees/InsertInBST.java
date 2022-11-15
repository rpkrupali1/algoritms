package trees;

import java.util.ArrayList;

public class InsertInBST {
    public static BinaryTreeNode build_a_bst(ArrayList<Integer> values){
        BinaryTreeNode bst = null;
        for (int value: values) {
            bst = insert_node(bst,value);
        }
        return bst;
    }

    private static BinaryTreeNode insert_node(BinaryTreeNode bst, int value){
        if(bst==null){
            bst = new BinaryTreeNode(value);
            return bst;
        } else if (value<bst.value)
            bst.left = insert_node(bst.left,value);
        else bst.right = insert_node(bst.right,value);
        return bst;
    }
}
