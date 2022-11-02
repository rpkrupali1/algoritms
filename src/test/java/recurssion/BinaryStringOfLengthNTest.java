package recurssion;


import common.ParentTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class BinaryStringOfLengthNTest extends ParentTest {

    @Test
    public void recursive_test000(){
        ArrayList<String> actual = BinaryStringOfLengthN.recursive(3);
        printStrings(actual);
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("000", "001", "010", "011", "100", "101", "110", "111"));
        Assert.assertEquals(actual,expected);
    }
}
