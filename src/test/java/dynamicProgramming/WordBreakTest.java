package dynamicProgramming;

import common.ParentTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class WordBreakTest extends ParentTest {

    @Test
    public void test000(){
        ArrayList<String> input = new ArrayList<>(List.of("world", "hello", "faang"));
        Boolean actual = WordBreak.bottom_up("helloworldhello",input);
        Assert.assertTrue(actual);
    }

    @Test
    public void test001(){
        ArrayList<String> input = new ArrayList<>(List.of("interview", "preparation"));
        Boolean actual = WordBreak.bottom_up("interviewkickstart",input);
        Assert.assertFalse(actual);
    }
}
