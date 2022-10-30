package sort;

import common.ParentTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import sort.examples.GroupTheNumbers;

import java.util.ArrayList;
import java.util.Arrays;

public class GroupTheNumbersTest extends ParentTest {

    @Test
    public void test000(){
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,4));
        GroupTheNumbers gp = new GroupTheNumbers();
        ArrayList<Integer> actualOutput = gp.twoPointer(input);
        print(actualOutput);
        ArrayList<Integer> expectedOutput = new ArrayList<>(Arrays.asList(2,4,3,1));
        Assert.assertEquals(actualOutput,expectedOutput);
    }

    @Test
    public void test001(){
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,5,8,7));
        GroupTheNumbers gp = new GroupTheNumbers();
        ArrayList<Integer> actualOutput = gp.twoPointer(input);
        print(actualOutput);
        ArrayList<Integer> expectedOutput = new ArrayList<>(Arrays.asList(8,5,1,7));
        Assert.assertEquals(actualOutput,expectedOutput);
    }
}
