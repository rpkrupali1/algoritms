package trees;

import common.ParentTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class AllPathsOfTreeTest extends ParentTest {
    @Test
    public void test000(){
        BinaryTreeNode input = new BinaryTreeNode(10);
        input.left = new BinaryTreeNode(20);
        input.right = new BinaryTreeNode(30);
        input.left.left = new BinaryTreeNode(40);
        input.left.right = new BinaryTreeNode(50);
        ArrayList<ArrayList<Integer>> actual = AllPathsOfTree.dfs(input);
        printList(actual);
        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>(List.of(10, 20, 40)));
        expected.add(new ArrayList<>(List.of(10, 20, 50)));
        expected.add(new ArrayList<>(List.of(10, 30)));
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void test001(){
        BinaryTreeNode input = new BinaryTreeNode(1);
        input.left = new BinaryTreeNode(2);
        input.right = new BinaryTreeNode(3);
        input.left.left = new BinaryTreeNode(4);
        input.left.right = new BinaryTreeNode(5);
        input.right.left = new BinaryTreeNode(6);
        input.right.right = new BinaryTreeNode(7);
        ArrayList<ArrayList<Integer>> actual = AllPathsOfTree.dfs(input);
        printList(actual);
        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>(List.of(1, 2, 4)));
        expected.add(new ArrayList<>(List.of(1, 2, 5)));
        expected.add(new ArrayList<>(List.of(1, 3,6)));
        expected.add(new ArrayList<>(List.of(1, 3,7)));
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void test005(){
        BinaryTreeNode input = new BinaryTreeNode(100);
        input.right = new BinaryTreeNode(200);
        ArrayList<ArrayList<Integer>> actual = AllPathsOfTree.dfs(input);
        printList(actual);
        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>(List.of(100, 200)));
        Assert.assertEquals(actual,expected);
    }
}