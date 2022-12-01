package graphs;

import common.ParentTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class BFSTraversalOfAGraphTest extends ParentTest {

    @Test
    public void test000(){
        ArrayList<ArrayList<Integer>> input = new ArrayList<>();
        input.add(new ArrayList<>(List.of(0,1)));
        input.add(new ArrayList<>(List.of(0,2)));
        input.add(new ArrayList<>(List.of(0,4)));
        input.add(new ArrayList<>(List.of(2,3)));
        ArrayList<Integer> actual = BFSTraversalOfAGraph.traversal(6,input);
        print(actual);

        ArrayList<Integer> expected = new ArrayList<>(List.of(0, 1, 2, 4, 3, 5));
        Assert.assertEquals(actual,expected);
    }
}
