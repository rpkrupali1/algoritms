package recurssion;

import common.ParentTest;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class GenerateParenthesesTest extends ParentTest {

    @Test
    public void test000(){
        ArrayList<String > actual = GenerateParentheses.recursive(2);
        printStrings(actual);
    }
    @Test
    public void test001(){
        ArrayList<String > actual = GenerateParentheses.recursive(3);
        printStrings(actual);
    }
}
