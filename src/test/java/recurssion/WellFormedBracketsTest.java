package recurssion;

import common.ParentTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WellFormedBracketsTest extends ParentTest {
    @Test
    public void test000(){
        ArrayList<String> actual = WellFormedBrackets.brackets(1);
        print(actual);
        ArrayList<String> expected = new ArrayList<>(List.of("()"));
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void test001(){
        ArrayList<String> actual = WellFormedBrackets.brackets(2);
        print(actual);
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("(())","()()"));
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void test003(){
        ArrayList<String> actual = WellFormedBrackets.brackets(3);
        print(actual);
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("((()))","(()())","(())()","()(())","()()()"));
        Assert.assertEquals(actual,expected);
    }
}
