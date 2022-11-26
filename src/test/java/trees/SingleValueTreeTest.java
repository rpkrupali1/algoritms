package trees;

import common.ParentTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SingleValueTreeTest extends ParentTest {
    @Test
    public void test000(){
        BinaryTreeNode input = new BinaryTreeNode(5);
        input.left = new BinaryTreeNode(5);
        input.right = new BinaryTreeNode(5);
        input.left.left = new BinaryTreeNode(5);
        input.left.right = new BinaryTreeNode(5);
        input.right.right = new BinaryTreeNode(5);
        int actual = SingleValueTree.uniValues(input);
        Assert.assertEquals(actual,6);
    }

    @Test
    public void test001(){
        BinaryTreeNode input = new BinaryTreeNode(5);
        input.left = new BinaryTreeNode(5);
        input.right = new BinaryTreeNode(5);
        input.left.left = new BinaryTreeNode(5);
        input.left.right = new BinaryTreeNode(5);
        input.right.left = new BinaryTreeNode(4);
        input.right.right = new BinaryTreeNode(5);
        int actual = SingleValueTree.uniValues(input);
        Assert.assertEquals(actual,5);
    }
}
