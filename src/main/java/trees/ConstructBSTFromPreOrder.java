package trees;

import java.util.ArrayList;

/**
 * Construct A Binary Search Tree From Its Preorder Traversal
 * Construct a Binary Search Tree whose preorder traversal matches the given list.
 * Example One
     * Input: "preorder": [1, 0, 2]
     * Output: 1 | 0,2
 * Example Two
     * Input: "preorder": [2, 0, 1, 3, 5, 4]
     * Output: 2| 0, 3 | null, 1 , null, 5 | null, null, 4,null|
 */
public class ConstructBSTFromPreOrder {

    private static int current = 0;
    public static BinaryTreeNode getBST(ArrayList<Integer> preorder) {
        // Write your code here.
        return helper(preorder,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }

    private static BinaryTreeNode helper(ArrayList<Integer> arr, int min, int max){
        if(current==arr.size())
            return null;
        int val = arr.get(current);
        if(val < min || val > max)
            return null;
        current++;
        BinaryTreeNode root = new BinaryTreeNode(val);
        root.left = helper(arr,min,val);
        root.right = helper(arr,val,max);
        return root;
    }
}
