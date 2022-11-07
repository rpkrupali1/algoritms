package recurssion;

import common.ParentTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class LetterCasePermulationsTest extends ParentTest {

    @Test
    public void test000(){
        ArrayList<String> actual = LetterCasePermulations.recursion("a1z");
        printStrings(actual);
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("A1Z", "A1z", "a1Z", "a1z"));
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void test001(){
        ArrayList<String> actual = LetterCasePermulations.recursion("123");
        printStrings(actual);
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("123"));
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void test002(){
        ArrayList<String> actual = LetterCasePermulations.recursion("G");
        printStrings(actual);
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("G", "g"));
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void test003(){
        ArrayList<String> actual = LetterCasePermulations.recursion("abcd");
        printStrings(actual);
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("ABCD", "ABCd", "ABcD", "ABcd", "AbCD", "AbCd",
                "AbcD", "Abcd", "aBCD", "aBCd", "aBcD", "aBcd", "abCD", "abCd", "abcD", "abcd"));
        Assert.assertEquals(actual,expected);
    }
}
