package recurssion;

import common.ParentTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class PalindromicDecompositionTest extends ParentTest {

    @Test
    public void test000(){
        ArrayList<String> actual = PalindromicDecomposition.recursive("abracadabra");
        //printStrings(actual);
        print(actual);
        ArrayList<String> expected = new ArrayList<>(Arrays.asList(
                "a|b|r|aca|d|a|b|r|a", "a|b|r|a|c|ada|b|r|a","a|b|r|a|c|a|d|a|b|r|a"
        ));
        Assert.assertEquals(actual,expected);
    }
}
