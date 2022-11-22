package trees;

import common.ParentTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ZigzagLevelOrderTraversalOfBinaryTreeTest extends ParentTest {
    @Test
    public void test000(){
        BinaryTreeNode btn = new BinaryTreeNode(0);
        btn.left = new BinaryTreeNode(1);
        btn.right = new BinaryTreeNode(2);
        btn.left.left = new BinaryTreeNode(3);
        btn.left.right = new BinaryTreeNode(4);
        ArrayList<ArrayList<Integer>> actual = ZigzagLevelOrderTraversalOfBinaryTree.zigzag(btn);
        printList(actual);
        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>(List.of(0)));
        expected.add(new ArrayList<>(List.of(2,1)));
        expected.add(new ArrayList<>(List.of(3,4)));
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void test001(){
        BinaryTreeNode btn = new BinaryTreeNode(0);
        btn.left = new BinaryTreeNode(1);
        btn.left.right = new BinaryTreeNode(2);
        btn.left.right.left = new BinaryTreeNode(3);
        ArrayList<ArrayList<Integer>> actual = ZigzagLevelOrderTraversalOfBinaryTree.zigzag(btn);
        printList(actual);
        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>(List.of(0)));
        expected.add(new ArrayList<>(List.of(1)));
        expected.add(new ArrayList<>(List.of(2)));
        expected.add(new ArrayList<>(List.of(3)));
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void test003(){
        BinaryTreeNode btn = new BinaryTreeNode(3);
        btn.left = new BinaryTreeNode(5);
        btn.right = new BinaryTreeNode(0);
        btn.right.left = new BinaryTreeNode(7);
        btn.right.right = new BinaryTreeNode(2);
        btn.right.right.left = new BinaryTreeNode(1);
        btn.right.right.right = new BinaryTreeNode(6);
        btn.right.right.right.right = new BinaryTreeNode(4);
        ArrayList<ArrayList<Integer>> actual = ZigzagLevelOrderTraversalOfBinaryTree.zigzag(btn);
        printList(actual);
        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>(List.of(3)));
        expected.add(new ArrayList<>(List.of(0,5)));
        expected.add(new ArrayList<>(List.of(7,2)));
        expected.add(new ArrayList<>(List.of(6,1)));
        expected.add(new ArrayList<>(List.of(4)));
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void test008(){
        BinaryTreeNode btn = new BinaryTreeNode(5);
        btn.left = new BinaryTreeNode(3);
        btn.right = new BinaryTreeNode(1);
        btn.left.left = new BinaryTreeNode(0);
        btn.left.right = new BinaryTreeNode(2);
        btn.right.right = new BinaryTreeNode(4);
        ArrayList<ArrayList<Integer>> actual = ZigzagLevelOrderTraversalOfBinaryTree.zigzag(btn);
        printList(actual);
        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>(List.of(5)));
        expected.add(new ArrayList<>(List.of(1,3)));
        expected.add(new ArrayList<>(List.of(0,2,4)));
        //expected.add(new ArrayList<>(List.of(4)));
        Assert.assertEquals(actual,expected);
    }
}
