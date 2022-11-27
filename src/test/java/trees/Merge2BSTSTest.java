package trees;

import common.ParentTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Merge2BSTSTest extends ParentTest {
    @Test
    public static void test000(){
        BinaryTreeNode b1 = new BinaryTreeNode(5);
        b1.left = new BinaryTreeNode(3);
        b1.right = new BinaryTreeNode(6);
        b1.left.left = new BinaryTreeNode(2);
        b1.left.right = new BinaryTreeNode(4);
        b1.right.right = new BinaryTreeNode(7);

        BinaryTreeNode b2 = new BinaryTreeNode(8);
        b2.left = new BinaryTreeNode(1);
        b2.right = new BinaryTreeNode(9);

        BinaryTreeNode output = Merge2BSTS.inOrder_sol(b1,b2);
        ArrayList<ArrayList<Integer>> actual = LevelOrderTraversalOfBST.level_order_traversal(output);
        printList(actual);

        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>(List.of(5)));
        expected.add(new ArrayList<>(List.of(2,7)));
        expected.add(new ArrayList<>(List.of(1,3,6,8)));
        expected.add(new ArrayList<>(List.of(4,9)));

        Assert.assertEquals(actual,expected);
    }
}
