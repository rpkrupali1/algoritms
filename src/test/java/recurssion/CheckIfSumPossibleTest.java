package recurssion;

import common.ParentTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class CheckIfSumPossibleTest extends ParentTest {

    @Test
    public void test000(){
        ArrayList<Long> input = new ArrayList<>(Arrays.asList(2L,4L,8L));
        boolean actual = CheckIfSumPossible.checkSum(input,6);
        Assert.assertTrue(actual);
    }

    @Test
    public void test001(){
        ArrayList<Long> input = new ArrayList<>(Arrays.asList(2L,4L,8L));
        boolean actual = CheckIfSumPossible.checkSum(input,5);
        Assert.assertFalse(actual);
    }

    @Test
    public void test002(){
        ArrayList<Long> input = new ArrayList<>(Arrays.asList(0L));
        boolean actual = CheckIfSumPossible.checkSum(input,0);
        Assert.assertTrue(actual);
    }

    @Test
    public void test003(){
        ArrayList<Long> input = new ArrayList<>(Arrays.asList(1L));
        boolean actual = CheckIfSumPossible.checkSum(input,0);
        Assert.assertFalse(actual);
    }

    @Test
    public void test004(){
        ArrayList<Long> input = new ArrayList<>(Arrays.asList(50L));
        boolean actual = CheckIfSumPossible.checkSum(input,50);
        Assert.assertTrue(actual);
    }
}
