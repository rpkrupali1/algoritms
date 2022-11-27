package trees;

import common.ParentTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class PostOrderTraversalOfBinaryTest extends ParentTest {
    @Test
    public void test000_recursion(){
        BinaryTreeNode btn = new BinaryTreeNode(0);
        btn.left = new BinaryTreeNode(1);
        btn.right = new BinaryTreeNode(2);
        btn.left.left = new BinaryTreeNode(3);
        btn.left.right = new BinaryTreeNode(4);
        ArrayList<Integer> actual = PostOrderTraversalOfBinary.recursion(btn);
        print(actual);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(3, 4, 1, 2, 0));
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void test001_recursion(){
        BinaryTreeNode btn = new BinaryTreeNode(0);
        btn.left = new BinaryTreeNode(1);
        btn.left.right = new BinaryTreeNode(2);
        btn.left.right.left = new BinaryTreeNode(3);
        ArrayList<Integer> actual = PostOrderTraversalOfBinary.recursion(btn);
        print(actual);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(3, 2, 1, 0));
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void test000_withoutTreeModification(){
        BinaryTreeNode btn = new BinaryTreeNode(0);
        btn.left = new BinaryTreeNode(1);
        btn.right = new BinaryTreeNode(2);
        btn.left.left = new BinaryTreeNode(3);
        btn.left.right = new BinaryTreeNode(4);
        ArrayList<Integer> actual = PostOrderTraversalOfBinary.withoutTreeModification(btn);
        print(actual);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(3, 4, 1, 2, 0));
        Assert.assertEquals(actual,expected);
    }
}
