package graphs;

import common.ParentTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class CheckIfEulerianPathExistsTests extends ParentTest {

    @Test
    public void test000(){
        ArrayList<ArrayList<Integer>> input = new ArrayList<>();
        input.add(new ArrayList<>(List.of(0,1)));
        input.add(new ArrayList<>(List.of(1,2)));
        input.add(new ArrayList<>(List.of(1,3)));
        input.add(new ArrayList<>(List.of(2,0)));
        input.add(new ArrayList<>(List.of(3,2)));
        boolean actual = CheckIfEulerianPathExists.isPathExist(4,input);
        Assert.assertTrue(actual);
    }

    @Test
    public void test001(){
        ArrayList<ArrayList<Integer>> input = new ArrayList<>();
        input.add(new ArrayList<>(List.of(0,3)));
        input.add(new ArrayList<>(List.of(1,2)));
        input.add(new ArrayList<>(List.of(1,3)));
        input.add(new ArrayList<>(List.of(3,2)));
        input.add(new ArrayList<>(List.of(4,1)));
        input.add(new ArrayList<>(List.of(4,2)));
        boolean actual = CheckIfEulerianPathExists.isPathExist(5,input);
        Assert.assertFalse(actual);
    }
}
