package sort;

import org.testng.Assert;
import org.testng.annotations.Test;
import sort.examples.TwoSum;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoSumTest {

    @Test
    public void test_bruteForce_000(){
        TwoSum twoSum = new TwoSum();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,9,1,3));
        boolean actualResult = twoSum.boolean_bruteForce(input,6);
        Assert.assertTrue(actualResult);
    }

    @Test
    public void test_bruteForce_001(){
        TwoSum twoSum = new TwoSum();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,9,1,3));
        boolean actualResult = twoSum.boolean_bruteForce(input,7);
        Assert.assertFalse(actualResult);
    }

    @Test
    public void test_2pointer_000(){
        TwoSum twoSum = new TwoSum();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,3,5,9));
        boolean actualResult = twoSum.boolean__twoPointerPass(input,6);
        Assert.assertTrue(actualResult);
    }

    @Test
    public void test_2pointer_001(){
        TwoSum twoSum = new TwoSum();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,3,5,9));
        boolean actualResult = twoSum.boolean__twoPointerPass(input,7);
        Assert.assertFalse(actualResult);
    }

    @Test
    public void hashSet_test000(){
        TwoSum twoSum = new TwoSum();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,3,5,9));
        boolean actualResult = twoSum.boolean_hashMap(input,6);
        Assert.assertTrue(actualResult);
    }

    @Test
    public void hashSet_test001(){
        TwoSum twoSum = new TwoSum();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,3,5,9));
        boolean actualResult = twoSum.boolean_hashMap(input,7);
        Assert.assertFalse(actualResult);
    }

    @Test
    public void bruteForce_ReturnIndices_test000(){
        TwoSum twoSum = new TwoSum();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,3,5,9));
        ArrayList<Integer> actualResult = twoSum.bruteForce(input,6);
        ArrayList<Integer> expectedResult = new ArrayList<>(Arrays.asList(0,2));
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void bruteForce_ReturnIndices_test001(){
        TwoSum twoSum = new TwoSum();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,3,5,9));
        ArrayList<Integer> actualResult = twoSum.bruteForce(input,7);
        ArrayList<Integer> expectedResult = new ArrayList<>(Arrays.asList(-1,-1));
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void twoPointer_ReturnIndices_test000(){
        TwoSum twoSum = new TwoSum();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,3,5,9));
        ArrayList<Integer> actualResult = twoSum.twoPointer(input,6);
        ArrayList<Integer> expectedResult = new ArrayList<>(Arrays.asList(0,2));
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void twoPointer_ReturnIndices_test001(){
        TwoSum twoSum = new TwoSum();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,3,5,9));
        ArrayList<Integer> actualResult = twoSum.twoPointer(input,7);
        ArrayList<Integer> expectedResult = new ArrayList<>(Arrays.asList(-1,-1));
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void map_ReturnIndices_test000(){
        TwoSum twoSum = new TwoSum();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,3,5,9));
        ArrayList<Integer> actualResult = twoSum.hashMap(input,6);
        ArrayList<Integer> expectedResult = new ArrayList<>(Arrays.asList(0,2));
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void map_ReturnIndices_test001(){
        TwoSum twoSum = new TwoSum();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,3,5,9));
        ArrayList<Integer> actualResult = twoSum.hashMap(input,7);
        ArrayList<Integer> expectedResult = new ArrayList<>(Arrays.asList(-1,-1));
        Assert.assertEquals(actualResult,expectedResult);
    }
}
