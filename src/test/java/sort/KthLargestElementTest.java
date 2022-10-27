package sort;

import org.testng.Assert;
import org.testng.annotations.Test;
import sort.examples.KthLargest;

import java.util.ArrayList;
import java.util.Arrays;

public class KthLargestElementTest extends ParentTest {

    @Test
    public void test000(){
        int[] input = {3,2,1,5,6,4};
        KthLargest kth = new KthLargest();
        int actualOutput = kth.getkth_sorting(input,2);
        Assert.assertEquals(actualOutput,5);
    }

    @Test
    public void test001(){
        int[] input = {3,2,1,3,1,2,4,5,5,6};
        KthLargest kth = new KthLargest();
        int actualOutput = kth.getkth_sorting(input,4);
        Assert.assertEquals(actualOutput,4);
    }

    @Test
    public void pq_test000(){
        int[] input = {3,2,1,5,6,4};
        KthLargest kth = new KthLargest();
        int actualOutput = kth.priorityQueue(input,2);
        Assert.assertEquals(actualOutput,5);
    }

    @Test
    public void pq_test001(){
        int[] input = {3,2,1,3,1,2,4,5,5,6};
        KthLargest kth = new KthLargest();
        int actualOutput = kth.priorityQueue(input,4);
        Assert.assertEquals(actualOutput,4);
    }

    @Test
    public void pq2_test000(){
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,2,1,5,6,4));
        KthLargest kth = new KthLargest();
        int actualOutput = kth.priorityQueue(input,2);
        Assert.assertEquals(actualOutput,5);
    }

    @Test
    public void pq2_test001(){
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,2,1,3,1,2,4,5,5,6));
        KthLargest kth = new KthLargest();
        int actualOutput = kth.priorityQueue(input,4);
        Assert.assertEquals(actualOutput,4);
    }
}
