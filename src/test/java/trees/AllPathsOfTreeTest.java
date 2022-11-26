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
}