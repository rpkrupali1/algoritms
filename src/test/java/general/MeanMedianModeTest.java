package general;

import common.ParentTest;
import org.testng.annotations.Test;

public class MeanMedianModeTest extends ParentTest {

    @Test
    public void test000(){
        int[] input = new int[]{64630, 11735, 14216, 99233, 14470, 4978, 73429, 38120, 51135, 67060};
        Double[] actual = MeanMedianMode.getMeanMedianMode(input);
        print(actual);
        Double[] expected = new Double[]{43900.6,44627.5, 4978.0};

    }
}
