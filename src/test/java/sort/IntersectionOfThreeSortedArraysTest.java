package sort;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionOfThreeSortedArraysTest extends ParentTest {

    @Test
    public void bruteForce_test000(){
        int[] arr1 = {1,2,3,4,5}, arr2 = {1,2,5,7,9}, arr3 = {1,3,4,5,8};
        sort.examples.IntersectionOfThreeSortedArrays ir = new sort.examples.IntersectionOfThreeSortedArrays();
        int[] actualResult = ir.threeSorted_bruteForce(arr1,arr2,arr3);
        int[] expectedResult = {1,5};
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void test000(){
        int[] arr1 = {1,2,3,4,5}, arr2 = {1,2,5,7,9}, arr3 = {1,3,4,5,8};
        sort.examples.IntersectionOfThreeSortedArrays ir = new sort.examples.IntersectionOfThreeSortedArrays();
        int[] actualResult = ir.threeSorted(arr1,arr2,arr3);
        printTest(actualResult);
        int[] expectedResult = {1,5};
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void pointer_test000(){
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(1,2,3,4,5)),
                arr2 = new ArrayList<>(Arrays.asList(1,2,5,7,9)),
                arr3 = new ArrayList<>(Arrays.asList(1,3,4,5,8));
        sort.examples.IntersectionOfThreeSortedArrays ir = new sort.examples.IntersectionOfThreeSortedArrays();
        ArrayList<Integer> actualResult = ir.pointer(arr1,arr2,arr3);
        printTest(actualResult);
        ArrayList<Integer> expectedResult = new ArrayList<>(Arrays.asList(1,5));
        Assert.assertEquals(actualResult,expectedResult);
    }
}
