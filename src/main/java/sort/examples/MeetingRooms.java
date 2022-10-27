package sort.examples;

import java.util.ArrayList;
import java.util.Arrays;


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
 *
 * Given a list of meeting intervals where each interval consists of a start and an end time,
 * check if a person can attend all the given meetings such that only one meeting can be attended at a time.
 *
 * Example One
 * {
 * "intervals": [[1, 5], [5, 8], [10, 15]]
 * }
 * Output:
 * 1
 * As the above intervals are non-overlapping intervals, it means a person can attend all these meetings.
 *
 * Example Two
 * {
 * "intervals": [[1, 5], [4, 8]]
 * }
 * Output:
 * 0
 * Time 4 - 5 is overlapping in the first and second intervals.
 *
 * Notes
 * A new meeting can start at the same time the previous one ended.
 */
public class MeetingRooms {
    /**
     * Time - O(n logn)
     * Space - O(n)
     */
    public boolean canAttendAllMeetings(int[][] intervals){
        Arrays.sort(intervals,(a,b)-> a[0] == b[0] ? a[1] - b[1] : a[0]-b[0]);
        for (int i = 1; i < intervals.length; i++) {
            if(intervals[i][0]<intervals[i-1][1])
                return false;
        }
        return true;
    }

    public int can_attend_all_meetings(ArrayList<ArrayList<Integer>> intervals) {
        // Write your code here.
        intervals.sort((a, b) ->
                a.get(0).equals(b.get(0)) ? a.get(1) - b.get(1) : a.get(0) - b.get(0));
        for (int i = 0; i < intervals.size()-1; i++) {
            int endTime = intervals.get(i).get(1);
            int startTime = intervals.get(i+1).get(0);

            // If overlap found, return 0
            if(endTime>startTime)
                return 0;
        }
        return 1;
    }
}
