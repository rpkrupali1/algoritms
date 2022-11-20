package trees;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class GetHeightTest {

    @Test
    public void test000(){
        BinaryTreeNode bst = InsertInBST.build_a_bst(new ArrayList<>(Arrays.asList(7,3,5,2,1,4,6,7)));
        int actual = GetHeight.getHeight(bst);
        Assert.assertEquals(actual,3);
    }
}
