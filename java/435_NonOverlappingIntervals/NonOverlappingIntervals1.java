class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0) return 0;
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);
        int[] dp = new int[intervals.length]; // dp[i] is maximum number of valid intervals up to index i
        dp[0] = 1;
        int num = 1;
        for (int i = 1; i < intervals.length; i++) {
            int max = 0;
            for (int j = 0; j < i; j++) {
                if (intervals[i][0] >= intervals[j][1]) {
                    max = Math.max(max, dp[j]);
                }
            }
            dp[i] = max + 1; 
            num = Math.max(num, dp[i]);
        }
        return intervals.length - num;
    }
}
