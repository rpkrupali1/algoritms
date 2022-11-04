package recurssion;

import common.ParentTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class AllSubsetOfASetTest extends ParentTest {
    @Test
    public void recursive_test000(){
        ArrayList<String> actual = AllSubsetOfASet.recursive("xy");
        printStrings(actual);
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("", "y", "x", "xy"));
        Assert.assertEquals(actual,expected);
    }
}
