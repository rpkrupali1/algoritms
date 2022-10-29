package recurssion;

import org.testng.Assert;
import org.testng.annotations.Test;
import sort.ParentTest;

public class CountAllSubsetTest extends ParentTest {

    @Test
    public void test000(){
        CountAllSubset count = new CountAllSubset();
        int actualOutput = count.recursive(3);
        Assert.assertEquals(actualOutput,8);
    }

    @Test
    public void test001(){
        CountAllSubset count = new CountAllSubset();
        int actualOutput = count.recursive(20);
        Assert.assertEquals(actualOutput,1048576);
    }

    @Test
    public void test003(){
        CountAllSubset count = new CountAllSubset();
        int actualOutput = count.recursive(0);
        Assert.assertEquals(actualOutput,1);
    }

}
