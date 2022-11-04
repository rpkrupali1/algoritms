package recurssion;

import common.ParentTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class PermuteUniqueIntegersTest extends ParentTest {

    @Test
    public void recursive_test000(){
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<ArrayList<Integer>> actual = PermuteUniqueIntegers.recursive(input);
        printList(actual);
        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>(Arrays.asList(1,2,3)));
        expected.add(new ArrayList<>(Arrays.asList(1,3,2)));
        expected.add(new ArrayList<>(Arrays.asList(2,1,3)));
        expected.add(new ArrayList<>(Arrays.asList(2,3,1)));
        expected.add(new ArrayList<>(Arrays.asList(3,2,1)));
        expected.add(new ArrayList<>(Arrays.asList(3,1,2)));
        Assert.assertEquals(actual,expected);
    }
}
