package sort;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class CountingSortTest extends ParentTest {

    @Test
    public void test000(){
        Counting sort = new Counting();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5, 8, 3, 9, 4, 1, 7));
        ArrayList<Integer> output = sort.counting_sort(input);
        printTest(output);
        Assert.assertTrue(isSorted(output));
    }
}
