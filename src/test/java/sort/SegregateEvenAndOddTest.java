package sort;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SegregateEvenAndOddTest extends ParentTest {

    @Test
    public void test000(){
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,4));
        SegregateEvenAndOdd sort = new SegregateEvenAndOdd();
        ArrayList<Integer> output = sort.sortByEvenAndOdd(input);
        printTest(output);
    }

    @Test
    public void test001(){
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4, 9, 5, 2, 9, 5, 7, 10));
        SegregateEvenAndOdd sort = new SegregateEvenAndOdd();
        ArrayList<Integer> output = sort.sortByEvenAndOdd(input);
        printTest(output);
    }

    @Test
    public void test002(){
        ArrayList<Integer> input = new ArrayList<>(List.of(7));
        SegregateEvenAndOdd sort = new SegregateEvenAndOdd();
        ArrayList<Integer> output = sort.sortByEvenAndOdd(input);
        printTest(output);
    }

    @Test
    public void test003(){
        ArrayList<Integer> input = new ArrayList<>(List.of(90));
        SegregateEvenAndOdd sort = new SegregateEvenAndOdd();
        ArrayList<Integer> output = sort.sortByEvenAndOdd(input);
        printTest(output);
    }

    @Test
    public void test004(){
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,5));
        SegregateEvenAndOdd sort = new SegregateEvenAndOdd();
        ArrayList<Integer> output = sort.sortByEvenAndOdd(input);
        printTest(output);
    }

    @Test
    public void test005(){
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,4));
        SegregateEvenAndOdd sort = new SegregateEvenAndOdd();
        ArrayList<Integer> output = sort.sortByEvenAndOdd(input);
        printTest(output);
    }

    @Test
    public void test006(){
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4,3));
        SegregateEvenAndOdd sort = new SegregateEvenAndOdd();
        ArrayList<Integer> output = sort.sortByEvenAndOdd(input);
        printTest(output);
    }

    @Test
    public void test007(){
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10,90));
        SegregateEvenAndOdd sort = new SegregateEvenAndOdd();
        ArrayList<Integer> output = sort.sortByEvenAndOdd(input);
        printTest(output);
    }

    @Test
    public void test008(){
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,3,5));
        SegregateEvenAndOdd sort = new SegregateEvenAndOdd();
        ArrayList<Integer> output = sort.sortByEvenAndOdd(input);
        printTest(output);
    }

    @Test
    public void test009(){
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,3,4));
        SegregateEvenAndOdd sort = new SegregateEvenAndOdd();
        ArrayList<Integer> output = sort.sortByEvenAndOdd(input);
        printTest(output);
    }

    @Test
    public void test010(){
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,5));
        SegregateEvenAndOdd sort = new SegregateEvenAndOdd();
        ArrayList<Integer> output = sort.sortByEvenAndOdd(input);
        printTest(output);
    }

    @Test
    public void test011(){
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,6,8));
        SegregateEvenAndOdd sort = new SegregateEvenAndOdd();
        ArrayList<Integer> output = sort.sortByEvenAndOdd(input);
        printTest(output);
    }

    @Test
    public void test012(){
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4,7,9));
        SegregateEvenAndOdd sort = new SegregateEvenAndOdd();
        ArrayList<Integer> output = sort.sortByEvenAndOdd(input);
        printTest(output);
    }

    @Test
    public void test013(){
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4,7,8));
        SegregateEvenAndOdd sort = new SegregateEvenAndOdd();
        ArrayList<Integer> output = sort.sortByEvenAndOdd(input);
        printTest(output);
    }

    @Test
    public void test014(){
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4,6,7));
        SegregateEvenAndOdd sort = new SegregateEvenAndOdd();
        ArrayList<Integer> output = sort.sortByEvenAndOdd(input);
        printTest(output);
    }

    @Test
    public void test015(){
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4,6,8));
        SegregateEvenAndOdd sort = new SegregateEvenAndOdd();
        ArrayList<Integer> output = sort.sortByEvenAndOdd(input);
        printTest(output);
    }
}
