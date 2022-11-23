package trees;

import common.ParentTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ConstructBSTFromPreOrderTest extends ParentTest {

    @Test
    public void test000() {
        ArrayList<Integer> input = new ArrayList<>(List.of(1, 0, 2));
        BinaryTreeNode output = ConstructBSTFromPreOrder.getBST(input);
        ArrayList<ArrayList<Integer>> actual = LevelOrderTraversalOfBST.level_order_traversal(output);
        printList(actual);

        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>(List.of(1)));
        expected.add(new ArrayList<>(List.of(0,2)));
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void test001() {
        ArrayList<Integer> input = new ArrayList<>(List.of(2, 0, 1, 3, 5, 4));
        BinaryTreeNode output = ConstructBSTFromPreOrder.getBST(input);
        ArrayList<ArrayList<Integer>> actual = LevelOrderTraversalOfBST.level_order_traversal(output);
        printList(actual);

        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>(List.of(2)));
        expected.add(new ArrayList<>(List.of(0,3)));
        expected.add(new ArrayList<>(List.of(1,5)));
        expected.add(new ArrayList<>(List.of(4)));
        Assert.assertEquals(actual,expected);
    }

}
