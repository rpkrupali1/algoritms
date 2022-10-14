package sort;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoSumTest {

    @Test
    public void test_bruteForce_000(){
        TwoSum twoSum = new TwoSum();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,9,1,3));
        boolean actualResult = twoSum.two_sum_bruteForce(input,6);
        Assert.assertTrue(actualResult);
    }

    @Test
    public void test_bruteForce_001(){
        TwoSum twoSum = new TwoSum();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,9,1,3));
        boolean actualResult = twoSum.two_sum_bruteForce(input,7);
        Assert.assertFalse(actualResult);
    }

    @Test
    public void test_2pointer_000(){
        TwoSum twoSum = new TwoSum();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,3,5,9));
        boolean actualResult = twoSum.two_sum_bruteForce(input,6);
        Assert.assertTrue(actualResult);
    }

    @Test
    public void test_2pointer_001(){
        TwoSum twoSum = new TwoSum();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,3,5,9));
        boolean actualResult = twoSum.two_sum_bruteForce(input,7);
        Assert.assertFalse(actualResult);
    }
}
