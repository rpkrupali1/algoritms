package sort;

import org.testng.Assert;
import org.testng.annotations.Test;
import sort.examples.IntersectionOfArrays;

public class IntersectionOfArraysTest extends ParentTest {

    @Test
    public void bruteForce_test000(){
        int[] arr1 = {1,2,3,4,5}, arr2 = {1,2,5,7,9}, arr3 = {1,3,4,5,8};
        IntersectionOfArrays ir = new IntersectionOfArrays();
        int[] actualResult = ir.threeSorted_bruteForce(arr1,arr2,arr3);
        int[] expectedResult = {1,5};
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void test000(){
        int[] arr1 = {1,2,3,4,5}, arr2 = {1,2,5,7,9}, arr3 = {1,3,4,5,8};
        IntersectionOfArrays ir = new IntersectionOfArrays();
        int[] actualResult = ir.threeSorted(arr1,arr2,arr3);
        printTest(actualResult);
        int[] expectedResult = {1,5};
        Assert.assertEquals(actualResult,expectedResult);
    }
}
