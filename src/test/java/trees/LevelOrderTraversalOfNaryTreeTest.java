package trees;

import common.ParentTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LevelOrderTraversalOfNaryTreeTest extends ParentTest {

    @Test
    public void test000() {
        TreeNode input = new TreeNode(1);
        input.children.add(new TreeNode(3));
        input.children.add(new TreeNode(4));
        input.children.add(new TreeNode(2));
        input.children.get(1).children.add(new TreeNode(5));
        input.children.get(1).children.add(new TreeNode(6));
        ArrayList<ArrayList<Integer>> actual = LevelOrderTraversalOfNaryTree.level_order_traversal(input);
        printList(actual);

        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>(List.of(1)));
        expected.add(new ArrayList<>(Arrays.asList(3,4,2)));
        expected.add(new ArrayList<>(Arrays.asList(5,6)));

        Assert.assertEquals(actual,expected);

    }

    @Test
    public void test001() {
        TreeNode input = new TreeNode(1);
        input.children.add(new TreeNode(2));
        input.children.get(0).children.add(new TreeNode(4));
        input.children.get(0).children.get(0).children.add(new TreeNode(3));
        ArrayList<ArrayList<Integer>> actual = LevelOrderTraversalOfNaryTree.level_order_traversal(input);
        printList(actual);

        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>(List.of(1)));
        expected.add(new ArrayList<>(Arrays.asList(2)));
        expected.add(new ArrayList<>(Arrays.asList(4)));
        expected.add(new ArrayList<>(Arrays.asList(3)));

        Assert.assertEquals(actual,expected);
    }
}
