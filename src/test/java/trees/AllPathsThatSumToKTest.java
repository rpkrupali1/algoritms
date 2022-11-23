package trees;

import common.ParentTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class AllPathsThatSumToKTest extends ParentTest {

    @Test
    public void test000(){
        BinaryTreeNode input = new BinaryTreeNode(10);
        input.left = new BinaryTreeNode(25);
        input.right = new BinaryTreeNode(30);
        input.left.left = new BinaryTreeNode(45);
        input.right.left = new BinaryTreeNode(40);
        input.right.right = new BinaryTreeNode(50);
        ArrayList<ArrayList<Integer>> actual = AllPathsThatSumToK.pathsToSum(input,80);
        printList(actual);

        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>(List.of(10,25,45)));
        expected.add(new ArrayList<>(List.of(10,30,40)));
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void test001(){
        BinaryTreeNode input = new BinaryTreeNode(5);
        input.left = new BinaryTreeNode(5);
        input.right = new BinaryTreeNode(5);
        ArrayList<ArrayList<Integer>> actual = AllPathsThatSumToK.pathsToSum(input,10);
        printList(actual);

        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>(List.of(5,5)));
        expected.add(new ArrayList<>(List.of(5,5)));
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void test006(){
        BinaryTreeNode input = new BinaryTreeNode(10000);
        input.left = new BinaryTreeNode(10000);
        input.right = new BinaryTreeNode(0);
        ArrayList<ArrayList<Integer>> actual = AllPathsThatSumToK.pathsToSum(input,0);
        printList(actual);

        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>(List.of(-1)));
        Assert.assertEquals(actual,expected);
    }
}
