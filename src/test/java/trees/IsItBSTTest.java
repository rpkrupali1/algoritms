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
        boolean actual = IsItBST.dfs(input);
        Assert.assertFalse(actual);
    }

    @Test
    public void test001(){
        BinaryTreeNode input = new BinaryTreeNode(200);
        input.left = new BinaryTreeNode(100);
        input.right = new BinaryTreeNode(300);
        boolean actual = IsItBST.dfs(input);
        Assert.assertTrue(actual);
    }

    @Test
    public void test002(){
        boolean actual = IsItBST.dfs(null);
        Assert.assertTrue(actual);
    }

    @Test
    public void test003(){
        BinaryTreeNode input = new BinaryTreeNode(12);
        boolean actual = IsItBST.dfs(input);
        Assert.assertTrue(actual);
    }

    @Test
    public void test004(){
        BinaryTreeNode input = new BinaryTreeNode(100);
        input.left = new BinaryTreeNode(200);
        input.left.right = new BinaryTreeNode(300);
        input.left.right.right = new BinaryTreeNode(400);
        boolean actual = IsItBST.dfs(input);
        Assert.assertFalse(actual);
    }

    @Test
    public void test005(){
        BinaryTreeNode input = new BinaryTreeNode(300);
        input.left = new BinaryTreeNode(200);
        input.right = new BinaryTreeNode(400);
        input.left.left = new BinaryTreeNode(100);
        input.left.right = new BinaryTreeNode(400);
        boolean actual = IsItBST.dfs(input);
        Assert.assertFalse(actual);
    }
}
