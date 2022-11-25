package trees;

import common.ParentTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IsItBSTTest extends ParentTest {

    @Test
    public void test000(){
        BinaryTreeNode input = new BinaryTreeNode(100);
        input.left = new BinaryTreeNode(200);
        input.right = new BinaryTreeNode(300);
        boolean actual = IsItBST.bfs(input);
        Assert.assertFalse(actual);
    }

    @Test
    public void test001(){
        BinaryTreeNode input = new BinaryTreeNode(200);
        input.left = new BinaryTreeNode(100);
        input.right = new BinaryTreeNode(300);
        boolean actual = IsItBST.bfs(input);
        Assert.assertTrue(actual);
    }

    @Test
    public void test002(){
        boolean actual = IsItBST.bfs(null);
        Assert.assertTrue(actual);
    }

    @Test
    public void test003(){
        BinaryTreeNode input = new BinaryTreeNode(12);
        boolean actual = IsItBST.bfs(input);
        Assert.assertTrue(actual);
    }

    @Test
    public void test004(){
        BinaryTreeNode input = new BinaryTreeNode(100);
        input.left = new BinaryTreeNode(200);
        input.left.right = new BinaryTreeNode(300);
        input.left.right.right = new BinaryTreeNode(400);
        boolean actual = IsItBST.bfs(input);
        Assert.assertFalse(actual);
    }
}
