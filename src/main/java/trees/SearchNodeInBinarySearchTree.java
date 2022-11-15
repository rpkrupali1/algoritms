package trees;

/**
 * Find whether a node with a given value is present in a given binary search tree or not.
 * Example One
 * input: root: [2,1,5,null,null,4, 6],"value": 4
 * Output:  1
 * Example Two
 * "value": 5
 * Output: 0
 */
public class SearchNodeInBonarySearchTree {
    public static Boolean search_node_in_bst(BinaryTreeNode root, Integer value) {
        while (root!=null){
            if(root.value.equals(value))
                return true;
            else if (value< root.value)
                root = root.left;
            else root = root.right;
        }
        return false;
    }
}

class BinaryTreeNode {
    Integer value;
    BinaryTreeNode left;
    BinaryTreeNode right;

    BinaryTreeNode(Integer value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}