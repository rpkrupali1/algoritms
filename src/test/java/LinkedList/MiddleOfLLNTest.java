package LinkedList;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MiddleOfLLNTest {

    @Test
    public void test000(){
        LinkedListNode node = new LinkedListNode(1);
        node.next = new LinkedListNode(2);
        node.next.next = new LinkedListNode(3);
        node.next.next.next = new LinkedListNode(4);
        node.next.next.next.next = new LinkedListNode(5);
        int actual = MiddleOfLLN.getMiddle(node);
        Assert.assertEquals(actual,3);
    }

    @Test
    public void test001(){
        LinkedListNode node = new LinkedListNode(1);
        node.next = new LinkedListNode(2);
        node.next.next = new LinkedListNode(3);
        node.next.next.next = new LinkedListNode(4);
        int actual = MiddleOfLLN.getMiddle(node);
        Assert.assertEquals(actual,3);
    }
}
