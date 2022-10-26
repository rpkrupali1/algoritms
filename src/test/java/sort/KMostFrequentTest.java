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
        ArrayList<String> actualOutput = kMostFrequent.kMostFrequent_words_pq(4,input);
        ArrayList<String> expectedOutput =new ArrayList<>(Arrays.asList("car", "driver", "taxi", "bus"));
        Assert.assertEquals(actualOutput,expectedOutput);
    }

    @Test
    public void test001(){
        ArrayList<String> input = new ArrayList<>(Arrays.asList("car", "car", "car", "car", "car", "car"));
        KMostFrequent kMostFrequent = new KMostFrequent();
        ArrayList<String> actualOutput = kMostFrequent.kMostFrequent_words_pq(1,input);
        ArrayList<String> expectedOutput =new ArrayList<>(Arrays.asList("car"));
        Assert.assertEquals(actualOutput,expectedOutput);
    }

    @Test
    public void test002(){
        ArrayList<String> input = new ArrayList<>(Arrays.asList("car", "car", "taxi", "taxi", "motor", "motor", "driver", "driver", "life", "life"));
        KMostFrequent kMostFrequent = new KMostFrequent();
        ArrayList<String> actualOutput = kMostFrequent.kMostFrequent_words_pq(5,input);
        ArrayList<String> expectedOutput =new ArrayList<>(Arrays.asList("car", "driver", "life", "motor", "taxi"));
        Assert.assertEquals(actualOutput,expectedOutput);
    }

    @Test
    public void numbers_test000(){
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 4, 3, 1));
        KMostFrequent kMostFrequent = new KMostFrequent();
        ArrayList<Integer> actualOutput = kMostFrequent.kMostFrequentElements_pq(input,2);
        printTest(actualOutput);
        ArrayList<Integer> expectedOutput =new ArrayList<>(Arrays.asList(3,2));
        Assert.assertEquals(actualOutput,expectedOutput);
    }

    @Test
    public void numbers_test001(){
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 1, 2, 3, 1));
        KMostFrequent kMostFrequent = new KMostFrequent();
        ArrayList<Integer> actualOutput = kMostFrequent.kMostFrequentElements_pq(input,1);
        printTest(actualOutput);
        ArrayList<Integer> expectedOutput =new ArrayList<>(Arrays.asList(1));
        Assert.assertEquals(actualOutput,expectedOutput);
    }
}
