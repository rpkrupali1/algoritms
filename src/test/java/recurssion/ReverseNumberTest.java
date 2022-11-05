package recurssion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReverseNumberTest {

    @Test
    public void test000(){
        int actual = ReverseNumber.recursive(456);
        Assert.assertEquals(actual,654);
    }

    @Test
    public void test001(){
        int actual = ReverseNumber.recursive(43556);
        Assert.assertEquals(actual,65534);
    }


}
