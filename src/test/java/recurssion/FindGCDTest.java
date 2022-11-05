package recurssion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FindGCDTest {
    @Test
    public void test000(){
        int actual = FindGCD.recursive(270,192);
        Assert.assertEquals(actual,6);
    }

    @Test
    public void test001(){
        int actual = FindGCD.recursive(50,25);
        Assert.assertEquals(actual,25);
    }

    @Test
    public void test003(){
        int actual = FindGCD.recursive(50,30);
        Assert.assertEquals(actual,10);
    }
}
