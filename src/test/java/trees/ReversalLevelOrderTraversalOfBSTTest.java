package trees;

import common.ParentTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ReversalLevelOrderTraversalOfBSTTest extends ParentTest {

    @Test
    public void test000(){
        BinaryTreeNode btn = new BinaryTreeNode(0);
        btn.left = new BinaryTreeNode(1);
        btn.right = new BinaryTreeNode(2);
        btn.left.left = new BinaryTreeNode(3);
        btn.left.right = new BinaryTreeNode(4);
        ArrayList<ArrayList<Integer>> actual = ReversalLevelOrderTraversalOfBST.reversal_order(btn);
        printList(actual);
        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>(List.of(3,4)));
        expected.add(new ArrayList<>(List.of(1,2)));
        expected.add(new ArrayList<>(List.of(0)));
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void test001(){
        BinaryTreeNode btn = new BinaryTreeNode(0);
        btn.left = new BinaryTreeNode(1);
        btn.left.right = new BinaryTreeNode(2);
        btn.left.right.left = new BinaryTreeNode(3);
        ArrayList<ArrayList<Integer>> actual =ReversalLevelOrderTraversalOfBST.reversal_order(btn);
        printList(actual);
        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>(List.of(3)));
        expected.add(new ArrayList<>(List.of(2)));
        expected.add(new ArrayList<>(List.of(1)));
        expected.add(new ArrayList<>(List.of(0)));
        Assert.assertEquals(actual,expected);
    }
}
