package trees;

import common.ParentTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class InsertInBSTTest extends ParentTest {
    @Test
    public void test000(){
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(7,5,9));
        BinaryTreeNode bst = InsertInBST.build_a_bst(input);
        ArrayList<Integer> actual = convertToArray(bst);
        print(actual);
        BinaryTreeNode output = new BinaryTreeNode(7);
        output.left = new BinaryTreeNode(5);
        output.right = new BinaryTreeNode(9);
        ArrayList<Integer> expected = convertToArray(output);
        System.out.println();
        print(expected);
        Assert.assertEquals(actual,expected);
    }
}
