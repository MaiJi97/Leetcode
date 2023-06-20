class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> q = new ArrayDeque<>();
        int[] ret = new int[nums.length - k + 1];
        for (int i = 0; i < nums.length; i++) {
            int startWindowIndex = i - k + 1;
            while (!q.isEmpty() && i - q.peekFirst() >= k) q.pollFirst();
            while (!q.isEmpty() && nums[q.peekLast()] <= nums[i]) q.pollLast();
            q.offerLast(i);
            if (startWindowIndex >= 0) ret[startWindowIndex] = nums[q.peekFirst()];
        }
        return ret;
    }
}
