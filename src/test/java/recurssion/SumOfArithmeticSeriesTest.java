package recurssion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SumOfArithmeticSeriesTest {

    @Test
    public void test000(){
        int actual = SumOfArithmeticSeries.recursive(5);
        int expected = 5+4+3+2+1;
        Assert.assertEquals(actual,expected);
    }
}
