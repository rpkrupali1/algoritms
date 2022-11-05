package recurssion;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.LinkedList;

public class ReverseLinkedListTest {
    @Test
    public void test000(){
        LinkedList<Integer> arr = new LinkedList<>(Arrays.asList(1,2,3,4,5));
        LinkedList<Integer> actual = ReverseLinkedList.recursion(arr);
        LinkedList<Integer> expected = new LinkedList<>(Arrays.asList(5,4,3,2,1));
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void test001(){
        LinkedList<Integer> arr = new LinkedList<>(Arrays.asList(1,2,3,4));
        LinkedList<Integer> actual = ReverseLinkedList.recursion(arr);
        LinkedList<Integer> expected = new LinkedList<>(Arrays.asList(4,3,2,1));
        Assert.assertEquals(actual,expected);
    }
}
