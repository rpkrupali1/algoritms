package graphs;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class IsItItreeUndirectGraphTest {

    @Test
    public void test000_bfs(){
        ArrayList<Integer> edge_start = new ArrayList<>(List.of(0,0,0));
        ArrayList<Integer> edge_end = new ArrayList<>(List.of(1,2,3));
        boolean actual = IsItItreeUndirectGraph.bfs(4,edge_start,edge_end);
        Assert.assertTrue(actual);
    }

    @Test
    public void test001_bfs(){
        ArrayList<Integer> edge_start = new ArrayList<>(List.of(0,0));
        ArrayList<Integer> edge_end = new ArrayList<>(List.of(1,2));
        boolean actual = IsItItreeUndirectGraph.bfs(4,edge_start,edge_end);
        Assert.assertFalse(actual);
    }

    @Test
    public void test002_bfs(){
        ArrayList<Integer> edge_start = new ArrayList<>(List.of(0,0,1,2));
        ArrayList<Integer> edge_end = new ArrayList<>(List.of(3,1,2,0));
        boolean actual = IsItItreeUndirectGraph.bfs(4,edge_start,edge_end);
        Assert.assertFalse(actual);
    }

    @Test
    public void test003_bfs(){
        ArrayList<Integer> edge_start = new ArrayList<>(List.of(0,0,0,1));
        ArrayList<Integer> edge_end = new ArrayList<>(List.of(1,2,3,0));
        boolean actual = IsItItreeUndirectGraph.bfs(4,edge_start,edge_end);
        Assert.assertFalse(actual);
    }
}
