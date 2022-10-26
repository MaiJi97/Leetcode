class Solution {
    public int splitArray(int[] nums, int m) {
        int left = 0;
        int right = 0;
        for (int i = 0; i < nums.length; i++) {
            left = Math.max(left, nums[i]);
            right += nums[i];
        }
        while (left < right) {
            int mid = left + (right - left) / 2;
            int split = helper(nums, mid); // return the number of subarrays whose sum is mid
            if (split > m) {
                left = mid + 1;
            }
            else {
                right = mid;
            }
        }
        return left;
    }
    
    private int helper(int[] nums, int targetSum) {
        int count = 1;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {     
            if (sum + nums[i] <= targetSum) {
                sum += nums[i];
            }
            else {
                count++;
                sum = nums[i];
            }     
        }
        return count;
    }
}
