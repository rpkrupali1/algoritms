package sort;

import org.testng.Assert;
import org.testng.annotations.Test;
import sort.examples.MeetingRooms;

import java.util.ArrayList;
import java.util.Arrays;

public class MeetingRoomTest extends ParentTest{

    @Test
    public void test000(){
        int[][] input = {{0,30},{5,10},{15,20}};
        //int[][] input = {{7,10},{2,4}};
        MeetingRooms mr = new MeetingRooms();
        boolean actualOutput = mr.canAttendAllMeetings(input);
        Assert.assertEquals(actualOutput,false);
    }

    @Test
    public void test001(){
        int[][] input = {{7,10},{2,4}};
        MeetingRooms mr = new MeetingRooms();
        boolean actualOutput = mr.canAttendAllMeetings(input);
        Assert.assertEquals(actualOutput,true);
    }

    @Test
    public void test002(){
        int[][] input = {{7,10},{2,15}};
        MeetingRooms mr = new MeetingRooms();
        boolean actualOutput = mr.canAttendAllMeetings(input);
        Assert.assertEquals(actualOutput,false);
    }

    @Test
    public void intReturn_test000(){
        ArrayList<ArrayList<Integer>> input = new ArrayList<>();
        input.add(new ArrayList<>(Arrays.asList(1,5)));
        input.add(new ArrayList<>(Arrays.asList(5,8)));
        input.add(new ArrayList<>(Arrays.asList(10,15)));

        MeetingRooms mr = new MeetingRooms();
        int actualOutput = mr.can_attend_all_meetings(input);
        Assert.assertEquals(actualOutput,1);
    }

    @Test
    public void intReturn_test001(){
        ArrayList<ArrayList<Integer>> input = new ArrayList<>();
        input.add(new ArrayList<>(Arrays.asList(1,5)));
        input.add(new ArrayList<>(Arrays.asList(4,8)));

        MeetingRooms mr = new MeetingRooms();
        int actualOutput = mr.can_attend_all_meetings(input);
        Assert.assertEquals(actualOutput,0);
    }

    @Test
    public void intReturn_test002(){
        ArrayList<ArrayList<Integer>> input = new ArrayList<>();
        input.add(new ArrayList<>(Arrays.asList(4,7)));
        input.add(new ArrayList<>(Arrays.asList(1,5)));

        MeetingRooms mr = new MeetingRooms();
        int actualOutput = mr.can_attend_all_meetings(input);
        Assert.assertEquals(actualOutput,0);
    }


}
