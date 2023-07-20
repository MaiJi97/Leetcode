class Solution {
    public int maxProduct(int[] nums) {
        int currentSubarray = nums[0];
        int maxSubarray = nums[0];
        int minSubarray = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int temp = Math.max(nums[i], Math.max(currentSubarray * nums[i], minSubarray * nums[i])); // calculation for minSubarray need to use the original value, so store the new currentSubarray in a temp first
            minSubarray = Math.min(nums[i], Math.min(currentSubarray * nums[i], minSubarray * nums[i]));
            currentSubarray = temp;
            maxSubarray = Math.max(maxSubarray, currentSubarray);
        }
        return maxSubarray;
    }
}
