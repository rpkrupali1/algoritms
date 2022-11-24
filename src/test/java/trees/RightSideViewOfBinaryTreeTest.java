package trees;

import common.ParentTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class RightSideViewOfBinaryTreeTest extends ParentTest {

    @Test
    public void test000(){
        BinaryTreeNode input = new BinaryTreeNode(0);
        input.left = new BinaryTreeNode(1);
        input.right = new BinaryTreeNode(2);
        input.left.left = new BinaryTreeNode(3);
        input.left.right = new BinaryTreeNode(4);
        ArrayList<Integer> actual = RightSideViewOfBinaryTree.dfs(input);
        print(actual);
        ArrayList<Integer> expected = new ArrayList<>(List.of(0,2,4));
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void test001(){
        BinaryTreeNode input = new BinaryTreeNode(0);
        input.left = new BinaryTreeNode(1);
        input.left.right = new BinaryTreeNode(2);
        input.left.right.left = new BinaryTreeNode(3);
        ArrayList<Integer> actual = RightSideViewOfBinaryTree.dfs(input);
        print(actual);
        ArrayList<Integer> expected = new ArrayList<>(List.of(0, 1, 2, 3));
        Assert.assertEquals(actual,expected);
    }
}
