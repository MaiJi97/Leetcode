class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long left = 0;
        int max = 0;
        for (int i = 0; i < time.length; i++) {
            max = Math.max(max, time[i]);
        }
        long right = (long) totalTrips * max;

        int ret = 0;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            if (numTrips(time, mid) < totalTrips) left = mid + 1;
            else {
                right = mid - 1;
            }
        }
        return left;
    }

    private long numTrips(int[] time, long mid) {
        long count = 0;
        for (int i = 0; i < time.length; i++) {
            count += mid / time[i];
        }
        return count;
    }
}
