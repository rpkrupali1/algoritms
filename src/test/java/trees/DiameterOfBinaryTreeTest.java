package trees;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DiameterOfBinaryTreeTest {
    @Test
    public void test000(){
        BinaryTreeNode btn = new BinaryTreeNode(0);
        btn.left = new BinaryTreeNode(1);
        btn.right = new BinaryTreeNode(2);
        btn.left.left = new BinaryTreeNode(3);
        btn.left.right = new BinaryTreeNode(4);
        int actual = DiameterOfBinaryTree.getDiameter(btn);
        Assert.assertEquals(actual,3);
    }

    @Test
    public void test001(){
        BinaryTreeNode btn = new BinaryTreeNode(0);
        btn.left = new BinaryTreeNode(1);
        btn.left.left = new BinaryTreeNode(2);
        btn.left.right = new BinaryTreeNode(3);
        btn.left.left.left = new BinaryTreeNode(4);
        btn.left.right.right = new BinaryTreeNode(5);
        int actual = DiameterOfBinaryTree.getDiameter(btn);
        Assert.assertEquals(actual,4);
    }

    @Test
    public void test005(){
        BinaryTreeNode btn = new BinaryTreeNode(0);
        btn.left = new BinaryTreeNode(2);
        btn.left.left = new BinaryTreeNode(4);
        btn.left.left.left = new BinaryTreeNode(3);
        btn.left.left.left.left = new BinaryTreeNode(5);
        btn.left.left.left.left.right = new BinaryTreeNode(1);

        int actual = DiameterOfBinaryTree.getDiameter(btn);
        Assert.assertEquals(actual,5);
    }
}
