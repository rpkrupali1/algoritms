package LinkedList;

import common.ParentTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesTest extends ParentTest {
    @Test
    public void test000(){
        LinkedListNode node = new LinkedListNode(1);
        node.next = new LinkedListNode(2);
        node.next.next = new LinkedListNode(2);
        node.next.next.next = new LinkedListNode(3);
        node.next.next.next.next = new LinkedListNode(3);
        node.next.next.next.next.next = new LinkedListNode(4);
        LinkedListNode output = RemoveDuplicates.removeDuplicates(node);
        ArrayList<Integer> actual = getList(output);
        ArrayList<Integer> expected = new ArrayList<>(List.of(1,2,3,4));
        Assert.assertEquals(actual,expected);
    }
}
