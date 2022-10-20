package sort;

import org.testng.Assert;
import org.testng.annotations.Test;
import sort.examples.IntersectionOfTwoArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoArraysTest extends ParentTest {

    @Test
    public void test000(){
        int[] nums1 = {1,2,2,1}, nums2 = {2,2};
        IntersectionOfTwoArrays ar = new IntersectionOfTwoArrays();
        ArrayList<Integer> actualOutput =  ar.usingHash(nums1,nums2);
        printTest(actualOutput);
        ArrayList<Integer> expectedOutput = new ArrayList<>(List.of(2));
        Assert.assertEquals(actualOutput,expectedOutput);
    }

    @Test
    public void test001(){
        int[] nums1 = {4,9,5}, nums2 = {9,4,9,8,4};
        IntersectionOfTwoArrays ar = new IntersectionOfTwoArrays();
        ArrayList<Integer> actualOutput =  ar.usingHash(nums1,nums2);
        printTest(actualOutput);
        ArrayList<Integer> expectedOutput = new ArrayList<>(Arrays.asList(4,9));
        Assert.assertEquals(actualOutput,expectedOutput);
        Assert.assertEquals(actualOutput.size(),expectedOutput.size());

    }
}
