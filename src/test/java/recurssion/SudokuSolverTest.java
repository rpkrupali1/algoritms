package recurssion;

import common.ParentTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class SudokuSolverTest extends ParentTest {
    @Test
    public void test000(){
        ArrayList<ArrayList<Integer>> input = new ArrayList<>();
        input.add(new ArrayList<>(Arrays.asList(8, 4, 9, 0, 0, 3, 5, 7, 0)));
        input.add(new ArrayList<>(Arrays.asList(0, 1, 0, 0, 0, 0, 0, 0, 0)));
        input.add(new ArrayList<>(Arrays.asList(7, 0, 0, 0, 9, 0, 0, 8, 3)));
        input.add(new ArrayList<>(Arrays.asList(0, 0, 0, 9, 4, 6, 7, 0, 0)));
        input.add(new ArrayList<>(Arrays.asList(0, 8, 0, 0, 5, 0, 0, 4, 0)));
        input.add(new ArrayList<>(Arrays.asList(0, 0, 6, 8, 7, 2, 0, 0, 0)));
        input.add(new ArrayList<>(Arrays.asList(5, 7, 0, 0, 1, 0, 0, 0, 4)));
        input.add(new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 1, 0)));
        input.add(new ArrayList<>(Arrays.asList(0, 2, 1, 7, 0, 0, 8, 6, 5)));

        ArrayList<ArrayList<Integer>> actual = SudokuSolver.solve_sudoku_puzzle(input);
        printList(actual);

        ArrayList<ArrayList<Integer>> output = new ArrayList<>();
        output.add(new ArrayList<>(Arrays.asList(8, 4, 9, 1, 6, 3, 5, 7, 2)));
        output.add(new ArrayList<>(Arrays.asList(3, 1, 5, 2, 8, 7, 4, 9, 6)));
        output.add(new ArrayList<>(Arrays.asList(7, 6, 2, 4, 9, 5, 1, 8, 3)));
        output.add(new ArrayList<>(Arrays.asList(1, 5, 3, 9, 4, 6, 7, 2, 8)));
        output.add(new ArrayList<>(Arrays.asList(2, 8, 7, 3, 5, 1, 6, 4, 9)));
        output.add(new ArrayList<>(Arrays.asList(4, 9, 6, 8, 7, 2, 3, 5, 1)));
        output.add(new ArrayList<>(Arrays.asList(5, 7, 8, 6, 1, 9, 2, 3, 4)));
        output.add(new ArrayList<>(Arrays.asList(6, 3, 4, 5, 2, 8, 9, 1, 7)));
        output.add(new ArrayList<>(Arrays.asList(9, 2, 1, 7, 3, 4, 8, 6, 5)));

        Assert.assertEquals(actual,output);
    }
}
