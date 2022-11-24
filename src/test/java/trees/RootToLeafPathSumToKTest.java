package trees;

import common.ParentTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RootToLeafPathSumToKTest extends ParentTest {

    @Test
    public void dfs_test000(){
        BinaryTreeNode input = new BinaryTreeNode(0);
        input.left = new BinaryTreeNode(1);
        input.right = new BinaryTreeNode(2);
        input.left.left = new BinaryTreeNode(3);
        input.left.right = new BinaryTreeNode(4);
        boolean actual = RootToLeafPathSumToK.dfs(input,4);
        Assert.assertTrue(actual);
    }

    @Test
    public void dfs_test001(){
        BinaryTreeNode input = new BinaryTreeNode(2);
        input.right = new BinaryTreeNode(3);
        input.right.right = new BinaryTreeNode(5);
        input.right.right.left = new BinaryTreeNode(4);
        boolean actual = RootToLeafPathSumToK.dfs(input,10);
        Assert.assertFalse(actual);
    }

    @Test
    public void dfs_test002(){
        BinaryTreeNode input = new BinaryTreeNode(200);
        input.left = new BinaryTreeNode(1);
        input.right = new BinaryTreeNode(3);
        input.left.left = new BinaryTreeNode(0);
        input.left.right = new BinaryTreeNode(7);
        input.right.left = new BinaryTreeNode(4);
        input.left.left.left = new BinaryTreeNode(-1);

        boolean actual = RootToLeafPathSumToK.dfs(input,200);
        Assert.assertTrue(actual);
    }
}
