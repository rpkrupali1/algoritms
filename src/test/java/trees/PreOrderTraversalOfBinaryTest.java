package trees;

import common.ParentTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class PreOrderTraversalOfBinaryTest extends ParentTest {

    @Test
    public void test000(){
        BinaryTreeNode btn = new BinaryTreeNode(0);
        btn.left = new BinaryTreeNode(1);
        btn.right = new BinaryTreeNode(2);
        btn.left.left = new BinaryTreeNode(3);
        btn.left.right = new BinaryTreeNode(4);
        ArrayList<Integer> actual = PreOrderTraversalOfBinary.preorder(btn);
        print(actual);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(0,1,3,4,2));
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void test001(){
        BinaryTreeNode btn = new BinaryTreeNode(0);
        btn.left = new BinaryTreeNode(1);
        btn.left.right = new BinaryTreeNode(2);
        btn.left.right.left = new BinaryTreeNode(3);
        ArrayList<Integer> actual = PreOrderTraversalOfBinary.preorder(btn);
        print(actual);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(0,1,2,3));
        Assert.assertEquals(actual,expected);
    }
}
