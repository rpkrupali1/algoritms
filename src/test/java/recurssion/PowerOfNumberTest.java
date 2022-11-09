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

    @Test
    public void test002(){
        int actual = PowerOfNumber.recursive(1, 10000000);
        Assert.assertEquals(actual,1);
    }

    @Test
    public void test003(){
        int actual = PowerOfNumber.recursive(10000, 10000000);
        Assert.assertEquals(actual,144659229);
    }

    @Test
    public void test004(){
        int actual = PowerOfNumber.recursive(2, 30);
        Assert.assertEquals(actual,1073741824);
    }
}
