package recurssion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PowerOfNumberTest {

    @Test
    public void test000(){
        int actual = PowerOfNumber.recursive(2,3);
        Assert.assertEquals(actual,8);
    }

    @Test
    public void test001(){
        int actual = PowerOfNumber.recursive(3,4);
        Assert.assertEquals(actual,81);
    }
}
