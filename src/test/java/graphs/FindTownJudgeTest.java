package graphs;

import common.ParentTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class FindTownJudgeTest extends ParentTest {

    @Test
    public void test000(){
        ArrayList<ArrayList<Integer>> input = new ArrayList<>();
        input.add(new ArrayList<>(List.of(1,4)));
        input.add(new ArrayList<>(List.of(2,4)));
        input.add(new ArrayList<>(List.of(3,4)));
        int actual = FindTownJudge.bfs(4,input);
        Assert.assertEquals(actual,4);
    }

    @Test
    public void test001(){
        ArrayList<ArrayList<Integer>> input = new ArrayList<>();
        input.add(new ArrayList<>(List.of(1,2)));
        input.add(new ArrayList<>(List.of(2,3)));
        input.add(new ArrayList<>(List.of(3,1)));
        input.add(new ArrayList<>(List.of(3,2)));
        int actual = FindTownJudge.bfs(4,input);
        Assert.assertEquals(actual,-1);
    }

}
