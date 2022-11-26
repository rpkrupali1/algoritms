package trees;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SymmetricTreeTest {

    @Test
    public void test000(){
        BinaryTreeNode input = new BinaryTreeNode(1);
        input.left = new BinaryTreeNode(5);
        input.right = new BinaryTreeNode(5);
        input.left.left = new BinaryTreeNode(7);
        input.right.right = new BinaryTreeNode(7);
        boolean actual = SymmetricTree.isItMirror(input);
        Assert.assertTrue(actual);
    }

    @Test
    public void test001(){
        BinaryTreeNode input = new BinaryTreeNode(14);
        input.left = new BinaryTreeNode(19);
        input.right = new BinaryTreeNode(27);
        input.left.left = new BinaryTreeNode(35);
        input.left.right = new BinaryTreeNode(56);
        input.right.left = new BinaryTreeNode(63);
        boolean actual = SymmetricTree.isItMirror(input);
        Assert.assertFalse(actual);
    }


    @Test
    public void test002(){
        BinaryTreeNode input = new BinaryTreeNode(100);
        input.left = new BinaryTreeNode(30);
        input.right = new BinaryTreeNode(30);
        input.left.left = new BinaryTreeNode(40);
        input.left.right = new BinaryTreeNode(20);
        input.right.left = new BinaryTreeNode(10);
        input.right.right = new BinaryTreeNode(50);
        boolean actual = SymmetricTree.isItMirror(input);
        Assert.assertFalse(actual);
    }
}
