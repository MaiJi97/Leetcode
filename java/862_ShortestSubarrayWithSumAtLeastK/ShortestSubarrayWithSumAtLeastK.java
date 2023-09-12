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

            // This is a bit tricky. Removing equal or larger sums at previous indices is safe since they won't contribute to valid answers. 
			// Let's say we have two indexes i1 and i2 , where i1 < i2 and sums[i1] = sums[i2].
			// Our current index is j. Then the shortest subarray length can only be j - i2. Same thing if sums[i1] > sums[i2].
            while (!q.isEmpty() && prefixSum[q.peekLast()] >= prefixSum[i]) q.pollLast();
            q.offerLast(i);
        }
        return ret <= nums.length ? ret : -1;
    }
}
