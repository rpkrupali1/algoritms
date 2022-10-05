package sort;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DutchNationalFlagTest {

    public void printTest(ArrayList<Character> arr){
        for (Character character : arr) {
            System.out.print(character + ' ');
        }
    }

    @Test
    public void test000(){
        ArrayList<Character> input = new ArrayList<>(Arrays.asList('G', 'B', 'G', 'G', 'R', 'B', 'R', 'G'));
        DutchNationalFlag sort = new DutchNationalFlag();
        ArrayList<Character> output = sort.dutchNationalFlag(input);
        printTest(output);
    }
    @Test
    public void test001(){
        ArrayList<Character> input = new ArrayList<>(Arrays.asList('G', 'G', 'B', 'B', 'R', 'R'));
        DutchNationalFlag sort = new DutchNationalFlag();
        ArrayList<Character> output = sort.dutchNationalFlag(input);
        printTest(output);
    }

    @Test
    public void test002(){
        ArrayList<Character> input = new ArrayList<>(List.of('R'));
        DutchNationalFlag sort = new DutchNationalFlag();
        ArrayList<Character> output = sort.dutchNationalFlag(input);
        printTest(output);
    }

    @Test
    public void test003(){
        ArrayList<Character> input = new ArrayList<>(List.of('G'));
        DutchNationalFlag sort = new DutchNationalFlag();
        ArrayList<Character> output = sort.dutchNationalFlag(input);
        printTest(output);
    }

    @Test
    public void test004(){
        ArrayList<Character> input = new ArrayList<>(List.of('B'));
        DutchNationalFlag sort = new DutchNationalFlag();
        ArrayList<Character> output = sort.dutchNationalFlag(input);
        printTest(output);
    }

    @Test
    public void test005(){
        ArrayList<Character> input = new ArrayList<>(List.of('R','R'));
        DutchNationalFlag sort = new DutchNationalFlag();
        ArrayList<Character> output = sort.dutchNationalFlag(input);
        printTest(output);
    }

    @Test
    public void test006(){
        ArrayList<Character> input = new ArrayList<>(List.of('R','G'));
        DutchNationalFlag sort = new DutchNationalFlag();
        ArrayList<Character> output = sort.dutchNationalFlag(input);
        printTest(output);
    }

    @Test
    public void test007(){
        ArrayList<Character> input = new ArrayList<>(List.of('R','B'));
        DutchNationalFlag sort = new DutchNationalFlag();
        ArrayList<Character> output = sort.dutchNationalFlag(input);
        printTest(output);
    }

    @Test
    public void test008(){
        ArrayList<Character> input = new ArrayList<>(List.of('G','R'));
        DutchNationalFlag sort = new DutchNationalFlag();
        ArrayList<Character> output = sort.dutchNationalFlag(input);
        printTest(output);
    }

    @Test
    public void test009(){
        ArrayList<Character> input = new ArrayList<>(List.of('G','G'));
        DutchNationalFlag sort = new DutchNationalFlag();
        ArrayList<Character> output = sort.dutchNationalFlag(input);
        printTest(output);
    }

    @Test
    public void test0010(){
        ArrayList<Character> input = new ArrayList<>(List.of('G','B'));
        DutchNationalFlag sort = new DutchNationalFlag();
        ArrayList<Character> output = sort.dutchNationalFlag(input);
        printTest(output);
    }

    @Test
    public void test011(){
        ArrayList<Character> input = new ArrayList<>(List.of('R','B'));
        DutchNationalFlag sort = new DutchNationalFlag();
        ArrayList<Character> output = sort.dutchNationalFlag(input);
        printTest(output);
    }

    @Test
    public void test012(){
        ArrayList<Character> input = new ArrayList<>(List.of('G','B'));
        DutchNationalFlag sort = new DutchNationalFlag();
        ArrayList<Character> output = sort.dutchNationalFlag(input);
        printTest(output);
    }

    @Test
    public void test013(){
        ArrayList<Character> input = new ArrayList<>(List.of('B','B'));
        DutchNationalFlag sort = new DutchNationalFlag();
        ArrayList<Character> output = sort.dutchNationalFlag(input);
        printTest(output);
    }

    @Test
    public void test014(){
        ArrayList<Character> input = new ArrayList<>(Arrays.asList('R','G','B'));
        DutchNationalFlag sort = new DutchNationalFlag();
        ArrayList<Character> output = sort.dutchNationalFlag(input);
        printTest(output);
    }

    @Test
    public void test015(){
        ArrayList<Character> input = new ArrayList<>(Arrays.asList('R','B','G'));
        DutchNationalFlag sort = new DutchNationalFlag();
        ArrayList<Character> output = sort.dutchNationalFlag(input);
        printTest(output);
    }

    @Test
    public void test016(){
        ArrayList<Character> input = new ArrayList<>(Arrays.asList('G', 'R', 'B'));
        DutchNationalFlag sort = new DutchNationalFlag();
        ArrayList<Character> output = sort.dutchNationalFlag(input);
        printTest(output);
    }

    @Test
    public void test017(){
        ArrayList<Character> input = new ArrayList<>(Arrays.asList('G', 'B', 'R'));
        DutchNationalFlag sort = new DutchNationalFlag();
        ArrayList<Character> output = sort.dutchNationalFlag(input);
        printTest(output);
    }

    @Test
    public void test018(){
        ArrayList<Character> input = new ArrayList<>(Arrays.asList('B', 'R', 'G'));
        DutchNationalFlag sort = new DutchNationalFlag();
        ArrayList<Character> output = sort.dutchNationalFlag(input);
        printTest(output);
    }

    @Test
    public void test019(){
        ArrayList<Character> input = new ArrayList<>(Arrays.asList('B', 'G', 'R'));
        DutchNationalFlag sort = new DutchNationalFlag();
        ArrayList<Character> output = sort.dutchNationalFlag(input);
        printTest(output);
    }

    @Test
    public void test020(){
        ArrayList<Character> input = new ArrayList<>(Arrays.asList('G', 'G', 'G'));
        DutchNationalFlag sort = new DutchNationalFlag();
        ArrayList<Character> output = sort.dutchNationalFlag(input);
        printTest(output);
    }

    @Test
    public void test021(){
        ArrayList<Character> input = new ArrayList<>(Arrays.asList('R', 'R', 'G', 'B', 'B', 'B', 'B', 'R', 'G', 'G', 'G', 'G'));
        DutchNationalFlag sort = new DutchNationalFlag();
        ArrayList<Character> output = sort.dutchNationalFlag(input);
        printTest(output);
    }
}
