class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] == b[0] ? b[1] - a[1] : a[0] - b[0]);
        int count = 1;
        int[] newInterval = intervals[0];
        for (int[] interval : intervals) {
            if (interval[1] <= newInterval[1]) {
                continue;
            }
            else {
                count++;
                newInterval = interval;
            }
        }
        return count;
    }
}
