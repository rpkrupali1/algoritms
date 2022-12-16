package dynamicProgramming;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UniquePathsTest {
    @Test
    public void test000(){
        int actual = UniquePaths.iterative(3,2);
        Assert.assertEquals(actual,3);
    }

    @Test
    public void test001(){
        int actual = UniquePaths.iterative(4,1);
        Assert.assertEquals(actual,1);
    }

    @Test
    public void test002(){
        int actual = UniquePaths.iterative(1,1);
        Assert.assertEquals(actual,1);
    }

    @Test
    public void test003(){
        int actual = UniquePaths.iterative(1,6);
        Assert.assertEquals(actual,1);
    }
}
