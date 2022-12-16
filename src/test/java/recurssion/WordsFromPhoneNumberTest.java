package recurssion;

import common.ParentTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class WordsFromPhoneNumberTest extends ParentTest {

    @Test
    public void test000(){
        ArrayList<String> actual = WordsFromPhoneNumber.recursion("23");
        //printStrings(actual);
        print(actual);
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("ad", "ae","af","bd","be","bf","cd","ce","cf"));
        Assert.assertEquals(actual,expected);
    }


    @Test
    public void test001(){
        ArrayList<String> actual = WordsFromPhoneNumber.recursion("01");
        //printStrings(actual);
        print(actual);
        ArrayList<String> expected = new ArrayList<>(Arrays.asList(""));
        Assert.assertEquals(actual,expected);
    }
}
