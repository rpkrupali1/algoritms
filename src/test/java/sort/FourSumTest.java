package sort;

import org.testng.Assert;
import org.testng.annotations.Test;
import sort.examples.FourSum;

import java.util.ArrayList;
import java.util.Arrays;

public class FourSumTest extends ParentTest {

    @Test
    public void bruteforce_test000(){
        FourSum fourSum = new FourSum();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0, 0, 1, 3, 2, -1));
        ArrayList<ArrayList<Integer>> actualResult = fourSum.brute_force(input,3);
        System.out.println(actualResult);
        ArrayList<ArrayList<Integer>> expectedResult = new ArrayList<>();
        expectedResult.add(new ArrayList<>(Arrays.asList(-1, 0, 1, 3)));
        expectedResult.add(new ArrayList<>(Arrays.asList(0, 0, 1, 2)));
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void bruteforce_test002(){
        FourSum fourSum = new FourSum();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(251, 251, 251, 251, 251, 251, 251));
        ArrayList<ArrayList<Integer>> actualResult = fourSum.brute_force(input,1004);
        System.out.println(actualResult);
        ArrayList<ArrayList<Integer>> expectedResult = new ArrayList<>();
        expectedResult.add(new ArrayList<>(Arrays.asList(251, 251, 251, 251)));
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void twoPointer_test000(){
        FourSum fourSum = new FourSum();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0, 0, 1, 3, 2, -1));
        ArrayList<ArrayList<Integer>> actualResult = fourSum.two_pointer(input,3);
        System.out.println(actualResult);
        ArrayList<ArrayList<Integer>> expectedResult = new ArrayList<>();
        expectedResult.add(new ArrayList<>(Arrays.asList(-1, 0, 1, 3)));
        expectedResult.add(new ArrayList<>(Arrays.asList(0, 0, 1, 2)));
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void twoPointer_test001(){
        FourSum fourSum = new FourSum();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2, 1, 6, 3, 1, 3, 5, 4, 4, 5, 6, 2));
        ArrayList<ArrayList<Integer>> actualResult = fourSum.two_pointer(input,11);
        System.out.println(actualResult);
        ArrayList<ArrayList<Integer>> expectedResult = new ArrayList<>();
        expectedResult.add(new ArrayList<>(Arrays.asList(1,1,3,6)));
        expectedResult.add(new ArrayList<>(Arrays.asList(1,1,4,5)));
        expectedResult.add(new ArrayList<>(Arrays.asList(1,2,2,6)));
        expectedResult.add(new ArrayList<>(Arrays.asList(1,2,3,5)));
        expectedResult.add(new ArrayList<>(Arrays.asList(1,2,4,4)));
        expectedResult.add(new ArrayList<>(Arrays.asList(1,3,3,4)));
        expectedResult.add(new ArrayList<>(Arrays.asList(2,2,3,4)));
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void twoPointer_test002(){
        FourSum fourSum = new FourSum();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(251, 251, 251, 251, 251, 251, 251));
        ArrayList<ArrayList<Integer>> actualResult = fourSum.two_pointer(input,1004);
        System.out.println(actualResult);
        ArrayList<ArrayList<Integer>> expectedResult = new ArrayList<>();
        expectedResult.add(new ArrayList<>(Arrays.asList(251, 251, 251, 251)));
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void twoPointer_test003(){
        FourSum fourSum = new FourSum();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(100000, -99999, 1, 0, -99997, -1, -100000, 2));
        ArrayList<ArrayList<Integer>> actualResult = fourSum.two_pointer(input,2);
        System.out.println(actualResult);
        ArrayList<ArrayList<Integer>> expectedResult = new ArrayList<>();
        expectedResult.add(new ArrayList<>(Arrays.asList(-100000, 0, 2, 100000)));
        expectedResult.add(new ArrayList<>(Arrays.asList(-99999, -1, 2, 100000)));
        expectedResult.add(new ArrayList<>(Arrays.asList(-99999, 0, 1, 100000)));
        expectedResult.add(new ArrayList<>(Arrays.asList(-99997, -1, 0, 100000)));
        expectedResult.add(new ArrayList<>(Arrays.asList(-1, 0, 1, 2)));
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void twoPointer_test008(){
        FourSum fourSum = new FourSum();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<ArrayList<Integer>> actualResult = fourSum.two_pointer(input,-1);
        System.out.println(actualResult);
        ArrayList<ArrayList<Integer>> expectedResult = new ArrayList<>();
        Assert.assertEquals(actualResult,expectedResult);
    }
}
