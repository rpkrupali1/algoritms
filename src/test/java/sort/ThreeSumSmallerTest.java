package sort;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class ThreeSumSmallerTest extends ParentTest {
    @Test
    public void test000(){
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5, 0, -1, 3, 2));
        ThreeSumSmaller threeSumSmaller = new ThreeSumSmaller();
        int output = threeSumSmaller.two_pointer(4,input);
        Assert.assertEquals(output,2);
    }

    @Test
    public void test001(){
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2, 2, 2, 1));
        ThreeSumSmaller threeSumSmaller = new ThreeSumSmaller();
        int output = threeSumSmaller.two_pointer(7,input);
        Assert.assertEquals(output,4);
    }

    @Test
    public void test005(){
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(100000, 10000, -9999, -98531, -12356));
        ThreeSumSmaller threeSumSmaller = new ThreeSumSmaller();
        int output = threeSumSmaller.two_pointer(1000,input);
        Assert.assertEquals(output,6);
    }

    @Test
    public void test006(){
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3, 1, 234, 131, 0, 0, 0, 1));
        ThreeSumSmaller threeSumSmaller = new ThreeSumSmaller();
        int output = threeSumSmaller.two_pointer(10,input);
        Assert.assertEquals(output,20);
    }

    @Test
    public void test002(){
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5, 1, 3, 4, 7));
        ThreeSumSmaller threeSumSmaller = new ThreeSumSmaller();
        int output = threeSumSmaller.two_pointer(12,input);
        Assert.assertEquals(output,4);
    }
}
