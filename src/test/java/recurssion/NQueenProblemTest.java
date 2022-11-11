package recurssion;

import common.ParentTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class NQueenProblemTest extends ParentTest {

    @Test
    public void test000(){
        ArrayList<ArrayList<String>> actual = NQueenProblem.recursive(4);
        printList2(actual);
        ArrayList<ArrayList<String>> expected = new ArrayList<>();
        expected.add(new ArrayList<>(Arrays.asList("-q--", "---q", "q---", "--q-")));
        expected.add(new ArrayList<>(Arrays.asList("--q-", "q---", "---q", "-q--")));
        Assert.assertEquals(actual,expected);
    }
}
