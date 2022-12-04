package graphs;

import common.ParentTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class CountConnCompInUndirectGraphTest extends ParentTest {
    @Test
    public void test000(){
        ArrayList<ArrayList<Integer>> input = new ArrayList<>();
        input.add(new ArrayList<>(List.of(0,1)));
        input.add(new ArrayList<>(List.of(1,2)));
        input.add(new ArrayList<>(List.of(0,2)));
        input.add(new ArrayList<>(List.of(3,4)));
        int actual = CountConnCompInUndirectGraph.bfs(5,input);
        Assert.assertEquals(actual,2);
    }

    @Test
    public void test0001(){
        ArrayList<ArrayList<Integer>> input = new ArrayList<>();
        input.add(new ArrayList<>(List.of(0,1)));
        input.add(new ArrayList<>(List.of(0,3)));
        input.add(new ArrayList<>(List.of(0,2)));
        input.add(new ArrayList<>(List.of(2,1)));
        input.add(new ArrayList<>(List.of(2,3)));
        int actual = CountConnCompInUndirectGraph.bfs(4,input);
        Assert.assertEquals(actual,1);
    }

    @Test
    public void test000_dfs(){
        ArrayList<ArrayList<Integer>> input = new ArrayList<>();
        input.add(new ArrayList<>(List.of(0,1)));
        input.add(new ArrayList<>(List.of(1,2)));
        input.add(new ArrayList<>(List.of(0,2)));
        input.add(new ArrayList<>(List.of(3,4)));
        int actual = CountConnCompInUndirectGraph.dfs(5,input);
        Assert.assertEquals(actual,2);
    }

    @Test
    public void test0001_dfs(){
        ArrayList<ArrayList<Integer>> input = new ArrayList<>();
        input.add(new ArrayList<>(List.of(0,1)));
        input.add(new ArrayList<>(List.of(0,3)));
        input.add(new ArrayList<>(List.of(0,2)));
        input.add(new ArrayList<>(List.of(2,1)));
        input.add(new ArrayList<>(List.of(2,3)));
        int actual = CountConnCompInUndirectGraph.dfs(4,input);
        Assert.assertEquals(actual,1);
    }
}
