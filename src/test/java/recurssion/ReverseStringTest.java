package recurssion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReverseStringTest {
    @Test
    public void test000(){
        String actual= ReverseString.recursive_approach("krupali");
        Assert.assertEquals(actual,"ilapurk");
        actual = "krupali";
        System.out.println(actual.substring(1));
        System.out.println(actual.charAt(0));
    }

    @Test
    public void test001(){
        String actual= ReverseString.recursive_approach2("krupali");
        Assert.assertEquals(actual,"ilapurk");
    }
}
