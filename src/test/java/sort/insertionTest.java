package sort;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;


public class insertionTest {

    @Test
    public static void basicTest(){
        insertion insertion = new insertion();
        ArrayList<Integer> updatedlist =  insertion.insertion_sort(new ArrayList<Integer>(Arrays.asList(3,5,2,9,7,0,1)));
        for (int i = 0; i < updatedlist.size(); i++) {
            System.out.print(updatedlist.get(i) + " ");
        }

    }
}
