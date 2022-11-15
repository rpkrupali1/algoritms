package trees;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MaxValueInBSTTest {
    @Test
    public void test000(){
        BinaryTreeNode btn = new BinaryTreeNode(2);
        btn.left = new BinaryTreeNode(1);
        btn.right = new BinaryTreeNode(5);
        btn.right.left = new BinaryTreeNode(4);
        btn.right.right = new BinaryTreeNode(6);
        int actual = MaxValueInBST.getMaxValue(btn);
        Assert.assertEquals(actual,6);
    }

    @Test
    public void test001(){
        BinaryTreeNode btn = new BinaryTreeNode(-10);
        int actual = MaxValueInBST.getMaxValue(btn);
        Assert.assertEquals(actual,-10);
    }

    @Test
    public void test002(){
        BinaryTreeNode btn = new BinaryTreeNode(20);
        btn.left = new BinaryTreeNode(10);
        btn.right = new BinaryTreeNode(30);
        int actual = MaxValueInBST.getMaxValue(btn);
        Assert.assertEquals(actual,30);
    }
}
