package trees;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MaxWidthBSTTest {
    @Test
    public void test00(){
        BinaryTreeNode input = new BinaryTreeNode(1);
        input.left = new BinaryTreeNode(2);
        input.right = new BinaryTreeNode(3);
        input.left.left = new BinaryTreeNode(4);
        input.left.right = new BinaryTreeNode(5);
        input.right.right = new BinaryTreeNode(8);
        input.right.right.left = new BinaryTreeNode(6);
        input.right.right.right = new BinaryTreeNode(7);
        int actual = MaxWidthBST.bfs(input);
        Assert.assertEquals(actual,3);
    }


    @Test
    public void test000(){
        BinaryTreeNode input = new BinaryTreeNode(1);
        input.left = new BinaryTreeNode(2);
        input.right = new BinaryTreeNode(3);
        input.left.left = new BinaryTreeNode(4);
        input.left.right = new BinaryTreeNode(null);
        input.right.left = new BinaryTreeNode(5);
        int actual = MaxWidthBST.bfs(input);
        Assert.assertEquals(actual,3);
    }

    @Test
    public void test001(){
        BinaryTreeNode input = new BinaryTreeNode(1);
        int actual = MaxWidthBST.bfs(input);
        Assert.assertEquals(actual,1);
    }

    @Test
    public void test002(){
        BinaryTreeNode input = new BinaryTreeNode(10);
        input.left = new BinaryTreeNode(8);
        input.left.left = new BinaryTreeNode(4);
        input.left.left.left = new BinaryTreeNode(3);
        input.left.left.left.left = new BinaryTreeNode(9);
        input.left.left.left.left.left = new BinaryTreeNode(1);
        input.left.left.left.left.left.left = new BinaryTreeNode(2);
        input.left.left.left.left.left.left.left = new BinaryTreeNode(6);
        input.left.left.left.left.left.left.left.left = new BinaryTreeNode(7);
        int actual = MaxWidthBST.bfs(input);
        Assert.assertEquals(actual,1);
    }
}
