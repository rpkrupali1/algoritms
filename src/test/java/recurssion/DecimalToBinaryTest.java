package recurssion;

import common.ParentTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class DecimalToBinaryTest extends ParentTest {
    @Test
    public void test000(){
        ArrayList<Integer> actual = DecimalToBinary.recursive(13);
        print(actual);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1,1,0,1));
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void test001(){
        ArrayList<Integer> actual = DecimalToBinary.recursive(7);
        print(actual);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1,1,1));
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void test002(){
        ArrayList<Integer> actual = DecimalToBinary.recursive(10);
        print(actual);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1,0,1,0));
        Assert.assertEquals(actual,expected);
    }
}
