package graphs;

import common.ParentTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class DFSTraversalOfAUndirectedGraphTest extends ParentTest {

    @Test
    public void test000_stack(){
        ArrayList<ArrayList<Integer>> input = new ArrayList<>();
        input.add(new ArrayList<>(List.of(0,1)));
        input.add(new ArrayList<>(List.of(0,2)));
        input.add(new ArrayList<>(List.of(1,4)));
        input.add(new ArrayList<>(List.of(3,5)));
        ArrayList<Integer> actual = DFSTraversalOfAUndirectedGraph.stack_approach(6,input);
        print(actual);

        ArrayList<Integer> expected = new ArrayList<>(List.of(0, 2, 1, 4, 3, 5));
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void test000_recurse(){
        ArrayList<ArrayList<Integer>> input = new ArrayList<>();
        input.add(new ArrayList<>(List.of(0,1)));
        input.add(new ArrayList<>(List.of(0,2)));
        input.add(new ArrayList<>(List.of(1,4)));
        input.add(new ArrayList<>(List.of(3,5)));
        ArrayList<Integer> actual = DFSTraversalOfAUndirectedGraph.recursive_approach(6,input);
        print(actual);

        ArrayList<Integer> expected = new ArrayList<>(List.of(0, 1, 4, 2, 3, 5));
        Assert.assertEquals(actual,expected);
    }
}
