class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a, b) -> a[1] - b[1]);
        int[] newInterval = intervals[0];
        int count = 0;
        for (int i = 1; i < intervals.length; i++) {
            int[] interval = intervals[i];
            if (newInterval[1] > interval[0]) {
                count++;
            }
            else {
                newInterval = interval;
            }
        }
        return count;
    }
}
