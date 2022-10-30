package sort;

import common.ParentTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import sort.examples.OnlineMedian;

import java.util.ArrayList;
import java.util.Arrays;

public class OnlineMedianTest extends ParentTest {

    @Test
    public void bf_test000(){
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3, 8, 5, 2));
        OnlineMedian median = new OnlineMedian();
        ArrayList<Integer> actualOutput = median.bruteForce(input);
        ArrayList<Integer> expectedOutput = new ArrayList<>(Arrays.asList(3, 5, 5, 4));
        Assert.assertEquals(actualOutput,expectedOutput);
    }

    @Test
    public void heap_test000(){
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3, 8, 5, 2));
        OnlineMedian median = new OnlineMedian();
        ArrayList<Integer> actualOutput = median.heapSolution(input);
        print(actualOutput);
        ArrayList<Integer> expectedOutput = new ArrayList<>(Arrays.asList(3, 5, 5, 4));
        Assert.assertEquals(actualOutput,expectedOutput);
    }
}
