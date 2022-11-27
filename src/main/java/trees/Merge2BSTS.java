package trees;

import java.util.ArrayList;

/**
 * Given two Binary Search Trees (BSTs), merge them into a single height-balanced BST.
 */
public class Merge2BSTS {

    public static BinaryTreeNode inOrder_sol(BinaryTreeNode b1, BinaryTreeNode b2){
        //first tree into inorder traversal
        ArrayList<Integer> arr1 = new ArrayList<>();
        inOrder(b1,arr1);
        // second tree to inorder traversal
        ArrayList<Integer> arr2 = new ArrayList<>();
        inOrder(b2,arr2);
        //merge two arrays
        ArrayList<Integer> finalArr = new ArrayList<>();
        int i =0, j=0;
        while (i< arr1.size() && j< arr2.size()){
            if(arr1.get(i)<=arr2.get(j))
                finalArr.add(arr1.get(i++));
            else
                finalArr.add(arr2.get(j++));
        }
        while (i< arr1.size())
            finalArr.add(arr1.get(i++));

        while (j < arr2.size())
            finalArr.add(arr2.get(j++));

        return createTree(finalArr,0, finalArr.size()-1);
    }

    private static void inOrder(BinaryTreeNode root, ArrayList<Integer> arr){
        if(root==null)
            return;
        inOrder(root.left,arr);
        arr.add(root.value);
        inOrder(root.right,arr);
    }

    private static BinaryTreeNode createTree(ArrayList<Integer> arr,int start, int end){
        if(start>end)
            return null;
        int mid = start + (end-start)/2;
        BinaryTreeNode node = new BinaryTreeNode(arr.get(mid));
        node.left = createTree(arr,start,mid-1);
        node.right = createTree(arr,mid+1,end);
        return node;
    }
}
