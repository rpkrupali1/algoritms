package sort;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class QuickSortTest extends ParentTest{
    @Test
    public void naive_test000(){
        Quick sort = new Quick();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3, 2, 1, 78, 9798, 97));
        ArrayList<Integer> output = sort.quicksort_naive_partition(input);
        printTest(output);
        Assert.assertTrue(isSorted(output));
    }

    @Test
    public void naive_test001(){
        Quick sort = new Quick();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5, 8, 3, 9, 4, 1, 7));
        ArrayList<Integer> output = sort.quicksort_naive_partition(input);
        printTest(output);
        Assert.assertTrue(isSorted(output));
    }

    @Test
    public void lomuto_test000(){
        Quick sort = new Quick();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5, 8, 3, 9, 4, 1, 7));
        ArrayList<Integer> output = sort.quicksort_lomuto_partition(input);
        printTest(output);
        Assert.assertTrue(isSorted(output));
    }
}
