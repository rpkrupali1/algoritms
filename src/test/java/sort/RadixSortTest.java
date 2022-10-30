package sort;

import common.ParentTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import sort.methods.Radix;

import java.util.ArrayList;
import java.util.Arrays;

public class RadixSortTest extends ParentTest {

    @Test
    public void test000(){
        Radix sort = new Radix();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(121, 432, 564, 23, 1, 45, 788));
        //ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5, 8, 3, 9, 4, 1, 7));
        ArrayList<Integer> output = sort.radix_sort(input);
        print(output);
        Assert.assertTrue(isSorted(output));
    }
}
