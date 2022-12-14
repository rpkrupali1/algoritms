package dynamicProgramming;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class MinimumCoinsTest {

    @Test
    public void test000(){
        ArrayList<Integer> input = new ArrayList<>(List.of(1,3,5));
        int actual = MinimumCoins.minimum_coins(input,9);
        Assert.assertEquals(actual,3);
    }

    @Test
    public void test005(){
        ArrayList<Integer> input = new ArrayList<>(List.of(22, 14, 1, 18));
        int actual = MinimumCoins.minimum_coins(input,889);
        Assert.assertEquals(actual,43);
    }
}
