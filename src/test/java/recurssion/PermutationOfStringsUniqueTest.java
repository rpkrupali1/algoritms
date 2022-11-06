package recurssion;

import common.ParentTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class PermutationOfStringsUniqueTest extends ParentTest {

    @Test
    public void test000(){
        ArrayList<String> actual = PermutationOfStringsUnique.recursive("xyz");
        printStrings(actual);
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("xyz", "xzy","yxz","yzx","zyx","zxy"));
        Assert.assertEquals(actual,expected);
    }
}
