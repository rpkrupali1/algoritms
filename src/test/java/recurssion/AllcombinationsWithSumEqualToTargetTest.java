package recurssion;


import common.ParentTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class AllcombinationsWithSumEqualToTargetTest extends ParentTest {

    @Test
    public void test000(){
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3));
        ArrayList<ArrayList<Integer>> actual = AllcombinationsWithSumEqualToTarget.recursive_approach(input,3);
        printList(actual);
        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>(Arrays.asList(1,2)));
        expected.add(new ArrayList<>(Arrays.asList(3)));
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void test001(){
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,1,1));
        ArrayList<ArrayList<Integer>> actual = AllcombinationsWithSumEqualToTarget.recursive_approach(input,2);
        printList(actual);
        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>(Arrays.asList(1,1)));
        Assert.assertEquals(actual,expected);
    }
}
