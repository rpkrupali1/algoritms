package graphs;

import common.ParentTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class CheckIfEulerianCycleExistsTest extends ParentTest {

    @Test
    public void test000(){
        ArrayList<ArrayList<Integer>> input = new ArrayList<>();
        input.add(new ArrayList<>(List.of(0,1)));
        input.add(new ArrayList<>(List.of(0,2)));
        input.add(new ArrayList<>(List.of(1,3)));
        input.add(new ArrayList<>(List.of(3,0)));
        input.add(new ArrayList<>(List.of(3,2)));
        input.add(new ArrayList<>(List.of(4,3)));
        input.add(new ArrayList<>(List.of(4,0)));
        boolean actual = CheckIfEulerianCycleExists.is_exists(5,input);
        Assert.assertTrue(actual);
    }

    @Test
    public void test001(){
        ArrayList<ArrayList<Integer>> input = new ArrayList<>();
        input.add(new ArrayList<>(List.of(0,4)));
        input.add(new ArrayList<>(List.of(0,5)));
        input.add(new ArrayList<>(List.of(1,2)));
        input.add(new ArrayList<>(List.of(2,3)));
        input.add(new ArrayList<>(List.of(3,1)));
        input.add(new ArrayList<>(List.of(4,3)));
        boolean actual = CheckIfEulerianCycleExists.is_exists(6,input);
        Assert.assertFalse(actual);
    }
}