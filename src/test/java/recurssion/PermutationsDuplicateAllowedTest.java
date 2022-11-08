package recurssion;

import common.ParentTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class PermutationsDuplicateAllowedTest extends ParentTest {

    @Test
    public void test000(){
        ArrayList<ArrayList<Integer>> actual = PermutationsDuplicateAllowed.recursive_approach(
                new ArrayList<>(Arrays.asList(1, 2, 2)));
        printList(actual);
        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>(Arrays.asList(1, 2, 2)));
        expected.add(new ArrayList<>(Arrays.asList(2, 2,1)));
        expected.add(new ArrayList<>(Arrays.asList(2,1, 2)));
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void test001(){
        ArrayList<ArrayList<Integer>> actual = PermutationsDuplicateAllowed.recursive_approach(
                new ArrayList<>(Arrays.asList(2,0,9)));
        printList(actual);
        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>(Arrays.asList(0,2,9)));
        expected.add(new ArrayList<>(Arrays.asList(9,2,0)));
        expected.add(new ArrayList<>(Arrays.asList(2,9,0)));
        expected.add(new ArrayList<>(Arrays.asList(0,9,2)));
        expected.add(new ArrayList<>(Arrays.asList(2,0,9)));
        expected.add(new ArrayList<>(Arrays.asList(9,0,2)));
        Assert.assertEquals(actual,expected);
    }
}
