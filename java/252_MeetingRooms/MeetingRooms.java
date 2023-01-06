class Solution {
    public boolean canAttendMeetings(int[][] intervals) {
        int latest = 0;
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        for (int i = 1; i < intervals.length; i++) {
            latest = Math.max(latest, intervals[i-1][1]);
            if (intervals[i][0] < latest) {
                return false;
            }
        }
        return true;
    }
}
