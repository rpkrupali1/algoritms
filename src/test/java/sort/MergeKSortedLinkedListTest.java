package sort;

import common.ParentTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import sort.examples.LinkedListNode;
import sort.examples.MergeKSortedLinkedList;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeKSortedLinkedListTest extends ParentTest {

    @Test
    public void test000(){
        LinkedListNode node1 = new LinkedListNode(1);
        node1.next = new LinkedListNode(3);
        node1.next.next = new LinkedListNode(5);

        LinkedListNode node2 = new LinkedListNode(3);
        node2.next = new LinkedListNode(4);

        LinkedListNode node3 = new LinkedListNode(7);
        ArrayList<LinkedListNode> input = new ArrayList<>(Arrays.asList(node1,node2,node3));
        LinkedListNode output = MergeKSortedLinkedList.recursive(input);
        print(output);
        ArrayList<Integer> actual = convertToArray(output);

        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1,3,3,4,5,7));

        Assert.assertEquals(actual,expected);
    }
}
