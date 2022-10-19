package sort.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Given an array of meeting time intervals consisting of start and end times {[start1, end1], [start2,end2],...} determine if person could attend all meetings.
 *
 * Example 1:
 * Input:[[0,30],[5,10],[15,20]]
 * Output: false
 *
 * Example 2:
 * Input: [[7,10],[2,4]]
 * Output: true
 */
public class MeetingRooms {
    public boolean canAttendAllMeetings(int[][] intervals){
        Arrays.sort(intervals,(a,b)->{
            return a[0] == b[0] ? a[1] - b[1] : a[0]-b[0];
        });
        for (int i = 1; i < intervals.length; i++) {
            if(intervals[i][0]<intervals[i-1][1])
                return false;
        }
        return true;
    }
}
