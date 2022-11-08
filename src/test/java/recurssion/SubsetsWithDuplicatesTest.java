package recurssion;

import common.ParentTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class SubsetsWithDuplicatesTest extends ParentTest {

    @Test
    public void test000(){
        ArrayList<String> actual = SubsetsWithDuplicates.recursive_approach("aab");
        printStrings(actual);
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("aa", "", "ab", "a", "b", "aab"));
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void test001(){
        ArrayList<String> actual = SubsetsWithDuplicates.recursive_approach("dc");
        printStrings(actual);
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("", "cd", "c", "d"));
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void test002(){
        ArrayList<String> actual = SubsetsWithDuplicates.recursive_approach("fdsf");
        printStrings(actual);
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("dffs", "ff", "", "df", "d", "dff", "f", "fs", "ds", "dfs", "ffs", "s"));
        Assert.assertEquals(actual,expected);
    }
}
