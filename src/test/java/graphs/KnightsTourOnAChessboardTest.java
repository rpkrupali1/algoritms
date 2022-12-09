package graphs;

import common.ParentTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class KnightsTourOnAChessboardTest extends ParentTest {

    @Test
    public void test000(){
        int actual = KnightsTourOnAChessboard.bfs(5,5,0,0,4,1);
        Assert.assertEquals(actual,3);
    }
}
