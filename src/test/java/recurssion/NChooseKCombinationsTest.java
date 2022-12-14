package recurssion;

import org.testng.Assert;
import org.testng.annotations.Test;
import common.ParentTest;

import java.util.ArrayList;
import java.util.Arrays;

public class NChooseKCombinationsTest extends ParentTest {

    @Test
    public static void recurive_test000(){
        ArrayList<ArrayList<Integer>> actual = NChooseKCombinations.recursive(5,2);
        printList(actual);
        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        expected.add( new ArrayList<>(Arrays.asList(1,2)));
        expected.add( new ArrayList<>(Arrays.asList(1,3)));
        expected.add( new ArrayList<>(Arrays.asList(1,4)));
        expected.add( new ArrayList<>(Arrays.asList(1,5)));
        expected.add( new ArrayList<>(Arrays.asList(2,3)));
        expected.add( new ArrayList<>(Arrays.asList(2,4)));
        expected.add( new ArrayList<>(Arrays.asList(2,5)));
        expected.add( new ArrayList<>(Arrays.asList(3,4)));
        expected.add( new ArrayList<>(Arrays.asList(3,5)));
        expected.add( new ArrayList<>(Arrays.asList(4,5)));
        Assert.assertEquals(actual,expected);
    }

    @Test
    public static void recurive_test001(){
        ArrayList<ArrayList<Integer>> actual = NChooseKCombinations.recursive(6,6);
        printList(actual);
        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        expected.add( new ArrayList<>(Arrays.asList(1,2,3,4,5,6)));
        Assert.assertEquals(actual,expected);
    }
}
