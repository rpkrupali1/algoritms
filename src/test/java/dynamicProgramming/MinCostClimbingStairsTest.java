package dynamicProgramming;

import common.ParentTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class MinCostClimbingStairsTest extends ParentTest {

    @Test
    public void test000_iterative() {
        ArrayList<Integer> input = new ArrayList<>(List.of(1, 1, 2));
        int actual = MinCostClimbingStairs.iterative(input);
        Assert.assertEquals(actual, 1);
    }

    @Test
    public void test001_iterative() {
        ArrayList<Integer> input = new ArrayList<>(List.of(3, 4));
        int actual = MinCostClimbingStairs.iterative(input);
        Assert.assertEquals(actual, 3);
    }

    @Test
    public void test002_iterative() {
        ArrayList<Integer> input = new ArrayList<>(List.of(1, 1, 1, 1, 1));
        int actual = MinCostClimbingStairs.iterative(input);
        Assert.assertEquals(actual, 2);
    }

    @Test
    public void test003_iterative() {
        ArrayList<Integer> input = new ArrayList<>(List.of(100, 1));
        int actual = MinCostClimbingStairs.iterative(input);
        Assert.assertEquals(actual, 1);
    }

    @Test
    public void test000_optimal() {
        ArrayList<Integer> input = new ArrayList<>(List.of(1, 1, 2));
        int actual = MinCostClimbingStairs.iterative_optimal(input);
        Assert.assertEquals(actual, 1);
    }

    @Test
    public void test001_optimal() {
        ArrayList<Integer> input = new ArrayList<>(List.of(3, 4));
        int actual = MinCostClimbingStairs.iterative_optimal(input);
        Assert.assertEquals(actual, 3);
    }

    @Test
    public void test002_optimal() {
        ArrayList<Integer> input = new ArrayList<>(List.of(1, 1, 1, 1, 1));
        int actual = MinCostClimbingStairs.iterative_optimal(input);
        Assert.assertEquals(actual, 2);
    }

    @Test
    public void test003_optimal() {
        ArrayList<Integer> input = new ArrayList<>(List.of(100, 1));
        int actual = MinCostClimbingStairs.iterative_optimal(input);
        Assert.assertEquals(actual, 1);
    }

}