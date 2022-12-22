package general;

import common.ParentTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InterQuartileTest extends ParentTest {

    @Test
    public void test000(){
        List<Integer> values = new ArrayList<>(Arrays.asList(1,2,3));
        List<Integer> freqs = new ArrayList<>(Arrays.asList(3,2,1));
        double output = InterQuartile.interQuartile(values,freqs);
        System.out.println(output);
        Assert.assertEquals(output,1.0);
    }

    @Test
    public void test001(){
        List<Integer> values = new ArrayList<>(Arrays.asList(6, 12, 8, 10, 20, 16));
        List<Integer> freqs = new ArrayList<>(Arrays.asList(5, 4, 3, 2, 1, 5));
        double output = InterQuartile.interQuartile(values,freqs);
        System.out.println(output);
        Assert.assertEquals(output,9.0);
    }

    @Test
    public void test002(){
        List<Integer> values = new ArrayList<>(Arrays.asList(10, 40, 30, 50, 20));
        List<Integer> freqs = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        double output = InterQuartile.interQuartile(values,freqs);
        System.out.println(output);
        Assert.assertEquals(output,30.0);
    }
}
