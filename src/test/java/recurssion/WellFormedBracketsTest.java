package recurssion;

import common.ParentTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class WellFormedBracketsTest extends ParentTest {
    @Test
    public void test000(){
        ArrayList<String> actual = WellFormedBrackets.brackets(1);
        //printStrings(actual);
        print(actual);
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("()"));
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void test001(){
        ArrayList<String> actual = WellFormedBrackets.brackets(2);
        //printStrings(actual);
        print(actual);
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("(())","()()"));
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void test003(){
        ArrayList<String> actual = WellFormedBrackets.brackets(3);
        //printStrings(actual);
        print(actual);
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("((()))","(()())","(())()","()(())","()()()"));
        Assert.assertEquals(actual,expected);
    }
}
