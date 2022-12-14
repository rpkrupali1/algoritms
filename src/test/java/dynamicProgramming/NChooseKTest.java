package dynamicProgramming;

import common.ParentTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NChooseKTest extends ParentTest {

    @Test
    public void test000(){
        int actual = NChooseK.dynamic_recursion(5,3);
        Assert.assertEquals(actual,10);
    }

    @Test
    public void test001_dynamic(){
        int actual = NChooseK.dynamic_recursion(3,5);
        Assert.assertEquals(actual,0);
    }

    @Test
    public void test002_dynamic(){
        int actual = NChooseK.dynamic_recursion(0,0);
        Assert.assertEquals(actual,1);
    }

    @Test
    public void test004_dynamic(){
        int actual = NChooseK.dynamic_recursion(8,3);
        Assert.assertEquals(actual,56);
    }

    @Test
    public void test001_optimal(){
        int actual = NChooseK.optimal_solution(3,5);
        Assert.assertEquals(actual,0);
    }

    @Test
    public void test002_optimal(){
        int actual = NChooseK.optimal_solution(0,0);
        Assert.assertEquals(actual,1);
    }

    @Test
    public void test004_optimal(){
        int actual = NChooseK.optimal_solution(8,3);
        Assert.assertEquals(actual,56);
    }
}
