package recurssion;

import common.ParentTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LetterCasePermulationsTest extends ParentTest {

    @Test
    public void test000(){
        ArrayList<String> actual = LetterCasePermulations.recursion("a1z");
        print(actual);
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("A1Z", "A1z", "a1Z", "a1z"));
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void test001(){
        ArrayList<String> actual = LetterCasePermulations.recursion("123");
        print(actual);
        ArrayList<String> expected = new ArrayList<>(List.of("123"));
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void test002(){
        ArrayList<String> actual = LetterCasePermulations.recursion("G");
        print(actual);
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("G", "g"));
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void test003(){
        ArrayList<String> actual = LetterCasePermulations.recursion("abcd");
        print(actual);
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("ABCD", "ABCd", "ABcD", "ABcd", "AbCD", "AbCd",
                "AbcD", "Abcd", "aBCD", "aBCd", "aBcD", "aBcd", "abCD", "abCd", "abcD", "abcd"));
        Assert.assertEquals(actual,expected);
    }
}
