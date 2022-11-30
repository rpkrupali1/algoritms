package graphs;

import common.ParentTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ConvertEdgeListToAdjacencyListTest extends ParentTest {

    @Test
    public void test000(){
        ArrayList<ArrayList<Integer>> input = new ArrayList<>();
        input.add(new ArrayList<>(List.of(0,1)));
        input.add(new ArrayList<>(List.of(1,4)));
        input.add(new ArrayList<>(List.of(1,2)));
        input.add(new ArrayList<>(List.of(1,3)));
        input.add(new ArrayList<>(List.of(3,4)));
        ArrayList<ArrayList<Integer>> actual = ConvertEdgeListToAdjacencyList.getAList(5,input);
        printList(actual);

        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>(List.of(1)));
        expected.add(new ArrayList<>(List.of(0, 2, 3, 4)));
        expected.add(new ArrayList<>(List.of(1)));
        expected.add(new ArrayList<>(List.of(1,4)));
        expected.add(new ArrayList<>(List.of(1,3)));

        Assert.assertEquals(actual,expected);

    }
}
