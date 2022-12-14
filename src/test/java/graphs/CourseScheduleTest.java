package graphs;

import common.ParentTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class CourseScheduleTest extends ParentTest {

    @Test
    public void test000(){
        ArrayList<ArrayList<Integer>> input = new ArrayList<>();
        input.add(new ArrayList<>(List.of(1,0)));
        input.add(new ArrayList<>(List.of(2,0)));
        input.add(new ArrayList<>(List.of(3,1)));
        input.add(new ArrayList<>(List.of(3,2)));
        ArrayList<Integer> actual = CourseSchedule.bfs(4,input);
        print(actual);
        ArrayList<ArrayList<Integer>> output = new ArrayList<>();
        output.add(new ArrayList<>(List.of(0, 2, 1, 3)));
        output.add(new ArrayList<>(List.of(0, 1, 2, 3)));
        boolean expected = output.contains(actual);
        Assert.assertTrue(expected);
    }

    @Test
    public void test001(){
        ArrayList<ArrayList<Integer>> input = new ArrayList<>();
        input.add(new ArrayList<>(List.of(1,0)));
        ArrayList<Integer> actual = CourseSchedule.bfs(2,input);
        print(actual);
        ArrayList<ArrayList<Integer>> output = new ArrayList<>();
        output.add(new ArrayList<>(List.of(0, 1)));
        boolean expected = output.contains(actual);
        Assert.assertTrue(expected);
    }

    @Test
    public void test003(){
        ArrayList<ArrayList<Integer>> input = new ArrayList<>();
        ArrayList<Integer> actual = CourseSchedule.bfs(2,input);
        print(actual);
        ArrayList<ArrayList<Integer>> output = new ArrayList<>();
        output.add(new ArrayList<>(List.of(0, 1)));
        output.add(new ArrayList<>(List.of(1, 0)));
        boolean expected = output.contains(actual);
        Assert.assertTrue(expected);
    }

    @Test
    public void test004(){
        ArrayList<ArrayList<Integer>> input = new ArrayList<>();
        input.add(new ArrayList<>(List.of(0,1)));
        input.add(new ArrayList<>(List.of(1,0)));
        ArrayList<Integer> actual = CourseSchedule.bfs(2,input);
        print(actual);
        ArrayList<ArrayList<Integer>> output = new ArrayList<>();
        output.add(new ArrayList<>(List.of(-1)));
        boolean expected = output.contains(actual);
        Assert.assertTrue(expected);
    }

    @Test
    public void test006(){
        ArrayList<ArrayList<Integer>> input = new ArrayList<>();
        input.add(new ArrayList<>(List.of(0,1)));
        ArrayList<Integer> actual = CourseSchedule.bfs(3,input);
        print(actual);
        ArrayList<ArrayList<Integer>> output = new ArrayList<>();
        output.add(new ArrayList<>(List.of(2, 1,0)));
        output.add(new ArrayList<>(List.of(1, 0,2)));
        boolean expected = output.contains(actual);
        Assert.assertTrue(expected);
    }
}
