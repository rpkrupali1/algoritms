package recurssion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DigitsToWordsTest {
    @Test
    public void test000(){
        String output = DigitsToWords.recursive(349);
        String expected = "three four nine";
        Assert.assertEquals(output,expected);
    }
}
