package sort;

import org.testng.Assert;
import org.testng.annotations.Test;
import sort.examples.MeetingRooms;

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
}
