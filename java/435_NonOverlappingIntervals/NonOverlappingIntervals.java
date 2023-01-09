class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0) return 0;
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);
        int prev = 0;;
        int count = 0;
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] >= intervals[prev][1]) {
                prev = i;
            }
            else { 
                if (intervals[i][0] < intervals[prev][1]) {
                    if (intervals[i][1] < intervals[prev][0]) {
                        prev = i;
                    }
                    count++;
                }
            }
        }
        return count;
    }
}
