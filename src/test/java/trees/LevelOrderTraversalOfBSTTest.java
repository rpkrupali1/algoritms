package trees;

import common.ParentTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LevelOrderTraversalOfBSTTest extends ParentTest {

    @Test
    public void test000(){
        BinaryTreeNode btn = new BinaryTreeNode(0);
        btn.left = new BinaryTreeNode(1);
        btn.left.right = new BinaryTreeNode(2);
        btn.left.right.left = new BinaryTreeNode(4);
        btn.left.right.left.right = new BinaryTreeNode(3);
        ArrayList<ArrayList<Integer>> actual = LevelOrderTraversalOfBST.level_order_traversal(btn);
        printList(actual);
        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>(List.of(0)));
        expected.add(new ArrayList<>(List.of(1)));
        expected.add(new ArrayList<>(List.of(2)));
        expected.add(new ArrayList<>(List.of(4)));
        expected.add(new ArrayList<>(List.of(3)));
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void test001(){
        BinaryTreeNode btn = new BinaryTreeNode(2);
        btn.left = new BinaryTreeNode(5);
        btn.right = new BinaryTreeNode(4);
        btn.left.left = new BinaryTreeNode(0);
        btn.left.right = new BinaryTreeNode(1);
        btn.right.left = new BinaryTreeNode(3);
        btn.right.right = new BinaryTreeNode(6);
        ArrayList<ArrayList<Integer>> actual = LevelOrderTraversalOfBST.level_order_traversal(btn);
        printList(actual);
        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>(List.of(2)));
        expected.add(new ArrayList<>(Arrays.asList(5,4)));
        expected.add(new ArrayList<>(Arrays.asList(0,1,3,6)));
        Assert.assertEquals(actual,expected);
    }
}
