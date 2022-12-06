package graphs;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class FindLargestIslandTest {

    @Test
    public void test000(){
        ArrayList<ArrayList<Integer>> input = new ArrayList<>();
        input.add(new ArrayList<>(List.of(1,1,0)));
        input.add(new ArrayList<>(List.of(1,1,0)));
        input.add(new ArrayList<>(List.of(0,0,1)));
        int actual = FindLargestIsland.bfs(input);
        Assert.assertEquals(actual,4);
    }

    @Test
    public void test001(){
        ArrayList<ArrayList<Integer>> input = new ArrayList<>();
        input.add(new ArrayList<>(List.of(0,0,0)));
        input.add(new ArrayList<>(List.of(0,0,0)));
        input.add(new ArrayList<>(List.of(0,0,0)));
        int actual = FindLargestIsland.bfs(input);
        Assert.assertEquals(actual,0);
    }
}
