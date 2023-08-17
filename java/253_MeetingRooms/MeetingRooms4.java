class Solution {
    public int minMeetingRooms(int[][] intervals) {
        int[] starts = new int[intervals.length];
        int[] ends = new int[intervals.length];
        for (int i = 0; i < intervals.length; i++) {
            starts[i] = intervals[i][0];
            ends[i] = intervals[i][1];
        }
        Arrays.sort(starts);
        Arrays.sort(ends);
        
        int ret = 1;
        int j = 0;
        for (int i = 1; i < intervals.length; i++) {
            if (starts[i] < ends[j]) ret++;
            else j++;
        }
        return ret;
    }
}
