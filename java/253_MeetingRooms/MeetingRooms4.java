class Solution {
    public int minMeetingRooms(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        Queue<Integer> pq = new PriorityQueue<>((a, b) -> a - b);
        pq.offer(intervals[0][1]);
        int ret = 1;
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < pq.peek()) ret++;
            else pq.poll();
            pq.offer(intervals[i][1]);
        }
        return ret;
    }
}
