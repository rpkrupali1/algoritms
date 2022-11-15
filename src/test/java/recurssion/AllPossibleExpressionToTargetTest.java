package recurssion;

import common.ParentTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class AllPossibleExpressionToTargetTest extends ParentTest {

    @Test
    public void test000(){
        ArrayList<String> actual = AllPossibleExpressionToTarget.generate_all_expressions("202",4);
        printStrings(actual);
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("2+0+2", "2*02", "2+02"));
        Assert.assertEquals(actual,expected);
    }
}
