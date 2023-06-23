class Solution {
    public int longestSubarray(int[] nums, int limit) {
        PriorityQueue<Integer> pqMin = new PriorityQueue<>((a, b) -> a - b);
        PriorityQueue<Integer> pqMax = new PriorityQueue<>((a, b) -> b - a);
        int ret = 0;

        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            pqMin.offer(nums[i]);
            pqMax.offer(nums[i]);
            if (pqMax.peek() -  pqMin.peek() > limit) {
                pqMin.remove(nums[j]);
                pqMax.remove(nums[j]);
                j++;
            }
            else {
                ret = Math.max(ret, pqMax.size());
            }
        }
        return ret;
    }
}
