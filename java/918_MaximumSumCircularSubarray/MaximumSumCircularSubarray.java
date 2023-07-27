class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalSum = nums[0];
        int currentMaxSubarray = nums[0];
        int currentMinSubarray = nums[0];
        int maxSubarray = nums[0];
        int minSubarray = nums[0];
        for (int i = 1; i < nums.length; i++) {
            totalSum += nums[i];
            currentMaxSubarray = Math.max(currentMaxSubarray + nums[i], nums[i]);
            maxSubarray = Math.max(maxSubarray, currentMaxSubarray);
            currentMinSubarray = Math.min(currentMinSubarray + nums[i], nums[i]);
            minSubarray = Math.min(minSubarray, currentMinSubarray);
        }
        if (totalSum == minSubarray) {
            return maxSubarray;
        }
        return Math.max(maxSubarray, totalSum - minSubarray);
    }
}
