package trees;

import common.ParentTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class DeleteFromBSTTest extends ParentTest {

    @Test
    public void test000(){
        BinaryTreeNode btn = new BinaryTreeNode(4);
        btn.left = new BinaryTreeNode(2);
        btn.right = new BinaryTreeNode(6);
        btn.left.left =  new BinaryTreeNode(1);
        btn.left.right =  new BinaryTreeNode(3);
        btn.right.left = new BinaryTreeNode(5);
        btn.right.right = new BinaryTreeNode(7);
        BinaryTreeNode actualResult = DeleteFromBST.delete(btn,new ArrayList<>(Arrays.asList(5,6)));
        ArrayList<Integer> actual = convertToArray(actualResult);
        print(actual);

        BinaryTreeNode output = new BinaryTreeNode(4);
        output.left = new BinaryTreeNode(2);
        output.right = new BinaryTreeNode(7);
        output.left.left =  new BinaryTreeNode(1);
        output.left.right =  new BinaryTreeNode(3);
        ArrayList<Integer> expected = convertToArray(output);
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void test005(){
        BinaryTreeNode btn = new BinaryTreeNode(120);
        btn.left = new BinaryTreeNode(100);
        btn.right = new BinaryTreeNode(200);
        btn.left.left =  new BinaryTreeNode(-1000000000);
        btn.right.right = new BinaryTreeNode(1000000000);
        BinaryTreeNode actualResult = DeleteFromBST.delete(btn,new ArrayList<>(Arrays.asList(1000000000,100,200)));
        ArrayList<Integer> actual = convertToArray(actualResult);
        print(actual);

        BinaryTreeNode output = new BinaryTreeNode(120);
        output.left = new BinaryTreeNode(-1000000000);
        ArrayList<Integer> expected = convertToArray(output);
        print(expected);
        Assert.assertEquals(actual,expected);
    }
}
