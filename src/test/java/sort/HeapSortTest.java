package sort;

import org.testng.Assert;
import org.testng.annotations.Test;
import sort.methods.Heap;

import java.util.ArrayList;
import java.util.Arrays;


public class HeapSortTest extends ParentTest {

    @Test
    public void test000(){
        Heap sort = new Heap();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5, 8, 3, 9, 4, 1, 7));
        ArrayList<Integer> output = sort.heap_sort(input);
        printTest(output);
        Assert.assertTrue(isSorted(output));
    }

    @Test
    public void test001() {
        Heap heap = new Heap();
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(0, 199999999, 1000000000));
        ArrayList<Integer> output = heap.heap_sort(input);
        printTest(output);
        isSorted(output);
    }

    @Test
    public void test002() {
        Heap heap = new Heap();
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1));
        ArrayList<Integer> output = heap.heap_sort(input);
        printTest(output);
        isSorted(output);
    }

    @Test
    public void test003() {
        Heap heap = new Heap();
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1, -2));
        ArrayList<Integer> output = heap.heap_sort(input);
        printTest(output);
        isSorted(output);
    }

    @Test
    public void test004() {
        Heap heap = new Heap();
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1000000000, 0));
        ArrayList<Integer> output = heap.heap_sort(input);
        printTest(output);
        isSorted(output);
    }

    @Test
    public void test005() {
        Heap heap = new Heap();
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(-9, 9));
        ArrayList<Integer> output = heap.heap_sort(input);
        printTest(output);
        isSorted(output);
    }

    @Test
    public void test006() {
        Heap heap = new Heap();
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(0, 3, 2, 1));
        ArrayList<Integer> output = heap.heap_sort(input);
        printTest(output);
        isSorted(output);
    }

    @Test
    public void test007() {
        Heap heap = new Heap();
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1, 1, 1, -1));
        ArrayList<Integer> output = heap.heap_sort(input);
        printTest(output);
        isSorted(output);
    }

    @Test
    public void test008() {
        Heap heap = new Heap();
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 2, 1));
        ArrayList<Integer> output = heap.heap_sort(input);
        printTest(output);
        isSorted(output);
    }

    @Test
    public void test009() {
        Heap heap = new Heap();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-1, -2, -3, -4));
        ArrayList<Integer> output = heap.heap_sort(input);
        printTest(output);
        isSorted(output);
    }

    @Test
    public void test010() {
        Heap heap = new Heap();
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1, 3, 5, 7, -2, -4, -6));
        ArrayList<Integer> output = heap.heap_sort(input);
        printTest(output);
        isSorted(output);
    }

    @Test
    public void test011() {
        Heap heap = new Heap();
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1, 2, 1, 2));
        ArrayList<Integer> output = heap.heap_sort(input);
        printTest(output);
        isSorted(output);
    }
}
