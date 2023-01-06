class Solution {
    public int minMeetingRooms(int[][] intervals) {
        Queue<int[]> q = new PriorityQueue<int[]>((a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
        for (int[] interval : intervals) {
            q.offer(new int[]{interval[0], 1});
            q.offer(new int[]{interval[1], -1});
        }
        int ret = 0;
        int count = 0;
        while (!q.isEmpty()) {
            count += q.poll()[1];
            ret = Math.max(ret, count);
        }
        return ret;
    }
}
