package sort;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class KMostFrequentTest extends ParentTest{
    @Test
    public void test000(){
        ArrayList<String> input = new ArrayList<>(Arrays.asList("car", "bus", "taxi", "car", "driver", "candy", "race", "car", "driver", "fare", "taxi"));
        KMostFrequent kMostFrequent = new KMostFrequent();
        kMostFrequent.k_most_frequent(4,input);
    }
}
