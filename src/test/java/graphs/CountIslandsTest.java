package graphs;

import common.ParentTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class CountIslandsTest extends ParentTest {

    @Test
    public void test000_bfs(){
        ArrayList<ArrayList<Integer>> input = new ArrayList<>();
        input.add(new ArrayList<>(List.of(1, 1, 0, 0, 0)));
        input.add(new ArrayList<>(List.of(0, 1, 0, 0, 1)));
        input.add(new ArrayList<>(List.of(1, 0, 0, 1, 1)));
        input.add(new ArrayList<>(List.of(0, 0, 0, 0, 0)));
        input.add(new ArrayList<>(List.of(1, 0, 1, 0, 1)));
        int actual = CountIslands.bfs(input);
        Assert.assertEquals(actual,5);
    }

    @Test
    public void test000_dfs(){
        ArrayList<ArrayList<Integer>> input = new ArrayList<>();
        input.add(new ArrayList<>(List.of(1, 1, 0, 0, 0)));
        input.add(new ArrayList<>(List.of(0, 1, 0, 0, 1)));
        input.add(new ArrayList<>(List.of(1, 0, 0, 1, 1)));
        input.add(new ArrayList<>(List.of(0, 0, 0, 0, 0)));
        input.add(new ArrayList<>(List.of(1, 0, 1, 0, 1)));
        int actual = CountIslands.dfs(input);
        Assert.assertEquals(actual,5);
    }
}
