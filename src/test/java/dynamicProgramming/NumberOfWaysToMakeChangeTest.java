package dynamicProgramming;


import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class NumberOfWaysToMakeChangeTest {
    @Test
    public static void test000(){
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3));
        int actual = NumberOfWaysToMakeChange.bottom_up(input,3);
        Assert.assertEquals(actual,3);
    }

    @Test
    public static void test001(){
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(9, 1, 8, 10, 3));
        int actual = NumberOfWaysToMakeChange.bottom_up(input,12);
        Assert.assertEquals(actual,10);
    }
}
