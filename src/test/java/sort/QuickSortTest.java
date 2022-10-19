package sort;

import org.testng.Assert;
import org.testng.annotations.Test;
import sort.methods.Quick;

import java.util.ArrayList;
import java.util.Arrays;

public class QuickSortTest extends ParentTest{

    @Test
    public void firstIndexPartition_test000(){
        Quick sort = new Quick();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5, 8, 3, 9, 4, 1, 7));
        ArrayList<Integer> output = sort.firstIndex_quick_sort(input);
        printTest(output);
        Assert.assertTrue(isSorted(output));
    }


    @Test
    public void lastIndexPartition_test000(){
        Quick sort = new Quick();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5, 8, 3, 9, 4, 1, 7));
        ArrayList<Integer> output = sort.lastIndex_quickSort(input);
        printTest(output);
        Assert.assertTrue(isSorted(output));
    }

    @Test
    public void randomPartition_test000(){
        Quick sort = new Quick();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5, 8, 3, 9, 4, 1, 7));
        ArrayList<Integer> output = sort.random_quickSort(input);
        printTest(output);
        Assert.assertTrue(isSorted(output));
    }
}
