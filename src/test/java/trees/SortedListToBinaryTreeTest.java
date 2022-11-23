package trees;

import common.ParentTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class SortedListToBinaryTreeTest extends ParentTest {

    @Test
    public void test000(){
        LinkedListNode list = new LinkedListNode(-1);
        list.next = new LinkedListNode(2);
        list.next.next = new LinkedListNode(3);
        list.next.next.next = new LinkedListNode(5);
        list.next.next.next.next = new LinkedListNode(6);
        list.next.next.next.next.next = new LinkedListNode(7);
        list.next.next.next.next.next.next= new LinkedListNode(10);
        BinaryTreeNode output = SortedListToBinaryTree.sorted_list_to_bst(list);
        ArrayList<ArrayList<Integer>> actual = LevelOrderTraversalOfBST.level_order_traversal(output);
        printList(actual);

        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>(List.of(5)));
        expected.add(new ArrayList<>(List.of(2,7)));
        expected.add(new ArrayList<>(List.of(-1,3,6,10)));
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void test001(){
        LinkedListNode list = new LinkedListNode(-1);
        list.next = new LinkedListNode(2);
        BinaryTreeNode output = SortedListToBinaryTree.sorted_list_to_bst(list);
        ArrayList<ArrayList<Integer>> actual = LevelOrderTraversalOfBST.level_order_traversal(output);
        printList(actual);

        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>(List.of(-1)));
        expected.add(new ArrayList<>(List.of(2)));
        Assert.assertEquals(actual,expected);
    }
}
