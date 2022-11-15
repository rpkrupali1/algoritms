package trees;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchNodeInBinarySearchTreeTest {
    @Test
    public void test000(){
        BinaryTreeNode btn = new BinaryTreeNode(2);
        btn.left = new BinaryTreeNode(1);
        btn.right = new BinaryTreeNode(5);
        btn.right.left = new BinaryTreeNode(4);
        btn.right.right = new BinaryTreeNode(6);
        boolean actual = SearchNodeInBinarySearchTree.search_node_in_bst(btn,4);
        Assert.assertEquals(actual,true);
    }

    @Test
    public void test001(){
        BinaryTreeNode btn = new BinaryTreeNode(20);
        btn.left = new BinaryTreeNode(10);
        btn.right = new BinaryTreeNode(30);
        boolean actual = SearchNodeInBinarySearchTree.search_node_in_bst(btn,5);
        Assert.assertEquals(actual,false);
    }
}
