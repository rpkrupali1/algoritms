package general;

import common.ParentTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuartilesTest extends ParentTest {
    @Test
    public void test000(){
        List<Integer> input = new ArrayList<>(List.of(9,5,7,1,3));
        List<Integer> actual = Quartiles.quartiles(input);
        List<Integer> expected = new ArrayList<>(Arrays.asList(2,5,8));
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void test001(){
        List<Integer> input = new ArrayList<>(List.of(1,3,5,7));
        List<Integer> actual = Quartiles.quartiles(input);
        List<Integer> expected = new ArrayList<>(Arrays.asList(2,4,6));
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void test002(){
        List<Integer> input = new ArrayList<>(Arrays.asList(3, 7, 8, 5, 12, 14, 21, 13, 18));
        List<Integer> actual = Quartiles.quartiles(input);
        List<Integer> expected = new ArrayList<>(Arrays.asList(6,12,16));
        Assert.assertEquals(actual,expected);
    }
}
