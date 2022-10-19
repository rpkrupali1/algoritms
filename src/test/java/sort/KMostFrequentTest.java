package sort;

import org.testng.Assert;
import org.testng.annotations.Test;
import sort.examples.KMostFrequent;

import java.util.ArrayList;
import java.util.Arrays;

public class KMostFrequentTest extends ParentTest{
    @Test
    public void test000(){
        ArrayList<String> input = new ArrayList<>(Arrays.asList("car", "bus", "taxi", "car", "driver", "candy", "race", "car", "driver", "fare", "taxi"));
        KMostFrequent kMostFrequent = new KMostFrequent();
        ArrayList<String> actualOutput = kMostFrequent.k_most_frequent(4,input);
        ArrayList<String> expectedOutput =new ArrayList<>(Arrays.asList("car", "driver", "taxi", "bus"));
        Assert.assertEquals(actualOutput,expectedOutput);
    }

    @Test
    public void test001(){
        ArrayList<String> input = new ArrayList<>(Arrays.asList("car", "car", "car", "car", "car", "car"));
        KMostFrequent kMostFrequent = new KMostFrequent();
        ArrayList<String> actualOutput = kMostFrequent.k_most_frequent(1,input);
        ArrayList<String> expectedOutput =new ArrayList<>(Arrays.asList("car"));
        Assert.assertEquals(actualOutput,expectedOutput);
    }

    @Test
    public void test002(){
        ArrayList<String> input = new ArrayList<>(Arrays.asList("car", "car", "taxi", "taxi", "motor", "motor", "driver", "driver", "life", "life"));
        KMostFrequent kMostFrequent = new KMostFrequent();
        ArrayList<String> actualOutput = kMostFrequent.k_most_frequent(5,input);
        ArrayList<String> expectedOutput =new ArrayList<>(Arrays.asList("car", "driver", "life", "motor", "taxi"));
        Assert.assertEquals(actualOutput,expectedOutput);
    }
}
