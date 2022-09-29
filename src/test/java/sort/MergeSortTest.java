package sort;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSortTest extends ParentTest {

    @Test
    public void test000() {
        Merge merge = new Merge();
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(5, 8, 3, 9, 4, 1, 7));
        ArrayList<Integer> output = merge.merge_sort(input);
        printTest(output);
        isSorted(output);
    }

    /* solution not working
    @Test
    public void mergesort2_test000(){
        Merge merge = new Merge();
        ArrayList<Integer> input =  new ArrayList<Integer>(Arrays.asList());
        ArrayList<Integer> output = merge.merge_sort2(input);
        printTest(output);
        isSorted(output);
    }
    */

    @Test
    public void test001() {
        Merge merge = new Merge();
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(0, 199999999, 1000000000));
        ArrayList<Integer> output = merge.merge_sort(input);
        printTest(output);
        isSorted(output);
    }

    @Test
    public void test002() {
        Merge merge = new Merge();
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1));
        ArrayList<Integer> output = merge.merge_sort(input);
        printTest(output);
        isSorted(output);
    }

    @Test
    public void test003() {
        Merge merge = new Merge();
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1, -2));
        ArrayList<Integer> output = merge.merge_sort(input);
        printTest(output);
        isSorted(output);
    }

    @Test
    public void test004() {
        Merge merge = new Merge();
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1000000000, 0));
        ArrayList<Integer> output = merge.merge_sort(input);
        printTest(output);
        isSorted(output);
    }

    @Test
    public void test005() {
        Merge merge = new Merge();
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(-9, 9));
        ArrayList<Integer> output = merge.merge_sort(input);
        printTest(output);
        isSorted(output);
    }

    @Test
    public void test006() {
        Merge merge = new Merge();
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(0, 3, 2, 1));
        ArrayList<Integer> output = merge.merge_sort(input);
        printTest(output);
        isSorted(output);
    }

    @Test
    public void test007() {
        Merge merge = new Merge();
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1, 1, 1, -1));
        ArrayList<Integer> output = merge.merge_sort(input);
        printTest(output);
        isSorted(output);
    }

    @Test
    public void test008() {
        Merge merge = new Merge();
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 2, 1));
        ArrayList<Integer> output = merge.merge_sort(input);
        printTest(output);
        isSorted(output);
    }

    @Test
    public void test009() {
        Merge merge = new Merge();
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(-1, -2, -3, -4));
        ArrayList<Integer> output = merge.merge_sort(input);
        printTest(output);
        isSorted(output);
    }

    @Test
    public void test010() {
        Merge merge = new Merge();
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1, 3, 5, 7, -2, -4, -6));
        ArrayList<Integer> output = merge.merge_sort(input);
        printTest(output);
        isSorted(output);
    }

    @Test
    public void test011() {
        Merge merge = new Merge();
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1, 2, 1, 2));
        ArrayList<Integer> output = merge.merge_sort(input);
        printTest(output);
        isSorted(output);
    }
}