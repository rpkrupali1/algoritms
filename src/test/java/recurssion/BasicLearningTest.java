package recurssion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicLearningTest {

    @Test
    public void basicPrint_test000(){
        BasicLearning.basicPrint(10);
    }
    @Test
    public void basicPrint_test001(){
        BasicLearning.basicPrint(20);
    }

    @Test
    public void basicPrint_headRecursion_test000(){
        BasicLearning.basicPrint_recursionHead(10);
    }
    @Test
    public void basicPrint_headRecursion_test001(){
        BasicLearning.basicPrint_recursionHead(20);
    }


    @Test
    public void sumOf1toN_test000(){
        int actual = BasicLearning.sumOf1toN(4);
        int expected = 10;
        Assert.assertEquals(actual,expected);
    }
}
