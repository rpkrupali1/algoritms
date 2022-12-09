package graphs;

import common.ParentTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class FloodFillTest extends ParentTest {

    @Test
    public void test000_bfs(){
        ArrayList<ArrayList<Integer>> image = new ArrayList<>();
        image.add(new ArrayList<>(List.of(0, 1, 3)));
        image.add(new ArrayList<>(List.of(1, 1, 1)));
        image.add(new ArrayList<>(List.of(1, 5, 4)));
        ArrayList<ArrayList<Integer>> actual = FloodFill.bfs(0,1,2,image);
        printList(actual);
        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>(List.of(0, 2, 3)));
        expected.add(new ArrayList<>(List.of(2, 2, 2)));
        expected.add(new ArrayList<>(List.of(2, 5, 4)));
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void test001_bfs(){
        ArrayList<ArrayList<Integer>> image = new ArrayList<>();
        image.add(new ArrayList<>(List.of(0, 2, 1)));
        image.add(new ArrayList<>(List.of(1, 1, 2)));
        image.add(new ArrayList<>(List.of(2, 5, 4)));
        ArrayList<ArrayList<Integer>> actual = FloodFill.bfs(1,0,9,image);
        printList(actual);
        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>(List.of(0, 2, 1)));
        expected.add(new ArrayList<>(List.of(9, 9, 2)));
        expected.add(new ArrayList<>(List.of(2, 5, 4)));
        Assert.assertEquals(actual,expected);
    }
}
