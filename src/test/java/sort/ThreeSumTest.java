package sort;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class ThreeSumTest {

    @Test
    public void test_bruteForce_000(){
        ThreeSum threeSum = new ThreeSum();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10, 3, -4, 1, -6, 9));
        ArrayList<String> actualResult = threeSum.find_zero_sum_bruteForce(input);
        ArrayList<String> exepectedResult = new ArrayList<>(Arrays.asList("10,-4,-6", "3,-4,1"));
        Assert.assertEquals(actualResult,exepectedResult);
    }

    @Test
    public void test_bruteForce_001(){
        ThreeSum threeSum = new ThreeSum();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(22, -71, -32, 26, -80, -1, -24, 45, 53, 20, -20, 26, 25, -13, -11, 45, 27, 50, -21, 49, -55, -33, -40, 28, 21, -68, -4, 16, 35, -3, -44, -16, -48, -8, -80, -42, -66, 61, -51, -20, 2, 65, -5, -7, 22, -6, 12, -49, 13, -80, 49, 39, -9, 3, 41, 25, 0, -25, -16, -33, 21, 13, -17, 40, 43, -15, -29, 24, -1, -34, -41, -28, -14, 34, -9, -78, 0, -7, -31, 9, 44, 47, -17, -29, 40, -57, -20, -38, -21, -13, -4, -28, 11));
        ArrayList<String> actualResult = threeSum.find_zero_sum_bruteForce(input);
        System.out.println(actualResult);
        ArrayList<String> expectedResult = new ArrayList<>(Arrays.asList("-1,-1,2", "-11,-1,12", "-11,-5,16", "-11,-9,20", "-11,0,11", "-11,2,9", "-13,-11,24", "-13,-13,26", "-13,-3,16", "-13,-7,20", "-13,-8,21", "-13,-9,22", "-13,0,13", "-13,2,11", "-14,-11,25", "-14,-13,27", "-14,-6,20", "-14,-7,21", "-14,-8,22", "-14,2,12", "-14,3,11", "-15,-1,16", "-15,-11,26", "-15,-13,28", "-15,-5,20", "-15,-6,21", "-15,-7,22", "-15,-9,24", "-15,2,13", "-15,3,12", "-16,-11,27", "-16,-4,20", "-16,-5,21", "-16,-6,22", "-16,-8,24", "-16,-9,25", "-16,0,16", "-16,3,13", "-17,-11,28", "-17,-17,34", "-17,-3,20", "-17,-4,21", "-17,-5,22", "-17,-7,24", "-17,-8,25", "-17,-9,26", "-20,-1,21", "-20,-14,34", "-20,-15,35", "-20,-20,40", "-20,-4,24", "-20,-5,25", "-20,-6,26", "-20,-7,27", "-20,-8,28", "-20,0,20", "-20,9,11", "-21,-1,22", "-21,-13,34", "-21,-14,35", "-21,-20,41", "-21,-3,24", "-21,-4,25", "-21,-5,26", "-21,-6,27", "-21,-7,28", "-21,0,21", "-21,9,12", "-24,-1,25", "-24,-11,35", "-24,-15,39", "-24,-16,40", "-24,-17,41", "-24,-20,44", "-24,-21,45", "-24,-3,27", "-24,-4,28", "-24,0,24", "-24,11,13", "-24,2,22", "-24,3,21", "-25,-1,26", "-25,-14,39", "-25,-15,40", "-25,-16,41", "-25,-20,45", "-25,-24,49", "-25,-3,28", "-25,-9,34", "-25,0,25", "-25,12,13", "-25,3,22", "-25,9,16", "-28,-11,39", "-28,-13,41", "-28,-15,43", "-28,-16,44", "-28,-17,45", "-28,-21,49", "-28,-25,53", "-28,-6,34", "-28,-7,35", "-28,0,28", "-28,12,16", "-28,2,26", "-28,3,25", "-29,-11,40", "-29,-14,43", "-29,-15,44", "-29,-16,45", "-29,-20,49", "-29,-21,50", "-29,-24,53", "-29,-5,34", "-29,-6,35", "-29,13,16", "-29,2,27", "-29,3,26", "-29,9,20", "-3,0,3", "-31,-13,44", "-31,-14,45", "-31,-16,47", "-31,-3,34", "-31,-4,35", "-31,-8,39", "-31,-9,40", "-31,11,20", "-31,3,28", "-31,9,22", "-32,-11,43", "-32,-13,45", "-32,-15,47", "-32,-17,49", "-32,-21,53", "-32,-29,61", "-32,-3,35", "-32,-7,39", "-32,-8,40", "-32,-9,41", "-32,11,21", "-32,12,20", "-33,-1,34", "-33,-11,44", "-33,-14,47", "-33,-16,49", "-33,-17,50", "-33,-20,53", "-33,-28,61", "-33,-32,65", "-33,-6,39", "-33,-7,40", "-33,-8,41", "-33,11,22", "-33,12,21", "-33,13,20", "-33,9,24", "-34,-1,35", "-34,-11,45", "-34,-13,47", "-34,-15,49", "-34,-16,50", "-34,-31,65", "-34,-5,39", "-34,-6,40", "-34,-7,41", "-34,-9,43", "-34,0,34", "-34,12,22", "-34,13,21", "-34,9,25", "-38,-1,39", "-38,-11,49", "-38,-15,53", "-38,-3,41", "-38,-5,43", "-38,-6,44", "-38,-7,45", "-38,-9,47", "-38,11,27", "-38,12,26", "-38,13,25", "-38,16,22", "-38,3,35", "-40,-1,41", "-40,-13,53", "-40,-21,61", "-40,-25,65", "-40,-3,43", "-40,-4,44", "-40,-5,45", "-40,-7,47", "-40,-9,49", "-40,0,40", "-40,12,28", "-40,13,27", "-40,16,24", "-41,-20,61", "-41,-24,65", "-41,-3,44", "-41,-4,45", "-41,-6,47", "-41,-8,49", "-41,-9,50", "-41,0,41", "-41,13,28", "-41,16,25", "-41,2,39", "-41,20,21", "-42,-1,43", "-42,-11,53", "-42,-3,45", "-42,-5,47", "-42,-7,49", "-42,-8,50", "-42,16,26", "-42,2,40", "-42,20,22", "-42,21,21", "-42,3,39", "-44,-1,45", "-44,-17,61", "-44,-21,65", "-44,-3,47", "-44,-5,49", "-44,-6,50", "-44,-9,53", "-44,0,44", "-44,16,28", "-44,20,24", "-44,22,22", "-44,3,41", "-44,9,35", "-48,-1,49", "-48,-13,61", "-48,-17,65", "-48,-5,53", "-48,13,35", "-48,20,28", "-48,21,27", "-48,22,26", "-48,3,45", "-48,9,39", "-49,-1,50", "-49,-16,65", "-49,-4,53", "-49,0,49", "-49,2,47", "-49,21,28", "-49,22,27", "-49,24,25", "-49,9,40", "-5,-4,9", "-5,2,3", "-51,-14,65", "-51,11,40", "-51,12,39", "-51,16,35", "-51,2,49", "-51,24,27", "-51,25,26", "-55,-6,61", "-55,11,44", "-55,12,43", "-55,16,39", "-55,2,53", "-55,20,35", "-55,21,34", "-55,27,28", "-57,-4,61", "-57,-8,65", "-57,12,45", "-57,13,44", "-57,16,41", "-57,22,35", "-6,-3,9", "-6,-5,11", "-66,13,53", "-66,16,50", "-66,21,45", "-66,22,44", "-66,25,41", "-66,26,40", "-66,27,39", "-68,21,47", "-68,24,44", "-68,25,43", "-68,27,41", "-68,28,40", "-68,3,65", "-7,-4,11", "-7,-5,12", "-7,-6,13", "-71,21,50", "-71,22,49", "-71,24,47", "-71,26,45", "-71,27,44", "-71,28,43", "-78,13,65", "-78,25,53", "-78,28,50", "-78,34,44", "-78,35,43", "-8,-1,9", "-8,-3,11", "-8,-4,12", "-8,-5,13", "-80,27,53", "-80,35,45", "-80,39,41", "-80,40,40", "-9,-3,12", "-9,-4,13", "-9,-7,16", "-9,0,9"));
        System.out.println(expectedResult);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void test_optimal_000(){
        ThreeSum threeSum = new ThreeSum();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10, 3, -4, 1, -6, 9));
        ArrayList<String> actualResult = threeSum.find_zero_sum_optimalSolution(input);
        System.out.println(actualResult);
        ArrayList<String> exepectedResult = new ArrayList<>(Arrays.asList("-4,1,3", "-6,-4,10"));
        Assert.assertEquals(actualResult,exepectedResult);
    }

    @Test
    public void test_optimal_001(){
        ThreeSum threeSum = new ThreeSum();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(12, 34, -46));
        ArrayList<String> actualResult = threeSum.find_zero_sum_optimalSolution(input);
        System.out.println(actualResult);
        ArrayList<String> exepectedResult = new ArrayList<>(Arrays.asList("-46,12,34"));
        Assert.assertEquals(actualResult,exepectedResult);
    }

    @Test
    public void test_optimal_002(){
        ThreeSum threeSum = new ThreeSum();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,0,0));
        ArrayList<String> actualResult = threeSum.find_zero_sum_optimalSolution(input);
        System.out.println(actualResult);
        ArrayList<String> exepectedResult = new ArrayList<>(Arrays.asList("0,0,0"));
        Assert.assertEquals(actualResult,exepectedResult);
    }

    @Test
    public void test_optimal_003(){
        ThreeSum threeSum = new ThreeSum();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-2, 2, 0, -1, 1));
        ArrayList<String> actualResult = threeSum.find_zero_sum_optimalSolution(input);
        System.out.println(actualResult);
        ArrayList<String> exepectedResult = new ArrayList<>(Arrays.asList("-2,0,2", "-1,0,1"));
        Assert.assertEquals(actualResult,exepectedResult);
    }

    @Test
    public void test_optimal_004(){
        ThreeSum threeSum = new ThreeSum();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        ArrayList<String> actualResult = threeSum.find_zero_sum_optimalSolution(input);
        System.out.println(actualResult);
        ArrayList<String> exepectedResult = new ArrayList<>();
        Assert.assertEquals(actualResult,exepectedResult);
    }

    @Test
    public void test_optimal_005(){
        ThreeSum threeSum = new ThreeSum();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-7, -5, -3, -99, -245));
        ArrayList<String> actualResult = threeSum.find_zero_sum_optimalSolution(input);
        System.out.println(actualResult);
        ArrayList<String> exepectedResult = new ArrayList<>();
        Assert.assertEquals(actualResult,exepectedResult);
    }

    @Test
    public void test_optimal_006(){
        ThreeSum threeSum = new ThreeSum();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0, 0));
        ArrayList<String> actualResult = threeSum.find_zero_sum_optimalSolution(input);
        System.out.println(actualResult);
        ArrayList<String> exepectedResult = new ArrayList<>(Arrays.asList("0,0,0"));
        Assert.assertEquals(actualResult,exepectedResult);
    }

    @Test
    public void test_optimal_007(){
        ThreeSum threeSum = new ThreeSum();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-1, -1, 0, 0, 1, 1));
        ArrayList<String> actualResult = threeSum.find_zero_sum_optimalSolution(input);
        System.out.println(actualResult);
        ArrayList<String> exepectedResult = new ArrayList<>(Arrays.asList("-1,0,1"));
        Assert.assertEquals(actualResult,exepectedResult);
    }

    @Test
    public void test_optimal_008(){
        ThreeSum threeSum = new ThreeSum();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-600, 1000, -400, 239, -29));
        ArrayList<String> actualResult = threeSum.find_zero_sum_optimalSolution(input);
        System.out.println(actualResult);
        ArrayList<String> exepectedResult = new ArrayList<>(Arrays.asList("-600,-400,1000"));
        Assert.assertEquals(actualResult,exepectedResult);
    }

}
