class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        int[] ret = new int[nums.length - k + 1];
        int j = 0;
        for (int i = 0; i < k; i++) {
            pq.add(nums[i]);
        }
        for (int i = k; i < nums.length; i++) {
            ret[j] = pq.peek();
            pq.remove(nums[j]);
            pq.add(nums[i]);
            j++;
        }
        ret[ret.length - 1] = pq.peek();
        
        return ret;
    }
}
