package recurssion;

import common.ParentTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class TowerOfHanoiTest extends ParentTest {
    @Test
    public static void recurive_test000(){
        ArrayList<ArrayList<Integer>> actual = TowerOfHanoi.recursive_approach(4);
        printList(actual);
        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        expected.add( new ArrayList<>(Arrays.asList(1,2)));
        expected.add( new ArrayList<>(Arrays.asList(1,3)));
        expected.add( new ArrayList<>(Arrays.asList(2,3)));
        expected.add( new ArrayList<>(Arrays.asList(1,2)));
        expected.add( new ArrayList<>(Arrays.asList(3,1)));
        expected.add( new ArrayList<>(Arrays.asList(3,2)));
        expected.add( new ArrayList<>(Arrays.asList(1,2)));
        expected.add( new ArrayList<>(Arrays.asList(1,3)));
        expected.add( new ArrayList<>(Arrays.asList(2,3)));
        expected.add( new ArrayList<>(Arrays.asList(2,1)));
        expected.add( new ArrayList<>(Arrays.asList(3,1)));
        expected.add( new ArrayList<>(Arrays.asList(2,3)));
        expected.add( new ArrayList<>(Arrays.asList(1,2)));
        expected.add( new ArrayList<>(Arrays.asList(1,3)));
        expected.add( new ArrayList<>(Arrays.asList(2,3)));
        Assert.assertEquals(actual,expected);
    }
}
