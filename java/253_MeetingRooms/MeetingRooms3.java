class Solution {
    public int minMeetingRooms(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]); // sort by start time
        Queue<Integer> q = new PriorityQueue<Integer>((a, b) -> a - b); // sort by end time
        q.offer(intervals[0][1]);
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] >= q.peek()) { // a new start is later than the earliest end time
                q.poll();
            }
            q.offer(intervals[i][1]);
        }
        return q.size();
    }
}
