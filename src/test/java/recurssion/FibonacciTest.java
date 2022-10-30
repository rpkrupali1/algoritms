package recurssion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FibonacciTest {

    @Test
    public void recursive_test000(){
        Fibonacci fib = new Fibonacci();
        int actual = fib.recursive(4);
        Assert.assertEquals(actual,3);
    }

    @Test
    public void recursive_test001(){
        Fibonacci fib = new Fibonacci();
        int actual = fib.recursive(1);
        Assert.assertEquals(actual,1);
    }

    @Test
    public void iterative_test000(){
        Fibonacci fib = new Fibonacci();
        int actual = fib.iterative(4);
        Assert.assertEquals(actual,3);
    }

    @Test
    public void iterative_test001(){
        Fibonacci fib = new Fibonacci();
        int actual = fib.iterative(1);
        Assert.assertEquals(actual,1);
    }
}
