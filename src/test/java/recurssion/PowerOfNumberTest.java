package recurssion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PowerOfNumberTest {

    @Test
    public void test000(){
        long actual = PowerOfNumber.mod_approach(2,3);
        Assert.assertEquals(actual,8);
    }

    @Test
    public void test001(){
        long actual = PowerOfNumber.mod_approach(3,4);
        Assert.assertEquals(actual,81);
    }

    @Test
    public void test002(){
        long actual = PowerOfNumber.mod_approach(1, 10000000);
        Assert.assertEquals(actual,1);
    }

    @Test
    public void test003(){
        long actual = PowerOfNumber.mod_approach(10000, 10000000);
        Assert.assertEquals(actual,144659229);
    }

    @Test
    public void test004(){
        long actual = PowerOfNumber.mod_approach(2, 32);
        Assert.assertEquals(actual,294967268);
    }

    @Test
    public void divide_conquer_test001(){
        long actual = PowerOfNumber.divide_conquer(3,4);
        Assert.assertEquals(actual,81);
    }

    @Test
    public void divide_conquer_test002(){
        long actual = PowerOfNumber.divide_conquer(1, 10000000);
        Assert.assertEquals(actual,1);
    }

    @Test
    public void divide_conquer_test003(){
        long actual = PowerOfNumber.divide_conquer(10000, 10000000);
        Assert.assertEquals(actual,144659229);
    }

    @Test
    public void divide_conquer_test004(){
        long actual = PowerOfNumber.divide_conquer(2, 32);
        Assert.assertEquals(actual,294967268);
    }

    @Test
    public void divide_conquer_test005(){
        long actual = PowerOfNumber.divide_conquer(10000, 0);
        Assert.assertEquals(actual,1);
    }
}
