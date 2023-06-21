class Solution {
    public int shortestSubarray(int[] nums, int k) {
        int[] prefixSum = new int[nums.length+1];
        int ret = nums.length + 1;
        Deque<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < nums.length; i++) {
            prefixSum[i+1] = prefixSum[i] + nums[i];
        }
        for (int i = 0; i < nums.length + 1; i++) {
            while (!q.isEmpty() && prefixSum[i] - prefixSum[q.peekFirst()] >= k) ret = Math.min(ret, i - q.pollFirst());
            while (!q.isEmpty() && prefixSum[q.peekLast()] >= prefixSum[i]) q.pollLast();
            q.offerLast(i);
        }
        return ret <= nums.length ? ret : -1;
    }
}
