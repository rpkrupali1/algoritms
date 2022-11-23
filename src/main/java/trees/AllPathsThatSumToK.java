package trees;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a binary tree and an integer k, find all the root to leaf paths that sum to k.
 * Example One
     * Input: 10|25,30|45,null,40,50|  k = 80
     * Output: [[10, 25, 45],[10, 30, 40]]
 * Example Two
     * Input: bst- 5|5,5 |  k = 10
     * Output: [[5, 5],[5, 5]]
 */
public class AllPathsThatSumToK {
    private static final ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    public static ArrayList<ArrayList<Integer>> pathsToSum(BinaryTreeNode bst, int k){
        ArrayList<Integer> noData = new ArrayList<>(List.of(-1));
        if (bst==null) {
            result.add(noData);
            return result;
        }
        helper(bst,k,new ArrayList<>());
        if(result.isEmpty())
            result.add(noData);
        return result;
    }
    private static void helper(BinaryTreeNode root, int k, ArrayList<Integer> slate){
        if(root.left==null && root.right==null){
            if(root.value==k){
                slate.add(root.value);
                result.add(new ArrayList<>(slate));
                slate.remove(slate.size()-1);
            }
            return;
        }
        slate.add(root.value);
        if(root.left!=null)
            helper(root.left,k- root.value,slate);
        if(root.right!=null)
            helper(root.right,k- root.value,slate);
        slate.remove(slate.size()-1);
    }
}
