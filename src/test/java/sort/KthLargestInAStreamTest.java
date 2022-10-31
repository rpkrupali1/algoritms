package sort;

import common.ParentTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import sort.examples.KthLargestInAStream;

import java.util.ArrayList;
import java.util.Arrays;

public class KthLargestInAStreamTest extends ParentTest {

    @Test
    public void bruteForce_test000(){
        ArrayList<Integer> initialStream = new ArrayList<>(Arrays.asList(4, 6));
        ArrayList<Integer> appendStream = new ArrayList<>(Arrays.asList(5,2,20));
        int k = 2;
        KthLargestInAStream st = new KthLargestInAStream();
        ArrayList<Integer> actualOutput = st.brute_force(k,initialStream,appendStream);
        print(actualOutput);
        ArrayList<Integer> expectedOutput = new ArrayList<>(Arrays.asList(5,5,6));
        Assert.assertEquals(actualOutput,expectedOutput);
    }

    @Test
    public void heapSolution_test000(){
        ArrayList<Integer> initialStream = new ArrayList<>(Arrays.asList(4, 6));
        ArrayList<Integer> appendStream = new ArrayList<>(Arrays.asList(5,2,20));
        int k = 2;
        KthLargestInAStream st = new KthLargestInAStream();
        ArrayList<Integer> actualOutput = st.min_heap(k,initialStream,appendStream);
        print(actualOutput);
        ArrayList<Integer> expectedOutput = new ArrayList<>(Arrays.asList(5,5,6));
        Assert.assertEquals(actualOutput,expectedOutput);
    }

    @Test
    public void heapSolution_test001(){
        ArrayList<Integer> initialStream = new ArrayList<>(Arrays.asList(4, 5, 6, 7));
        ArrayList<Integer> appendStream = new ArrayList<>(Arrays.asList(5, 6, 4));
        int k = 3;
        KthLargestInAStream st = new KthLargestInAStream();
        ArrayList<Integer> actualOutput = st.min_heap(k,initialStream,appendStream);
        print(actualOutput);
        ArrayList<Integer> expectedOutput = new ArrayList<>(Arrays.asList(5,6,6));
        Assert.assertEquals(actualOutput,expectedOutput);
    }
}
