class Solution {
    public int longestSubarray(int[] nums, int limit) {
        Deque<Integer> minDeque = new ArrayDeque<>();
        Deque<Integer> maxDeque = new ArrayDeque<>();
        int j = 0;
        int ret = 0;
        for (int i = 0; i < nums.length; i++) {
            while (!minDeque.isEmpty() && minDeque.peekLast() >  nums[i]) minDeque.pollLast(); // 与pq不同，这里我们不排序，不符合顺序的直接移除
            while (!maxDeque.isEmpty() && maxDeque.peekLast() < nums[i]) maxDeque.pollLast();
            minDeque.add(nums[i]);
            maxDeque.add(nums[i]);
            if (maxDeque.peek() - minDeque.peek() > limit) {
                if (nums[j] == minDeque.peek()) minDeque.pollFirst();
                if (nums[j] == maxDeque.peek()) maxDeque.pollFirst();
                j++;
            }
            ret = Math.max(ret, i - j + 1);
        }
        return ret;
    }
}
