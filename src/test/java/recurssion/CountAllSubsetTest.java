package recurssion;

import org.testng.Assert;
import org.testng.annotations.Test;
import sort.ParentTest;

public class CountAllSubsetTest extends ParentTest {

    @Test
    public void recursive_test000(){
        CountAllSubset count = new CountAllSubset();
        int actualOutput = count.recursive(3);
        Assert.assertEquals(actualOutput,8);
    }

    @Test
    public void recursive_test001(){
        CountAllSubset count = new CountAllSubset();
        int actualOutput = count.recursive(20);
        Assert.assertEquals(actualOutput,1048576);
    }

    @Test
    public void recursive_test003(){
        CountAllSubset count = new CountAllSubset();
        int actualOutput = count.recursive(0);
        Assert.assertEquals(actualOutput,1);
    }

    @Test
    public void iterative_test000(){
        CountAllSubset count = new CountAllSubset();
        int actualOutput = count.iterative(3);
        Assert.assertEquals(actualOutput,8);
    }

    @Test
    public void iterative_test001(){
        CountAllSubset count = new CountAllSubset();
        int actualOutput = count.iterative(20);
        Assert.assertEquals(actualOutput,1048576);
    }

}
