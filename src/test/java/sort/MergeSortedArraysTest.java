package sort;

import org.testng.annotations.Test;
import sort.examples.MergeSortedArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSortedArraysTest extends ParentTest {

    @Test
    public void test000(){
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(1,3,5));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(2,4,6,0,0,0));
        MergeSortedArrays sort = new MergeSortedArrays();
        ArrayList<Integer> output = sort.mergeSortedArray(first,second);
        printTest(output);
        isSorted(output);
    }

    @Test
    public void test001(){
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(5,10));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(8,13,0,0));
        MergeSortedArrays sort = new MergeSortedArrays();
        ArrayList<Integer> output = sort.mergeSortedArray(first,second);
        printTest(output);
        isSorted(output);
    }

    @Test
    public void test002(){
        ArrayList<Integer> first = new ArrayList<>(List.of(1));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(2,0));
        MergeSortedArrays sort = new MergeSortedArrays();
        ArrayList<Integer> output = sort.mergeSortedArray(first,second);
        printTest(output);
        isSorted(output);
    }

    @Test
    public void test003(){
        ArrayList<Integer> first = new ArrayList<>(List.of(1));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(1,0));
        MergeSortedArrays sort = new MergeSortedArrays();
        ArrayList<Integer> output = sort.mergeSortedArray(first,second);
        printTest(output);
        isSorted(output);
    }

    @Test
    public void test004(){
        ArrayList<Integer> first = new ArrayList<>(List.of(2));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(1,0));
        MergeSortedArrays sort = new MergeSortedArrays();
        ArrayList<Integer> output = sort.mergeSortedArray(first,second);
        printTest(output);
        isSorted(output);
    }

    @Test
    public void test005(){
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(10,10));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(10,10,0,0));
        MergeSortedArrays sort = new MergeSortedArrays();
        ArrayList<Integer> output = sort.mergeSortedArray(first,second);
        printTest(output);
        isSorted(output);
    }

    @Test
    public void test006(){
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(11,11));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(3,11,0,0));
        MergeSortedArrays sort = new MergeSortedArrays();
        ArrayList<Integer> output = sort.mergeSortedArray(first,second);
        printTest(output);
        isSorted(output);
    }

    @Test
    public void test007(){
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(13,21));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(13,13,0,0));
        MergeSortedArrays sort = new MergeSortedArrays();
        ArrayList<Integer> output = sort.mergeSortedArray(first,second);
        printTest(output);
        isSorted(output);
    }

    @Test
    public void test008(){
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(1, 10, 11, 12, 13));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(2, 3, 4, 13, 15, 0, 0, 0, 0, 0));
        MergeSortedArrays sort = new MergeSortedArrays();
        ArrayList<Integer> output = sort.mergeSortedArray(first,second);
        printTest(output);
        isSorted(output);
    }

    @Test
    public void test009(){
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(50, 55, 60, 65));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(45, 52, 53, 68,0,0,0,0));
        MergeSortedArrays sort = new MergeSortedArrays();
        ArrayList<Integer> output = sort.mergeSortedArray(first,second);
        printTest(output);
        isSorted(output);
    }

    @Test
    public void test010(){
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(1, 1, 1, 1, 1, 1));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(1, 1, 1, 1, 1, 2, 0, 0, 0, 0, 0, 0));
        MergeSortedArrays sort = new MergeSortedArrays();
        ArrayList<Integer> output = sort.mergeSortedArray(first,second);
        printTest(output);
        isSorted(output);
    }

    @Test
    public void test011(){
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(100, 100, 200, 300, 300, 400, 400));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(90, 100, 100, 200, 200, 450, 450, 0, 0, 0, 0, 0, 0, 0));
        MergeSortedArrays sort = new MergeSortedArrays();
        ArrayList<Integer> output = sort.mergeSortedArray(first,second);
        printTest(output);
        isSorted(output);
    }
}
