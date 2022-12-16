package general;

import common.ParentTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberTest extends ParentTest {
    @Test
    public void test000_optimal(){
        ArrayList<Integer> input = new ArrayList<>(List.of(12,5,7));
        ArrayList<String> actual = PrimeNumber.optimal(input);
        print(actual);
        ArrayList<String> expected = new ArrayList<>(List.of("Not prime","Prime","Prime"));
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void test001_optimal(){
        ArrayList<Integer> input = new ArrayList<>(List.of(31,33));
        ArrayList<String> actual = PrimeNumber.optimal(input);
        print(actual);
        ArrayList<String> expected = new ArrayList<>(List.of("Prime","Not prime"));
        Assert.assertEquals(actual,expected);
    }
}
