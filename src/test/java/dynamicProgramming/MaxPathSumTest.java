package dynamicProgramming;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class MaxPathSumTest {

    @Test
    public void test000_iterative(){
        ArrayList<ArrayList<Integer>> input = new ArrayList<>();
        input.add(new ArrayList<>(List.of(4,5,8)));
        input.add(new ArrayList<>(List.of(3,6,4)));
        input.add(new ArrayList<>(List.of(2,4,7)));
        int actual = MaxPathSum.iterative(input);
        Assert.assertEquals(actual,28);
    }

    @Test
    public void test001_iterative(){
        ArrayList<ArrayList<Integer>> input = new ArrayList<>();
        input.add(new ArrayList<>(List.of(1,-4,3)));
        input.add(new ArrayList<>(List.of(4,-2,2)));
        int actual = MaxPathSum.iterative(input);
        Assert.assertEquals(actual,5);
    }
}
