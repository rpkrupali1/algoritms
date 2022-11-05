package recurssion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialTest {
    @Test
    public void test000(){
        int actual = Factorial.recursive_approach(4);
        Assert.assertEquals(actual,24);
    }

    @Test
    public void test001(){
        int actual = Factorial.recursive_approach(7);
        Assert.assertEquals(actual,5040);
    }

    @Test
    public void test002(){
        int actual = Factorial.recursive_approach(1);
        Assert.assertEquals(actual,1);
    }
}
