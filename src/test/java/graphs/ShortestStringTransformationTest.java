package graphs;

import common.ParentTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ShortestStringTransformationTest extends ParentTest {

    @Test
    public void test000_dict(){
        ArrayList<String> words = new ArrayList<>(List.of("cat", "hat", "bad", "had"));
        ArrayList<String> actual = ShortestStringTransformation.usingDictionary(words,"bat","had");
        //printStrings(actual);
        print(actual);
        ArrayList<ArrayList<String>> expected = new ArrayList<>();
        expected.add(new ArrayList<>(List.of("bat", "hat", "had")));
        expected.add(new ArrayList<>(List.of("bat", "bad", "had")));
        Assert.assertTrue(expected.contains(actual));
    }

    @Test
    public void test001_dict(){
        ArrayList<String> words = new ArrayList<>();
        ArrayList<String> actual = ShortestStringTransformation.usingDictionary(words,"bbb","bbc");
        //printStrings(actual);
        print(actual);
        ArrayList<ArrayList<String>> expected = new ArrayList<>();
        expected.add(new ArrayList<>(List.of("bbb", "bbc")));
        Assert.assertTrue(expected.contains(actual));
    }

    @Test
    public void test002_dict(){
        ArrayList<String> words = new ArrayList<>();
        ArrayList<String> actual = ShortestStringTransformation.usingDictionary(words,"zzzzzz","zzzzzz");
        //printStrings(actual);
        print(actual);
        ArrayList<ArrayList<String>> expected = new ArrayList<>();
        expected.add(new ArrayList<>(List.of("-1")));
        Assert.assertTrue(expected.contains(actual));
    }
}
