package recurssion;

import common.ParentTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllPossibleExpressionToTargetTest extends ParentTest {

    @Test
    public void test000(){
        ArrayList<String> actual = AllPossibleExpressionToTarget.generate_all_expressions("202",4);
        printStrings(actual);
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("2+0+2", "2*02", "2+02"));
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void test001(){
        ArrayList<String> actual = AllPossibleExpressionToTarget.generate_all_expressions("1234",11);
        printStrings(actual);
        ArrayList<String> expected = new ArrayList<>(List.of("1+2*3+4"));
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void test002(){
        ArrayList<String> actual = AllPossibleExpressionToTarget.generate_all_expressions("99",1);
        printStrings(actual);
        ArrayList<String> expected = new ArrayList<>();
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void test003(){
        ArrayList<String> actual = AllPossibleExpressionToTarget.generate_all_expressions("0",0);
        printStrings(actual);
        ArrayList<String> expected = new ArrayList<>(List.of("0"));
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void test006(){
        ArrayList<String> actual = AllPossibleExpressionToTarget.generate_all_expressions("22",4);
        printStrings(actual);
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("2*2", "2+2"));
        Assert.assertEquals(actual,expected);
    }
}
