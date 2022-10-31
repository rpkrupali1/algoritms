package sort;

import common.ParentTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import sort.examples.KClosestToOrigin;

public class KClosestToOriginTest extends ParentTest {

    @Test
    public void test000(){
        int[][] input = {{1, 3}, {-2, 2}};
        int k = 1;
        KClosestToOrigin sol = new KClosestToOrigin();
        int[][] actualOutput = sol.kClosest(input,k);
        int[][] expectedOutput =  {{-2, 2}};
        Assert.assertEquals(actualOutput,expectedOutput);
    }

    @Test
    public void test001(){
        //int[][] input = {{3,3},{5,-1},{-2,4}};
        int[][] input = {{5,-1},{3,3},{-2,4}};
        int k = 2;
        KClosestToOrigin sol = new KClosestToOrigin();
        int[][] actualOutput = sol.kClosest(input,k);
        int[][] expectedOutput =  {{-2,4},{3,3}};
        Assert.assertEquals(actualOutput,expectedOutput);
    }
}
