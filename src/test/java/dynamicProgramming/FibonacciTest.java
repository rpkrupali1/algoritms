package dynamicProgramming;

import org.testng.Assert;
import org.testng.annotations.Test;


public class FibonacciTest {

    @Test
    public void recursive_memoized_test000(){
        int actual = dynamicProgramming.Fibonacci.recursive_memoized(4);
        Assert.assertEquals(actual,3);
    }

    @Test
    public void recursive_memoized_test001(){
        int actual = dynamicProgramming.Fibonacci.recursive_memoized(1);
        Assert.assertEquals(actual,1);
    }

    @Test
    public void recursive_memoized_test002(){
        int actual = dynamicProgramming.Fibonacci.recursive_memoized(2);
        Assert.assertEquals(actual,1);
    }
}
