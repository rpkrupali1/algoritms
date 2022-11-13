package recurssion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BinarySearchTreesWithNNodesTest {

    @Test
    public void test000(){
        int actual = BinarySearchTreesWithNNodes.recursive(3);
        Assert.assertEquals(actual,5);
    }

    @Test
    public void test001(){
        int actual = BinarySearchTreesWithNNodes.recursive(1);
        Assert.assertEquals(actual,1);
    }

    @Test
    public void test002(){
        int actual = BinarySearchTreesWithNNodes.recursive(2);
        Assert.assertEquals(actual,2);
    }

    @Test
    public void test003(){
        int actual = BinarySearchTreesWithNNodes.recursive(4);
        Assert.assertEquals(actual,14);
    }
}
