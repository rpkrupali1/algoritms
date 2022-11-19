package trees;

import java.util.ArrayList;

/**
 * Given a Binary Search Tree (BST) and a list of numbers,
 * your task is to delete the nodes whose value matches any number from the given list.
 * Solution to delete:
 * 1) Recursively search the node that is to be deleted
 * 2) Then delete based on number of child node it has
 *    -- case 1: Number of child node = 0 :
 *               When the node to be deleted is a leaf node.
 *               It can simply be cut out of the BST without affecting the other nodes.
 *               Therefore, in this case, we will make its parent node point to a NULL child node instead of pointing to the node_to_be_deleted
 *    -- case 2: Number of child node = 1 :
 *               In this case, the non-NULL child of the node_to_be_deleted will take its place.
 *               That is, instead of pointing to the node_to_be_deleted, its parent node will now point to the non-NULL child of the node_to_be_deleted.
 *    -- case 3: Number of child node = 2 :
 */
public class DeleteFromBST {
    public static BinaryTreeNode delete(BinaryTreeNode root, ArrayList<Integer> values_to_be_deleted) {
        // loop to delete every node from arraylist
        for (int num : values_to_be_deleted) {
            root = helper(root, num);
        }
        return root;
    }

    private static BinaryTreeNode helper(BinaryTreeNode root, int value){
        BinaryTreeNode curr = root;
        BinaryTreeNode prev = null;
        BinaryTreeNode child = null;
        BinaryTreeNode succ;
        // search the node to be deleted as current and get prev
        while (curr!=null){
            if(curr.value == value)
                break;
            else if (value < curr.value) {
                prev = curr;
                curr = curr.left;
            }
            else {
                prev = curr;
                curr = curr.right;
            }
        }
        //if current is null then return root as is
        if(curr==null)
            return root;
        // case 1: when current has no child node meaning current node is leaf node
        if(curr.left==null && curr.right == null){
            //if previous is null it means its root
            if (prev==null)
                return null;
            if(curr== prev.left)
                prev.left=null;
            else prev.right = null;
            return root;
        }
        // case 2: node has one child
        if(curr.left!=null && curr.right==null)
            child = curr.left;
        if(curr.left == null)
            child = curr.right;
        if(child!=null){
            if(prev==null) {
                root = child;
                return root;
            }
            if(prev.left == curr)
                prev.left = child;
            else prev.right = child;
            return root;
        }
        // case 3 : node with two childs
        succ = curr.right;
        prev = curr;
        while (succ.left!=null){
            prev = succ;
            succ = succ.left;
        }
        curr.value= succ.value;
        if(succ == prev.left)
            prev.left = succ.right;
        else prev.right = succ.right;
        return root;
    }
}
